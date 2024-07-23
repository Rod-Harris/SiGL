
package rojira.sigl;

import static rojira.sigl.GLWrap.*;


public class VertexShader extends Shader
{
	private final String src;


	public VertexShader( final String src )
	{
		this.src = src;
	}


	public void init() throws RuntimeException
	{
		shader_id = glCreateShaderObjectARB( GL_VERTEX_SHADER_ARB );

		String[] shaders_src = { src };

		int[] src_lengths = { src.length() };

		glShaderSourceARB( shader_id, 1, shaders_src, src_lengths, 0 );

		glCompileShaderARB( shader_id );

		int[] success = { 0 };

		glGetObjectParameterivARB( shader_id, GL_OBJECT_COMPILE_STATUS_ARB, success, 0 );

		check( "Compile", success[ 0 ] );
	}
}
