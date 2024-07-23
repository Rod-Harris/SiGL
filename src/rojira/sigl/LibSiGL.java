package rojira.sigl;

import static rojira.jsi4.LibConsole.cinfo;
import static rojira.jsi4.LibConsole.cwarn;
import static rojira.jsi4.LibGUI.Blue;
import static rojira.jsi4.LibGUI.Green;
import static rojira.jsi4.LibGUI.Red;
import static rojira.jsi4.LibGUI.argbA;
import static rojira.jsi4.LibGUI.argbAd;
import static rojira.jsi4.LibGUI.argbB;
import static rojira.jsi4.LibGUI.argbBd;
import static rojira.jsi4.LibGUI.argbG;
import static rojira.jsi4.LibGUI.argbGd;
import static rojira.jsi4.LibGUI.argbR;
import static rojira.jsi4.LibGUI.argbRd;
import static rojira.jsi4.LibGUI.create_argb_image;
import static rojira.jsi4.LibGUI.get_pixel;
import static rojira.jsi4.LibGUI.height;
import static rojira.jsi4.LibGUI.load_image;
import static rojira.jsi4.LibGUI.width;
import static rojira.jsi4.LibIO.read_file;
import static rojira.jsi4.LibIO.write_file;
import static rojira.jsi4.LibMaths.avg;
import static rojira.jsi4.LibMaths.deg;
import static rojira.jsi4.LibMaths.interpolate;
import static rojira.jsi4.LibMaths.isPowOf2;
import static rojira.jsi4.LibMaths.min;
import static rojira.jsi4.LibMaths.pack;
import static rojira.jsi4.LibSystem.byte_buffer;
import static rojira.jsi4.LibSystem.compile_check;
import static rojira.jsi4.LibSystem.runtime_check;
import static rojira.jsi4.LibSystem.systime;
import static rojira.sigl.GLUWrap.gluErrorString;
import static rojira.sigl.GLUWrap.gluLookAt;
import static rojira.sigl.GLUWrap.gluOrtho2D;
import static rojira.sigl.GLUWrap.gluPerspective;
import static rojira.sigl.GLUWrap.gluUnProject;
import static rojira.sigl.GLWrap.*;

//import jsi.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;

import rojira.jsi4.modules.eou.ConfigParser;
import rojira.jsi4.util.maths.Mat4d;
import rojira.jsi4.util.maths.Vec2d;
import rojira.jsi4.util.maths.Vec3d;
import rojira.jsi4.util.text.EString;


public class LibSiGL
{
	public static int material_face = GL_FRONT_AND_BACK;

	private static double[] gl_mat4d = new double[ 16 ];

	public static boolean power_of_2_texture_size = true;

	public static boolean use_buffer_cache = false;
	
	static Map<Integer,ByteBuffer> byte_buffers_cache = new HashMap<Integer,ByteBuffer>();

	static TextureDiskCache texture_disk_cache;

	/*-------------------------------------------------------------------------------------------------*/

	// matrix manipulation


	public static void push_matrix()
	{
		glPushMatrix();
	}


	public static void pop_matrix()
	{
		glPopMatrix();
	}


	public static void translate( double x, double y, double z )
	{
		glTranslated( x, y, z );
	}


	public static void translate( Vec3d v )
	{
		glTranslated( v.x, v.y, v.z );
	}


	public static void rotate( double a, double x, double y, double z )
	{
		glRotated( a, x, y, z );
	}


	public static void rotateX( double a )
	{
		glRotated( a, 1, 0, 0 );
	}


	public static void rotateY( double a )
	{
		glRotated( a, 0, 1, 0 );
	}


	public static void rotateZ( double a )
	{
		glRotated( a, 0, 0, 1 );
	}


	public static void pitch( double a )
	{
		glRotated( a, 1, 0, 0 );
	}


	public static void yaw( double a )
	{
		glRotated( a, 0, 1, 0 );
	}


	public static void roll( double a )
	{
		glRotated( a, 0, 0, 1 );
	}


	public static void scale( Vec3d v )
	{
		glScaled( v.x, v.y, v.z );
	}


	public static void scale( double x, double y, double z )
	{
		glScaled( x, y, z );
	}


	public static void scale( double s )
	{
		glScaled( s, s, s );
	}


	// rendering helpers


	public static void begin_shape( int mode )
	{
		glBegin( mode );
	}


	public static void end_shape()
	{
		glEnd();
	}


	public static int start_list()
	{
		int list_index = glGenLists( 1 );

		glNewList( list_index, GL_COMPILE );

		return list_index;
	}


	public static void end_list()
	{
		glEndList();
	}


	public static void delete_list( int list_index )
	{
		glDeleteLists( list_index, 1 );
	}


	public static void call_list( int list_index )
	{
		glCallList( list_index );
	}


	public static void colour( int argb )
	{
		glColor4d
		(
			argbRd( argb ),
			argbGd( argb ),
			argbBd( argb ),
			argbAd( argb )
		);
	}


	public static void antialias( boolean on )
	{
		if( on )
		{
			glHint( GL_POINT_SMOOTH_HINT, GL_NICEST );
			glHint( GL_LINE_SMOOTH_HINT, GL_NICEST );
			glHint( GL_POLYGON_SMOOTH_HINT, GL_NICEST );

			glEnable( GL_POINT_SMOOTH );

			glEnable( GL_LINE_SMOOTH );

			glEnable( GL_BLEND );

			glBlendFunc( GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA );
		}
		else
		{
			glHint( GL_POINT_SMOOTH_HINT, GL_FASTEST );
			glHint( GL_LINE_SMOOTH_HINT, GL_FASTEST );
			glHint( GL_POLYGON_SMOOTH_HINT, GL_FASTEST );

			glDisable( GL_POINT_SMOOTH );

			glDisable( GL_LINE_SMOOTH );

			glDisable( GL_BLEND );
		}
	}
	
	
	public static void transparency( boolean on )
	{
		if( on )
		{
			glEnable( GL_BLEND );
			glBlendFunc( GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA );
		}
		else
		{
			glDisable( GL_BLEND );
		}
	}
	

	// gl gets

	public static int get_glint( int param )
	{
		int[] v = { 0 };

		glGetIntegerv( param, v, 0 );

		return v[ 0 ];
	}


	public static double get_gldouble( int param )
	{
		double[] v = { 0 };

		glGetDoublev( param, v, 0 );

		return v[ 0 ];
	}


	public static boolean check_error()
	{
		int error_code = glGetError();

		if( error_code == GL_NO_ERROR ) return true;

		System.err.println( gluErrorString( error_code ) );

		return false;
	}


	// vetex helpers

	public static void vertex( double x, double y )
	{
		glVertex2d( x, y );
	}


	public static void vertex( double x, double y, double tu, double tv )
	{
		glTexCoord2d( tu, tv );

		glVertex2d( x, y );
	}


	public static void vertex( double x, double y, double z )
	{
		glVertex3d( x, y, z );
	}


	public static void vertex( Vec3d v )
	{
		glVertex3d( v.x, v.y, v.z );
	}


	public static void vertex( Vec3d v, Vec2d t )
	{
		glTexCoord2d( t.x, t.y );

		glVertex3d( v.x, v.y, v.z );
	}


