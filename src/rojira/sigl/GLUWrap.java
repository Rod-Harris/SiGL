package rojira.sigl;

import javax.media.opengl.glu.GLU;

/**
	This is an auto generated class created via the Java reflection mechanism
	@author Rod Harris
*/

public final class GLUWrap
{
	public static GLU glu;

	public static final int GLU_FALSE = javax.media.opengl.glu.GLU.GLU_FALSE;
	public static final int GLU_TRUE = javax.media.opengl.glu.GLU.GLU_TRUE;
	public static final int GLU_VERSION = javax.media.opengl.glu.GLU.GLU_VERSION;
	public static final int GLU_EXTENSIONS = javax.media.opengl.glu.GLU.GLU_EXTENSIONS;
	public static final java.lang.String versionString = javax.media.opengl.glu.GLU.versionString;
	public static final java.lang.String extensionString = javax.media.opengl.glu.GLU.extensionString;
	public static final int GLU_INVALID_ENUM = javax.media.opengl.glu.GLU.GLU_INVALID_ENUM;
	public static final int GLU_INVALID_VALUE = javax.media.opengl.glu.GLU.GLU_INVALID_VALUE;
	public static final int GLU_OUT_OF_MEMORY = javax.media.opengl.glu.GLU.GLU_OUT_OF_MEMORY;
	public static final int GLU_INVALID_OPERATION = javax.media.opengl.glu.GLU.GLU_INVALID_OPERATION;
	public static final int GLU_ERROR = javax.media.opengl.glu.GLU.GLU_ERROR;
	public static final int GLU_POINT = javax.media.opengl.glu.GLU.GLU_POINT;
	public static final int GLU_LINE = javax.media.opengl.glu.GLU.GLU_LINE;
	public static final int GLU_FILL = javax.media.opengl.glu.GLU.GLU_FILL;
	public static final int GLU_SILHOUETTE = javax.media.opengl.glu.GLU.GLU_SILHOUETTE;
	public static final int GLU_SMOOTH = javax.media.opengl.glu.GLU.GLU_SMOOTH;
	public static final int GLU_FLAT = javax.media.opengl.glu.GLU.GLU_FLAT;
	public static final int GLU_NONE = javax.media.opengl.glu.GLU.GLU_NONE;
	public static final int GLU_OUTSIDE = javax.media.opengl.glu.GLU.GLU_OUTSIDE;
	public static final int GLU_INSIDE = javax.media.opengl.glu.GLU.GLU_INSIDE;
	public static final int GLU_TESS_BEGIN = javax.media.opengl.glu.GLU.GLU_TESS_BEGIN;
	public static final int GLU_BEGIN = javax.media.opengl.glu.GLU.GLU_BEGIN;
	public static final int GLU_TESS_VERTEX = javax.media.opengl.glu.GLU.GLU_TESS_VERTEX;
	public static final int GLU_VERTEX = javax.media.opengl.glu.GLU.GLU_VERTEX;
	public static final int GLU_TESS_END = javax.media.opengl.glu.GLU.GLU_TESS_END;
	public static final int GLU_END = javax.media.opengl.glu.GLU.GLU_END;
	public static final int GLU_TESS_ERROR = javax.media.opengl.glu.GLU.GLU_TESS_ERROR;
	public static final int GLU_TESS_EDGE_FLAG = javax.media.opengl.glu.GLU.GLU_TESS_EDGE_FLAG;
	public static final int GLU_EDGE_FLAG = javax.media.opengl.glu.GLU.GLU_EDGE_FLAG;
	public static final int GLU_TESS_COMBINE = javax.media.opengl.glu.GLU.GLU_TESS_COMBINE;
	public static final int GLU_TESS_BEGIN_DATA = javax.media.opengl.glu.GLU.GLU_TESS_BEGIN_DATA;
	public static final int GLU_TESS_VERTEX_DATA = javax.media.opengl.glu.GLU.GLU_TESS_VERTEX_DATA;
	public static final int GLU_TESS_END_DATA = javax.media.opengl.glu.GLU.GLU_TESS_END_DATA;
	public static final int GLU_TESS_ERROR_DATA = javax.media.opengl.glu.GLU.GLU_TESS_ERROR_DATA;
	public static final int GLU_TESS_EDGE_FLAG_DATA = javax.media.opengl.glu.GLU.GLU_TESS_EDGE_FLAG_DATA;
	public static final int GLU_TESS_COMBINE_DATA = javax.media.opengl.glu.GLU.GLU_TESS_COMBINE_DATA;
	public static final int GLU_CW = javax.media.opengl.glu.GLU.GLU_CW;
	public static final int GLU_CCW = javax.media.opengl.glu.GLU.GLU_CCW;
	public static final int GLU_INTERIOR = javax.media.opengl.glu.GLU.GLU_INTERIOR;
	public static final int GLU_EXTERIOR = javax.media.opengl.glu.GLU.GLU_EXTERIOR;
	public static final int GLU_UNKNOWN = javax.media.opengl.glu.GLU.GLU_UNKNOWN;
	public static final int GLU_TESS_WINDING_RULE = javax.media.opengl.glu.GLU.GLU_TESS_WINDING_RULE;
	public static final int GLU_TESS_BOUNDARY_ONLY = javax.media.opengl.glu.GLU.GLU_TESS_BOUNDARY_ONLY;
	public static final int GLU_TESS_TOLERANCE = javax.media.opengl.glu.GLU.GLU_TESS_TOLERANCE;
	public static final int GLU_TESS_ERROR1 = javax.media.opengl.glu.GLU.GLU_TESS_ERROR1;
	public static final int GLU_TESS_ERROR2 = javax.media.opengl.glu.GLU.GLU_TESS_ERROR2;
	public static final int GLU_TESS_ERROR3 = javax.media.opengl.glu.GLU.GLU_TESS_ERROR3;
	public static final int GLU_TESS_ERROR4 = javax.media.opengl.glu.GLU.GLU_TESS_ERROR4;
	public static final int GLU_TESS_ERROR5 = javax.media.opengl.glu.GLU.GLU_TESS_ERROR5;
	public static final int GLU_TESS_ERROR6 = javax.media.opengl.glu.GLU.GLU_TESS_ERROR6;
	public static final int GLU_TESS_ERROR7 = javax.media.opengl.glu.GLU.GLU_TESS_ERROR7;
	public static final int GLU_TESS_ERROR8 = javax.media.opengl.glu.GLU.GLU_TESS_ERROR8;
	public static final int GLU_TESS_MISSING_BEGIN_POLYGON = javax.media.opengl.glu.GLU.GLU_TESS_MISSING_BEGIN_POLYGON;
	public static final int GLU_TESS_MISSING_BEGIN_CONTOUR = javax.media.opengl.glu.GLU.GLU_TESS_MISSING_BEGIN_CONTOUR;
	public static final int GLU_TESS_MISSING_END_POLYGON = javax.media.opengl.glu.GLU.GLU_TESS_MISSING_END_POLYGON;
	public static final int GLU_TESS_MISSING_END_CONTOUR = javax.media.opengl.glu.GLU.GLU_TESS_MISSING_END_CONTOUR;
	public static final int GLU_TESS_COORD_TOO_LARGE = javax.media.opengl.glu.GLU.GLU_TESS_COORD_TOO_LARGE;
	public static final int GLU_TESS_NEED_COMBINE_CALLBACK = javax.media.opengl.glu.GLU.GLU_TESS_NEED_COMBINE_CALLBACK;
	public static final int GLU_TESS_WINDING_ODD = javax.media.opengl.glu.GLU.GLU_TESS_WINDING_ODD;
	public static final int GLU_TESS_WINDING_NONZERO = javax.media.opengl.glu.GLU.GLU_TESS_WINDING_NONZERO;
	public static final int GLU_TESS_WINDING_POSITIVE = javax.media.opengl.glu.GLU.GLU_TESS_WINDING_POSITIVE;
	public static final int GLU_TESS_WINDING_NEGATIVE = javax.media.opengl.glu.GLU.GLU_TESS_WINDING_NEGATIVE;
	public static final int GLU_TESS_WINDING_ABS_GEQ_TWO = javax.media.opengl.glu.GLU.GLU_TESS_WINDING_ABS_GEQ_TWO;
	public static final double GLU_TESS_MAX_COORD = javax.media.opengl.glu.GLU.GLU_TESS_MAX_COORD;

