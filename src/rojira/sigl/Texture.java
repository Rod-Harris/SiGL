
package rojira.sigl;

import java.nio.*;

import static rojira.sigl.GLWrap.*;
import static rojira.sigl.GLUWrap.*;

import static rojira.jsi4.LibSystem.*;
import static rojira.jsi4.LibConsole.*;

public class Texture
{
	public final int id;

	public final int format;

	public final int width;

	public final int height;


	public int wrap_s = GL_REPEAT;

	public int wrap_t = GL_REPEAT;

	public int mag_filter = GL_NEAREST;

	public int min_filter = GL_NEAREST;

	public int mode = GL_MODULATE;

	public double anisotropy_filter_level = 1.0;


	private int tex_unit;


	protected Texture( int format, int width, int height, Buffer image_data )
	{
		this( format, width, height, image_data, 0 );
	}


	protected Texture( int format, int width, int height, Buffer image_data, int max_mipmap_level )
	{
		this.format = format;

		this.width = width;

		this.height = height;

		int[] tex_ids = { 0 };

		glGenTextures( 1, tex_ids, 0 );

		this.id = tex_ids[ 0 ];

		glPixelStorei( GL_UNPACK_ALIGNMENT, 1 );

		glActiveTexture( GL_TEXTURE0 );

		glBindTexture( GL_TEXTURE_2D, id );

		long t0 = systime();
		
		if( max_mipmap_level == 0 )
		{
			glTexParameteri( GL_TEXTURE_2D, GL_GENERATE_MIPMAP, GL_FALSE );

			glTexImage2D( GL_TEXTURE_2D, 0, format, width, height, 0, format, GL_UNSIGNED_BYTE, image_data );
		}
		else if( max_mipmap_level > 0 )
		{
			min_filter = GL_NEAREST_MIPMAP_NEAREST;

			glTexParameteri( GL_TEXTURE_2D, GL_GENERATE_MIPMAP, GL_FALSE );

			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_BASE_LEVEL, 0 );

			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MAX_LEVEL, max_mipmap_level );

			gluBuild2DMipmapLevels( GL_TEXTURE_2D, format, width, height, format, GL_UNSIGNED_BYTE, 0, 0, max_mipmap_level, image_data );
		}
		else
		{
			min_filter = GL_NEAREST_MIPMAP_NEAREST;

			glTexParameteri( GL_TEXTURE_2D, GL_GENERATE_MIPMAP, GL_TRUE );

			glTexImage2D( GL_TEXTURE_2D, 0, format, width, height, 0, format, GL_UNSIGNED_BYTE, image_data );
		}
		
		long t1 = systime();
		
		cinfo.println( "Loaded texture in to graphics memory in %dms", t1 - t0 );

		glBindTexture( GL_TEXTURE_2D, 0 );
	}


	/**
	 * Applies this texture to active texture unit: GL_TEXTURE0
	 */
	public void apply()
	{
		apply( GL_TEXTURE0 );
	}


	/**
	 * Applies this texture to active texture unit: tex_unit
	 * @param tex_unit valid values GL_TEXTURE0, GL_TEXTURE1, GL_TEXTURE2, ...
	 */
	public void apply( final int tex_unit )
	{
		this.tex_unit = tex_unit;

		glActiveTexture( tex_unit );

		glBindTexture( GL_TEXTURE_2D, id );

		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, wrap_s );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, wrap_t );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, mag_filter );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, min_filter );

		glTexParameterf( GL_TEXTURE_2D, GL_TEXTURE_MAX_ANISOTROPY_EXT, (float) anisotropy_filter_level );

		glTexEnvf( GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, mode );
	}


	public void unapply()
	{
		glActiveTexture( tex_unit );

		glBindTexture( GL_TEXTURE_2D, 0 );

		this.tex_unit = 0;
	}


	public void delete()
	{
		int[] tex_ids = { id };

		glActiveTexture( tex_unit );

		glDeleteTextures( 1, tex_ids, 0 );

		this.tex_unit = 0;
	}
}