	public static void vertex( Vec3d v, Vec3d n )
	{
		glNormal3d( n.x, n.y, n.z );

		glVertex3d( v.x, v.y, v.z );
	}


	public static void vertex( Vec3d v, Vec2d t, Vec3d n )
	{
		glNormal3d( n.x, n.y, n.z );

		glTexCoord2d( t.x, t.y );

		glVertex3d( v.x, v.y, v.z );
	}


	public static void vertex( double x, double y, double z, double nx, double ny, double nz )
	{
		glNormal3d( nx, ny, nz );

		glVertex3d( x, y, z );
	}


	public static void vertex( double x, double y, double z, double tu, double tv )
	{
		glTexCoord2d( tu, tv );

		glVertex3d( x, y, z );
	}


	public static void vertex( double x, double y, double z, double nx, double ny, double nz, double tu, double tv )
	{
		glTexCoord2d( tu, tv );

		glNormal3d( nx, ny, nz );

		glVertex3d( x, y, z );
	}


/*
	public static void draw_vector( Vec3d p, Vec3d v )
	{
		draw_vector( p.x, p.y, p.z, v.x, v.y, v.z );
	}
*/


	public static void draw_vector( double x, double y, double z, double dx, double dy, double dz )
	{
		glVertex3d( x, y, z );

		glVertex3d( x + dx, y + dy, z + dz );
	}


	public static void draw_vector( Vec3d p, Vec3d v )
	{
		draw_vector( p.x, p.y, p.z, v.x, v.y, v.z );
	}


	public static void draw_vector( int colour1, Vec3d p, int colour2, Vec3d v )
	{
		colour( colour1 );

		glVertex3d( p.x, p.y, p.z );

		colour( colour2 );

		glVertex3d( p.x + v.x, p.y + v.y, p.z + v.z );
	}

	public static void draw_line( Vec3d p0, Vec3d p1 )
	{
		glVertex3d( p0.x, p0.y, p0.z );

		glVertex3d( p1.x, p1.y, p1.z );
	}

	public static void draw_line( int colour1, Vec3d p0, int colour2, Vec3d p1 )
	{
		colour( colour1 );

		glVertex3d( p0.x, p0.y, p0.z );

		colour( colour2 );

		glVertex3d( p1.x, p1.y, p1.z );
	}


	public static void normal( double nx, double ny, double nz )
	{
		glNormal3d( nx, ny, nz );
	}

	public static void normal( Vec3d n )
	{
		glNormal3d( n.x, n.y, n.z );
	}


	public static void tex_coord( double tx, double ty )
	{
		glTexCoord2d( tx, ty );
	}

	public static void tex_coord( Vec2d t )
	{
		glTexCoord2d( t.x, t.y );
	}


	// 2D vetex helpers

// 	public static void point( double x, double y )
// 	{
// 		glVertex2d( x, y );
// 	}
//
//
// 	public static void vertex( double x, double y, double tu, double tv )
// 	{
// 		glTexCoord2d( tu, tv );
//
// 		glVertex2d( x, y );
// 	}
//
//
// 	public static void vertex( double x, double y, double z )
// 	{
// 		glVertex3d( x, y, z );
// 	}
//
//
// 	public static void vertex( Vec3d v )
// 	{
// 		glVertex3d( v.x, v.y, v.z );
// 	}
//
//
// 	public static void vertex( double x, double y, double z, double nx, double ny, double nz )
// 	{
// 		glNormal3d( nx, ny, nz );
//
// 		glVertex3d( x, y, z );
// 	}
//
//
// 	public static void vertex( double x, double y, double z, double tu, double tv )
// 	{
// 		glTexCoord2d( tu, tv );
//
// 		glVertex3d( x, y, z );
// 	}
//
//
// 	public static void vertex( double x, double y, double z, double nx, double ny, double nz, double tu, double tv )
// 	{
// 		glTexCoord2d( tu, tv );
//
// 		glNormal3d( nx, ny, nz );
//
// 		glVertex3d( x, y, z );
// 	}



	// lighting

	public static void smooth_shading()
	{
		glShadeModel( GL_SMOOTH );
	}

	public static void flat_shading()
	{
		glShadeModel( GL_FLAT );
	}

	public static void ambient_light( int argb )
	{
		float[] colour = { (float) argbRd( argb ), (float) argbGd( argb ), (float) argbBd( argb ), (float) argbAd( argb ) };

		glLightModelfv( GL_LIGHT_MODEL_AMBIENT, colour, 0 );
	}


	public static void point_light( int argb, double x, double y, double z )
	{
		point_light( 0, argb, x, y, z );
	}


	public static void point_light( int light_no, int argb, double x, double y, double z )
	{
		light_no += GL_LIGHT0;

		float[] colour = { (float) argbRd( argb ), (float) argbGd( argb ), (float) argbBd( argb ), (float) argbAd( argb ) };

		float[] position = { (float) x, (float) y, (float) z, 1 };

		glLightfv( light_no, GL_DIFFUSE, colour, 0 );

		glLightfv( light_no, GL_SPECULAR, colour, 0 );

		glLightfv( light_no, GL_POSITION, position, 0 );

		glEnable( light_no );
	}


	public static void lights( boolean on )
	{
		if( on ) glEnable( GL_LIGHTING );

		else glDisable( GL_LIGHTING );
	}


	public static void light( int light_no, boolean on )
	{
		light_no += GL_LIGHT0;

		if( on ) glEnable( light_no );

		else glDisable( light_no );
	}


	public static void light_model_2_sided()
	{
		glLightModeli( GL_LIGHT_MODEL_TWO_SIDE, GL_TRUE );
	}


	public static void light_model_1_sided()
	{
		glLightModeli( GL_LIGHT_MODEL_TWO_SIDE, GL_FALSE );
	}


	// materials

	public static void ambient_material( int argb )
	{
		float[] colour = { (float) argbRd( argb ), (float) argbGd( argb ), (float) argbBd( argb ), (float) argbAd( argb ) };

		glMaterialfv( material_face, GL_AMBIENT, colour, 0 );
	}


	public static void diffuse_material( int argb )
	{
		float[] colour = { (float) argbRd( argb ), (float) argbGd( argb ), (float) argbBd( argb ), (float) argbAd( argb ) };

		glMaterialfv( material_face, GL_DIFFUSE, colour, 0 );
	}


	public static void ambient_and_diffuse_material( int argb )
	{
		float[] colour = { (float) argbRd( argb ), (float) argbGd( argb ), (float) argbBd( argb ), (float) argbAd( argb ) };

		glMaterialfv( material_face, GL_AMBIENT_AND_DIFFUSE, colour, 0 );
	}


	public static void specular_material( int argb )
	{
		float[] colour = { (float) argbRd( argb ), (float) argbGd( argb ), (float) argbBd( argb ), (float) argbAd( argb ) };

		glMaterialfv( material_face, GL_SPECULAR, colour, 0 );
	}


	public static void emissive_material( int argb )
	{
		float[] colour = { (float) argbRd( argb ), (float) argbGd( argb ), (float) argbBd( argb ), (float) argbAd( argb ) };

		glMaterialfv( material_face, GL_EMISSION, colour, 0 );
	}


