
package rojira.sigl;

import static rojira.jsi4.LibGUI.image_hints;
import static rojira.jsi4.LibGUI.quality_image_hints;
import static rojira.sigl.GLUWrap.gluBuild2DMipmapLevels;
import static rojira.sigl.GLWrap.GL_GENERATE_MIPMAP;
import static rojira.sigl.GLWrap.GL_NEAREST;
import static rojira.sigl.GLWrap.GL_REPEAT;
import static rojira.sigl.GLWrap.GL_REPLACE;
import static rojira.sigl.GLWrap.GL_TEXTURE0;
import static rojira.sigl.GLWrap.GL_TEXTURE_2D;
import static rojira.sigl.GLWrap.GL_TEXTURE_BASE_LEVEL;
import static rojira.sigl.GLWrap.GL_TEXTURE_ENV;
import static rojira.sigl.GLWrap.GL_TEXTURE_ENV_MODE;
import static rojira.sigl.GLWrap.GL_TEXTURE_MAG_FILTER;
import static rojira.sigl.GLWrap.GL_TEXTURE_MAX_ANISOTROPY_EXT;
import static rojira.sigl.GLWrap.GL_TEXTURE_MAX_LEVEL;
import static rojira.sigl.GLWrap.GL_TEXTURE_MIN_FILTER;
import static rojira.sigl.GLWrap.GL_TEXTURE_WRAP_S;
import static rojira.sigl.GLWrap.GL_TEXTURE_WRAP_T;
import static rojira.sigl.GLWrap.GL_TRUE;
import static rojira.sigl.GLWrap.GL_UNPACK_ALIGNMENT;
import static rojira.sigl.GLWrap.GL_UNSIGNED_BYTE;
import static rojira.sigl.GLWrap.glActiveTexture;
import static rojira.sigl.GLWrap.glBindTexture;
import static rojira.sigl.GLWrap.glDeleteTextures;
import static rojira.sigl.GLWrap.glEnable;
import static rojira.sigl.GLWrap.glGenTextures;
import static rojira.sigl.GLWrap.glPixelStorei;
import static rojira.sigl.GLWrap.glTexEnvf;
import static rojira.sigl.GLWrap.glTexImage2D;
import static rojira.sigl.GLWrap.glTexParameterf;
import static rojira.sigl.GLWrap.glTexParameteri;
import static rojira.sigl.LibSiGL.image_to_buffer;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class MipmapTexture
{
	public final int id;

	public final int format;

	public final int width;

	public final int height;

	public final int max_levels;


	public int wrap_s = GL_REPEAT;

	public int wrap_t = GL_REPEAT;

	public int mag_filter = GL_NEAREST;

	public int min_filter = GL_NEAREST;

	public int mode = GL_REPLACE;

	public double anisotropy_filter_level = 1.0;


	private int tex_unit;


	protected MipmapTexture( int format, BufferedImage image_0, int max_levels )
	{
		int w = image_0.getWidth();

		int h = image_0.getHeight();

		this.format = format;

		this.width = w;

		this.height = h;

		this.max_levels = max_levels;

		image_hints = quality_image_hints;

		int[] tex_ids = { 0 };

		glGenTextures( 1, tex_ids, 0 );

		this.id = tex_ids[ 0 ];

		glPixelStorei( GL_UNPACK_ALIGNMENT, 1 );

		glActiveTexture( GL_TEXTURE0 );

		glBindTexture( GL_TEXTURE_2D, id );

		Buffer image_data = image_to_buffer( image_0 );

		if( max_levels >= 0 )
		{
			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_BASE_LEVEL, 0 );

			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MAX_LEVEL, max_levels );

			gluBuild2DMipmapLevels( GL_TEXTURE_2D, format, width, height, format, GL_UNSIGNED_BYTE, 0, 0, max_levels, image_data );

/*
			for( int i=1; i<=max_levels; i++ )
			{
				int iscale = i + 1;

				w /= 2;

				h /= 2;

				BufferedImage image_i = resize_image( image_0, w, h );

				view_image( image_i );

				image_data = image_to_buffer( image_i );

				cdebug.println( "Generating level %d mipmap [%dx%d]", i, w, h );

				glTexImage2D( GL_TEXTURE_2D, i, format, w, h, 0, format, GL_UNSIGNED_BYTE, image_data );
			}
*/
		}
		else
		{
			glTexParameteri( GL_TEXTURE_2D, GL_GENERATE_MIPMAP, GL_TRUE );

			glTexImage2D( GL_TEXTURE_2D, 0, format, width, height, 0, format, GL_UNSIGNED_BYTE, image_data );
		}

		glBindTexture( GL_TEXTURE_2D, 0 );
	}


	public void apply()
	{
		apply( GL_TEXTURE0 );
	}


	public void apply( final int tex_unit )
	{
		this.tex_unit = tex_unit;

		glActiveTexture( tex_unit );

		glBindTexture( GL_TEXTURE_2D, id );

		if( max_levels >= 0 )
		{
			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_BASE_LEVEL, 0 );
			glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MAX_LEVEL, max_levels );
		}

		glTexParameterf( GL_TEXTURE_2D, GL_TEXTURE_MAX_ANISOTROPY_EXT, (float) anisotropy_filter_level );

		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, wrap_s );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, wrap_t );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, mag_filter );
		glTexParameteri( GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, min_filter );

		glTexEnvf( GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, mode );

		glEnable( GL_TEXTURE_2D );
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
