
package rojira.sigl;

import static rojira.sigl.GLWrap.*;


public class ShaderProgram extends Shader
{
	public final VertexShader vertex_shader;

	public final FragmentShader fragment_shader;


	public ShaderProgram( final VertexShader vertex_shader )
	{
		this( vertex_shader, null );
	}


	public ShaderProgram( final FragmentShader fragment_shader )
	{
		this( null, fragment_shader );
	}


	public ShaderProgram( final VertexShader vertex_shader, final FragmentShader fragment_shader )
	{
		this.vertex_shader = vertex_shader;

		this.fragment_shader = fragment_shader;
	}


	public void init() throws RuntimeException
	{
		shader_id = glCreateProgramObjectARB();

		if( vertex_shader == null && fragment_shader == null )
		{
			throw new RuntimeException( "No vertex or fragment shaders specified for shader program" );
		}

		if( vertex_shader != null )
		{
			vertex_shader.init();

			glAttachObjectARB( shader_id, vertex_shader.shader_id );
		}

		if( fragment_shader != null )
		{
			fragment_shader.init();

			glAttachObjectARB( shader_id, fragment_shader.shader_id );
		}

		int[] success = { 0 };

		glLinkProgramARB( shader_id );

		glGetObjectParameterivARB( shader_id, GL_OBJECT_LINK_STATUS_ARB, success, 0 );

		check( "Link", success[ 0 ] );

		glValidateProgramARB( shader_id );

		glGetObjectParameterivARB( shader_id, GL_OBJECT_VALIDATE_STATUS_ARB, success, 0 );

		check( "Validate", success[ 0 ] );
	}


	public void apply()
	{
		glUseProgramObjectARB( shader_id );
	}


	public static void unapply()
	{
		glUseProgramObjectARB( 0 );
	}
}