	/**
	 * Warning: not in the normal range 0 -> 128
	 * this method takes values 0 -> 1 (which are linearly mapped to 0 -> 128
	 */
	public static void shininess( double v )
	{
		if( v > 1 ) cwarn.println( "shininess method takes values in the range of 0 -> 1" );

		v *= 128;

		glMaterialf( material_face, GL_SHININESS, (float) v );
	}



	// rendering state

	public static void cull_front()
	{
		glCullFace( GL_FRONT );

		cull( true );
	}


	public static void cull_back()
	{
		glCullFace( GL_BACK );

		cull( true );
	}


	public static void cull( boolean on )
	{
		if( on ) glEnable( GL_CULL_FACE );

		else glDisable( GL_CULL_FACE );
	}


	public static void front_cw()
	{
		glFrontFace( GL_CW );
	}


	public static void front_ccw()
	{
		glFrontFace( GL_CCW );
	}


	public static void depth_test( boolean on )
	{
		if( on ) glEnable( GL_DEPTH_TEST );

		else glDisable( GL_DEPTH_TEST );
	}


	public static void depth_write( boolean on )
	{
		glDepthMask( on );
	}



	public static void colour_write( boolean on )
	{
		glColorMask( on, on, on, on );
	}


	public static void wireframe( boolean on )
	{
		if( on )
		{
			glPolygonMode( GL_FRONT_AND_BACK, GL_LINE );
		}
		else
		{
			glPolygonMode( GL_FRONT_AND_BACK, GL_FILL );
		}
	}

	// screen clearing functions


	/**
	*	clear the depth and colour buffers (to black)
	*/
	public static void clw( int clear_colour, int clear_buffers )
	{
		glClearColor
		(
			(float) argbRd( clear_colour ),
			(float) argbGd( clear_colour ),
			(float) argbBd( clear_colour ),
			(float) argbAd( clear_colour )
		);

		glClear( clear_buffers );
	}


	// matrix and view functions

	public static void camera( Vec3d c, Vec3d t, Vec3d u )
	{
		camera( c.x, c.y, c.z, t.x, t.y, t.z, u.x, u.y, u.z );
	}


	public static void camera( double cx, double cy, double cz, double tx, double ty, double tz, double ux, double uy, double uz )
	{
		glMatrixMode( GL_MODELVIEW );

		glLoadIdentity();

		//System.out.printf( "gluLookAt( %.1f,  %.1f,  %.1f,  %.1f,  %.1f,  %.1f,  %.1f,  %.1f,  %.1f\n", cx, cy, cz, tx, ty, tx, ux, uy, uz );

		gluLookAt( cx, cy, cz, tx, ty, tz, ux, uy, uz );
	}


	public static double clip( int x, int y, int width, int height )
	{
		glViewport( x, y, width, height );
		
		glScissor( x, y, width, height );
		
		//glScissor( x, y + height, width, height );
		
		// cinfo.println( "glScissor( %d, %d, %d, %d  );", x, y + height, width, height );
		
		// glScissor(left,bottom,width,height);
		
		glEnable(GL_SCISSOR_TEST);

		return 1.0 * width / height;
	}


	public static int[] clip_params()
	{
		int[] v = { 0, 0, 0, 0 };

		glGetIntegerv( GL_VIEWPORT, v, 0 );

		return v;
	}


	public static void ortho( double width, double height )
	{
		glMatrixMode( GL_PROJECTION );

		glLoadIdentity();

		gluOrtho2D( 0, width, height, 0 );
	}


	public static double perspective( double xfov, int width, int height, double near, double far )
	{
		glMatrixMode( GL_PROJECTION );

		glLoadIdentity();

		double aspect = 1.0f * width / height;

		double yfov = xfov / aspect;

		gluPerspective( yfov, aspect, near, far );

		return yfov;
	}


	public static void reset_projection()
	{
		glMatrixMode( GL_PROJECTION );

		glLoadIdentity();
	}

	public static void reset_modelview()
	{
		glMatrixMode( GL_MODELVIEW );

		glLoadIdentity();
	}

	public static void load_identity()
	{
		glLoadIdentity();
	}


	public static void modelview_matrix()
	{
		glMatrixMode( GL_MODELVIEW );
	}


	public static void set_modelview_matrix( Mat4d model_view_matrix )
	{
		set_matrix( GL_MODELVIEW, model_view_matrix );
	}

	public static Mat4d get_modelview_matrix( Mat4d model_view_matrix )
	{
		return get_matrix( GL_MODELVIEW_MATRIX, model_view_matrix );
	}


	public static Mat4d get_projection_matrix( Mat4d projection_matrix )
	{
		return get_matrix( GL_PROJECTION_MATRIX, projection_matrix );
	}


	public static Mat4d get_matrix( int mode, Mat4d matrix  )
	{
		if( matrix == null ) matrix = new Mat4d();

		glGetDoublev( mode, gl_mat4d, 0 );

		matrix.setGL( gl_mat4d );

		return matrix;
	}


	public static void set_matrix( int mode, Mat4d matrix  )
	{
		glMatrixMode( mode );

		glLoadIdentity();

		matrix.setGL( gl_mat4d );

		glMultMatrixd( gl_mat4d, 0 );
	}


	public static boolean view_ray( int x, int y, Vec3d ray )
	{
		Vec3d p0 = new Vec3d();

		Vec3d p1 = new Vec3d();

		int[] viewport = new int[ 4 ];
		glGetIntegerv( GL_VIEWPORT, viewport, 0 );

		double[] mv_matrix = new double[ 16 ];
		glGetDoublev( GL_MODELVIEW_MATRIX, mv_matrix, 0 );

		double[] proj_matrix = new double[ 16 ];
		glGetDoublev( GL_PROJECTION_MATRIX, proj_matrix, 0 );

		double winX = x;
		double winY = viewport[ 3 ] - y - 1;
		double[] pos = new double[ 4 ];

		boolean ec = gluUnProject
		(
			winX, winY, 0,
			mv_matrix, 0,
			proj_matrix, 0,
			viewport, 0,
			pos, 0
		);

		p0.x = pos[ 0 ];
		p0.y = pos[ 1 ];
		p0.z = pos[ 2 ];

		ec &= gluUnProject
		(
			winX, winY, 1,
			mv_matrix, 0,
			proj_matrix, 0,
			viewport, 0,
			pos, 0
		);

		p1.x = pos[ 0 ];
		p1.y = pos[ 1 ];
		p1.z = pos[ 2 ];

		ray.sub( p1, p0 );

		return ec;
	}

// 	public static void print_matrix()
// 	{
// 		System.out.println( String.format( "%.3f %.3f %.3f %.3f", matrix.m00, matrix.m01, matrix.m02, matrix.m03 ) );
// 		System.out.println( String.format( "%.3f %.3f %.3f %.3f", matrix.m10, matrix.m11, matrix.m12, matrix.m13 ) );
// 		System.out.println( String.format( "%.3f %.3f %.3f %.3f", matrix.m20, matrix.m21, matrix.m22, matrix.m23 ) );
// 		System.out.println( String.format( "%.3f %.3f %.3f %.3f", matrix.m30, matrix.m31, matrix.m32, matrix.m33 ) );
// 	}






