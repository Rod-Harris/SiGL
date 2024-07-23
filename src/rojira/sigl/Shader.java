package rojira.sigl;

import static rojira.sigl.GLWrap.GL_OBJECT_INFO_LOG_LENGTH_ARB;
import static rojira.sigl.GLWrap.glDeleteObjectARB;
import static rojira.sigl.GLWrap.glGetInfoLogARB;
import static rojira.sigl.GLWrap.glGetObjectParameterivARB;
import static rojira.sigl.GLWrap.glGetUniformLocationARB;
import static rojira.sigl.GLWrap.glUniform1f;
import static rojira.sigl.GLWrap.glUniform1i;
import static rojira.sigl.GLWrap.glUniform2fv;
import static rojira.sigl.GLWrap.glUniform3fv;

import rojira.jsi4.util.maths.*;
//import jsi.lib.linalg.*;


public abstract class Shader
{
	protected int shader_id;


	public abstract void init() throws RuntimeException;


	protected void check( String stage, int code ) throws RuntimeException
	{
		if( code == 0 )
		{
			int[] info_log_size = { 0 };

			glGetObjectParameterivARB( shader_id, GL_OBJECT_INFO_LOG_LENGTH_ARB, info_log_size, 0 );

			byte[] info_log = new byte[ info_log_size[ 0 ] ];

			glGetInfoLogARB( shader_id, info_log_size[ 0 ], info_log_size, 0, info_log, 0 );

			String info_log_str = new String( info_log );

			String error_msg = String.format( "%s Error: code: %d : Info: %s", stage, code, info_log_str );

			throw new RuntimeException( error_msg );
		}
	}


	public void delete()
	{
		glDeleteObjectARB( shader_id );

		shader_id = 0;
	}


	public void finalize()
	{
		if( shader_id != 0 )
		{
			delete();
		}
	}


	public int getUniformLocation( String name )
	{
		return glGetUniformLocationARB( shader_id, name );
	}


	public void set( String name, int i )
	{
		glUniform1i( getUniformLocation( name ), i );
	}


	public void set( String name, double v )
	{
		glUniform1f( getUniformLocation( name ), (float) v );
	}


	public void set( String name, boolean b )
	{
		int i = 0;

		if( b ) i = 1;

		set( name, i );
	}


	public void set( String name, Vec2d... vecs )
	{
		float[] fv = new float[ vecs.length * 2 ];

		for( int i=0; i<vecs.length; i++ )
		{
			fv[ i * 2 + 0 ] = (float) vecs[ i ].x;
			fv[ i * 2 + 1 ] = (float) vecs[ i ].y;
		}

		glUniform2fv( getUniformLocation( name ), vecs.length, fv, 0 );
	}


	public void set( String name, Vec3d... vecs )
	{
		float[] fv = new float[ vecs.length * 3 ];

		for( int i=0; i<vecs.length; i++ )
		{
			fv[ i * 3 + 0 ] = (float) vecs[ i ].x;
			fv[ i * 3 + 1 ] = (float) vecs[ i ].y;
			fv[ i * 3 + 2 ] = (float) vecs[ i ].z;
		}

		glUniform3fv( getUniformLocation( name ), vecs.length, fv, 0 );
	}
}
