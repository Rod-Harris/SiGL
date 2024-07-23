package rojira.sigl;

import static rojira.jsi4.LibConsole.cinfo;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SiGLClassGenerator
{
	private static PrintStream out;
	
	static String DEBUG;
	
	public static void run() throws Exception
	{
		cinfo.println( "SiGLClassGenerator: generating GL(|U|UT) wrapper classes" );
		
		specialFunc();
		
		System.exit( 0 );
	}
	
	protected static void specialFunc() throws Exception
	{
		out = new PrintStream( new File( "GLWrap.java" ) );
		
		out.println( "package rojira.sigl;" );
		out.println();
		out.println( "import javax.media.opengl.GL;" );
		out.println();
		out.println( "$TOKEN000$" );
		out.println();
		out.println( "public final class GLWrap {" );
		out.println();
		out.println( "\tpublic static GL gl;" );
		out.println();
		writeVariables( "javax.media.opengl.", "GL", "gl" );
		out.println();
		out.println( "\tprivate GLWrap() {}" );
		out.println();
		writeMethods( "javax.media.opengl.", "GL", "gl" );
		out.println( "}" );
		
		out.flush();
		out.close();
		
		out = new PrintStream( new File( "GLUWrap.java" ) );
		
		out.println( "package rojira.sigl;" );
		out.println();
		out.println( "import javax.media.opengl.glu.GLU;" );
		out.println();
		out.println( "$TOKEN001$" );
		out.println();
		out.println( "public final class GLUWrap {" );
		out.println();
		out.println( "\tpublic static GLU glu;" );
		out.println();
		writeVariables( "javax.media.opengl.glu.", "GLU", "glu" );
		out.println();
		out.println( "\tprivate GLUWrap() {}" );
		out.println();
		writeMethods( "javax.media.opengl.glu.", "GLU", "glu" );
		out.println( "}" );
		
		out.flush();
		out.close();
		
		out = new PrintStream( new File( "GLUTWrap.java" ) );
		
		out.println( "package rojira.sigl;" );
		out.println();
		out.println( "import com.sun.opengl.util.GLUT;" );
		out.println();
		out.println( "$TOKEN002$" );
		out.println();
		out.println( "public final class GLUTWrap {" );
		out.println();
		out.println( "\tpublic static GLUT glut;" );
		out.println();
		writeVariables( "com.sun.opengl.util.", "GLUT", "glut" );
		out.println();
		out.println( "\tprivate GLUTWrap() {}" );
		out.println();
		writeMethods( "com.sun.opengl.util.", "GLUT", "glut" );
		out.println( "}" );
		
		out.flush();
		out.close();
	}
	
	private static void writeVariables( String _package, String _class, String _object ) throws Exception
	{
		// Additional logging
		System.out.printf( "Processing class: %s%s%n", _package, _class );
		
		Class<?> gl_class = Class.forName( _package + _class );
		
		Field[] fields = gl_class.getFields(); // Only public fields
		
		// Additional logging
		System.out.printf( "Found %d public fields in class %s%s%n", fields.length, _package, _class );
		
		for( Field f : fields )
		{
			f.setAccessible( true );
			
			String s = f.toString();
			
			int i1 = s.lastIndexOf( "." );
			
			String s1 = s.substring( 0, i1 );
			
			int i2 = s1.lastIndexOf( ' ' );
			
			String s2 = s1.substring( 0, i2 );
			
			s1 = s1.substring( i2 + 1 );
			
			out.printf( "\t%s %s = %s.%s;%n", s2, f.getName(), s1, f.getName() );
		}
	}
	
	private static void writeMethods( String _package, String _class, String _object ) throws Exception
	{
		// Additional logging
		System.out.printf( "Processing methods for class: %s%s%n", _package, _class );
		
		Class<?> gl_class = Class.forName( _package + _class );
		
		Method[] methods = gl_class.getDeclaredMethods();
		
		for( Method m : methods )
		{
			String s = m.toString();
			
			if( !s.startsWith( "public" ) )
			{
				continue;
			}
			
			s = s.replace( _package + _class + ".", "" );
			
			s = s.replace( " abstract", "" );
			
			if( s.indexOf( "static" ) == -1 )
			{
				s = s.replace( "public", "public static final" );
				} else {
				s = s.replace( "public static", "public static final" );
			}
			
			int i0 = s.indexOf( "(" );
			int i1 = s.indexOf( ")" );
			
			String args0 = s.substring( i0 + 1, i1 );
			
			String[] asirenist = args0.split( "," );
			
			String method_declaration = s.substring( 0, i0 ) + "(";
			
			String ret = m.getReturnType().toString();
			
			String method_call = "";
			
			String runtime_call = "assert dprintln( \"";
			
			if( !ret.equals( "void" ) )
			{
				method_call += "return ";
			}
			
			method_call += _object + "." + m.getName() + "(";
			
			runtime_call += m.getName() + "(";
			
			if( asirenist.length > 0 && asirenist[ 0 ].trim().length() > 0 )
			{
				method_declaration += " ";
				method_call += " ";
				runtime_call += " ";
				
				for( int i = 0; i < asirenist.length; i++ )
				{
					if( asirenist[ i ].equals( "javax.media.opengl.GL" ) )
					{
						method_declaration += "$TOKEN003$";
						
						method_call += "gl";
						
						if( i < asirenist.length - 1 )
						{
							method_declaration += " ";
							
							method_call += ", ";
						}
						} else if( asirenist[ i ].equals( "javax.media.opengl.glu.GLU" ) ) {
						method_declaration += "$TOKEN004$";
						
						method_call += "glu";
						
						if( i < asirenist.length - 1 )
						{
							method_declaration += " ";
							
							method_call += ", ";
						}
						} else {
						method_declaration += asirenist[ i ] + " a" + i;
						
						method_call += "a" + i;
						
						if( i < asirenist.length - 1 )
						{
							method_declaration += ", ";
							
							method_call += ", ";
						}
					}
					
					runtime_call += "\" + a" + i + " + \"";
					
					if( i < asirenist.length - 1 )
					{
						runtime_call += ", ";
					}
				}
				
				method_declaration += " ";
				method_call += " ";
				runtime_call += " ";
			}
			method_declaration += ")";
			method_call += ");";
			runtime_call += ")\" );";
			
			out.println( "\t" + method_declaration );
			out.println( "\t{" );
			out.println( "\t\t" + runtime_call );
			out.println( "\t\t" + method_call );
			out.println( "\t}" );
		}
		
		out.println( "\tprivate static boolean dprintln(String s) {" );
		out.println( "\t\tSystem.err.println(s);" );
		out.println( "\t\treturn true;" );
		out.println( "\t}" );
	}
	
	public static String sprintf( String fmt, Object... args )
	{
		return String.format( fmt, args );
	}
}