	// texture and buffer functions


// 	public static Texture create_rgba_texture( BufferedImage image )
// 	{
// 		return create_texture( image, GL_RGBA );
// 	}
//
//
// 	public static Texture create_rgba_texture( String filename ) throws IOException
// 	{
// 		return create_texture( load_image( filename ), GL_RGBA );
// 	}
//
//
// 	public static Texture create_rgba_texture( int width, int height )
// 	{
// 		return create_texture( create_argb_image( width, height ), GL_RGBA );
// 	}
//
//
// 	public static Texture create_rgb_texture( BufferedImage image )
// 	{
// 		return create_texture( image, GL_RGB );
// 	}
//
//
// 	public static Texture create_rgb_texture( String filename ) throws IOException
// 	{
// 		return create_texture( load_image( filename ), GL_RGB );
// 	}
//
//
// 	public static Texture create_rgb_texture( int width, int height )
// 	{
// 		return create_texture( create_rgb_image( width, height ), GL_RGB );
// 	}


/*
	public static MipmapTexture create_mipmap_texture( String filename, int levels ) throws IOException
	{
		return new MipmapTexture( GL_RGBA, load_image( filename ), levels );
	}


	public static MipmapTexture create_mipmap_texture( BufferedImage image, int levels )
	{
		return new MipmapTexture( GL_RGBA, image, levels );
	}
*/


	public static void set_texture_disk_cache_dir( File dir ) throws Exception
	{
		texture_disk_cache = new TextureDiskCache( dir );
		
		cinfo.println( "Using Texture Disk cache: %s", dir );
	}
	

	public static Texture create_texture( String filename ) throws Exception
	{
		if( texture_disk_cache != null )
		{
			cinfo.println( "Using Texture Disk cache to load " + filename );
			
			return texture_disk_cache.create_texture( filename );
		}
		
		return create_texture( load_image( filename ) );
	}


	public static Texture create_texture( String filename, int max_mipmap_level ) throws Exception
	{
		if( texture_disk_cache != null )
		{
			cinfo.println( "Using Texture Disk cache to load " + filename );
			
			return texture_disk_cache.create_texture( filename, max_mipmap_level );
		}

		return create_texture( load_image( filename ), max_mipmap_level );
	}


	public static Texture create_texture( BufferedImage image )
	{
		return create_texture( image, 0 );
	}


	public static Texture create_texture( BufferedImage image, int max_mipmap_level )
	{
		int w = image.getWidth();

		int h = image.getHeight();

		check_texture_size( w, h );
	
		Buffer image_data = image_to_buffer( image );

		return new Texture( GL_RGBA, w, h, image_data, max_mipmap_level );
	}


/*
	public static Texture tex_sub_image( Texture texture, Buffer image_data, int x, int y, int w, int h )
	{
		glPixelStorei( GL_UNPACK_ALIGNMENT, 1 );

		glActiveTexture( texture.tex_unit );

		glBindTexture( GL_TEXTURE_2D, texture.id );

		//glTexImage2D( GL_TEXTURE_2D, 0, format, width, height, 0, format, type, image_data );

		glTexSubImage2D( GL_TEXTURE_2D, 0, x, y, w, h, GL_RGBA, GL_UNSIGNED_BYTE, image_data );

		return texture;
	}
*/


// 	public static Texture create_float_texture( BufferedImage image )
// 	{
// 		int w = image.getWidth();
//
// 		int h = image.getHeight();
//
// 		if( ! isPowOf2( w ) || ! isPowOf2( h ) )
// 		{
// 			check( ! texture_size_check, "cannot make a texture from this image" );
//
// 			cerr.println( "Warning: image dimensions not power of 2" );
// 		}
//
// 		FloatBuffer image_data = image_to_float_buffer( image );
//
// 		return new Texture( GL_RGBA, w, h, image_data, GL_FLOAT );
// 	}


	public static void cache_byte_buffers( boolean use_buffer_cache )
	{
		LibSiGL.use_buffer_cache = use_buffer_cache;
	}
	

	public static ByteBuffer cached_byte_buffer( int size )
	{
		ByteBuffer buffer = null;
		
		if( use_buffer_cache )
		{
			buffer = byte_buffers_cache.get( size );
			
			if( buffer == null )
			{
				cinfo.println( "Creating new byte_buffer[ %d ]", size );
				
				buffer = byte_buffer( size );
				
				byte_buffers_cache.put( size, buffer );
			}
			else
			{
				cinfo.println( "Using existing byte_buffer[ %d ]", size );
			}
			
			buffer.rewind();
		}
		else
		{
			buffer = byte_buffer( size );
		}
		
		return buffer;
	}


	public static Texture create_empty_rgba_texture( int width, int height )
	{
		check_texture_size( width, height );
		
		return new Texture( GL_RGBA, width, height, byte_buffer( width * height * 4 ) );
	}


	public static Texture create_empty_depth_texture( int width, int height )
	{
		check_texture_size( width, height );

		return new Texture( GL_DEPTH_COMPONENT, width, height, byte_buffer( width * height * 4 ) );
	}


	public static FBOTexture create_FBO_texture( int width, int height )
	{
		check_texture_size( width, height );
		
		return new FBOTexture( GL_RGBA, width, height );
	}


	public static void apply_texture( Texture texture )
	{
		apply_texture( texture, GL_TEXTURE0 );
	}


	public static void apply_texture( Texture texture, int tex_unit )
	{
		if( texture == null )
		{
			glActiveTexture( tex_unit );

			glBindTexture( GL_TEXTURE_2D, 0 );
		}
		else
		{
			texture.apply( tex_unit );
		}
	}


	public static void textures( boolean on )
	{
		if( on )
		{
			glEnable( GL_TEXTURE_2D );
		}
		else
		{
			glDisable( GL_TEXTURE_2D );
		}
	}


// 	private static ByteBuffer buffer( BufferedImage image, int format )
// 	{
// 		if( format == GL_RGB ) return rgb_buffer( image );
//
// 		else if( format == GL_RGBA ) return rgba_buffer( image );
//
// 		exit( -1 );
//
// 		return null;
// 	}


	public static Buffer image_to_buffer( BufferedImage image )
	{
		return image_to_buffer( image, GL_UNSIGNED_BYTE );
	}


	public static Buffer image_to_buffer( BufferedImage image, int buffer_type )
	{
		if( buffer_type == GL_UNSIGNED_BYTE ) return image_to_byte_buffer( image );

		else if( buffer_type == GL_FLOAT ) return image_to_float_buffer( image );

		return null;
	}


	private static ByteBuffer image_to_byte_buffer( BufferedImage image )
	{
		int w = image.getWidth();
		int h = image.getHeight();

		ByteBuffer buffer = cached_byte_buffer( w * h * 4 );

		//for( int y=h-1; y>=0; y-- )
		for( int y=0; y<h; y++ )
		{
			for( int x=0; x<w; x++ )
			//for( int x=w-1; x>=0; x-- )
			{
				int col = image.getRGB( x, y ); // argb

				byte a = (byte) ( ( col >> 24 ) & 0xff );
				byte r = (byte) ( ( col >> 16 ) & 0xff );
				byte g = (byte) ( ( col >>  8 ) & 0xff );
				byte b = (byte) ( ( col >>  0 ) & 0xff );

				buffer.put( r );
				buffer.put( g );
				buffer.put( b );
				buffer.put( a );

				//Console.out.println( "r:%d g:%d b:%d a:%d", r, g, b, a );
			}
		}

		buffer.rewind();

		return buffer;
	}