	private GLUWrap() {}

	public static final boolean isFunctionAvailable( java.lang.String a0 )
	{
		return glu.isFunctionAvailable( a0 );
	}
	@SuppressWarnings("static-access")
	public static final javax.media.opengl.GL getCurrentGL()
	{
		return glu.getCurrentGL();
	}
	public static final void gluBeginCurve( javax.media.opengl.glu.GLUnurbs a0 )
	{
		glu.gluBeginCurve( a0 );
	}
	public static final void gluBeginPolygon( javax.media.opengl.glu.GLUtessellator a0 )
	{
		glu.gluBeginPolygon( a0 );
	}
	public static final void gluBeginSurface( javax.media.opengl.glu.GLUnurbs a0 )
	{
		glu.gluBeginSurface( a0 );
	}
	public static final int gluBuild1DMipmapLevels( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.Buffer a8 )
	{
		return glu.gluBuild1DMipmapLevels( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final int gluBuild1DMipmaps( int a0, int a1, int a2, int a3, int a4, java.nio.Buffer a5 )
	{
		return glu.gluBuild1DMipmaps( a0, a1, a2, a3, a4, a5 );
	}
	public static final int gluBuild2DMipmapLevels( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, java.nio.Buffer a9 )
	{
		return glu.gluBuild2DMipmapLevels( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final int gluBuild2DMipmaps( int a0, int a1, int a2, int a3, int a4, int a5, java.nio.Buffer a6 )
	{
		return glu.gluBuild2DMipmaps( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final int gluBuild3DMipmapLevels( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, java.nio.Buffer a10 )
	{
		return glu.gluBuild3DMipmapLevels( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final int gluBuild3DMipmaps( int a0, int a1, int a2, int a3, int a4, int a5, int a6, java.nio.Buffer a7 )
	{
		return glu.gluBuild3DMipmaps( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final boolean gluCheckExtension( java.lang.String a0, java.lang.String a1 )
	{
		return glu.gluCheckExtension( a0, a1 );
	}
	public static final void gluCylinder( javax.media.opengl.glu.GLUquadric a0, double a1, double a2, double a3, int a4, int a5 )
	{
		glu.gluCylinder( a0, a1, a2, a3, a4, a5 );
	}
	public static final void gluDeleteQuadric( javax.media.opengl.glu.GLUquadric a0 )
	{
		glu.gluDeleteQuadric( a0 );
	}
	public static final void gluDeleteTess( javax.media.opengl.glu.GLUtessellator a0 )
	{
		glu.gluDeleteTess( a0 );
	}
	public static final void gluDisk( javax.media.opengl.glu.GLUquadric a0, double a1, double a2, int a3, int a4 )
	{
		glu.gluDisk( a0, a1, a2, a3, a4 );
	}
	public static final void gluEndCurve( javax.media.opengl.glu.GLUnurbs a0 )
	{
		glu.gluEndCurve( a0 );
	}
	public static final void gluEndPolygon( javax.media.opengl.glu.GLUtessellator a0 )
	{
		glu.gluEndPolygon( a0 );
	}
	public static final void gluEndSurface( javax.media.opengl.glu.GLUnurbs a0 )
	{
		glu.gluEndSurface( a0 );
	}
	public static final java.lang.String gluErrorString( int a0 )
	{
		return glu.gluErrorString( a0 );
	}
	public static final java.lang.String gluGetString( int a0 )
	{
		return glu.gluGetString( a0 );
	}
	public static final void gluGetTessProperty( javax.media.opengl.glu.GLUtessellator a0, int a1, double[] a2, int a3 )
	{
		glu.gluGetTessProperty( a0, a1, a2, a3 );
	}
	public static final void gluLookAt( double a0, double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8 )
	{
		glu.gluLookAt( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final javax.media.opengl.glu.GLUnurbs gluNewNurbsRenderer()
	{
		return glu.gluNewNurbsRenderer();
	}
	public static final javax.media.opengl.glu.GLUquadric gluNewQuadric()
	{
		return glu.gluNewQuadric();
	}
	public static final javax.media.opengl.glu.GLUtessellator gluNewTess()
	{
		return glu.gluNewTess();
	}
	public static final void gluNextContour( javax.media.opengl.glu.GLUtessellator a0, int a1 )
	{
		glu.gluNextContour( a0, a1 );
	}
	public static final void gluNurbsCurve( javax.media.opengl.glu.GLUnurbs a0, int a1, float[] a2, int a3, float[] a4, int a5, int a6 )
	{
		glu.gluNurbsCurve( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void gluNurbsProperty( javax.media.opengl.glu.GLUnurbs a0, int a1, float a2 )
	{
		glu.gluNurbsProperty( a0, a1, a2 );
	}
	public static final void gluNurbsSurface( javax.media.opengl.glu.GLUnurbs a0, int a1, float[] a2, int a3, float[] a4, int a5, int a6, float[] a7, int a8, int a9, int a10 )
	{
		glu.gluNurbsSurface( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void gluOrtho2D( double a0, double a1, double a2, double a3 )
	{
		glu.gluOrtho2D( a0, a1, a2, a3 );
	}
	public static final void gluPartialDisk( javax.media.opengl.glu.GLUquadric a0, double a1, double a2, int a3, int a4, double a5, double a6 )
	{
		glu.gluPartialDisk( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void gluPerspective( double a0, double a1, double a2, double a3 )
	{
		glu.gluPerspective( a0, a1, a2, a3 );
	}
	public static final void gluPickMatrix( double a0, double a1, double a2, double a3, int[] a4, int a5 )
	{
		glu.gluPickMatrix( a0, a1, a2, a3, a4, a5 );
	}
	public static final void gluPickMatrix( double a0, double a1, double a2, double a3, java.nio.IntBuffer a4 )
	{
		glu.gluPickMatrix( a0, a1, a2, a3, a4 );
	}
	public static final boolean gluProject( double a0, double a1, double a2, double[] a3, int a4, double[] a5, int a6, int[] a7, int a8, double[] a9, int a10 )
	{
		return glu.gluProject( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final boolean gluProject( double a0, double a1, double a2, java.nio.DoubleBuffer a3, java.nio.DoubleBuffer a4, java.nio.IntBuffer a5, java.nio.DoubleBuffer a6 )
	{
		return glu.gluProject( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void gluQuadricDrawStyle( javax.media.opengl.glu.GLUquadric a0, int a1 )
	{
		glu.gluQuadricDrawStyle( a0, a1 );
	}
	public static final void gluQuadricNormals( javax.media.opengl.glu.GLUquadric a0, int a1 )
	{
		glu.gluQuadricNormals( a0, a1 );
	}
	public static final void gluQuadricOrientation( javax.media.opengl.glu.GLUquadric a0, int a1 )
	{
		glu.gluQuadricOrientation( a0, a1 );
	}
	public static final void gluQuadricTexture( javax.media.opengl.glu.GLUquadric a0, boolean a1 )
	{
		glu.gluQuadricTexture( a0, a1 );
	}
	public static final int gluScaleImage( int a0, int a1, int a2, int a3, java.nio.Buffer a4, int a5, int a6, int a7, java.nio.Buffer a8 )
	{
		return glu.gluScaleImage( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void gluSphere( javax.media.opengl.glu.GLUquadric a0, double a1, int a2, int a3 )
	{
		glu.gluSphere( a0, a1, a2, a3 );
	}
	public static final void gluTessBeginContour( javax.media.opengl.glu.GLUtessellator a0 )
	{
		glu.gluTessBeginContour( a0 );
	}
	public static final void gluTessBeginPolygon( javax.media.opengl.glu.GLUtessellator a0, java.lang.Object a1 )
	{
		glu.gluTessBeginPolygon( a0, a1 );
	}
	public static final void gluTessCallback( javax.media.opengl.glu.GLUtessellator a0, int a1, javax.media.opengl.glu.GLUtessellatorCallback a2 )
	{
		glu.gluTessCallback( a0, a1, a2 );
	}
	public static final void gluTessEndContour( javax.media.opengl.glu.GLUtessellator a0 )
	{
		glu.gluTessEndContour( a0 );
	}
	public static final void gluTessEndPolygon( javax.media.opengl.glu.GLUtessellator a0 )
	{
		glu.gluTessEndPolygon( a0 );
	}
	public static final void gluTessNormal( javax.media.opengl.glu.GLUtessellator a0, double a1, double a2, double a3 )
	{
		glu.gluTessNormal( a0, a1, a2, a3 );
	}
	public static final void gluTessProperty( javax.media.opengl.glu.GLUtessellator a0, int a1, double a2 )
	{
		glu.gluTessProperty( a0, a1, a2 );
	}
	public static final void gluTessVertex( javax.media.opengl.glu.GLUtessellator a0, double[] a1, int a2, java.lang.Object a3 )
	{
		glu.gluTessVertex( a0, a1, a2, a3 );
	}
	public static final boolean gluUnProject( double a0, double a1, double a2, double[] a3, int a4, double[] a5, int a6, int[] a7, int a8, double[] a9, int a10 )
	{
		return glu.gluUnProject( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final boolean gluUnProject( double a0, double a1, double a2, java.nio.DoubleBuffer a3, java.nio.DoubleBuffer a4, java.nio.IntBuffer a5, java.nio.DoubleBuffer a6 )
	{
		return glu.gluUnProject( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final boolean gluUnProject4( double a0, double a1, double a2, double a3, double[] a4, int a5, double[] a6, int a7, int[] a8, int a9, double a10, double a11, double[] a12, int a13 )
	{
		return glu.gluUnProject4( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13 );
	}
	public static final boolean gluUnProject4( double a0, double a1, double a2, double a3, java.nio.DoubleBuffer a4, java.nio.DoubleBuffer a5, java.nio.IntBuffer a6, double a7, double a8, java.nio.DoubleBuffer a9 )
	{
		return glu.gluUnProject4( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
}
