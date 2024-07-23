package rojira.sigl;

import static rojira.sigl.GLWrap.*;

public class RenderBuffer
{
	int id;
	
	int width;
	
	int height;
	
	int format;
	
	
	public RenderBuffer( int width, int height, int format )
	{
		this.width = width;
		
		this.height = height;
		
		this.format = format;
	}
	
	
	public void initGL()
	{
		id = gen_render_buffer();

		bind();
		
		glRenderbufferStorageEXT( GL_RENDERBUFFER_EXT, format, width, height );
		
		unbind();
	}
	
	
	private int gen_render_buffer()
	{
		int[] ids = { 0 };
		
		glGenRenderbuffersEXT( 1, ids, 0 );
		
		return ids[ 0 ];
	}
	
	
	public void bind()
	{
		glBindRenderbufferEXT( GL_RENDERBUFFER_EXT, id );
	}
	
	
	public void unbind()
	{
		glBindRenderbufferEXT( GL_RENDERBUFFER_EXT, 0 );
	}
}