	private static FloatBuffer image_to_float_buffer( BufferedImage image )
	{
		int w = image.getWidth();
		int h = image.getHeight();

		FloatBuffer buffer = cached_byte_buffer( w * h * 4 * 4 ).asFloatBuffer();

		//for( int y=h-1; y>=0; y-- )
		for( int y=0; y<h; y++ )
		{
			for( int x=0; x<w; x++ )
			//for( int x=w-1; x>=0; x-- )
			{
				int col = image.getRGB( x, y ); // argb

				float a = (float) ( ( col >> 24 ) & 0xff );
				float r = (float) ( ( col >> 16 ) & 0xff );
				float g = (float) ( ( col >>  8 ) & 0xff );
				float b = (float) ( ( col >>  0 ) & 0xff );

				buffer.put( r );
				buffer.put( g );
				buffer.put( b );
				buffer.put( a );

				//Console.out.println( "r:%d g:%d b:%d a:%d", r, g, b, a );
			}
		}

		buffer.rewind();

		return buffer;
	}


// 	private static ByteBuffer rgb_buffer( BufferedImage image )
// 	{
// 		int w = image.getWidth();
// 		int h = image.getHeight();
//
// 		ByteBuffer buffer = byte_buffer( w * h * 3 );
//
// 		//for( int y=h-1; y>=0; y-- )
// 		for( int y=0; y<h; y++ )
// 		{
// 			for( int x=0; x<w; x++ )
// 			//for( int x=w-1; x>=0; x-- )
// 			{
// 				int col = image.getRGB( x, y ); // argb
//
// 				byte r = (byte) ( ( col >> 16 ) & 0xff );
// 				byte g = (byte) ( ( col >>  8 ) & 0xff );
// 				byte b = (byte) ( ( col >>  0 ) & 0xff );
//
// 				buffer.put( r );
// 				buffer.put( g );
// 				buffer.put( b );
//
// 				//System.out.println( String.format( "r:%d g:%d b:%d", r, g, b ) );
// 			}
// 		}
//
// 		buffer.rewind();
//
// 		return buffer;
// 	}


	public static BufferedImage back_buffer_to_image()
	{
		glReadBuffer( GL_BACK );

		return buffer_to_image();
	}


	public static BufferedImage buffer_to_image()
	{
		int[] clip_params = clip_params();

		int x = clip_params[ 0 ];
		int y = clip_params[ 1 ];
		int w = clip_params[ 2 ];
		int h = clip_params[ 3 ];

		ByteBuffer rgba_buffer = byte_buffer( w * h * 4 );

		glReadPixels( x, y, w, h, GL_RGBA, GL_UNSIGNED_BYTE, rgba_buffer );

		BufferedImage argb_image = rgba_buffer_to_argb_image( rgba_buffer, w, h );

		return argb_image;
	}


	public static BufferedImage rgba_buffer_to_argb_image( ByteBuffer rgba_buffer, int w, int h )
	{
		rgba_buffer.rewind();

		BufferedImage argb_image = create_argb_image( w, h );

		for( int y=0; y<h; y++ )
		{
			for( int x=0; x<w; x++ )
			{
				int r = rgba_buffer.get() & 0xff;
				int g = rgba_buffer.get() & 0xff;
				int b = rgba_buffer.get() & 0xff;
				int a = rgba_buffer.get() & 0xff;

				int argb = ( a << 24 ) | ( r << 16 ) | ( g << 8 ) | ( b << 0 );

				argb_image.setRGB( x, y, argb );
			}
		}

		return argb_image;
	}



	// complex drawing helpers

// 	public static void point_grid_XZ( Vec3d p0, Vec3d p1, int nxlines, int nzlines, boolean texcoords )
// 	{
// 		begin_shape( GL_LINES );
//
// 		double y = avg( p0.y, p1.y );
//
// 		for( int i=0; i<nxlines; i++ )
// 		{
// 			double fi = pack( i, 0, nxlines - 1, 0, 1 );
//
// 			double x = interpolate( p0.x, p1.x, fi );
//
// 			for( int j=0; j<nzlines - 1; j++ )
// 			{
// 				double fj0 = pack( j, 0, nzlines - 1, 0, 1 );
//
// 				double z0 = interpolate( p0.z, p1.z, fj0 );
//
// 				double fj1 = pack( j + 1, 0, nzlines - 1, 0, 1 );
//
// 				double z1 = interpolate( p0.z, p1.z, fj1 );
//
// 				if( texcoords )
// 				{
// 					vertex( x, 0, z0, fi, fj0 );
//
// 					vertex( x, 0, z1, fi, fj1 );
// 				}
// 				else
// 				{
// 					vertex( x, 0, z0 );
//
// 					vertex( x, 0, z1 );
// 				}
// 			}
// 		}
//
// 		for( int i=0; i<nzlines; i++ )
// 		{
// 			double fi = pack( i, 0, nzlines - 1, 0, 1 );
//
// 			double z = interpolate( p0.z, p1.z, fi );
//
// 			for( int j=0; j<nxlines - 1; j++ )
// 			{
// 				double fj0 = pack( j, 0, nxlines - 1, 0, 1 );
//
// 				double x0 = interpolate( p0.x, p1.x, fj0 );
//
// 				double fj1 = pack( j + 1, 0, nxlines - 1, 0, 1 );
//
// 				double x1 = interpolate( p0.x, p1.x, fj1 );
//
// 				if( texcoords )
// 				{
// 					vertex( x0, 0, z, fj0, fi );
//
// 					vertex( x1, 0, z, fj1, fi );
// 				}
// 				else
// 				{
// 					vertex( x0, 0, z );
//
// 					vertex( x1, 0, z );
// 				}
// 			}
// 		}
//
// 		end_shape();
// 	}

	public static void point_grid_XZ( Vec3d p0, Vec3d p1, int nxlines, int nzlines, boolean texcoords )
	{
		double y = avg( p0.y, p1.y );

		for( int i=0; i<nxlines; i++ )
		{
			double fi = pack( i, 0, nxlines, 0, 1 );

			double x = interpolate( p0.x, p1.x, fi );

			begin_shape( GL_LINE_STRIP );

			for( int j=0; j<nzlines; j++ )
			{
				double fj = pack( j, 0, nzlines, 0, 1 );

				double z = interpolate( p0.z, p1.z, fj );

				if( texcoords )
				{
					vertex( x, y, z, fi, fj );
				}
				else
				{
					vertex( x, y, z );
				}
			}

			end_shape();
		}

		for( int i=0; i<nzlines; i++ )
		{
			double fi = pack( i, 0, nzlines, 0, 1 );

			double z = interpolate( p0.z, p1.z, fi );

			begin_shape( GL_LINE_STRIP );

			for( int j=0; j<nxlines; j++ )
			{
				double fj = pack( j, 0, nxlines, 0, 1 );

				double x = interpolate( p0.x, p1.x, fj );

				if( texcoords )
				{
					vertex( x, y, z, fj, fi );
				}
				else
				{
					vertex( x, y, z );
				}
			}

			end_shape();
		}
	}

	public static void grid_XZ( Vec3d p0, Vec3d p1, int nxlines, int nzlines )
	{
		begin_shape( GL_LINES );

		for( int i=0; i<nxlines; i++ )
		{
			double f = pack( i, 0, nxlines - 1, 0, 1 );

			double x = interpolate( p0.x, p1.x, f );

			double y = interpolate( p0.y, p1.y, f );

			vertex( x, y, p0.z );

			vertex( x, y, p1.z );
		}

		for( int i=0; i<nzlines; i++ )
		{
			double f = pack( i, 0, nzlines - 1, 0, 1 );

			double z = interpolate( p0.z, p1.z, f );

			double y = interpolate( p0.y, p1.y, f );

			vertex( p0.x, y, z );

			vertex( p1.x, y, z );
		}

		end_shape();
	}

	public static void grid_XZ( double min, double max, double y, int lines )
	{
		begin_shape( GL_LINES );

		for( int i=0; i<lines; i++ )
		{
			double x = i * ( ( max - min ) / ( lines - 1 ) ) + min;

			vertex( x, y, min );

			vertex( x, y, max );
		}

		for( int i=0; i<lines; i++ )
		{
			double z = i * ( ( max - min ) / ( lines - 1 ) ) + min;

			vertex( min, y, z );

			vertex( max, y, z );
		}

		end_shape();
	}


	public static void quad_strip_grid( Vec3d min, Vec3d max, int strips, int segments )
	{
		for( int zi=0; zi<strips; zi++ )
		{
			double z0 = pack( zi, 0, strips, min.z, max.z );

			double z1 = pack( zi + 1, 0, strips, min.z, max.z );

			double zt0 = pack( z0, min.z, max.z, 0, 1 );

			double zt1 = pack( z1, min.z, max.z, 0, 1 );

			begin_shape( GL_QUAD_STRIP );

			for( int xi=0; xi<segments+1; xi++ )
			{
				double x = pack( xi, 0, segments, min.x, max.x );

				double xt = pack( x, min.x, max.x, 0, 1 );

				vertex( x, 0, z0, xt, zt0 );

				vertex( x, 0, z1, xt, zt1 );
			}

			end_shape();
		}


	}



	public static void axes( double length )
	{
		begin_shape( GL_LINES );

		colour( Red );

		vertex( 0, 0, 0 );

		vertex( 0, 0, length );

		colour( Green );

		vertex( 0, 0, 0 );

		vertex( 0, length, 0 );

		colour( Blue );

		vertex( 0, 0, 0 );

		vertex( length, 0 ,0 );

		end_shape();
	}


	public static void cube( double size )
	{
		double s = size / 2;

		begin_shape( GL_QUADS );

			glNormal3d( 0, 0, -1 );

			vertex(  s, -s, -s, 1, 0 );
			vertex( -s, -s, -s, 0, 0 );
			vertex( -s,  s, -s, 0, 1 );
			vertex(  s,  s, -s, 1, 1 );

			glNormal3d( 0, 0, 1 );

			vertex( -s, -s,  s, 0, 0 );
			vertex(  s, -s,  s, 1, 0 );
			vertex(  s,  s,  s, 1, 1 );
			vertex( -s,  s,  s, 0, 1 );

			glNormal3d( 1, 0, 0 );

			vertex(  s, -s,  s, 0, 1 );
			vertex(  s, -s, -s, 0, 0 );
			vertex(  s,  s, -s, 1, 0 );
			vertex(  s,  s,  s, 1, 1 );

			glNormal3d( -1, 0, 0 );

			vertex(  -s, -s, -s, 0, 0 );
			vertex(  -s, -s,  s, 0, 1 );
			vertex(  -s,  s,  s, 1, 1 );
			vertex(  -s,  s, -s, 1, 0 );

			glNormal3d( 0, -1, 0 );

			vertex(  -s, -s, -s, 0, 0 );
			vertex(   s, -s, -s, 1, 0 );
			vertex(   s, -s,  s, 1, 1 );
			vertex(  -s, -s,  s, 0, 1 );

			glNormal3d( 0, 1, 0 );

			vertex(   s,  s, -s, 1, 0 );
			vertex(  -s,  s, -s, 0, 0 );
			vertex(  -s,  s,  s, 0, 1 );
			vertex(   s,  s,  s, 1, 1 );

		end_shape();
	}


	public static void quad( double width, double height )
	{
		double x = width / 2;
		double y = height / 2;

		begin_shape( GL_QUADS );

			glNormal3d( 0, 0, -1 );

			vertex(  x, -y,  0,  1,  0 );
			vertex( -x, -y,  0,  0,  0 );
			vertex( -x,  y,  0,  0,  1 );
			vertex(  x,  y,  0,  1,  1 );

		end_shape();
	}

	public static void box( Vec3d v )
	{
		double x = v.x / 2;
		double y = v.y / 2;
		double z = v.z / 2;

		begin_shape( GL_QUADS );

			glNormal3d( 0, 0, -1 );

			vertex(  x, -y, -z, 1, 0 );
			vertex( -x, -y, -z, 0, 0 );
			vertex( -x,  y, -z, 0, 1 );
			vertex(  x,  y, -z, 1, 1 );

			glNormal3d( 0, 0, 1 );

			vertex( -x, -y,  z, 0, 0 );
			vertex(  x, -y,  z, 1, 0 );
			vertex(  x,  y,  z, 1, 1 );
			vertex( -x,  y,  z, 0, 1 );

			glNormal3d( 1, 0, 0 );

			vertex(  x, -y,  z, 0, 1 );
			vertex(  x, -y, -z, 0, 0 );
			vertex(  x,  y, -z, 1, 0 );
			vertex(  x,  y,  z, 1, 1 );

			glNormal3d( -1, 0, 0 );

			vertex(  -x, -y, -z, 0, 0 );
			vertex(  -x, -y,  z, 0, 1 );
			vertex(  -x,  y,  z, 1, 1 );
			vertex(  -x,  y, -z, 1, 0 );

			glNormal3d( 0, -1, 0 );

			vertex(  -x, -y, -z, 0, 0 );
			vertex(   x, -y, -z, 1, 0 );
			vertex(   x, -y,  z, 1, 1 );
			vertex(  -x, -y,  z, 0, 1 );

			glNormal3d( 0, 1, 0 );

			vertex(   x,  y, -z, 1, 0 );
			vertex(  -x,  y, -z, 0, 0 );
			vertex(  -x,  y,  z, 0, 1 );
			vertex(   x,  y,  z, 1, 1 );

		end_shape();
	}

	public static void cylinder( double diameter, double height, int segs )
	{
		double r = diameter / 2.0;

		begin_shape( GL_QUAD_STRIP );
		{
			for( int xs=0; xs<=segs; xs++ )
			{
				double x0 = deg.cos( xs * 360.0f / segs );
				double y0 = - height / 2.0;
				double z0 = deg.sin( xs * 360.0f / segs );

				double x1 = x0;
				double y1 = height / 2.0;
				double z1 = z0;

				double tu0 = 1.0 - 1.0 * xs / segs;
				double tv0 = 0;

				double tu1 = tu0;
				double tv1 = 1;

				vertex( r * x0, y0, r * z0, x0, 0, z0, tu0, tv0 );

				vertex( r * x1, y1, r * z1, x1, 0, z1, tu1, tv1 );
			}
		}
		end_shape();

		begin_shape( GL_TRIANGLE_FAN );
		{
			double y = height / 2.0;

			glNormal3d( 0, 1, 0 );

			vertex( 0, y, 0 );

			for( int xs=segs; xs>=0; xs-- )
			{
				double x = deg.cos( xs * 360.0f / segs );
				double z = deg.sin( xs * 360.0f / segs );

				vertex( r * x, y, r * z );
			}
		}

		end_shape();

		begin_shape( GL_TRIANGLE_FAN );
		{
			double y = - height / 2.0;

			glNormal3d( 0, -1, 0 );

			vertex( 0, y, 0 );

			for( int xs=0; xs<=segs; xs++ )
			{
				double x = deg.cos( xs * 360.0f / segs );
				double z = deg.sin( xs * 360.0f / segs );

				vertex( r * x, y, r * z );
			}
		}

		end_shape();
	}


	
	public static void sphere( int xsegs, int ysegs, double radius )
	{
		sphere( xsegs, ysegs, radius, 1, 1, false, false );
	}


	public static void sphere( int xsegs, int ysegs, double radius, boolean normals, boolean texcoords )
	{
		sphere( xsegs, ysegs, radius, 1, 1, normals, texcoords );
	}


	public static void sphere( int xsegs, int ysegs, double radius, int xtile, int ytile, boolean normals, boolean texcoords )
	{
		double r = radius;

		begin_shape( GL_QUAD_STRIP );

		for( int ys=0; ys<ysegs; ys++ )
		{
			//for( int xs=0; xs<=xsegs; xs++ )
			for( int xs=xsegs; xs>=0; xs-- )
			{
				int ys0 = ys;

				double yt0 = 180.0f / ysegs * ys0;

				double sr0 = deg.sin( yt0 );

				double x0 = sr0 * deg.cos( xs * 360.0f / xsegs );
				double y0 = deg.cos( yt0 );
				double z0 = sr0 * deg.sin( xs * 360.0f / xsegs );

				int ys1 = ys + 1;

				double yt1 = 180.0f / ysegs * ys1;

				double sr1 = deg.sin( yt1 );

				double x1 = sr1 * deg.cos( xs * 360.0f / xsegs );
				double y1 = deg.cos( yt1 );
				double z1 = sr1 * deg.sin( xs * 360.0f / xsegs );

				double tu = 1.0f - 1.0f * xs / xsegs;
				double tv0 = 1.0f * ys0 / ysegs;
				double tv1 = 1.0f * ys1 / ysegs;

				tu *= xtile;

				tv0 *= ytile;
				tv1 *= ytile;


				if( normals && texcoords )
				{
					vertex( r * x0, r * y0, r * z0, x0, y0, z0, tu, tv0 );

					vertex( r * x1, r * y1, r * z1, x1, y1, z1, tu, tv1 );
				}
				else if( normals )
				{
					vertex( r * x0, r * y0, r * z0, x0, y0, z0 );

					vertex( r * x1, r * y1, r * z1, x1, y1, z1 );
				}
				else if( texcoords )
				{
					vertex( r * x0, r * y0, r * z0, tu, tv0 );

					vertex( r * x1, r * y1, r * z1, tu, tv1 );
				}
				else
				{
					vertex( r * x0, r * y0, r * z0 );

					vertex( r * x1, r * y1, r * z1 );
				}
			}
		}

		end_shape();
	}

/*
	public static void sphere2( int xsegs, int ysegs, double radius, boolean normals, boolean texcoords )
	{
		double r = radius;

		begin_shape( GL_QUAD_STRIP );

		for( int ys=0; ys<ysegs; ys++ )
		{
			//for( int xs=0; xs<=xsegs; xs++ )
			for( int xs=xsegs; xs>=0; xs-- )
			{
				int ys0 = ys;

				double yt0 = 180.0f / ysegs * ys0;

				double sr0 = deg.sin( yt0 );

				double x0 = sr0 * deg.cos( xs * 360.0f / xsegs );
				double y0 = deg.cos( yt0 );
				double z0 = sr0 * deg.sin( xs * 360.0f / xsegs );

				int ys1 = ys + 1;

				double yt1 = 180.0f / ysegs * ys1;

				double sr1 = deg.sin( yt1 );

				double x1 = sr1 * deg.cos( xs * 360.0f / xsegs );
				double y1 = deg.cos( yt1 );
				double z1 = sr1 * deg.sin( xs * 360.0f / xsegs );

				double tu = 1.0f - 1.0f * xs / xsegs;
				double tv0 = 1.0f * ys0 / ysegs;
				double tv1 = 1.0f * ys1 / ysegs;

				double dec0 = yt0 - 90;
				double dec1 = yt1 - 90;

				double tvw0 = deg.cos( dec0 );
				double tvw1 = deg.cos( dec1 );

				double tu0 = pack( tu, 0, 1, 0.5 - tvw0 / 2, 0.5 + tvw0 / 2 );
				double tu1 = pack( tu, 0, 1, 0.5 - tvw1 / 2, 0.5 + tvw1 / 2 );

				//double tu0 = pack( tu, 0, 1, 0, tvw0 );
				//double tu1 = pack( tu, 0, 1, 0, tvw1 );

				//cout.println( "ytheta0: %.2f - ytheta1: %.2f - tu0: %.2f - tu1: %.2f", yt0, yt1, tu, tu1 );

				//cout.println( "tu: %.2f - tu0: %.2f - tu1: %.2f", tu, tu0, tu1 );

				//tu = pack( tu, 0, 1,

				if( normals && texcoords )
				{
					vertex( r * x0, r * y0, r * z0, x0, y0, z0, tu0, tv0 );

					vertex( r * x1, r * y1, r * z1, x1, y1, z1, tu1, tv1 );
				}
				else if( normals )
				{
					vertex( r * x0, r * y0, r * z0, x0, y0, z0 );

					vertex( r * x1, r * y1, r * z1, x1, y1, z1 );
				}
				else if( texcoords )
				{
					vertex( r * x0, r * y0, r * z0, tu0, tv0 );

					vertex( r * x1, r * y1, r * z1, tu0, tv1 );
				}
				else
				{
					vertex( r * x0, r * y0, r * z0 );

					vertex( r * x1, r * y1, r * z1 );
				}
			}
		}

		end_shape();
	}
	*/


	public static ShaderProgram create_shader( String vert_source_filepath, String frag_source_filepath ) throws FileNotFoundException, IOException
	{
		VertexShader vert = null;

		FragmentShader frag = null;

		if( vert_source_filepath != null )
		{
			vert = new VertexShader( read_file( vert_source_filepath ) );
		}

		if( frag_source_filepath != null )
		{
			frag = new FragmentShader( read_file( frag_source_filepath ) );
		}

		return new ShaderProgram( vert, frag );
	}


	public static void render_fullscreen_textured_quad()
	{
		glMatrixMode( GL_MODELVIEW );

		glPushMatrix();

		glLoadIdentity();

		glMatrixMode( GL_PROJECTION );

		glPushMatrix();

		glLoadIdentity();

		begin_shape( GL_QUADS );

		vertex( -1,  1, 0, 0, 0 );

		vertex(  1,  1, 0, 1, 0 );

		vertex(  1, -1, 0, 1, 1 );

		vertex( -1, -1, 0, 0, 1 );

		end_shape();

		glPopMatrix();

		glMatrixMode( GL_MODELVIEW );

		glPopMatrix();
	}


	public static void render_fullscreen_quad()
	{
		glMatrixMode( GL_MODELVIEW );

		glPushMatrix();

		glLoadIdentity();

		glMatrixMode( GL_PROJECTION );

		glPushMatrix();

		glLoadIdentity();

		begin_shape( GL_QUADS );

		vertex( -1,  1, 0 );

		vertex(  1,  1, 0 );

		vertex(  1, -1, 0 );

		vertex( -1, -1, 0 );

		end_shape();

		glPopMatrix();

		glMatrixMode( GL_MODELVIEW );

		glPopMatrix();
	}


	static void check_texture_size( int width, int height )
	{
		if( ! isPowOf2( width ) || ! isPowOf2( height ) )
		{
			if( power_of_2_texture_size )
			{
				throw new RuntimeException( String.format( "create texture dimensions (%dx%d) not power of 2", width, height ) );
			}
			else
			{
				cwarn.println( "create texture dimensions (%dx%d) not power of 2", width, height );
			}
		}
	}
}





class TextureDiskCache
{
	File dir;
	
	boolean no_overwrite = true;
	
	public static final int ARGB = 0;
	
	public static final int RGBA = 1;
	
	public static final int HORIZONTAL = 0;
	
	public static final int VERTICAL = 1;

	byte[] file_buffer = new byte[ 1024000 ];
	
	//byte[] file_buffer = new byte[ 4096000 ];
	
	
	public TextureDiskCache( File dir ) throws Exception
	{
		compile_check( dir != null );
		
		if( ! dir.exists() )
		{
			dir.mkdirs();
		}
		
		runtime_check( dir.exists(), "Couldn't create directory [%s]", dir );
		
		runtime_check( dir.isDirectory(), "Not a directory [%s]", dir );
		
		this.dir = dir;
	}
	
	
	public void cache_image( String image_path ) throws Exception
	{
		cache_image( image_path, RGBA, HORIZONTAL );
	}
	

	
	public void cache_image( String image_path, int type, int align ) throws Exception
	{
		compile_check( image_path != null );
		
		BufferedImage image = load_image( image_path );
		
		File cache_file = data_file( image_path );
		
		cinfo.println( "Image cache file: %s", cache_file );
		
		if( cache_file.exists() )
		{
			cwarn.println( "Cached image already exists: " + cache_file );
			
			if( no_overwrite )
			{
				cwarn.println( "Not re-caching image (using existing one)" );
				
				return;
			}
			
			cwarn.println( "re-caching image (not using existing one)" );
		}
		
		
		
		try (EString meta = new EString())
		{
			meta.println( "type = " + type );
			
			meta.println( "alignment = " + align );
			
			meta.println( "width = " + width( image ) );
			
			meta.println( "height = " + height( image ) );
			
			File conf_file = meta_file( image_path );
			
			write_file( conf_file, meta.toString() );
		}
		
		OutputStream os = new BufferedOutputStream( new FileOutputStream( cache_file ) );
		
		byte[] colour = new byte[ 4 ];
		
		if( align == HORIZONTAL )
		{
			for( int y=0; y<height( image ); y++ )
			{
				for( int x=0; x<width( image ); x++ )
				{
					int pixel = get_pixel( image, x, y );
					
					write_pixel( pixel, colour, type, os );
				}
			}
		}
		else if( align == VERTICAL )
		{
			for( int x=0; x<width( image ); x++ )
			{
				for( int y=0; y<height( image ); y++ )
				{
					int pixel = get_pixel( image, x, y );
					
					write_pixel( pixel, colour, type, os );
				}
			}
		}
		
		os.flush();
		
		os.close();
	}
	
	
	private void write_pixel( int pixel, byte[] colour, int type, OutputStream os ) throws Exception
	{
		if( type == ARGB )
		{
			colour[ 0 ] = (byte) argbA( pixel );
			colour[ 1 ] = (byte) argbR( pixel );
			colour[ 2 ] = (byte) argbG( pixel );
			colour[ 3 ] = (byte) argbB( pixel );
		}
		else if( type == RGBA )
		{
			colour[ 0 ] = (byte) argbR( pixel );
			colour[ 1 ] = (byte) argbG( pixel );
			colour[ 2 ] = (byte) argbB( pixel );
			colour[ 3 ] = (byte) argbA( pixel );
		}
		else
		{
			runtime_check( false, "Image type must be ARGB or RGBA" );
		}
		
		os.write( colour, 0, 4 );
	}
	
	
	private File data_file( String image_path )
	{
		if( image_path.startsWith( "./" ) )
		{
			image_path = image_path.substring( 2 );
		}
		
		String cached_image_path = dir + "/" + image_path.replace( "/", "-" ) + ".bin";
		
		return new File( cached_image_path );
	}


	private File meta_file( String image_path )
	{
		if( image_path.startsWith( "./" ) )
		{
			image_path = image_path.substring( 2 );
		}

		String cached_image_meta_path = dir + "/" + image_path.replace( "/", "-" ) + ".conf";
		
		return new File( cached_image_meta_path );
	}
	
	
	public Texture create_texture( String image_path ) throws Exception
	{
		return create_texture( image_path, 0 );
	}
	
	
	public Texture create_texture( String image_path, int max_mipmap_level ) throws Exception
	{
		File data_file = data_file( image_path );
		
		if( ! data_file.exists() )
		{
			cache_image( image_path );
		}
		
		runtime_check( data_file.exists() );
		
		ConfigParser conf = ConfigParser.create_from_file( meta_file( image_path ) );
		
		// int type = conf.get_int( "type" ); 
		
		// int alignment = conf.get_int( "alignment" );
		
		int width = conf.get_int( "width" );
		
		int height = conf.get_int( "height" );

		LibSiGL.check_texture_size( width, height );

		ByteBuffer buffer = LibSiGL.cached_byte_buffer( (int) data_file.length() );
		
		try (BufferedInputStream in = new BufferedInputStream( new FileInputStream( data_file ) ))
		{
			int avail = 0;
			
			long t0 = systime();
			
			while( ( avail = in.available() ) > 0 )
			{
				int read = in.read( file_buffer, 0, min( avail, file_buffer.length ) );
				
				buffer.put( file_buffer, 0, read );
			}
			
			long t1 = systime();
			
			cinfo.println( "read %d bytes in %dms from %s", data_file.length(), t1 - t0, data_file );
		}

		buffer.rewind();

		return new Texture( GL_RGBA, width, height, buffer, max_mipmap_level );
	}
}
