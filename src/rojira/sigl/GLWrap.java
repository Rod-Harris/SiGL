package rojira.sigl;

import javax.media.opengl.GL;

/**
	This is an auto generated class created via the Java reflection mechanism
	@author Rod Harris
*/

public final class GLWrap
{

	public static GL gl;

	public static final int GL_FALSE = javax.media.opengl.GL.GL_FALSE;
	public static final int GL_TRUE = javax.media.opengl.GL.GL_TRUE;
	public static final int GL_BYTE = javax.media.opengl.GL.GL_BYTE;
	public static final int GL_UNSIGNED_BYTE = javax.media.opengl.GL.GL_UNSIGNED_BYTE;
	public static final int GL_SHORT = javax.media.opengl.GL.GL_SHORT;
	public static final int GL_UNSIGNED_SHORT = javax.media.opengl.GL.GL_UNSIGNED_SHORT;
	public static final int GL_INT = javax.media.opengl.GL.GL_INT;
	public static final int GL_UNSIGNED_INT = javax.media.opengl.GL.GL_UNSIGNED_INT;
	public static final int GL_FLOAT = javax.media.opengl.GL.GL_FLOAT;
	public static final int GL_DOUBLE = javax.media.opengl.GL.GL_DOUBLE;
	public static final int GL_2_BYTES = javax.media.opengl.GL.GL_2_BYTES;
	public static final int GL_3_BYTES = javax.media.opengl.GL.GL_3_BYTES;
	public static final int GL_4_BYTES = javax.media.opengl.GL.GL_4_BYTES;
	public static final int GL_POINTS = javax.media.opengl.GL.GL_POINTS;
	public static final int GL_LINES = javax.media.opengl.GL.GL_LINES;
	public static final int GL_LINE_LOOP = javax.media.opengl.GL.GL_LINE_LOOP;
	public static final int GL_LINE_STRIP = javax.media.opengl.GL.GL_LINE_STRIP;
	public static final int GL_TRIANGLES = javax.media.opengl.GL.GL_TRIANGLES;
	public static final int GL_TRIANGLE_STRIP = javax.media.opengl.GL.GL_TRIANGLE_STRIP;
	public static final int GL_TRIANGLE_FAN = javax.media.opengl.GL.GL_TRIANGLE_FAN;
	public static final int GL_QUADS = javax.media.opengl.GL.GL_QUADS;
	public static final int GL_QUAD_STRIP = javax.media.opengl.GL.GL_QUAD_STRIP;
	public static final int GL_POLYGON = javax.media.opengl.GL.GL_POLYGON;
	public static final int GL_MATRIX_MODE = javax.media.opengl.GL.GL_MATRIX_MODE;
	public static final int GL_MODELVIEW = javax.media.opengl.GL.GL_MODELVIEW;
	public static final int GL_PROJECTION = javax.media.opengl.GL.GL_PROJECTION;
	public static final int GL_TEXTURE = javax.media.opengl.GL.GL_TEXTURE;
	public static final int GL_POINT_SMOOTH = javax.media.opengl.GL.GL_POINT_SMOOTH;
	public static final int GL_POINT_SIZE = javax.media.opengl.GL.GL_POINT_SIZE;
	public static final int GL_POINT_SIZE_GRANULARITY = javax.media.opengl.GL.GL_POINT_SIZE_GRANULARITY;
	public static final int GL_POINT_SIZE_RANGE = javax.media.opengl.GL.GL_POINT_SIZE_RANGE;
	public static final int GL_LINE_SMOOTH = javax.media.opengl.GL.GL_LINE_SMOOTH;
	public static final int GL_LINE_STIPPLE = javax.media.opengl.GL.GL_LINE_STIPPLE;
	public static final int GL_LINE_STIPPLE_PATTERN = javax.media.opengl.GL.GL_LINE_STIPPLE_PATTERN;
	public static final int GL_LINE_STIPPLE_REPEAT = javax.media.opengl.GL.GL_LINE_STIPPLE_REPEAT;
	public static final int GL_LINE_WIDTH = javax.media.opengl.GL.GL_LINE_WIDTH;
	public static final int GL_LINE_WIDTH_GRANULARITY = javax.media.opengl.GL.GL_LINE_WIDTH_GRANULARITY;
	public static final int GL_LINE_WIDTH_RANGE = javax.media.opengl.GL.GL_LINE_WIDTH_RANGE;
	public static final int GL_POINT = javax.media.opengl.GL.GL_POINT;
	public static final int GL_LINE = javax.media.opengl.GL.GL_LINE;
	public static final int GL_FILL = javax.media.opengl.GL.GL_FILL;
	public static final int GL_CW = javax.media.opengl.GL.GL_CW;
	public static final int GL_CCW = javax.media.opengl.GL.GL_CCW;
	public static final int GL_FRONT = javax.media.opengl.GL.GL_FRONT;
	public static final int GL_BACK = javax.media.opengl.GL.GL_BACK;
	public static final int GL_POLYGON_MODE = javax.media.opengl.GL.GL_POLYGON_MODE;
	public static final int GL_POLYGON_SMOOTH = javax.media.opengl.GL.GL_POLYGON_SMOOTH;
	public static final int GL_POLYGON_STIPPLE = javax.media.opengl.GL.GL_POLYGON_STIPPLE;
	public static final int GL_EDGE_FLAG = javax.media.opengl.GL.GL_EDGE_FLAG;
	public static final int GL_CULL_FACE = javax.media.opengl.GL.GL_CULL_FACE;
	public static final int GL_CULL_FACE_MODE = javax.media.opengl.GL.GL_CULL_FACE_MODE;
	public static final int GL_FRONT_FACE = javax.media.opengl.GL.GL_FRONT_FACE;
	public static final int GL_POLYGON_OFFSET_FACTOR = javax.media.opengl.GL.GL_POLYGON_OFFSET_FACTOR;
	public static final int GL_POLYGON_OFFSET_UNITS = javax.media.opengl.GL.GL_POLYGON_OFFSET_UNITS;
	public static final int GL_POLYGON_OFFSET_POINT = javax.media.opengl.GL.GL_POLYGON_OFFSET_POINT;
	public static final int GL_POLYGON_OFFSET_LINE = javax.media.opengl.GL.GL_POLYGON_OFFSET_LINE;
	public static final int GL_POLYGON_OFFSET_FILL = javax.media.opengl.GL.GL_POLYGON_OFFSET_FILL;
	public static final int GL_COMPILE = javax.media.opengl.GL.GL_COMPILE;
	public static final int GL_COMPILE_AND_EXECUTE = javax.media.opengl.GL.GL_COMPILE_AND_EXECUTE;
	public static final int GL_LIST_BASE = javax.media.opengl.GL.GL_LIST_BASE;
	public static final int GL_LIST_INDEX = javax.media.opengl.GL.GL_LIST_INDEX;
	public static final int GL_LIST_MODE = javax.media.opengl.GL.GL_LIST_MODE;
	public static final int GL_NEVER = javax.media.opengl.GL.GL_NEVER;
	public static final int GL_LESS = javax.media.opengl.GL.GL_LESS;
	public static final int GL_EQUAL = javax.media.opengl.GL.GL_EQUAL;
	public static final int GL_LEQUAL = javax.media.opengl.GL.GL_LEQUAL;
	public static final int GL_GREATER = javax.media.opengl.GL.GL_GREATER;
	public static final int GL_NOTEQUAL = javax.media.opengl.GL.GL_NOTEQUAL;
	public static final int GL_GEQUAL = javax.media.opengl.GL.GL_GEQUAL;
	public static final int GL_ALWAYS = javax.media.opengl.GL.GL_ALWAYS;
	public static final int GL_DEPTH_TEST = javax.media.opengl.GL.GL_DEPTH_TEST;
	public static final int GL_DEPTH_BITS = javax.media.opengl.GL.GL_DEPTH_BITS;
	public static final int GL_DEPTH_CLEAR_VALUE = javax.media.opengl.GL.GL_DEPTH_CLEAR_VALUE;
	public static final int GL_DEPTH_FUNC = javax.media.opengl.GL.GL_DEPTH_FUNC;
	public static final int GL_DEPTH_RANGE = javax.media.opengl.GL.GL_DEPTH_RANGE;
	public static final int GL_DEPTH_WRITEMASK = javax.media.opengl.GL.GL_DEPTH_WRITEMASK;
	public static final int GL_DEPTH_COMPONENT = javax.media.opengl.GL.GL_DEPTH_COMPONENT;
	public static final int GL_LIGHTING = javax.media.opengl.GL.GL_LIGHTING;
	public static final int GL_LIGHT0 = javax.media.opengl.GL.GL_LIGHT0;
	public static final int GL_LIGHT1 = javax.media.opengl.GL.GL_LIGHT1;
	public static final int GL_LIGHT2 = javax.media.opengl.GL.GL_LIGHT2;
	public static final int GL_LIGHT3 = javax.media.opengl.GL.GL_LIGHT3;
	public static final int GL_LIGHT4 = javax.media.opengl.GL.GL_LIGHT4;
	public static final int GL_LIGHT5 = javax.media.opengl.GL.GL_LIGHT5;
	public static final int GL_LIGHT6 = javax.media.opengl.GL.GL_LIGHT6;
	public static final int GL_LIGHT7 = javax.media.opengl.GL.GL_LIGHT7;
	public static final int GL_SPOT_EXPONENT = javax.media.opengl.GL.GL_SPOT_EXPONENT;
	public static final int GL_SPOT_CUTOFF = javax.media.opengl.GL.GL_SPOT_CUTOFF;
	public static final int GL_CONSTANT_ATTENUATION = javax.media.opengl.GL.GL_CONSTANT_ATTENUATION;
	public static final int GL_LINEAR_ATTENUATION = javax.media.opengl.GL.GL_LINEAR_ATTENUATION;
	public static final int GL_QUADRATIC_ATTENUATION = javax.media.opengl.GL.GL_QUADRATIC_ATTENUATION;
	public static final int GL_AMBIENT = javax.media.opengl.GL.GL_AMBIENT;
	public static final int GL_DIFFUSE = javax.media.opengl.GL.GL_DIFFUSE;
	public static final int GL_SPECULAR = javax.media.opengl.GL.GL_SPECULAR;
	public static final int GL_SHININESS = javax.media.opengl.GL.GL_SHININESS;
	public static final int GL_EMISSION = javax.media.opengl.GL.GL_EMISSION;
	public static final int GL_POSITION = javax.media.opengl.GL.GL_POSITION;
	public static final int GL_SPOT_DIRECTION = javax.media.opengl.GL.GL_SPOT_DIRECTION;
	public static final int GL_AMBIENT_AND_DIFFUSE = javax.media.opengl.GL.GL_AMBIENT_AND_DIFFUSE;
	public static final int GL_COLOR_INDEXES = javax.media.opengl.GL.GL_COLOR_INDEXES;
	public static final int GL_LIGHT_MODEL_TWO_SIDE = javax.media.opengl.GL.GL_LIGHT_MODEL_TWO_SIDE;
	public static final int GL_LIGHT_MODEL_LOCAL_VIEWER = javax.media.opengl.GL.GL_LIGHT_MODEL_LOCAL_VIEWER;
	public static final int GL_LIGHT_MODEL_AMBIENT = javax.media.opengl.GL.GL_LIGHT_MODEL_AMBIENT;
	public static final int GL_FRONT_AND_BACK = javax.media.opengl.GL.GL_FRONT_AND_BACK;
	public static final int GL_SHADE_MODEL = javax.media.opengl.GL.GL_SHADE_MODEL;
	public static final int GL_FLAT = javax.media.opengl.GL.GL_FLAT;
	public static final int GL_SMOOTH = javax.media.opengl.GL.GL_SMOOTH;
	public static final int GL_COLOR_MATERIAL = javax.media.opengl.GL.GL_COLOR_MATERIAL;
	public static final int GL_COLOR_MATERIAL_FACE = javax.media.opengl.GL.GL_COLOR_MATERIAL_FACE;
	public static final int GL_COLOR_MATERIAL_PARAMETER = javax.media.opengl.GL.GL_COLOR_MATERIAL_PARAMETER;
	public static final int GL_NORMALIZE = javax.media.opengl.GL.GL_NORMALIZE;
	public static final int GL_CLIP_PLANE0 = javax.media.opengl.GL.GL_CLIP_PLANE0;
	public static final int GL_CLIP_PLANE1 = javax.media.opengl.GL.GL_CLIP_PLANE1;
	public static final int GL_CLIP_PLANE2 = javax.media.opengl.GL.GL_CLIP_PLANE2;
	public static final int GL_CLIP_PLANE3 = javax.media.opengl.GL.GL_CLIP_PLANE3;
	public static final int GL_CLIP_PLANE4 = javax.media.opengl.GL.GL_CLIP_PLANE4;
	public static final int GL_CLIP_PLANE5 = javax.media.opengl.GL.GL_CLIP_PLANE5;
	public static final int GL_ACCUM_RED_BITS = javax.media.opengl.GL.GL_ACCUM_RED_BITS;
	public static final int GL_ACCUM_GREEN_BITS = javax.media.opengl.GL.GL_ACCUM_GREEN_BITS;
	public static final int GL_ACCUM_BLUE_BITS = javax.media.opengl.GL.GL_ACCUM_BLUE_BITS;
	public static final int GL_ACCUM_ALPHA_BITS = javax.media.opengl.GL.GL_ACCUM_ALPHA_BITS;
	public static final int GL_ACCUM_CLEAR_VALUE = javax.media.opengl.GL.GL_ACCUM_CLEAR_VALUE;
	public static final int GL_ACCUM = javax.media.opengl.GL.GL_ACCUM;
	public static final int GL_ADD = javax.media.opengl.GL.GL_ADD;
	public static final int GL_LOAD = javax.media.opengl.GL.GL_LOAD;
	public static final int GL_MULT = javax.media.opengl.GL.GL_MULT;
	public static final int GL_RETURN = javax.media.opengl.GL.GL_RETURN;
	public static final int GL_ALPHA_TEST = javax.media.opengl.GL.GL_ALPHA_TEST;
	public static final int GL_ALPHA_TEST_REF = javax.media.opengl.GL.GL_ALPHA_TEST_REF;
	public static final int GL_ALPHA_TEST_FUNC = javax.media.opengl.GL.GL_ALPHA_TEST_FUNC;
	public static final int GL_BLEND = javax.media.opengl.GL.GL_BLEND;
	public static final int GL_BLEND_SRC = javax.media.opengl.GL.GL_BLEND_SRC;
	public static final int GL_BLEND_DST = javax.media.opengl.GL.GL_BLEND_DST;
	public static final int GL_ZERO = javax.media.opengl.GL.GL_ZERO;
	public static final int GL_ONE = javax.media.opengl.GL.GL_ONE;
	public static final int GL_SRC_COLOR = javax.media.opengl.GL.GL_SRC_COLOR;
	public static final int GL_ONE_MINUS_SRC_COLOR = javax.media.opengl.GL.GL_ONE_MINUS_SRC_COLOR;
	public static final int GL_SRC_ALPHA = javax.media.opengl.GL.GL_SRC_ALPHA;
	public static final int GL_ONE_MINUS_SRC_ALPHA = javax.media.opengl.GL.GL_ONE_MINUS_SRC_ALPHA;
	public static final int GL_DST_ALPHA = javax.media.opengl.GL.GL_DST_ALPHA;
	public static final int GL_ONE_MINUS_DST_ALPHA = javax.media.opengl.GL.GL_ONE_MINUS_DST_ALPHA;
	public static final int GL_DST_COLOR = javax.media.opengl.GL.GL_DST_COLOR;
	public static final int GL_ONE_MINUS_DST_COLOR = javax.media.opengl.GL.GL_ONE_MINUS_DST_COLOR;
	public static final int GL_SRC_ALPHA_SATURATE = javax.media.opengl.GL.GL_SRC_ALPHA_SATURATE;
	public static final int GL_FEEDBACK = javax.media.opengl.GL.GL_FEEDBACK;
	public static final int GL_RENDER = javax.media.opengl.GL.GL_RENDER;
	public static final int GL_SELECT = javax.media.opengl.GL.GL_SELECT;
	public static final int GL_2D = javax.media.opengl.GL.GL_2D;
	public static final int GL_3D = javax.media.opengl.GL.GL_3D;
	public static final int GL_3D_COLOR = javax.media.opengl.GL.GL_3D_COLOR;
	public static final int GL_3D_COLOR_TEXTURE = javax.media.opengl.GL.GL_3D_COLOR_TEXTURE;
	public static final int GL_4D_COLOR_TEXTURE = javax.media.opengl.GL.GL_4D_COLOR_TEXTURE;
	public static final int GL_POINT_TOKEN = javax.media.opengl.GL.GL_POINT_TOKEN;
	public static final int GL_LINE_TOKEN = javax.media.opengl.GL.GL_LINE_TOKEN;
	public static final int GL_LINE_RESET_TOKEN = javax.media.opengl.GL.GL_LINE_RESET_TOKEN;
	public static final int GL_POLYGON_TOKEN = javax.media.opengl.GL.GL_POLYGON_TOKEN;
	public static final int GL_BITMAP_TOKEN = javax.media.opengl.GL.GL_BITMAP_TOKEN;
	public static final int GL_DRAW_PIXEL_TOKEN = javax.media.opengl.GL.GL_DRAW_PIXEL_TOKEN;
	public static final int GL_COPY_PIXEL_TOKEN = javax.media.opengl.GL.GL_COPY_PIXEL_TOKEN;
	public static final int GL_PASS_THROUGH_TOKEN = javax.media.opengl.GL.GL_PASS_THROUGH_TOKEN;
	public static final int GL_FEEDBACK_BUFFER_POINTER = javax.media.opengl.GL.GL_FEEDBACK_BUFFER_POINTER;
	public static final int GL_FEEDBACK_BUFFER_SIZE = javax.media.opengl.GL.GL_FEEDBACK_BUFFER_SIZE;
	public static final int GL_FEEDBACK_BUFFER_TYPE = javax.media.opengl.GL.GL_FEEDBACK_BUFFER_TYPE;
	public static final int GL_SELECTION_BUFFER_POINTER = javax.media.opengl.GL.GL_SELECTION_BUFFER_POINTER;
	public static final int GL_SELECTION_BUFFER_SIZE = javax.media.opengl.GL.GL_SELECTION_BUFFER_SIZE;
	public static final int GL_FOG = javax.media.opengl.GL.GL_FOG;
	public static final int GL_FOG_MODE = javax.media.opengl.GL.GL_FOG_MODE;
	public static final int GL_FOG_DENSITY = javax.media.opengl.GL.GL_FOG_DENSITY;
	public static final int GL_FOG_COLOR = javax.media.opengl.GL.GL_FOG_COLOR;
	public static final int GL_FOG_INDEX = javax.media.opengl.GL.GL_FOG_INDEX;
	public static final int GL_FOG_START = javax.media.opengl.GL.GL_FOG_START;
	public static final int GL_FOG_END = javax.media.opengl.GL.GL_FOG_END;
	public static final int GL_LINEAR = javax.media.opengl.GL.GL_LINEAR;
	public static final int GL_EXP = javax.media.opengl.GL.GL_EXP;
	public static final int GL_EXP2 = javax.media.opengl.GL.GL_EXP2;
	public static final int GL_LOGIC_OP = javax.media.opengl.GL.GL_LOGIC_OP;
	public static final int GL_INDEX_LOGIC_OP = javax.media.opengl.GL.GL_INDEX_LOGIC_OP;
	public static final int GL_COLOR_LOGIC_OP = javax.media.opengl.GL.GL_COLOR_LOGIC_OP;
	public static final int GL_LOGIC_OP_MODE = javax.media.opengl.GL.GL_LOGIC_OP_MODE;
	public static final int GL_CLEAR = javax.media.opengl.GL.GL_CLEAR;
	public static final int GL_SET = javax.media.opengl.GL.GL_SET;
	public static final int GL_COPY = javax.media.opengl.GL.GL_COPY;
	public static final int GL_COPY_INVERTED = javax.media.opengl.GL.GL_COPY_INVERTED;
	public static final int GL_NOOP = javax.media.opengl.GL.GL_NOOP;
	public static final int GL_INVERT = javax.media.opengl.GL.GL_INVERT;
	public static final int GL_AND = javax.media.opengl.GL.GL_AND;
	public static final int GL_NAND = javax.media.opengl.GL.GL_NAND;
	public static final int GL_OR = javax.media.opengl.GL.GL_OR;
	public static final int GL_NOR = javax.media.opengl.GL.GL_NOR;
	public static final int GL_XOR = javax.media.opengl.GL.GL_XOR;
	public static final int GL_EQUIV = javax.media.opengl.GL.GL_EQUIV;
	public static final int GL_AND_REVERSE = javax.media.opengl.GL.GL_AND_REVERSE;
	public static final int GL_AND_INVERTED = javax.media.opengl.GL.GL_AND_INVERTED;
	public static final int GL_OR_REVERSE = javax.media.opengl.GL.GL_OR_REVERSE;
	public static final int GL_OR_INVERTED = javax.media.opengl.GL.GL_OR_INVERTED;
	public static final int GL_STENCIL_TEST = javax.media.opengl.GL.GL_STENCIL_TEST;
	public static final int GL_STENCIL_WRITEMASK = javax.media.opengl.GL.GL_STENCIL_WRITEMASK;
	public static final int GL_STENCIL_BITS = javax.media.opengl.GL.GL_STENCIL_BITS;
	public static final int GL_STENCIL_FUNC = javax.media.opengl.GL.GL_STENCIL_FUNC;
	public static final int GL_STENCIL_VALUE_MASK = javax.media.opengl.GL.GL_STENCIL_VALUE_MASK;
	public static final int GL_STENCIL_REF = javax.media.opengl.GL.GL_STENCIL_REF;
	public static final int GL_STENCIL_FAIL = javax.media.opengl.GL.GL_STENCIL_FAIL;
	public static final int GL_STENCIL_PASS_DEPTH_PASS = javax.media.opengl.GL.GL_STENCIL_PASS_DEPTH_PASS;
	public static final int GL_STENCIL_PASS_DEPTH_FAIL = javax.media.opengl.GL.GL_STENCIL_PASS_DEPTH_FAIL;
	public static final int GL_STENCIL_CLEAR_VALUE = javax.media.opengl.GL.GL_STENCIL_CLEAR_VALUE;
	public static final int GL_STENCIL_INDEX = javax.media.opengl.GL.GL_STENCIL_INDEX;
	public static final int GL_KEEP = javax.media.opengl.GL.GL_KEEP;
	public static final int GL_REPLACE = javax.media.opengl.GL.GL_REPLACE;
	public static final int GL_INCR = javax.media.opengl.GL.GL_INCR;
	public static final int GL_DECR = javax.media.opengl.GL.GL_DECR;
	public static final int GL_NONE = javax.media.opengl.GL.GL_NONE;
	public static final int GL_LEFT = javax.media.opengl.GL.GL_LEFT;
	public static final int GL_RIGHT = javax.media.opengl.GL.GL_RIGHT;
	public static final int GL_FRONT_LEFT = javax.media.opengl.GL.GL_FRONT_LEFT;
	public static final int GL_FRONT_RIGHT = javax.media.opengl.GL.GL_FRONT_RIGHT;
	public static final int GL_BACK_LEFT = javax.media.opengl.GL.GL_BACK_LEFT;
	public static final int GL_BACK_RIGHT = javax.media.opengl.GL.GL_BACK_RIGHT;
	public static final int GL_AUX0 = javax.media.opengl.GL.GL_AUX0;
	public static final int GL_AUX1 = javax.media.opengl.GL.GL_AUX1;
	public static final int GL_AUX2 = javax.media.opengl.GL.GL_AUX2;
	public static final int GL_AUX3 = javax.media.opengl.GL.GL_AUX3;
	public static final int GL_COLOR_INDEX = javax.media.opengl.GL.GL_COLOR_INDEX;
	public static final int GL_RED = javax.media.opengl.GL.GL_RED;
	public static final int GL_GREEN = javax.media.opengl.GL.GL_GREEN;
	public static final int GL_BLUE = javax.media.opengl.GL.GL_BLUE;
	public static final int GL_ALPHA = javax.media.opengl.GL.GL_ALPHA;
	public static final int GL_LUMINANCE = javax.media.opengl.GL.GL_LUMINANCE;
	public static final int GL_LUMINANCE_ALPHA = javax.media.opengl.GL.GL_LUMINANCE_ALPHA;
	public static final int GL_ALPHA_BITS = javax.media.opengl.GL.GL_ALPHA_BITS;
	public static final int GL_RED_BITS = javax.media.opengl.GL.GL_RED_BITS;
	public static final int GL_GREEN_BITS = javax.media.opengl.GL.GL_GREEN_BITS;
	public static final int GL_BLUE_BITS = javax.media.opengl.GL.GL_BLUE_BITS;
	public static final int GL_INDEX_BITS = javax.media.opengl.GL.GL_INDEX_BITS;
	public static final int GL_SUBPIXEL_BITS = javax.media.opengl.GL.GL_SUBPIXEL_BITS;
	public static final int GL_AUX_BUFFERS = javax.media.opengl.GL.GL_AUX_BUFFERS;
	public static final int GL_READ_BUFFER = javax.media.opengl.GL.GL_READ_BUFFER;
	public static final int GL_DRAW_BUFFER = javax.media.opengl.GL.GL_DRAW_BUFFER;
	public static final int GL_DOUBLEBUFFER = javax.media.opengl.GL.GL_DOUBLEBUFFER;
	public static final int GL_STEREO = javax.media.opengl.GL.GL_STEREO;
	public static final int GL_BITMAP = javax.media.opengl.GL.GL_BITMAP;
	public static final int GL_COLOR = javax.media.opengl.GL.GL_COLOR;
	public static final int GL_DEPTH = javax.media.opengl.GL.GL_DEPTH;
	public static final int GL_STENCIL = javax.media.opengl.GL.GL_STENCIL;
	public static final int GL_DITHER = javax.media.opengl.GL.GL_DITHER;
	public static final int GL_RGB = javax.media.opengl.GL.GL_RGB;
	public static final int GL_RGBA = javax.media.opengl.GL.GL_RGBA;
	public static final int GL_MAX_LIST_NESTING = javax.media.opengl.GL.GL_MAX_LIST_NESTING;
	public static final int GL_MAX_ATTRIB_STACK_DEPTH = javax.media.opengl.GL.GL_MAX_ATTRIB_STACK_DEPTH;
	public static final int GL_MAX_MODELVIEW_STACK_DEPTH = javax.media.opengl.GL.GL_MAX_MODELVIEW_STACK_DEPTH;
	public static final int GL_MAX_NAME_STACK_DEPTH = javax.media.opengl.GL.GL_MAX_NAME_STACK_DEPTH;
	public static final int GL_MAX_PROJECTION_STACK_DEPTH = javax.media.opengl.GL.GL_MAX_PROJECTION_STACK_DEPTH;
	public static final int GL_MAX_TEXTURE_STACK_DEPTH = javax.media.opengl.GL.GL_MAX_TEXTURE_STACK_DEPTH;
	public static final int GL_MAX_EVAL_ORDER = javax.media.opengl.GL.GL_MAX_EVAL_ORDER;
	public static final int GL_MAX_LIGHTS = javax.media.opengl.GL.GL_MAX_LIGHTS;
	public static final int GL_MAX_CLIP_PLANES = javax.media.opengl.GL.GL_MAX_CLIP_PLANES;
	public static final int GL_MAX_TEXTURE_SIZE = javax.media.opengl.GL.GL_MAX_TEXTURE_SIZE;
	public static final int GL_MAX_PIXEL_MAP_TABLE = javax.media.opengl.GL.GL_MAX_PIXEL_MAP_TABLE;
	public static final int GL_MAX_VIEWPORT_DIMS = javax.media.opengl.GL.GL_MAX_VIEWPORT_DIMS;
	public static final int GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = javax.media.opengl.GL.GL_MAX_CLIENT_ATTRIB_STACK_DEPTH;
	public static final int GL_ATTRIB_STACK_DEPTH = javax.media.opengl.GL.GL_ATTRIB_STACK_DEPTH;
	public static final int GL_CLIENT_ATTRIB_STACK_DEPTH = javax.media.opengl.GL.GL_CLIENT_ATTRIB_STACK_DEPTH;
	public static final int GL_COLOR_CLEAR_VALUE = javax.media.opengl.GL.GL_COLOR_CLEAR_VALUE;
	public static final int GL_COLOR_WRITEMASK = javax.media.opengl.GL.GL_COLOR_WRITEMASK;
	public static final int GL_CURRENT_INDEX = javax.media.opengl.GL.GL_CURRENT_INDEX;
	public static final int GL_CURRENT_COLOR = javax.media.opengl.GL.GL_CURRENT_COLOR;
	public static final int GL_CURRENT_NORMAL = javax.media.opengl.GL.GL_CURRENT_NORMAL;
	public static final int GL_CURRENT_RASTER_COLOR = javax.media.opengl.GL.GL_CURRENT_RASTER_COLOR;
	public static final int GL_CURRENT_RASTER_DISTANCE = javax.media.opengl.GL.GL_CURRENT_RASTER_DISTANCE;
	public static final int GL_CURRENT_RASTER_INDEX = javax.media.opengl.GL.GL_CURRENT_RASTER_INDEX;
	public static final int GL_CURRENT_RASTER_POSITION = javax.media.opengl.GL.GL_CURRENT_RASTER_POSITION;
	public static final int GL_CURRENT_RASTER_TEXTURE_COORDS = javax.media.opengl.GL.GL_CURRENT_RASTER_TEXTURE_COORDS;
	public static final int GL_CURRENT_RASTER_POSITION_VALID = javax.media.opengl.GL.GL_CURRENT_RASTER_POSITION_VALID;
	public static final int GL_CURRENT_TEXTURE_COORDS = javax.media.opengl.GL.GL_CURRENT_TEXTURE_COORDS;
	public static final int GL_INDEX_CLEAR_VALUE = javax.media.opengl.GL.GL_INDEX_CLEAR_VALUE;
	public static final int GL_INDEX_MODE = javax.media.opengl.GL.GL_INDEX_MODE;
	public static final int GL_INDEX_WRITEMASK = javax.media.opengl.GL.GL_INDEX_WRITEMASK;
	public static final int GL_MODELVIEW_MATRIX = javax.media.opengl.GL.GL_MODELVIEW_MATRIX;
	public static final int GL_MODELVIEW_STACK_DEPTH = javax.media.opengl.GL.GL_MODELVIEW_STACK_DEPTH;
	public static final int GL_NAME_STACK_DEPTH = javax.media.opengl.GL.GL_NAME_STACK_DEPTH;
	public static final int GL_PROJECTION_MATRIX = javax.media.opengl.GL.GL_PROJECTION_MATRIX;
	public static final int GL_PROJECTION_STACK_DEPTH = javax.media.opengl.GL.GL_PROJECTION_STACK_DEPTH;
	public static final int GL_RENDER_MODE = javax.media.opengl.GL.GL_RENDER_MODE;
	public static final int GL_RGBA_MODE = javax.media.opengl.GL.GL_RGBA_MODE;
	public static final int GL_TEXTURE_MATRIX = javax.media.opengl.GL.GL_TEXTURE_MATRIX;
	public static final int GL_TEXTURE_STACK_DEPTH = javax.media.opengl.GL.GL_TEXTURE_STACK_DEPTH;
	public static final int GL_VIEWPORT = javax.media.opengl.GL.GL_VIEWPORT;
	public static final int GL_AUTO_NORMAL = javax.media.opengl.GL.GL_AUTO_NORMAL;
	public static final int GL_MAP1_COLOR_4 = javax.media.opengl.GL.GL_MAP1_COLOR_4;
	public static final int GL_MAP1_INDEX = javax.media.opengl.GL.GL_MAP1_INDEX;
	public static final int GL_MAP1_NORMAL = javax.media.opengl.GL.GL_MAP1_NORMAL;
	public static final int GL_MAP1_TEXTURE_COORD_1 = javax.media.opengl.GL.GL_MAP1_TEXTURE_COORD_1;
	public static final int GL_MAP1_TEXTURE_COORD_2 = javax.media.opengl.GL.GL_MAP1_TEXTURE_COORD_2;
	public static final int GL_MAP1_TEXTURE_COORD_3 = javax.media.opengl.GL.GL_MAP1_TEXTURE_COORD_3;
	public static final int GL_MAP1_TEXTURE_COORD_4 = javax.media.opengl.GL.GL_MAP1_TEXTURE_COORD_4;
	public static final int GL_MAP1_VERTEX_3 = javax.media.opengl.GL.GL_MAP1_VERTEX_3;
	public static final int GL_MAP1_VERTEX_4 = javax.media.opengl.GL.GL_MAP1_VERTEX_4;
	public static final int GL_MAP2_COLOR_4 = javax.media.opengl.GL.GL_MAP2_COLOR_4;
	public static final int GL_MAP2_INDEX = javax.media.opengl.GL.GL_MAP2_INDEX;
	public static final int GL_MAP2_NORMAL = javax.media.opengl.GL.GL_MAP2_NORMAL;
	public static final int GL_MAP2_TEXTURE_COORD_1 = javax.media.opengl.GL.GL_MAP2_TEXTURE_COORD_1;
	public static final int GL_MAP2_TEXTURE_COORD_2 = javax.media.opengl.GL.GL_MAP2_TEXTURE_COORD_2;
	public static final int GL_MAP2_TEXTURE_COORD_3 = javax.media.opengl.GL.GL_MAP2_TEXTURE_COORD_3;
	public static final int GL_MAP2_TEXTURE_COORD_4 = javax.media.opengl.GL.GL_MAP2_TEXTURE_COORD_4;
	public static final int GL_MAP2_VERTEX_3 = javax.media.opengl.GL.GL_MAP2_VERTEX_3;
	public static final int GL_MAP2_VERTEX_4 = javax.media.opengl.GL.GL_MAP2_VERTEX_4;
	public static final int GL_MAP1_GRID_DOMAIN = javax.media.opengl.GL.GL_MAP1_GRID_DOMAIN;
	public static final int GL_MAP1_GRID_SEGMENTS = javax.media.opengl.GL.GL_MAP1_GRID_SEGMENTS;
	public static final int GL_MAP2_GRID_DOMAIN = javax.media.opengl.GL.GL_MAP2_GRID_DOMAIN;
	public static final int GL_MAP2_GRID_SEGMENTS = javax.media.opengl.GL.GL_MAP2_GRID_SEGMENTS;
	public static final int GL_COEFF = javax.media.opengl.GL.GL_COEFF;
	public static final int GL_DOMAIN = javax.media.opengl.GL.GL_DOMAIN;
	public static final int GL_ORDER = javax.media.opengl.GL.GL_ORDER;
	public static final int GL_FOG_HINT = javax.media.opengl.GL.GL_FOG_HINT;
	public static final int GL_LINE_SMOOTH_HINT = javax.media.opengl.GL.GL_LINE_SMOOTH_HINT;
	public static final int GL_PERSPECTIVE_CORRECTION_HINT = javax.media.opengl.GL.GL_PERSPECTIVE_CORRECTION_HINT;
	public static final int GL_POINT_SMOOTH_HINT = javax.media.opengl.GL.GL_POINT_SMOOTH_HINT;
	public static final int GL_POLYGON_SMOOTH_HINT = javax.media.opengl.GL.GL_POLYGON_SMOOTH_HINT;
	public static final int GL_DONT_CARE = javax.media.opengl.GL.GL_DONT_CARE;
	public static final int GL_FASTEST = javax.media.opengl.GL.GL_FASTEST;
	public static final int GL_NICEST = javax.media.opengl.GL.GL_NICEST;
	public static final int GL_SCISSOR_TEST = javax.media.opengl.GL.GL_SCISSOR_TEST;
	public static final int GL_SCISSOR_BOX = javax.media.opengl.GL.GL_SCISSOR_BOX;
	public static final int GL_MAP_COLOR = javax.media.opengl.GL.GL_MAP_COLOR;
	public static final int GL_MAP_STENCIL = javax.media.opengl.GL.GL_MAP_STENCIL;
	public static final int GL_INDEX_SHIFT = javax.media.opengl.GL.GL_INDEX_SHIFT;
	public static final int GL_INDEX_OFFSET = javax.media.opengl.GL.GL_INDEX_OFFSET;
	public static final int GL_RED_SCALE = javax.media.opengl.GL.GL_RED_SCALE;
	public static final int GL_RED_BIAS = javax.media.opengl.GL.GL_RED_BIAS;
	public static final int GL_GREEN_SCALE = javax.media.opengl.GL.GL_GREEN_SCALE;
	public static final int GL_GREEN_BIAS = javax.media.opengl.GL.GL_GREEN_BIAS;
	public static final int GL_BLUE_SCALE = javax.media.opengl.GL.GL_BLUE_SCALE;
	public static final int GL_BLUE_BIAS = javax.media.opengl.GL.GL_BLUE_BIAS;
	public static final int GL_ALPHA_SCALE = javax.media.opengl.GL.GL_ALPHA_SCALE;
	public static final int GL_ALPHA_BIAS = javax.media.opengl.GL.GL_ALPHA_BIAS;
	public static final int GL_DEPTH_SCALE = javax.media.opengl.GL.GL_DEPTH_SCALE;
	public static final int GL_DEPTH_BIAS = javax.media.opengl.GL.GL_DEPTH_BIAS;
	public static final int GL_PIXEL_MAP_S_TO_S_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_S_TO_S_SIZE;
	public static final int GL_PIXEL_MAP_I_TO_I_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_I_SIZE;
	public static final int GL_PIXEL_MAP_I_TO_R_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_R_SIZE;
	public static final int GL_PIXEL_MAP_I_TO_G_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_G_SIZE;
	public static final int GL_PIXEL_MAP_I_TO_B_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_B_SIZE;
	public static final int GL_PIXEL_MAP_I_TO_A_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_A_SIZE;
	public static final int GL_PIXEL_MAP_R_TO_R_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_R_TO_R_SIZE;
	public static final int GL_PIXEL_MAP_G_TO_G_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_G_TO_G_SIZE;
	public static final int GL_PIXEL_MAP_B_TO_B_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_B_TO_B_SIZE;
	public static final int GL_PIXEL_MAP_A_TO_A_SIZE = javax.media.opengl.GL.GL_PIXEL_MAP_A_TO_A_SIZE;
	public static final int GL_PIXEL_MAP_S_TO_S = javax.media.opengl.GL.GL_PIXEL_MAP_S_TO_S;
	public static final int GL_PIXEL_MAP_I_TO_I = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_I;
	public static final int GL_PIXEL_MAP_I_TO_R = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_R;
	public static final int GL_PIXEL_MAP_I_TO_G = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_G;
	public static final int GL_PIXEL_MAP_I_TO_B = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_B;
	public static final int GL_PIXEL_MAP_I_TO_A = javax.media.opengl.GL.GL_PIXEL_MAP_I_TO_A;
	public static final int GL_PIXEL_MAP_R_TO_R = javax.media.opengl.GL.GL_PIXEL_MAP_R_TO_R;
	public static final int GL_PIXEL_MAP_G_TO_G = javax.media.opengl.GL.GL_PIXEL_MAP_G_TO_G;
	public static final int GL_PIXEL_MAP_B_TO_B = javax.media.opengl.GL.GL_PIXEL_MAP_B_TO_B;
	public static final int GL_PIXEL_MAP_A_TO_A = javax.media.opengl.GL.GL_PIXEL_MAP_A_TO_A;
	public static final int GL_PACK_ALIGNMENT = javax.media.opengl.GL.GL_PACK_ALIGNMENT;
	public static final int GL_PACK_LSB_FIRST = javax.media.opengl.GL.GL_PACK_LSB_FIRST;
	public static final int GL_PACK_ROW_LENGTH = javax.media.opengl.GL.GL_PACK_ROW_LENGTH;
	public static final int GL_PACK_SKIP_PIXELS = javax.media.opengl.GL.GL_PACK_SKIP_PIXELS;
	public static final int GL_PACK_SKIP_ROWS = javax.media.opengl.GL.GL_PACK_SKIP_ROWS;
	public static final int GL_PACK_SWAP_BYTES = javax.media.opengl.GL.GL_PACK_SWAP_BYTES;
	public static final int GL_UNPACK_ALIGNMENT = javax.media.opengl.GL.GL_UNPACK_ALIGNMENT;
	public static final int GL_UNPACK_LSB_FIRST = javax.media.opengl.GL.GL_UNPACK_LSB_FIRST;
	public static final int GL_UNPACK_ROW_LENGTH = javax.media.opengl.GL.GL_UNPACK_ROW_LENGTH;
	public static final int GL_UNPACK_SKIP_PIXELS = javax.media.opengl.GL.GL_UNPACK_SKIP_PIXELS;
	public static final int GL_UNPACK_SKIP_ROWS = javax.media.opengl.GL.GL_UNPACK_SKIP_ROWS;
	public static final int GL_UNPACK_SWAP_BYTES = javax.media.opengl.GL.GL_UNPACK_SWAP_BYTES;
	public static final int GL_ZOOM_X = javax.media.opengl.GL.GL_ZOOM_X;
	public static final int GL_ZOOM_Y = javax.media.opengl.GL.GL_ZOOM_Y;
	public static final int GL_TEXTURE_ENV = javax.media.opengl.GL.GL_TEXTURE_ENV;
	public static final int GL_TEXTURE_ENV_MODE = javax.media.opengl.GL.GL_TEXTURE_ENV_MODE;
	public static final int GL_TEXTURE_1D = javax.media.opengl.GL.GL_TEXTURE_1D;
	public static final int GL_TEXTURE_2D = javax.media.opengl.GL.GL_TEXTURE_2D;
	public static final int GL_TEXTURE_WRAP_S = javax.media.opengl.GL.GL_TEXTURE_WRAP_S;
	public static final int GL_TEXTURE_WRAP_T = javax.media.opengl.GL.GL_TEXTURE_WRAP_T;
	public static final int GL_TEXTURE_MAG_FILTER = javax.media.opengl.GL.GL_TEXTURE_MAG_FILTER;
	public static final int GL_TEXTURE_MIN_FILTER = javax.media.opengl.GL.GL_TEXTURE_MIN_FILTER;
	public static final int GL_TEXTURE_ENV_COLOR = javax.media.opengl.GL.GL_TEXTURE_ENV_COLOR;
	public static final int GL_TEXTURE_GEN_S = javax.media.opengl.GL.GL_TEXTURE_GEN_S;
	public static final int GL_TEXTURE_GEN_T = javax.media.opengl.GL.GL_TEXTURE_GEN_T;
	public static final int GL_TEXTURE_GEN_MODE = javax.media.opengl.GL.GL_TEXTURE_GEN_MODE;
	public static final int GL_TEXTURE_BORDER_COLOR = javax.media.opengl.GL.GL_TEXTURE_BORDER_COLOR;
	public static final int GL_TEXTURE_WIDTH = javax.media.opengl.GL.GL_TEXTURE_WIDTH;
	public static final int GL_TEXTURE_HEIGHT = javax.media.opengl.GL.GL_TEXTURE_HEIGHT;
	public static final int GL_TEXTURE_BORDER = javax.media.opengl.GL.GL_TEXTURE_BORDER;
	public static final int GL_TEXTURE_COMPONENTS = javax.media.opengl.GL.GL_TEXTURE_COMPONENTS;
	public static final int GL_TEXTURE_RED_SIZE = javax.media.opengl.GL.GL_TEXTURE_RED_SIZE;
	public static final int GL_TEXTURE_GREEN_SIZE = javax.media.opengl.GL.GL_TEXTURE_GREEN_SIZE;
	public static final int GL_TEXTURE_BLUE_SIZE = javax.media.opengl.GL.GL_TEXTURE_BLUE_SIZE;
	public static final int GL_TEXTURE_ALPHA_SIZE = javax.media.opengl.GL.GL_TEXTURE_ALPHA_SIZE;
	public static final int GL_TEXTURE_LUMINANCE_SIZE = javax.media.opengl.GL.GL_TEXTURE_LUMINANCE_SIZE;
	public static final int GL_TEXTURE_INTENSITY_SIZE = javax.media.opengl.GL.GL_TEXTURE_INTENSITY_SIZE;
	public static final int GL_NEAREST_MIPMAP_NEAREST = javax.media.opengl.GL.GL_NEAREST_MIPMAP_NEAREST;
	public static final int GL_NEAREST_MIPMAP_LINEAR = javax.media.opengl.GL.GL_NEAREST_MIPMAP_LINEAR;
	public static final int GL_LINEAR_MIPMAP_NEAREST = javax.media.opengl.GL.GL_LINEAR_MIPMAP_NEAREST;
	public static final int GL_LINEAR_MIPMAP_LINEAR = javax.media.opengl.GL.GL_LINEAR_MIPMAP_LINEAR;
	public static final int GL_OBJECT_LINEAR = javax.media.opengl.GL.GL_OBJECT_LINEAR;
	public static final int GL_OBJECT_PLANE = javax.media.opengl.GL.GL_OBJECT_PLANE;
	public static final int GL_EYE_LINEAR = javax.media.opengl.GL.GL_EYE_LINEAR;
	public static final int GL_EYE_PLANE = javax.media.opengl.GL.GL_EYE_PLANE;
	public static final int GL_SPHERE_MAP = javax.media.opengl.GL.GL_SPHERE_MAP;
	public static final int GL_DECAL = javax.media.opengl.GL.GL_DECAL;
	public static final int GL_MODULATE = javax.media.opengl.GL.GL_MODULATE;
	public static final int GL_NEAREST = javax.media.opengl.GL.GL_NEAREST;
	public static final int GL_REPEAT = javax.media.opengl.GL.GL_REPEAT;
	public static final int GL_CLAMP = javax.media.opengl.GL.GL_CLAMP;
	public static final int GL_S = javax.media.opengl.GL.GL_S;
	public static final int GL_T = javax.media.opengl.GL.GL_T;
	public static final int GL_R = javax.media.opengl.GL.GL_R;
	public static final int GL_Q = javax.media.opengl.GL.GL_Q;
	public static final int GL_TEXTURE_GEN_R = javax.media.opengl.GL.GL_TEXTURE_GEN_R;
	public static final int GL_TEXTURE_GEN_Q = javax.media.opengl.GL.GL_TEXTURE_GEN_Q;
	public static final int GL_VENDOR = javax.media.opengl.GL.GL_VENDOR;
	public static final int GL_RENDERER = javax.media.opengl.GL.GL_RENDERER;
	public static final int GL_VERSION = javax.media.opengl.GL.GL_VERSION;
	public static final int GL_EXTENSIONS = javax.media.opengl.GL.GL_EXTENSIONS;
	public static final int GL_NO_ERROR = javax.media.opengl.GL.GL_NO_ERROR;
	public static final int GL_INVALID_VALUE = javax.media.opengl.GL.GL_INVALID_VALUE;
	public static final int GL_INVALID_ENUM = javax.media.opengl.GL.GL_INVALID_ENUM;
	public static final int GL_INVALID_OPERATION = javax.media.opengl.GL.GL_INVALID_OPERATION;
	public static final int GL_STACK_OVERFLOW = javax.media.opengl.GL.GL_STACK_OVERFLOW;
	public static final int GL_STACK_UNDERFLOW = javax.media.opengl.GL.GL_STACK_UNDERFLOW;
	public static final int GL_OUT_OF_MEMORY = javax.media.opengl.GL.GL_OUT_OF_MEMORY;
	public static final int GL_CURRENT_BIT = javax.media.opengl.GL.GL_CURRENT_BIT;
	public static final int GL_POINT_BIT = javax.media.opengl.GL.GL_POINT_BIT;
	public static final int GL_LINE_BIT = javax.media.opengl.GL.GL_LINE_BIT;
	public static final int GL_POLYGON_BIT = javax.media.opengl.GL.GL_POLYGON_BIT;
	public static final int GL_POLYGON_STIPPLE_BIT = javax.media.opengl.GL.GL_POLYGON_STIPPLE_BIT;
	public static final int GL_PIXEL_MODE_BIT = javax.media.opengl.GL.GL_PIXEL_MODE_BIT;
	public static final int GL_LIGHTING_BIT = javax.media.opengl.GL.GL_LIGHTING_BIT;
	public static final int GL_FOG_BIT = javax.media.opengl.GL.GL_FOG_BIT;
	public static final int GL_DEPTH_BUFFER_BIT = javax.media.opengl.GL.GL_DEPTH_BUFFER_BIT;
	public static final int GL_ACCUM_BUFFER_BIT = javax.media.opengl.GL.GL_ACCUM_BUFFER_BIT;
	public static final int GL_STENCIL_BUFFER_BIT = javax.media.opengl.GL.GL_STENCIL_BUFFER_BIT;
	public static final int GL_VIEWPORT_BIT = javax.media.opengl.GL.GL_VIEWPORT_BIT;
	public static final int GL_TRANSFORM_BIT = javax.media.opengl.GL.GL_TRANSFORM_BIT;
	public static final int GL_ENABLE_BIT = javax.media.opengl.GL.GL_ENABLE_BIT;
	public static final int GL_COLOR_BUFFER_BIT = javax.media.opengl.GL.GL_COLOR_BUFFER_BIT;
	public static final int GL_HINT_BIT = javax.media.opengl.GL.GL_HINT_BIT;
	public static final int GL_EVAL_BIT = javax.media.opengl.GL.GL_EVAL_BIT;
	public static final int GL_LIST_BIT = javax.media.opengl.GL.GL_LIST_BIT;
	public static final int GL_TEXTURE_BIT = javax.media.opengl.GL.GL_TEXTURE_BIT;
	public static final int GL_SCISSOR_BIT = javax.media.opengl.GL.GL_SCISSOR_BIT;
	public static final int GL_ALL_ATTRIB_BITS = javax.media.opengl.GL.GL_ALL_ATTRIB_BITS;
	public static final int GL_PROXY_TEXTURE_1D = javax.media.opengl.GL.GL_PROXY_TEXTURE_1D;
	public static final int GL_PROXY_TEXTURE_2D = javax.media.opengl.GL.GL_PROXY_TEXTURE_2D;
	public static final int GL_TEXTURE_PRIORITY = javax.media.opengl.GL.GL_TEXTURE_PRIORITY;
	public static final int GL_TEXTURE_RESIDENT = javax.media.opengl.GL.GL_TEXTURE_RESIDENT;
	public static final int GL_TEXTURE_BINDING_1D = javax.media.opengl.GL.GL_TEXTURE_BINDING_1D;
	public static final int GL_TEXTURE_BINDING_2D = javax.media.opengl.GL.GL_TEXTURE_BINDING_2D;
	public static final int GL_TEXTURE_INTERNAL_FORMAT = javax.media.opengl.GL.GL_TEXTURE_INTERNAL_FORMAT;
	public static final int GL_ALPHA4 = javax.media.opengl.GL.GL_ALPHA4;
	public static final int GL_ALPHA8 = javax.media.opengl.GL.GL_ALPHA8;
	public static final int GL_ALPHA12 = javax.media.opengl.GL.GL_ALPHA12;
	public static final int GL_ALPHA16 = javax.media.opengl.GL.GL_ALPHA16;
	public static final int GL_LUMINANCE4 = javax.media.opengl.GL.GL_LUMINANCE4;
	public static final int GL_LUMINANCE8 = javax.media.opengl.GL.GL_LUMINANCE8;
	public static final int GL_LUMINANCE12 = javax.media.opengl.GL.GL_LUMINANCE12;
	public static final int GL_LUMINANCE16 = javax.media.opengl.GL.GL_LUMINANCE16;
	public static final int GL_LUMINANCE4_ALPHA4 = javax.media.opengl.GL.GL_LUMINANCE4_ALPHA4;
	public static final int GL_LUMINANCE6_ALPHA2 = javax.media.opengl.GL.GL_LUMINANCE6_ALPHA2;
	public static final int GL_LUMINANCE8_ALPHA8 = javax.media.opengl.GL.GL_LUMINANCE8_ALPHA8;
	public static final int GL_LUMINANCE12_ALPHA4 = javax.media.opengl.GL.GL_LUMINANCE12_ALPHA4;
	public static final int GL_LUMINANCE12_ALPHA12 = javax.media.opengl.GL.GL_LUMINANCE12_ALPHA12;
	public static final int GL_LUMINANCE16_ALPHA16 = javax.media.opengl.GL.GL_LUMINANCE16_ALPHA16;
	public static final int GL_INTENSITY = javax.media.opengl.GL.GL_INTENSITY;
	public static final int GL_INTENSITY4 = javax.media.opengl.GL.GL_INTENSITY4;
	public static final int GL_INTENSITY8 = javax.media.opengl.GL.GL_INTENSITY8;
	public static final int GL_INTENSITY12 = javax.media.opengl.GL.GL_INTENSITY12;
	public static final int GL_INTENSITY16 = javax.media.opengl.GL.GL_INTENSITY16;
	public static final int GL_R3_G3_B2 = javax.media.opengl.GL.GL_R3_G3_B2;
	public static final int GL_RGB4 = javax.media.opengl.GL.GL_RGB4;
	public static final int GL_RGB5 = javax.media.opengl.GL.GL_RGB5;
	public static final int GL_RGB8 = javax.media.opengl.GL.GL_RGB8;
	public static final int GL_RGB10 = javax.media.opengl.GL.GL_RGB10;
	public static final int GL_RGB12 = javax.media.opengl.GL.GL_RGB12;
	public static final int GL_RGB16 = javax.media.opengl.GL.GL_RGB16;
	public static final int GL_RGBA2 = javax.media.opengl.GL.GL_RGBA2;
	public static final int GL_RGBA4 = javax.media.opengl.GL.GL_RGBA4;
	public static final int GL_RGB5_A1 = javax.media.opengl.GL.GL_RGB5_A1;
	public static final int GL_RGBA8 = javax.media.opengl.GL.GL_RGBA8;
	public static final int GL_RGB10_A2 = javax.media.opengl.GL.GL_RGB10_A2;
	public static final int GL_RGBA12 = javax.media.opengl.GL.GL_RGBA12;
	public static final int GL_RGBA16 = javax.media.opengl.GL.GL_RGBA16;
	public static final int GL_CLIENT_PIXEL_STORE_BIT = javax.media.opengl.GL.GL_CLIENT_PIXEL_STORE_BIT;
	public static final int GL_CLIENT_VERTEX_ARRAY_BIT = javax.media.opengl.GL.GL_CLIENT_VERTEX_ARRAY_BIT;
	public static final long GL_ALL_CLIENT_ATTRIB_BITS = javax.media.opengl.GL.GL_ALL_CLIENT_ATTRIB_BITS;
	public static final long GL_CLIENT_ALL_ATTRIB_BITS = javax.media.opengl.GL.GL_CLIENT_ALL_ATTRIB_BITS;
	public static final int GL_VERTEX_ARRAY = javax.media.opengl.GL.GL_VERTEX_ARRAY;
	public static final int GL_NORMAL_ARRAY = javax.media.opengl.GL.GL_NORMAL_ARRAY;
	public static final int GL_COLOR_ARRAY = javax.media.opengl.GL.GL_COLOR_ARRAY;
	public static final int GL_INDEX_ARRAY = javax.media.opengl.GL.GL_INDEX_ARRAY;
	public static final int GL_TEXTURE_COORD_ARRAY = javax.media.opengl.GL.GL_TEXTURE_COORD_ARRAY;
	public static final int GL_EDGE_FLAG_ARRAY = javax.media.opengl.GL.GL_EDGE_FLAG_ARRAY;
	public static final int GL_VERTEX_ARRAY_SIZE = javax.media.opengl.GL.GL_VERTEX_ARRAY_SIZE;
	public static final int GL_VERTEX_ARRAY_TYPE = javax.media.opengl.GL.GL_VERTEX_ARRAY_TYPE;
	public static final int GL_VERTEX_ARRAY_STRIDE = javax.media.opengl.GL.GL_VERTEX_ARRAY_STRIDE;
	public static final int GL_NORMAL_ARRAY_TYPE = javax.media.opengl.GL.GL_NORMAL_ARRAY_TYPE;
	public static final int GL_NORMAL_ARRAY_STRIDE = javax.media.opengl.GL.GL_NORMAL_ARRAY_STRIDE;
	public static final int GL_COLOR_ARRAY_SIZE = javax.media.opengl.GL.GL_COLOR_ARRAY_SIZE;
	public static final int GL_COLOR_ARRAY_TYPE = javax.media.opengl.GL.GL_COLOR_ARRAY_TYPE;
	public static final int GL_COLOR_ARRAY_STRIDE = javax.media.opengl.GL.GL_COLOR_ARRAY_STRIDE;
	public static final int GL_INDEX_ARRAY_TYPE = javax.media.opengl.GL.GL_INDEX_ARRAY_TYPE;
	public static final int GL_INDEX_ARRAY_STRIDE = javax.media.opengl.GL.GL_INDEX_ARRAY_STRIDE;
	public static final int GL_TEXTURE_COORD_ARRAY_SIZE = javax.media.opengl.GL.GL_TEXTURE_COORD_ARRAY_SIZE;
	public static final int GL_TEXTURE_COORD_ARRAY_TYPE = javax.media.opengl.GL.GL_TEXTURE_COORD_ARRAY_TYPE;
	public static final int GL_TEXTURE_COORD_ARRAY_STRIDE = javax.media.opengl.GL.GL_TEXTURE_COORD_ARRAY_STRIDE;
	public static final int GL_EDGE_FLAG_ARRAY_STRIDE = javax.media.opengl.GL.GL_EDGE_FLAG_ARRAY_STRIDE;
	public static final int GL_VERTEX_ARRAY_POINTER = javax.media.opengl.GL.GL_VERTEX_ARRAY_POINTER;
	public static final int GL_NORMAL_ARRAY_POINTER = javax.media.opengl.GL.GL_NORMAL_ARRAY_POINTER;
	public static final int GL_COLOR_ARRAY_POINTER = javax.media.opengl.GL.GL_COLOR_ARRAY_POINTER;
	public static final int GL_INDEX_ARRAY_POINTER = javax.media.opengl.GL.GL_INDEX_ARRAY_POINTER;
	public static final int GL_TEXTURE_COORD_ARRAY_POINTER = javax.media.opengl.GL.GL_TEXTURE_COORD_ARRAY_POINTER;
	public static final int GL_EDGE_FLAG_ARRAY_POINTER = javax.media.opengl.GL.GL_EDGE_FLAG_ARRAY_POINTER;
	public static final int GL_V2F = javax.media.opengl.GL.GL_V2F;
	public static final int GL_V3F = javax.media.opengl.GL.GL_V3F;
	public static final int GL_C4UB_V2F = javax.media.opengl.GL.GL_C4UB_V2F;
	public static final int GL_C4UB_V3F = javax.media.opengl.GL.GL_C4UB_V3F;
	public static final int GL_C3F_V3F = javax.media.opengl.GL.GL_C3F_V3F;
	public static final int GL_N3F_V3F = javax.media.opengl.GL.GL_N3F_V3F;
	public static final int GL_C4F_N3F_V3F = javax.media.opengl.GL.GL_C4F_N3F_V3F;
	public static final int GL_T2F_V3F = javax.media.opengl.GL.GL_T2F_V3F;
	public static final int GL_T4F_V4F = javax.media.opengl.GL.GL_T4F_V4F;
	public static final int GL_T2F_C4UB_V3F = javax.media.opengl.GL.GL_T2F_C4UB_V3F;
	public static final int GL_T2F_C3F_V3F = javax.media.opengl.GL.GL_T2F_C3F_V3F;
	public static final int GL_T2F_N3F_V3F = javax.media.opengl.GL.GL_T2F_N3F_V3F;
	public static final int GL_T2F_C4F_N3F_V3F = javax.media.opengl.GL.GL_T2F_C4F_N3F_V3F;
	public static final int GL_T4F_C4F_N3F_V4F = javax.media.opengl.GL.GL_T4F_C4F_N3F_V4F;
	public static final int GL_GLEXT_VERSION = javax.media.opengl.GL.GL_GLEXT_VERSION;
	public static final int GL_UNSIGNED_BYTE_3_3_2 = javax.media.opengl.GL.GL_UNSIGNED_BYTE_3_3_2;
	public static final int GL_UNSIGNED_SHORT_4_4_4_4 = javax.media.opengl.GL.GL_UNSIGNED_SHORT_4_4_4_4;
	public static final int GL_UNSIGNED_SHORT_5_5_5_1 = javax.media.opengl.GL.GL_UNSIGNED_SHORT_5_5_5_1;
	public static final int GL_UNSIGNED_INT_8_8_8_8 = javax.media.opengl.GL.GL_UNSIGNED_INT_8_8_8_8;
	public static final int GL_UNSIGNED_INT_10_10_10_2 = javax.media.opengl.GL.GL_UNSIGNED_INT_10_10_10_2;
	public static final int GL_RESCALE_NORMAL = javax.media.opengl.GL.GL_RESCALE_NORMAL;
	public static final int GL_TEXTURE_BINDING_3D = javax.media.opengl.GL.GL_TEXTURE_BINDING_3D;
	public static final int GL_PACK_SKIP_IMAGES = javax.media.opengl.GL.GL_PACK_SKIP_IMAGES;
	public static final int GL_PACK_IMAGE_HEIGHT = javax.media.opengl.GL.GL_PACK_IMAGE_HEIGHT;
	public static final int GL_UNPACK_SKIP_IMAGES = javax.media.opengl.GL.GL_UNPACK_SKIP_IMAGES;
	public static final int GL_UNPACK_IMAGE_HEIGHT = javax.media.opengl.GL.GL_UNPACK_IMAGE_HEIGHT;
	public static final int GL_TEXTURE_3D = javax.media.opengl.GL.GL_TEXTURE_3D;
	public static final int GL_PROXY_TEXTURE_3D = javax.media.opengl.GL.GL_PROXY_TEXTURE_3D;
	public static final int GL_TEXTURE_DEPTH = javax.media.opengl.GL.GL_TEXTURE_DEPTH;
	public static final int GL_TEXTURE_WRAP_R = javax.media.opengl.GL.GL_TEXTURE_WRAP_R;
	public static final int GL_MAX_3D_TEXTURE_SIZE = javax.media.opengl.GL.GL_MAX_3D_TEXTURE_SIZE;
	public static final int GL_UNSIGNED_BYTE_2_3_3_REV = javax.media.opengl.GL.GL_UNSIGNED_BYTE_2_3_3_REV;
	public static final int GL_UNSIGNED_SHORT_5_6_5 = javax.media.opengl.GL.GL_UNSIGNED_SHORT_5_6_5;
	public static final int GL_UNSIGNED_SHORT_5_6_5_REV = javax.media.opengl.GL.GL_UNSIGNED_SHORT_5_6_5_REV;
	public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = javax.media.opengl.GL.GL_UNSIGNED_SHORT_4_4_4_4_REV;
	public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = javax.media.opengl.GL.GL_UNSIGNED_SHORT_1_5_5_5_REV;
	public static final int GL_UNSIGNED_INT_8_8_8_8_REV = javax.media.opengl.GL.GL_UNSIGNED_INT_8_8_8_8_REV;
	public static final int GL_UNSIGNED_INT_2_10_10_10_REV = javax.media.opengl.GL.GL_UNSIGNED_INT_2_10_10_10_REV;
	public static final int GL_BGR = javax.media.opengl.GL.GL_BGR;
	public static final int GL_BGRA = javax.media.opengl.GL.GL_BGRA;
	public static final int GL_MAX_ELEMENTS_VERTICES = javax.media.opengl.GL.GL_MAX_ELEMENTS_VERTICES;
	public static final int GL_MAX_ELEMENTS_INDICES = javax.media.opengl.GL.GL_MAX_ELEMENTS_INDICES;
	public static final int GL_CLAMP_TO_EDGE = javax.media.opengl.GL.GL_CLAMP_TO_EDGE;
	public static final int GL_TEXTURE_MIN_LOD = javax.media.opengl.GL.GL_TEXTURE_MIN_LOD;
	public static final int GL_TEXTURE_MAX_LOD = javax.media.opengl.GL.GL_TEXTURE_MAX_LOD;
	public static final int GL_TEXTURE_BASE_LEVEL = javax.media.opengl.GL.GL_TEXTURE_BASE_LEVEL;
	public static final int GL_TEXTURE_MAX_LEVEL = javax.media.opengl.GL.GL_TEXTURE_MAX_LEVEL;
	public static final int GL_LIGHT_MODEL_COLOR_CONTROL = javax.media.opengl.GL.GL_LIGHT_MODEL_COLOR_CONTROL;
	public static final int GL_SINGLE_COLOR = javax.media.opengl.GL.GL_SINGLE_COLOR;
	public static final int GL_SEPARATE_SPECULAR_COLOR = javax.media.opengl.GL.GL_SEPARATE_SPECULAR_COLOR;
	public static final int GL_SMOOTH_POINT_SIZE_RANGE = javax.media.opengl.GL.GL_SMOOTH_POINT_SIZE_RANGE;
	public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = javax.media.opengl.GL.GL_SMOOTH_POINT_SIZE_GRANULARITY;
	public static final int GL_SMOOTH_LINE_WIDTH_RANGE = javax.media.opengl.GL.GL_SMOOTH_LINE_WIDTH_RANGE;
	public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = javax.media.opengl.GL.GL_SMOOTH_LINE_WIDTH_GRANULARITY;
	public static final int GL_ALIASED_POINT_SIZE_RANGE = javax.media.opengl.GL.GL_ALIASED_POINT_SIZE_RANGE;
	public static final int GL_ALIASED_LINE_WIDTH_RANGE = javax.media.opengl.GL.GL_ALIASED_LINE_WIDTH_RANGE;
	public static final int GL_CONSTANT_COLOR = javax.media.opengl.GL.GL_CONSTANT_COLOR;
	public static final int GL_ONE_MINUS_CONSTANT_COLOR = javax.media.opengl.GL.GL_ONE_MINUS_CONSTANT_COLOR;
	public static final int GL_CONSTANT_ALPHA = javax.media.opengl.GL.GL_CONSTANT_ALPHA;
	public static final int GL_ONE_MINUS_CONSTANT_ALPHA = javax.media.opengl.GL.GL_ONE_MINUS_CONSTANT_ALPHA;
	public static final int GL_BLEND_COLOR = javax.media.opengl.GL.GL_BLEND_COLOR;
	public static final int GL_FUNC_ADD = javax.media.opengl.GL.GL_FUNC_ADD;
	public static final int GL_MIN = javax.media.opengl.GL.GL_MIN;
	public static final int GL_MAX = javax.media.opengl.GL.GL_MAX;
	public static final int GL_BLEND_EQUATION = javax.media.opengl.GL.GL_BLEND_EQUATION;
	public static final int GL_FUNC_SUBTRACT = javax.media.opengl.GL.GL_FUNC_SUBTRACT;
	public static final int GL_FUNC_REVERSE_SUBTRACT = javax.media.opengl.GL.GL_FUNC_REVERSE_SUBTRACT;
	public static final int GL_CONVOLUTION_1D = javax.media.opengl.GL.GL_CONVOLUTION_1D;
	public static final int GL_CONVOLUTION_2D = javax.media.opengl.GL.GL_CONVOLUTION_2D;
	public static final int GL_SEPARABLE_2D = javax.media.opengl.GL.GL_SEPARABLE_2D;
	public static final int GL_CONVOLUTION_BORDER_MODE = javax.media.opengl.GL.GL_CONVOLUTION_BORDER_MODE;
	public static final int GL_CONVOLUTION_FILTER_SCALE = javax.media.opengl.GL.GL_CONVOLUTION_FILTER_SCALE;
	public static final int GL_CONVOLUTION_FILTER_BIAS = javax.media.opengl.GL.GL_CONVOLUTION_FILTER_BIAS;
	public static final int GL_REDUCE = javax.media.opengl.GL.GL_REDUCE;
	public static final int GL_CONVOLUTION_FORMAT = javax.media.opengl.GL.GL_CONVOLUTION_FORMAT;
	public static final int GL_CONVOLUTION_WIDTH = javax.media.opengl.GL.GL_CONVOLUTION_WIDTH;
	public static final int GL_CONVOLUTION_HEIGHT = javax.media.opengl.GL.GL_CONVOLUTION_HEIGHT;
	public static final int GL_MAX_CONVOLUTION_WIDTH = javax.media.opengl.GL.GL_MAX_CONVOLUTION_WIDTH;
	public static final int GL_MAX_CONVOLUTION_HEIGHT = javax.media.opengl.GL.GL_MAX_CONVOLUTION_HEIGHT;
	public static final int GL_POST_CONVOLUTION_RED_SCALE = javax.media.opengl.GL.GL_POST_CONVOLUTION_RED_SCALE;
	public static final int GL_POST_CONVOLUTION_GREEN_SCALE = javax.media.opengl.GL.GL_POST_CONVOLUTION_GREEN_SCALE;
	public static final int GL_POST_CONVOLUTION_BLUE_SCALE = javax.media.opengl.GL.GL_POST_CONVOLUTION_BLUE_SCALE;
	public static final int GL_POST_CONVOLUTION_ALPHA_SCALE = javax.media.opengl.GL.GL_POST_CONVOLUTION_ALPHA_SCALE;
	public static final int GL_POST_CONVOLUTION_RED_BIAS = javax.media.opengl.GL.GL_POST_CONVOLUTION_RED_BIAS;
	public static final int GL_POST_CONVOLUTION_GREEN_BIAS = javax.media.opengl.GL.GL_POST_CONVOLUTION_GREEN_BIAS;
	public static final int GL_POST_CONVOLUTION_BLUE_BIAS = javax.media.opengl.GL.GL_POST_CONVOLUTION_BLUE_BIAS;
	public static final int GL_POST_CONVOLUTION_ALPHA_BIAS = javax.media.opengl.GL.GL_POST_CONVOLUTION_ALPHA_BIAS;
	public static final int GL_HISTOGRAM = javax.media.opengl.GL.GL_HISTOGRAM;
	public static final int GL_PROXY_HISTOGRAM = javax.media.opengl.GL.GL_PROXY_HISTOGRAM;
	public static final int GL_HISTOGRAM_WIDTH = javax.media.opengl.GL.GL_HISTOGRAM_WIDTH;
	public static final int GL_HISTOGRAM_FORMAT = javax.media.opengl.GL.GL_HISTOGRAM_FORMAT;
	public static final int GL_HISTOGRAM_RED_SIZE = javax.media.opengl.GL.GL_HISTOGRAM_RED_SIZE;
	public static final int GL_HISTOGRAM_GREEN_SIZE = javax.media.opengl.GL.GL_HISTOGRAM_GREEN_SIZE;
	public static final int GL_HISTOGRAM_BLUE_SIZE = javax.media.opengl.GL.GL_HISTOGRAM_BLUE_SIZE;
	public static final int GL_HISTOGRAM_ALPHA_SIZE = javax.media.opengl.GL.GL_HISTOGRAM_ALPHA_SIZE;
	public static final int GL_HISTOGRAM_LUMINANCE_SIZE = javax.media.opengl.GL.GL_HISTOGRAM_LUMINANCE_SIZE;
	public static final int GL_HISTOGRAM_SINK = javax.media.opengl.GL.GL_HISTOGRAM_SINK;
	public static final int GL_MINMAX = javax.media.opengl.GL.GL_MINMAX;
	public static final int GL_MINMAX_FORMAT = javax.media.opengl.GL.GL_MINMAX_FORMAT;
	public static final int GL_MINMAX_SINK = javax.media.opengl.GL.GL_MINMAX_SINK;
	public static final int GL_TABLE_TOO_LARGE = javax.media.opengl.GL.GL_TABLE_TOO_LARGE;
	public static final int GL_COLOR_MATRIX = javax.media.opengl.GL.GL_COLOR_MATRIX;
	public static final int GL_COLOR_MATRIX_STACK_DEPTH = javax.media.opengl.GL.GL_COLOR_MATRIX_STACK_DEPTH;
	public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH = javax.media.opengl.GL.GL_MAX_COLOR_MATRIX_STACK_DEPTH;
	public static final int GL_POST_COLOR_MATRIX_RED_SCALE = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_RED_SCALE;
	public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_GREEN_SCALE;
	public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_BLUE_SCALE;
	public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_ALPHA_SCALE;
	public static final int GL_POST_COLOR_MATRIX_RED_BIAS = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_RED_BIAS;
	public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_GREEN_BIAS;
	public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_BLUE_BIAS;
	public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_ALPHA_BIAS;
	public static final int GL_COLOR_TABLE = javax.media.opengl.GL.GL_COLOR_TABLE;
	public static final int GL_POST_CONVOLUTION_COLOR_TABLE = javax.media.opengl.GL.GL_POST_CONVOLUTION_COLOR_TABLE;
	public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE = javax.media.opengl.GL.GL_POST_COLOR_MATRIX_COLOR_TABLE;
	public static final int GL_PROXY_COLOR_TABLE = javax.media.opengl.GL.GL_PROXY_COLOR_TABLE;
	public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE = javax.media.opengl.GL.GL_PROXY_POST_CONVOLUTION_COLOR_TABLE;
	public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = javax.media.opengl.GL.GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE;
	public static final int GL_COLOR_TABLE_SCALE = javax.media.opengl.GL.GL_COLOR_TABLE_SCALE;
	public static final int GL_COLOR_TABLE_BIAS = javax.media.opengl.GL.GL_COLOR_TABLE_BIAS;
	public static final int GL_COLOR_TABLE_FORMAT = javax.media.opengl.GL.GL_COLOR_TABLE_FORMAT;
	public static final int GL_COLOR_TABLE_WIDTH = javax.media.opengl.GL.GL_COLOR_TABLE_WIDTH;
	public static final int GL_COLOR_TABLE_RED_SIZE = javax.media.opengl.GL.GL_COLOR_TABLE_RED_SIZE;
	public static final int GL_COLOR_TABLE_GREEN_SIZE = javax.media.opengl.GL.GL_COLOR_TABLE_GREEN_SIZE;
	public static final int GL_COLOR_TABLE_BLUE_SIZE = javax.media.opengl.GL.GL_COLOR_TABLE_BLUE_SIZE;
	public static final int GL_COLOR_TABLE_ALPHA_SIZE = javax.media.opengl.GL.GL_COLOR_TABLE_ALPHA_SIZE;
	public static final int GL_COLOR_TABLE_LUMINANCE_SIZE = javax.media.opengl.GL.GL_COLOR_TABLE_LUMINANCE_SIZE;
	public static final int GL_COLOR_TABLE_INTENSITY_SIZE = javax.media.opengl.GL.GL_COLOR_TABLE_INTENSITY_SIZE;
	public static final int GL_CONSTANT_BORDER = javax.media.opengl.GL.GL_CONSTANT_BORDER;
	public static final int GL_REPLICATE_BORDER = javax.media.opengl.GL.GL_REPLICATE_BORDER;
	public static final int GL_CONVOLUTION_BORDER_COLOR = javax.media.opengl.GL.GL_CONVOLUTION_BORDER_COLOR;
	public static final int GL_TEXTURE0 = javax.media.opengl.GL.GL_TEXTURE0;
	public static final int GL_TEXTURE1 = javax.media.opengl.GL.GL_TEXTURE1;
	public static final int GL_TEXTURE2 = javax.media.opengl.GL.GL_TEXTURE2;
	public static final int GL_TEXTURE3 = javax.media.opengl.GL.GL_TEXTURE3;
	public static final int GL_TEXTURE4 = javax.media.opengl.GL.GL_TEXTURE4;
	public static final int GL_TEXTURE5 = javax.media.opengl.GL.GL_TEXTURE5;
	public static final int GL_TEXTURE6 = javax.media.opengl.GL.GL_TEXTURE6;
	public static final int GL_TEXTURE7 = javax.media.opengl.GL.GL_TEXTURE7;
	public static final int GL_TEXTURE8 = javax.media.opengl.GL.GL_TEXTURE8;
	public static final int GL_TEXTURE9 = javax.media.opengl.GL.GL_TEXTURE9;
	public static final int GL_TEXTURE10 = javax.media.opengl.GL.GL_TEXTURE10;
	public static final int GL_TEXTURE11 = javax.media.opengl.GL.GL_TEXTURE11;
	public static final int GL_TEXTURE12 = javax.media.opengl.GL.GL_TEXTURE12;
	public static final int GL_TEXTURE13 = javax.media.opengl.GL.GL_TEXTURE13;
	public static final int GL_TEXTURE14 = javax.media.opengl.GL.GL_TEXTURE14;
	public static final int GL_TEXTURE15 = javax.media.opengl.GL.GL_TEXTURE15;
	public static final int GL_TEXTURE16 = javax.media.opengl.GL.GL_TEXTURE16;
	public static final int GL_TEXTURE17 = javax.media.opengl.GL.GL_TEXTURE17;
	public static final int GL_TEXTURE18 = javax.media.opengl.GL.GL_TEXTURE18;
	public static final int GL_TEXTURE19 = javax.media.opengl.GL.GL_TEXTURE19;
	public static final int GL_TEXTURE20 = javax.media.opengl.GL.GL_TEXTURE20;
	public static final int GL_TEXTURE21 = javax.media.opengl.GL.GL_TEXTURE21;
	public static final int GL_TEXTURE22 = javax.media.opengl.GL.GL_TEXTURE22;
	public static final int GL_TEXTURE23 = javax.media.opengl.GL.GL_TEXTURE23;
	public static final int GL_TEXTURE24 = javax.media.opengl.GL.GL_TEXTURE24;
	public static final int GL_TEXTURE25 = javax.media.opengl.GL.GL_TEXTURE25;
	public static final int GL_TEXTURE26 = javax.media.opengl.GL.GL_TEXTURE26;
	public static final int GL_TEXTURE27 = javax.media.opengl.GL.GL_TEXTURE27;
	public static final int GL_TEXTURE28 = javax.media.opengl.GL.GL_TEXTURE28;
	public static final int GL_TEXTURE29 = javax.media.opengl.GL.GL_TEXTURE29;
	public static final int GL_TEXTURE30 = javax.media.opengl.GL.GL_TEXTURE30;
	public static final int GL_TEXTURE31 = javax.media.opengl.GL.GL_TEXTURE31;
	public static final int GL_ACTIVE_TEXTURE = javax.media.opengl.GL.GL_ACTIVE_TEXTURE;
	public static final int GL_CLIENT_ACTIVE_TEXTURE = javax.media.opengl.GL.GL_CLIENT_ACTIVE_TEXTURE;
	public static final int GL_MAX_TEXTURE_UNITS = javax.media.opengl.GL.GL_MAX_TEXTURE_UNITS;
	public static final int GL_TRANSPOSE_MODELVIEW_MATRIX = javax.media.opengl.GL.GL_TRANSPOSE_MODELVIEW_MATRIX;
	public static final int GL_TRANSPOSE_PROJECTION_MATRIX = javax.media.opengl.GL.GL_TRANSPOSE_PROJECTION_MATRIX;
	public static final int GL_TRANSPOSE_TEXTURE_MATRIX = javax.media.opengl.GL.GL_TRANSPOSE_TEXTURE_MATRIX;
	public static final int GL_TRANSPOSE_COLOR_MATRIX = javax.media.opengl.GL.GL_TRANSPOSE_COLOR_MATRIX;
	public static final int GL_MULTISAMPLE = javax.media.opengl.GL.GL_MULTISAMPLE;
	public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = javax.media.opengl.GL.GL_SAMPLE_ALPHA_TO_COVERAGE;
	public static final int GL_SAMPLE_ALPHA_TO_ONE = javax.media.opengl.GL.GL_SAMPLE_ALPHA_TO_ONE;
	public static final int GL_SAMPLE_COVERAGE = javax.media.opengl.GL.GL_SAMPLE_COVERAGE;
	public static final int GL_SAMPLE_BUFFERS = javax.media.opengl.GL.GL_SAMPLE_BUFFERS;
	public static final int GL_SAMPLES = javax.media.opengl.GL.GL_SAMPLES;
	public static final int GL_SAMPLE_COVERAGE_VALUE = javax.media.opengl.GL.GL_SAMPLE_COVERAGE_VALUE;
	public static final int GL_SAMPLE_COVERAGE_INVERT = javax.media.opengl.GL.GL_SAMPLE_COVERAGE_INVERT;
	public static final int GL_MULTISAMPLE_BIT = javax.media.opengl.GL.GL_MULTISAMPLE_BIT;
	public static final int GL_NORMAL_MAP = javax.media.opengl.GL.GL_NORMAL_MAP;
	public static final int GL_REFLECTION_MAP = javax.media.opengl.GL.GL_REFLECTION_MAP;
	public static final int GL_TEXTURE_CUBE_MAP = javax.media.opengl.GL.GL_TEXTURE_CUBE_MAP;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP = javax.media.opengl.GL.GL_TEXTURE_BINDING_CUBE_MAP;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = javax.media.opengl.GL.GL_TEXTURE_CUBE_MAP_POSITIVE_X;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = javax.media.opengl.GL.GL_TEXTURE_CUBE_MAP_NEGATIVE_X;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = javax.media.opengl.GL.GL_TEXTURE_CUBE_MAP_POSITIVE_Y;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = javax.media.opengl.GL.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = javax.media.opengl.GL.GL_TEXTURE_CUBE_MAP_POSITIVE_Z;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = javax.media.opengl.GL.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z;
	public static final int GL_PROXY_TEXTURE_CUBE_MAP = javax.media.opengl.GL.GL_PROXY_TEXTURE_CUBE_MAP;
	public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = javax.media.opengl.GL.GL_MAX_CUBE_MAP_TEXTURE_SIZE;
	public static final int GL_COMPRESSED_ALPHA = javax.media.opengl.GL.GL_COMPRESSED_ALPHA;
	public static final int GL_COMPRESSED_LUMINANCE = javax.media.opengl.GL.GL_COMPRESSED_LUMINANCE;
	public static final int GL_COMPRESSED_LUMINANCE_ALPHA = javax.media.opengl.GL.GL_COMPRESSED_LUMINANCE_ALPHA;
	public static final int GL_COMPRESSED_INTENSITY = javax.media.opengl.GL.GL_COMPRESSED_INTENSITY;
	public static final int GL_COMPRESSED_RGB = javax.media.opengl.GL.GL_COMPRESSED_RGB;
	public static final int GL_COMPRESSED_RGBA = javax.media.opengl.GL.GL_COMPRESSED_RGBA;
	public static final int GL_TEXTURE_COMPRESSION_HINT = javax.media.opengl.GL.GL_TEXTURE_COMPRESSION_HINT;
	public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = javax.media.opengl.GL.GL_TEXTURE_COMPRESSED_IMAGE_SIZE;
	public static final int GL_TEXTURE_COMPRESSED = javax.media.opengl.GL.GL_TEXTURE_COMPRESSED;
	public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = javax.media.opengl.GL.GL_NUM_COMPRESSED_TEXTURE_FORMATS;
	public static final int GL_COMPRESSED_TEXTURE_FORMATS = javax.media.opengl.GL.GL_COMPRESSED_TEXTURE_FORMATS;
	public static final int GL_CLAMP_TO_BORDER = javax.media.opengl.GL.GL_CLAMP_TO_BORDER;
	public static final int GL_COMBINE = javax.media.opengl.GL.GL_COMBINE;
	public static final int GL_COMBINE_RGB = javax.media.opengl.GL.GL_COMBINE_RGB;
	public static final int GL_COMBINE_ALPHA = javax.media.opengl.GL.GL_COMBINE_ALPHA;
	public static final int GL_SOURCE0_RGB = javax.media.opengl.GL.GL_SOURCE0_RGB;
	public static final int GL_SOURCE1_RGB = javax.media.opengl.GL.GL_SOURCE1_RGB;
	public static final int GL_SOURCE2_RGB = javax.media.opengl.GL.GL_SOURCE2_RGB;
	public static final int GL_SOURCE0_ALPHA = javax.media.opengl.GL.GL_SOURCE0_ALPHA;
	public static final int GL_SOURCE1_ALPHA = javax.media.opengl.GL.GL_SOURCE1_ALPHA;
	public static final int GL_SOURCE2_ALPHA = javax.media.opengl.GL.GL_SOURCE2_ALPHA;
	public static final int GL_OPERAND0_RGB = javax.media.opengl.GL.GL_OPERAND0_RGB;
	public static final int GL_OPERAND1_RGB = javax.media.opengl.GL.GL_OPERAND1_RGB;
	public static final int GL_OPERAND2_RGB = javax.media.opengl.GL.GL_OPERAND2_RGB;
	public static final int GL_OPERAND0_ALPHA = javax.media.opengl.GL.GL_OPERAND0_ALPHA;
	public static final int GL_OPERAND1_ALPHA = javax.media.opengl.GL.GL_OPERAND1_ALPHA;
	public static final int GL_OPERAND2_ALPHA = javax.media.opengl.GL.GL_OPERAND2_ALPHA;
	public static final int GL_RGB_SCALE = javax.media.opengl.GL.GL_RGB_SCALE;
	public static final int GL_ADD_SIGNED = javax.media.opengl.GL.GL_ADD_SIGNED;
	public static final int GL_INTERPOLATE = javax.media.opengl.GL.GL_INTERPOLATE;
	public static final int GL_SUBTRACT = javax.media.opengl.GL.GL_SUBTRACT;
	public static final int GL_CONSTANT = javax.media.opengl.GL.GL_CONSTANT;
	public static final int GL_PRIMARY_COLOR = javax.media.opengl.GL.GL_PRIMARY_COLOR;
	public static final int GL_PREVIOUS = javax.media.opengl.GL.GL_PREVIOUS;
	public static final int GL_DOT3_RGB = javax.media.opengl.GL.GL_DOT3_RGB;
	public static final int GL_DOT3_RGBA = javax.media.opengl.GL.GL_DOT3_RGBA;
	public static final int GL_BLEND_DST_RGB = javax.media.opengl.GL.GL_BLEND_DST_RGB;
	public static final int GL_BLEND_SRC_RGB = javax.media.opengl.GL.GL_BLEND_SRC_RGB;
	public static final int GL_BLEND_DST_ALPHA = javax.media.opengl.GL.GL_BLEND_DST_ALPHA;
	public static final int GL_BLEND_SRC_ALPHA = javax.media.opengl.GL.GL_BLEND_SRC_ALPHA;
	public static final int GL_POINT_SIZE_MIN = javax.media.opengl.GL.GL_POINT_SIZE_MIN;
	public static final int GL_POINT_SIZE_MAX = javax.media.opengl.GL.GL_POINT_SIZE_MAX;
	public static final int GL_POINT_FADE_THRESHOLD_SIZE = javax.media.opengl.GL.GL_POINT_FADE_THRESHOLD_SIZE;
	public static final int GL_POINT_DISTANCE_ATTENUATION = javax.media.opengl.GL.GL_POINT_DISTANCE_ATTENUATION;
	public static final int GL_GENERATE_MIPMAP = javax.media.opengl.GL.GL_GENERATE_MIPMAP;
	public static final int GL_GENERATE_MIPMAP_HINT = javax.media.opengl.GL.GL_GENERATE_MIPMAP_HINT;
	public static final int GL_DEPTH_COMPONENT16 = javax.media.opengl.GL.GL_DEPTH_COMPONENT16;
	public static final int GL_DEPTH_COMPONENT24 = javax.media.opengl.GL.GL_DEPTH_COMPONENT24;
	public static final int GL_DEPTH_COMPONENT32 = javax.media.opengl.GL.GL_DEPTH_COMPONENT32;
	public static final int GL_MIRRORED_REPEAT = javax.media.opengl.GL.GL_MIRRORED_REPEAT;
	public static final int GL_FOG_COORDINATE_SOURCE = javax.media.opengl.GL.GL_FOG_COORDINATE_SOURCE;
	public static final int GL_FOG_COORDINATE = javax.media.opengl.GL.GL_FOG_COORDINATE;
	public static final int GL_FRAGMENT_DEPTH = javax.media.opengl.GL.GL_FRAGMENT_DEPTH;
	public static final int GL_CURRENT_FOG_COORDINATE = javax.media.opengl.GL.GL_CURRENT_FOG_COORDINATE;
	public static final int GL_FOG_COORDINATE_ARRAY_TYPE = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_TYPE;
	public static final int GL_FOG_COORDINATE_ARRAY_STRIDE = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_STRIDE;
	public static final int GL_FOG_COORDINATE_ARRAY_POINTER = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_POINTER;
	public static final int GL_FOG_COORDINATE_ARRAY = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY;
	public static final int GL_COLOR_SUM = javax.media.opengl.GL.GL_COLOR_SUM;
	public static final int GL_CURRENT_SECONDARY_COLOR = javax.media.opengl.GL.GL_CURRENT_SECONDARY_COLOR;
	public static final int GL_SECONDARY_COLOR_ARRAY_SIZE = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_SIZE;
	public static final int GL_SECONDARY_COLOR_ARRAY_TYPE = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_TYPE;
	public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_STRIDE;
	public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_POINTER;
	public static final int GL_SECONDARY_COLOR_ARRAY = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY;
	public static final int GL_MAX_TEXTURE_LOD_BIAS = javax.media.opengl.GL.GL_MAX_TEXTURE_LOD_BIAS;
	public static final int GL_TEXTURE_FILTER_CONTROL = javax.media.opengl.GL.GL_TEXTURE_FILTER_CONTROL;
	public static final int GL_TEXTURE_LOD_BIAS = javax.media.opengl.GL.GL_TEXTURE_LOD_BIAS;
	public static final int GL_INCR_WRAP = javax.media.opengl.GL.GL_INCR_WRAP;
	public static final int GL_DECR_WRAP = javax.media.opengl.GL.GL_DECR_WRAP;
	public static final int GL_TEXTURE_DEPTH_SIZE = javax.media.opengl.GL.GL_TEXTURE_DEPTH_SIZE;
	public static final int GL_DEPTH_TEXTURE_MODE = javax.media.opengl.GL.GL_DEPTH_TEXTURE_MODE;
	public static final int GL_TEXTURE_COMPARE_MODE = javax.media.opengl.GL.GL_TEXTURE_COMPARE_MODE;
	public static final int GL_TEXTURE_COMPARE_FUNC = javax.media.opengl.GL.GL_TEXTURE_COMPARE_FUNC;
	public static final int GL_COMPARE_R_TO_TEXTURE = javax.media.opengl.GL.GL_COMPARE_R_TO_TEXTURE;
	public static final int GL_BUFFER_SIZE = javax.media.opengl.GL.GL_BUFFER_SIZE;
	public static final int GL_BUFFER_USAGE = javax.media.opengl.GL.GL_BUFFER_USAGE;
	public static final int GL_QUERY_COUNTER_BITS = javax.media.opengl.GL.GL_QUERY_COUNTER_BITS;
	public static final int GL_CURRENT_QUERY = javax.media.opengl.GL.GL_CURRENT_QUERY;
	public static final int GL_QUERY_RESULT = javax.media.opengl.GL.GL_QUERY_RESULT;
	public static final int GL_QUERY_RESULT_AVAILABLE = javax.media.opengl.GL.GL_QUERY_RESULT_AVAILABLE;
	public static final int GL_ARRAY_BUFFER = javax.media.opengl.GL.GL_ARRAY_BUFFER;
	public static final int GL_ELEMENT_ARRAY_BUFFER = javax.media.opengl.GL.GL_ELEMENT_ARRAY_BUFFER;
	public static final int GL_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_ARRAY_BUFFER_BINDING;
	public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_ELEMENT_ARRAY_BUFFER_BINDING;
	public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_VERTEX_ARRAY_BUFFER_BINDING;
	public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_NORMAL_ARRAY_BUFFER_BINDING;
	public static final int GL_COLOR_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_COLOR_ARRAY_BUFFER_BINDING;
	public static final int GL_INDEX_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_INDEX_ARRAY_BUFFER_BINDING;
	public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING;
	public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING;
	public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING;
	public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING;
	public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_WEIGHT_ARRAY_BUFFER_BINDING;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
	public static final int GL_READ_ONLY = javax.media.opengl.GL.GL_READ_ONLY;
	public static final int GL_WRITE_ONLY = javax.media.opengl.GL.GL_WRITE_ONLY;
	public static final int GL_READ_WRITE = javax.media.opengl.GL.GL_READ_WRITE;
	public static final int GL_BUFFER_ACCESS = javax.media.opengl.GL.GL_BUFFER_ACCESS;
	public static final int GL_BUFFER_MAPPED = javax.media.opengl.GL.GL_BUFFER_MAPPED;
	public static final int GL_BUFFER_MAP_POINTER = javax.media.opengl.GL.GL_BUFFER_MAP_POINTER;
	public static final int GL_STREAM_DRAW = javax.media.opengl.GL.GL_STREAM_DRAW;
	public static final int GL_STREAM_READ = javax.media.opengl.GL.GL_STREAM_READ;
	public static final int GL_STREAM_COPY = javax.media.opengl.GL.GL_STREAM_COPY;
	public static final int GL_STATIC_DRAW = javax.media.opengl.GL.GL_STATIC_DRAW;
	public static final int GL_STATIC_READ = javax.media.opengl.GL.GL_STATIC_READ;
	public static final int GL_STATIC_COPY = javax.media.opengl.GL.GL_STATIC_COPY;
	public static final int GL_DYNAMIC_DRAW = javax.media.opengl.GL.GL_DYNAMIC_DRAW;
	public static final int GL_DYNAMIC_READ = javax.media.opengl.GL.GL_DYNAMIC_READ;
	public static final int GL_DYNAMIC_COPY = javax.media.opengl.GL.GL_DYNAMIC_COPY;
	public static final int GL_SAMPLES_PASSED = javax.media.opengl.GL.GL_SAMPLES_PASSED;
	public static final int GL_FOG_COORD_SRC = javax.media.opengl.GL.GL_FOG_COORD_SRC;
	public static final int GL_FOG_COORD = javax.media.opengl.GL.GL_FOG_COORD;
	public static final int GL_CURRENT_FOG_COORD = javax.media.opengl.GL.GL_CURRENT_FOG_COORD;
	public static final int GL_FOG_COORD_ARRAY_TYPE = javax.media.opengl.GL.GL_FOG_COORD_ARRAY_TYPE;
	public static final int GL_FOG_COORD_ARRAY_STRIDE = javax.media.opengl.GL.GL_FOG_COORD_ARRAY_STRIDE;
	public static final int GL_FOG_COORD_ARRAY_POINTER = javax.media.opengl.GL.GL_FOG_COORD_ARRAY_POINTER;
	public static final int GL_FOG_COORD_ARRAY = javax.media.opengl.GL.GL_FOG_COORD_ARRAY;
	public static final int GL_FOG_COORD_ARRAY_BUFFER_BINDING = javax.media.opengl.GL.GL_FOG_COORD_ARRAY_BUFFER_BINDING;
	public static final int GL_SRC0_RGB = javax.media.opengl.GL.GL_SRC0_RGB;
	public static final int GL_SRC1_RGB = javax.media.opengl.GL.GL_SRC1_RGB;
	public static final int GL_SRC2_RGB = javax.media.opengl.GL.GL_SRC2_RGB;
	public static final int GL_SRC0_ALPHA = javax.media.opengl.GL.GL_SRC0_ALPHA;
	public static final int GL_SRC1_ALPHA = javax.media.opengl.GL.GL_SRC1_ALPHA;
	public static final int GL_SRC2_ALPHA = javax.media.opengl.GL.GL_SRC2_ALPHA;
	public static final int GL_BLEND_EQUATION_RGB = javax.media.opengl.GL.GL_BLEND_EQUATION_RGB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_ENABLED;
	public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_SIZE;
	public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_STRIDE;
	public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_TYPE;
	public static final int GL_CURRENT_VERTEX_ATTRIB = javax.media.opengl.GL.GL_CURRENT_VERTEX_ATTRIB;
	public static final int GL_VERTEX_PROGRAM_POINT_SIZE = javax.media.opengl.GL.GL_VERTEX_PROGRAM_POINT_SIZE;
	public static final int GL_VERTEX_PROGRAM_TWO_SIDE = javax.media.opengl.GL.GL_VERTEX_PROGRAM_TWO_SIDE;
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_POINTER;
	public static final int GL_STENCIL_BACK_FUNC = javax.media.opengl.GL.GL_STENCIL_BACK_FUNC;
	public static final int GL_STENCIL_BACK_FAIL = javax.media.opengl.GL.GL_STENCIL_BACK_FAIL;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = javax.media.opengl.GL.GL_STENCIL_BACK_PASS_DEPTH_FAIL;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = javax.media.opengl.GL.GL_STENCIL_BACK_PASS_DEPTH_PASS;
	public static final int GL_MAX_DRAW_BUFFERS = javax.media.opengl.GL.GL_MAX_DRAW_BUFFERS;
	public static final int GL_DRAW_BUFFER0 = javax.media.opengl.GL.GL_DRAW_BUFFER0;
	public static final int GL_DRAW_BUFFER1 = javax.media.opengl.GL.GL_DRAW_BUFFER1;
	public static final int GL_DRAW_BUFFER2 = javax.media.opengl.GL.GL_DRAW_BUFFER2;
	public static final int GL_DRAW_BUFFER3 = javax.media.opengl.GL.GL_DRAW_BUFFER3;
	public static final int GL_DRAW_BUFFER4 = javax.media.opengl.GL.GL_DRAW_BUFFER4;
	public static final int GL_DRAW_BUFFER5 = javax.media.opengl.GL.GL_DRAW_BUFFER5;
	public static final int GL_DRAW_BUFFER6 = javax.media.opengl.GL.GL_DRAW_BUFFER6;
	public static final int GL_DRAW_BUFFER7 = javax.media.opengl.GL.GL_DRAW_BUFFER7;
	public static final int GL_DRAW_BUFFER8 = javax.media.opengl.GL.GL_DRAW_BUFFER8;
	public static final int GL_DRAW_BUFFER9 = javax.media.opengl.GL.GL_DRAW_BUFFER9;
	public static final int GL_DRAW_BUFFER10 = javax.media.opengl.GL.GL_DRAW_BUFFER10;
	public static final int GL_DRAW_BUFFER11 = javax.media.opengl.GL.GL_DRAW_BUFFER11;
	public static final int GL_DRAW_BUFFER12 = javax.media.opengl.GL.GL_DRAW_BUFFER12;
	public static final int GL_DRAW_BUFFER13 = javax.media.opengl.GL.GL_DRAW_BUFFER13;
	public static final int GL_DRAW_BUFFER14 = javax.media.opengl.GL.GL_DRAW_BUFFER14;
	public static final int GL_DRAW_BUFFER15 = javax.media.opengl.GL.GL_DRAW_BUFFER15;
	public static final int GL_BLEND_EQUATION_ALPHA = javax.media.opengl.GL.GL_BLEND_EQUATION_ALPHA;
	public static final int GL_POINT_SPRITE = javax.media.opengl.GL.GL_POINT_SPRITE;
	public static final int GL_COORD_REPLACE = javax.media.opengl.GL.GL_COORD_REPLACE;
	public static final int GL_MAX_VERTEX_ATTRIBS = javax.media.opengl.GL.GL_MAX_VERTEX_ATTRIBS;
	public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_NORMALIZED;
	public static final int GL_MAX_TEXTURE_COORDS = javax.media.opengl.GL.GL_MAX_TEXTURE_COORDS;
	public static final int GL_MAX_TEXTURE_IMAGE_UNITS = javax.media.opengl.GL.GL_MAX_TEXTURE_IMAGE_UNITS;
	public static final int GL_FRAGMENT_SHADER = javax.media.opengl.GL.GL_FRAGMENT_SHADER;
	public static final int GL_VERTEX_SHADER = javax.media.opengl.GL.GL_VERTEX_SHADER;
	public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = javax.media.opengl.GL.GL_MAX_FRAGMENT_UNIFORM_COMPONENTS;
	public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = javax.media.opengl.GL.GL_MAX_VERTEX_UNIFORM_COMPONENTS;
	public static final int GL_MAX_VARYING_FLOATS = javax.media.opengl.GL.GL_MAX_VARYING_FLOATS;
	public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = javax.media.opengl.GL.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS;
	public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = javax.media.opengl.GL.GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS;
	public static final int GL_SHADER_TYPE = javax.media.opengl.GL.GL_SHADER_TYPE;
	public static final int GL_FLOAT_VEC2 = javax.media.opengl.GL.GL_FLOAT_VEC2;
	public static final int GL_FLOAT_VEC3 = javax.media.opengl.GL.GL_FLOAT_VEC3;
	public static final int GL_FLOAT_VEC4 = javax.media.opengl.GL.GL_FLOAT_VEC4;
	public static final int GL_INT_VEC2 = javax.media.opengl.GL.GL_INT_VEC2;
	public static final int GL_INT_VEC3 = javax.media.opengl.GL.GL_INT_VEC3;
	public static final int GL_INT_VEC4 = javax.media.opengl.GL.GL_INT_VEC4;
	public static final int GL_BOOL = javax.media.opengl.GL.GL_BOOL;
	public static final int GL_BOOL_VEC2 = javax.media.opengl.GL.GL_BOOL_VEC2;
	public static final int GL_BOOL_VEC3 = javax.media.opengl.GL.GL_BOOL_VEC3;
	public static final int GL_BOOL_VEC4 = javax.media.opengl.GL.GL_BOOL_VEC4;
	public static final int GL_FLOAT_MAT2 = javax.media.opengl.GL.GL_FLOAT_MAT2;
	public static final int GL_FLOAT_MAT3 = javax.media.opengl.GL.GL_FLOAT_MAT3;
	public static final int GL_FLOAT_MAT4 = javax.media.opengl.GL.GL_FLOAT_MAT4;
	public static final int GL_SAMPLER_1D = javax.media.opengl.GL.GL_SAMPLER_1D;
	public static final int GL_SAMPLER_2D = javax.media.opengl.GL.GL_SAMPLER_2D;
	public static final int GL_SAMPLER_3D = javax.media.opengl.GL.GL_SAMPLER_3D;
	public static final int GL_SAMPLER_CUBE = javax.media.opengl.GL.GL_SAMPLER_CUBE;
	public static final int GL_SAMPLER_1D_SHADOW = javax.media.opengl.GL.GL_SAMPLER_1D_SHADOW;
	public static final int GL_SAMPLER_2D_SHADOW = javax.media.opengl.GL.GL_SAMPLER_2D_SHADOW;
	public static final int GL_DELETE_STATUS = javax.media.opengl.GL.GL_DELETE_STATUS;
	public static final int GL_COMPILE_STATUS = javax.media.opengl.GL.GL_COMPILE_STATUS;
	public static final int GL_LINK_STATUS = javax.media.opengl.GL.GL_LINK_STATUS;
	public static final int GL_VALIDATE_STATUS = javax.media.opengl.GL.GL_VALIDATE_STATUS;
	public static final int GL_INFO_LOG_LENGTH = javax.media.opengl.GL.GL_INFO_LOG_LENGTH;
	public static final int GL_ATTACHED_SHADERS = javax.media.opengl.GL.GL_ATTACHED_SHADERS;
	public static final int GL_ACTIVE_UNIFORMS = javax.media.opengl.GL.GL_ACTIVE_UNIFORMS;
	public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = javax.media.opengl.GL.GL_ACTIVE_UNIFORM_MAX_LENGTH;
	public static final int GL_SHADER_SOURCE_LENGTH = javax.media.opengl.GL.GL_SHADER_SOURCE_LENGTH;
	public static final int GL_ACTIVE_ATTRIBUTES = javax.media.opengl.GL.GL_ACTIVE_ATTRIBUTES;
	public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = javax.media.opengl.GL.GL_ACTIVE_ATTRIBUTE_MAX_LENGTH;
	public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = javax.media.opengl.GL.GL_FRAGMENT_SHADER_DERIVATIVE_HINT;
	public static final int GL_SHADING_LANGUAGE_VERSION = javax.media.opengl.GL.GL_SHADING_LANGUAGE_VERSION;
	public static final int GL_CURRENT_PROGRAM = javax.media.opengl.GL.GL_CURRENT_PROGRAM;
	public static final int GL_POINT_SPRITE_COORD_ORIGIN = javax.media.opengl.GL.GL_POINT_SPRITE_COORD_ORIGIN;
	public static final int GL_LOWER_LEFT = javax.media.opengl.GL.GL_LOWER_LEFT;
	public static final int GL_UPPER_LEFT = javax.media.opengl.GL.GL_UPPER_LEFT;
	public static final int GL_STENCIL_BACK_REF = javax.media.opengl.GL.GL_STENCIL_BACK_REF;
	public static final int GL_STENCIL_BACK_VALUE_MASK = javax.media.opengl.GL.GL_STENCIL_BACK_VALUE_MASK;
	public static final int GL_STENCIL_BACK_WRITEMASK = javax.media.opengl.GL.GL_STENCIL_BACK_WRITEMASK;
	public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = javax.media.opengl.GL.GL_CURRENT_RASTER_SECONDARY_COLOR;
	public static final int GL_PIXEL_PACK_BUFFER = javax.media.opengl.GL.GL_PIXEL_PACK_BUFFER;
	public static final int GL_PIXEL_UNPACK_BUFFER = javax.media.opengl.GL.GL_PIXEL_UNPACK_BUFFER;
	public static final int GL_PIXEL_PACK_BUFFER_BINDING = javax.media.opengl.GL.GL_PIXEL_PACK_BUFFER_BINDING;
	public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = javax.media.opengl.GL.GL_PIXEL_UNPACK_BUFFER_BINDING;
	public static final int GL_FLOAT_MAT2x3 = javax.media.opengl.GL.GL_FLOAT_MAT2x3;
	public static final int GL_FLOAT_MAT2x4 = javax.media.opengl.GL.GL_FLOAT_MAT2x4;
	public static final int GL_FLOAT_MAT3x2 = javax.media.opengl.GL.GL_FLOAT_MAT3x2;
	public static final int GL_FLOAT_MAT3x4 = javax.media.opengl.GL.GL_FLOAT_MAT3x4;
	public static final int GL_FLOAT_MAT4x2 = javax.media.opengl.GL.GL_FLOAT_MAT4x2;
	public static final int GL_FLOAT_MAT4x3 = javax.media.opengl.GL.GL_FLOAT_MAT4x3;
	public static final int GL_SRGB = javax.media.opengl.GL.GL_SRGB;
	public static final int GL_SRGB8 = javax.media.opengl.GL.GL_SRGB8;
	public static final int GL_SRGB_ALPHA = javax.media.opengl.GL.GL_SRGB_ALPHA;
	public static final int GL_SRGB8_ALPHA8 = javax.media.opengl.GL.GL_SRGB8_ALPHA8;
	public static final int GL_SLUMINANCE_ALPHA = javax.media.opengl.GL.GL_SLUMINANCE_ALPHA;
	public static final int GL_SLUMINANCE8_ALPHA8 = javax.media.opengl.GL.GL_SLUMINANCE8_ALPHA8;
	public static final int GL_SLUMINANCE = javax.media.opengl.GL.GL_SLUMINANCE;
	public static final int GL_SLUMINANCE8 = javax.media.opengl.GL.GL_SLUMINANCE8;
	public static final int GL_COMPRESSED_SRGB = javax.media.opengl.GL.GL_COMPRESSED_SRGB;
	public static final int GL_COMPRESSED_SRGB_ALPHA = javax.media.opengl.GL.GL_COMPRESSED_SRGB_ALPHA;
	public static final int GL_COMPRESSED_SLUMINANCE = javax.media.opengl.GL.GL_COMPRESSED_SLUMINANCE;
	public static final int GL_COMPRESSED_SLUMINANCE_ALPHA = javax.media.opengl.GL.GL_COMPRESSED_SLUMINANCE_ALPHA;
	public static final int GL_POINT_SIZE_MIN_ARB = javax.media.opengl.GL.GL_POINT_SIZE_MIN_ARB;
	public static final int GL_POINT_SIZE_MAX_ARB = javax.media.opengl.GL.GL_POINT_SIZE_MAX_ARB;
	public static final int GL_POINT_FADE_THRESHOLD_SIZE_ARB = javax.media.opengl.GL.GL_POINT_FADE_THRESHOLD_SIZE_ARB;
	public static final int GL_POINT_DISTANCE_ATTENUATION_ARB = javax.media.opengl.GL.GL_POINT_DISTANCE_ATTENUATION_ARB;
	public static final int GL_MAX_VERTEX_UNITS_ARB = javax.media.opengl.GL.GL_MAX_VERTEX_UNITS_ARB;
	public static final int GL_ACTIVE_VERTEX_UNITS_ARB = javax.media.opengl.GL.GL_ACTIVE_VERTEX_UNITS_ARB;
	public static final int GL_WEIGHT_SUM_UNITY_ARB = javax.media.opengl.GL.GL_WEIGHT_SUM_UNITY_ARB;
	public static final int GL_VERTEX_BLEND_ARB = javax.media.opengl.GL.GL_VERTEX_BLEND_ARB;
	public static final int GL_CURRENT_WEIGHT_ARB = javax.media.opengl.GL.GL_CURRENT_WEIGHT_ARB;
	public static final int GL_WEIGHT_ARRAY_TYPE_ARB = javax.media.opengl.GL.GL_WEIGHT_ARRAY_TYPE_ARB;
	public static final int GL_WEIGHT_ARRAY_STRIDE_ARB = javax.media.opengl.GL.GL_WEIGHT_ARRAY_STRIDE_ARB;
	public static final int GL_WEIGHT_ARRAY_SIZE_ARB = javax.media.opengl.GL.GL_WEIGHT_ARRAY_SIZE_ARB;
	public static final int GL_WEIGHT_ARRAY_POINTER_ARB = javax.media.opengl.GL.GL_WEIGHT_ARRAY_POINTER_ARB;
	public static final int GL_WEIGHT_ARRAY_ARB = javax.media.opengl.GL.GL_WEIGHT_ARRAY_ARB;
	public static final int GL_MODELVIEW0_ARB = javax.media.opengl.GL.GL_MODELVIEW0_ARB;
	public static final int GL_MODELVIEW1_ARB = javax.media.opengl.GL.GL_MODELVIEW1_ARB;
	public static final int GL_MODELVIEW2_ARB = javax.media.opengl.GL.GL_MODELVIEW2_ARB;
	public static final int GL_MODELVIEW3_ARB = javax.media.opengl.GL.GL_MODELVIEW3_ARB;
	public static final int GL_MODELVIEW4_ARB = javax.media.opengl.GL.GL_MODELVIEW4_ARB;
	public static final int GL_MODELVIEW5_ARB = javax.media.opengl.GL.GL_MODELVIEW5_ARB;
	public static final int GL_MODELVIEW6_ARB = javax.media.opengl.GL.GL_MODELVIEW6_ARB;
	public static final int GL_MODELVIEW7_ARB = javax.media.opengl.GL.GL_MODELVIEW7_ARB;
	public static final int GL_MODELVIEW8_ARB = javax.media.opengl.GL.GL_MODELVIEW8_ARB;
	public static final int GL_MODELVIEW9_ARB = javax.media.opengl.GL.GL_MODELVIEW9_ARB;
	public static final int GL_MODELVIEW10_ARB = javax.media.opengl.GL.GL_MODELVIEW10_ARB;
	public static final int GL_MODELVIEW11_ARB = javax.media.opengl.GL.GL_MODELVIEW11_ARB;
	public static final int GL_MODELVIEW12_ARB = javax.media.opengl.GL.GL_MODELVIEW12_ARB;
	public static final int GL_MODELVIEW13_ARB = javax.media.opengl.GL.GL_MODELVIEW13_ARB;
	public static final int GL_MODELVIEW14_ARB = javax.media.opengl.GL.GL_MODELVIEW14_ARB;
	public static final int GL_MODELVIEW15_ARB = javax.media.opengl.GL.GL_MODELVIEW15_ARB;
	public static final int GL_MODELVIEW16_ARB = javax.media.opengl.GL.GL_MODELVIEW16_ARB;
	public static final int GL_MODELVIEW17_ARB = javax.media.opengl.GL.GL_MODELVIEW17_ARB;
	public static final int GL_MODELVIEW18_ARB = javax.media.opengl.GL.GL_MODELVIEW18_ARB;
	public static final int GL_MODELVIEW19_ARB = javax.media.opengl.GL.GL_MODELVIEW19_ARB;
	public static final int GL_MODELVIEW20_ARB = javax.media.opengl.GL.GL_MODELVIEW20_ARB;
	public static final int GL_MODELVIEW21_ARB = javax.media.opengl.GL.GL_MODELVIEW21_ARB;
	public static final int GL_MODELVIEW22_ARB = javax.media.opengl.GL.GL_MODELVIEW22_ARB;
	public static final int GL_MODELVIEW23_ARB = javax.media.opengl.GL.GL_MODELVIEW23_ARB;
	public static final int GL_MODELVIEW24_ARB = javax.media.opengl.GL.GL_MODELVIEW24_ARB;
	public static final int GL_MODELVIEW25_ARB = javax.media.opengl.GL.GL_MODELVIEW25_ARB;
	public static final int GL_MODELVIEW26_ARB = javax.media.opengl.GL.GL_MODELVIEW26_ARB;
	public static final int GL_MODELVIEW27_ARB = javax.media.opengl.GL.GL_MODELVIEW27_ARB;
	public static final int GL_MODELVIEW28_ARB = javax.media.opengl.GL.GL_MODELVIEW28_ARB;
	public static final int GL_MODELVIEW29_ARB = javax.media.opengl.GL.GL_MODELVIEW29_ARB;
	public static final int GL_MODELVIEW30_ARB = javax.media.opengl.GL.GL_MODELVIEW30_ARB;
	public static final int GL_MODELVIEW31_ARB = javax.media.opengl.GL.GL_MODELVIEW31_ARB;
	public static final int GL_MATRIX_PALETTE_ARB = javax.media.opengl.GL.GL_MATRIX_PALETTE_ARB;
	public static final int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = javax.media.opengl.GL.GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB;
	public static final int GL_MAX_PALETTE_MATRICES_ARB = javax.media.opengl.GL.GL_MAX_PALETTE_MATRICES_ARB;
	public static final int GL_CURRENT_PALETTE_MATRIX_ARB = javax.media.opengl.GL.GL_CURRENT_PALETTE_MATRIX_ARB;
	public static final int GL_MATRIX_INDEX_ARRAY_ARB = javax.media.opengl.GL.GL_MATRIX_INDEX_ARRAY_ARB;
	public static final int GL_CURRENT_MATRIX_INDEX_ARB = javax.media.opengl.GL.GL_CURRENT_MATRIX_INDEX_ARB;
	public static final int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = javax.media.opengl.GL.GL_MATRIX_INDEX_ARRAY_SIZE_ARB;
	public static final int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = javax.media.opengl.GL.GL_MATRIX_INDEX_ARRAY_TYPE_ARB;
	public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = javax.media.opengl.GL.GL_MATRIX_INDEX_ARRAY_STRIDE_ARB;
	public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = javax.media.opengl.GL.GL_MATRIX_INDEX_ARRAY_POINTER_ARB;
	public static final int GL_MIRRORED_REPEAT_ARB = javax.media.opengl.GL.GL_MIRRORED_REPEAT_ARB;
	public static final int GL_DEPTH_COMPONENT16_ARB = javax.media.opengl.GL.GL_DEPTH_COMPONENT16_ARB;
	public static final int GL_DEPTH_COMPONENT24_ARB = javax.media.opengl.GL.GL_DEPTH_COMPONENT24_ARB;
	public static final int GL_DEPTH_COMPONENT32_ARB = javax.media.opengl.GL.GL_DEPTH_COMPONENT32_ARB;
	public static final int GL_TEXTURE_DEPTH_SIZE_ARB = javax.media.opengl.GL.GL_TEXTURE_DEPTH_SIZE_ARB;
	public static final int GL_DEPTH_TEXTURE_MODE_ARB = javax.media.opengl.GL.GL_DEPTH_TEXTURE_MODE_ARB;
	public static final int GL_TEXTURE_COMPARE_MODE_ARB = javax.media.opengl.GL.GL_TEXTURE_COMPARE_MODE_ARB;
	public static final int GL_TEXTURE_COMPARE_FUNC_ARB = javax.media.opengl.GL.GL_TEXTURE_COMPARE_FUNC_ARB;
	public static final int GL_COMPARE_R_TO_TEXTURE_ARB = javax.media.opengl.GL.GL_COMPARE_R_TO_TEXTURE_ARB;
	public static final int GL_TEXTURE_COMPARE_FAIL_VALUE_ARB = javax.media.opengl.GL.GL_TEXTURE_COMPARE_FAIL_VALUE_ARB;
	public static final int GL_COLOR_SUM_ARB = javax.media.opengl.GL.GL_COLOR_SUM_ARB;
	public static final int GL_VERTEX_PROGRAM_ARB = javax.media.opengl.GL.GL_VERTEX_PROGRAM_ARB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB;
	public static final int GL_CURRENT_VERTEX_ATTRIB_ARB = javax.media.opengl.GL.GL_CURRENT_VERTEX_ATTRIB_ARB;
	public static final int GL_PROGRAM_LENGTH_ARB = javax.media.opengl.GL.GL_PROGRAM_LENGTH_ARB;
	public static final int GL_PROGRAM_STRING_ARB = javax.media.opengl.GL.GL_PROGRAM_STRING_ARB;
	public static final int GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB;
	public static final int GL_MAX_PROGRAM_MATRICES_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_MATRICES_ARB;
	public static final int GL_CURRENT_MATRIX_STACK_DEPTH_ARB = javax.media.opengl.GL.GL_CURRENT_MATRIX_STACK_DEPTH_ARB;
	public static final int GL_CURRENT_MATRIX_ARB = javax.media.opengl.GL.GL_CURRENT_MATRIX_ARB;
	public static final int GL_VERTEX_PROGRAM_POINT_SIZE_ARB = javax.media.opengl.GL.GL_VERTEX_PROGRAM_POINT_SIZE_ARB;
	public static final int GL_VERTEX_PROGRAM_TWO_SIDE_ARB = javax.media.opengl.GL.GL_VERTEX_PROGRAM_TWO_SIDE_ARB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB;
	public static final int GL_PROGRAM_ERROR_POSITION_ARB = javax.media.opengl.GL.GL_PROGRAM_ERROR_POSITION_ARB;
	public static final int GL_PROGRAM_BINDING_ARB = javax.media.opengl.GL.GL_PROGRAM_BINDING_ARB;
	public static final int GL_MAX_VERTEX_ATTRIBS_ARB = javax.media.opengl.GL.GL_MAX_VERTEX_ATTRIBS_ARB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB;
	public static final int GL_PROGRAM_ERROR_STRING_ARB = javax.media.opengl.GL.GL_PROGRAM_ERROR_STRING_ARB;
	public static final int GL_PROGRAM_FORMAT_ASCII_ARB = javax.media.opengl.GL.GL_PROGRAM_FORMAT_ASCII_ARB;
	public static final int GL_PROGRAM_FORMAT_ARB = javax.media.opengl.GL.GL_PROGRAM_FORMAT_ARB;
	public static final int GL_PROGRAM_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_PROGRAM_INSTRUCTIONS_ARB;
	public static final int GL_MAX_PROGRAM_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_INSTRUCTIONS_ARB;
	public static final int GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB;
	public static final int GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB;
	public static final int GL_PROGRAM_TEMPORARIES_ARB = javax.media.opengl.GL.GL_PROGRAM_TEMPORARIES_ARB;
	public static final int GL_MAX_PROGRAM_TEMPORARIES_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_TEMPORARIES_ARB;
	public static final int GL_PROGRAM_NATIVE_TEMPORARIES_ARB = javax.media.opengl.GL.GL_PROGRAM_NATIVE_TEMPORARIES_ARB;
	public static final int GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB;
	public static final int GL_PROGRAM_PARAMETERS_ARB = javax.media.opengl.GL.GL_PROGRAM_PARAMETERS_ARB;
	public static final int GL_MAX_PROGRAM_PARAMETERS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_PARAMETERS_ARB;
	public static final int GL_PROGRAM_NATIVE_PARAMETERS_ARB = javax.media.opengl.GL.GL_PROGRAM_NATIVE_PARAMETERS_ARB;
	public static final int GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB;
	public static final int GL_PROGRAM_ATTRIBS_ARB = javax.media.opengl.GL.GL_PROGRAM_ATTRIBS_ARB;
	public static final int GL_MAX_PROGRAM_ATTRIBS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_ATTRIBS_ARB;
	public static final int GL_PROGRAM_NATIVE_ATTRIBS_ARB = javax.media.opengl.GL.GL_PROGRAM_NATIVE_ATTRIBS_ARB;
	public static final int GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB;
	public static final int GL_PROGRAM_ADDRESS_REGISTERS_ARB = javax.media.opengl.GL.GL_PROGRAM_ADDRESS_REGISTERS_ARB;
	public static final int GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB;
	public static final int GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = javax.media.opengl.GL.GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB;
	public static final int GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB;
	public static final int GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB;
	public static final int GL_MAX_PROGRAM_ENV_PARAMETERS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_ENV_PARAMETERS_ARB;
	public static final int GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB = javax.media.opengl.GL.GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB;
	public static final int GL_TRANSPOSE_CURRENT_MATRIX_ARB = javax.media.opengl.GL.GL_TRANSPOSE_CURRENT_MATRIX_ARB;
	public static final int GL_MATRIX0_ARB = javax.media.opengl.GL.GL_MATRIX0_ARB;
	public static final int GL_MATRIX1_ARB = javax.media.opengl.GL.GL_MATRIX1_ARB;
	public static final int GL_MATRIX2_ARB = javax.media.opengl.GL.GL_MATRIX2_ARB;
	public static final int GL_MATRIX3_ARB = javax.media.opengl.GL.GL_MATRIX3_ARB;
	public static final int GL_MATRIX4_ARB = javax.media.opengl.GL.GL_MATRIX4_ARB;
	public static final int GL_MATRIX5_ARB = javax.media.opengl.GL.GL_MATRIX5_ARB;
	public static final int GL_MATRIX6_ARB = javax.media.opengl.GL.GL_MATRIX6_ARB;
	public static final int GL_MATRIX7_ARB = javax.media.opengl.GL.GL_MATRIX7_ARB;
	public static final int GL_MATRIX8_ARB = javax.media.opengl.GL.GL_MATRIX8_ARB;
	public static final int GL_MATRIX9_ARB = javax.media.opengl.GL.GL_MATRIX9_ARB;
	public static final int GL_MATRIX10_ARB = javax.media.opengl.GL.GL_MATRIX10_ARB;
	public static final int GL_MATRIX11_ARB = javax.media.opengl.GL.GL_MATRIX11_ARB;
	public static final int GL_MATRIX12_ARB = javax.media.opengl.GL.GL_MATRIX12_ARB;
	public static final int GL_MATRIX13_ARB = javax.media.opengl.GL.GL_MATRIX13_ARB;
	public static final int GL_MATRIX14_ARB = javax.media.opengl.GL.GL_MATRIX14_ARB;
	public static final int GL_MATRIX15_ARB = javax.media.opengl.GL.GL_MATRIX15_ARB;
	public static final int GL_MATRIX16_ARB = javax.media.opengl.GL.GL_MATRIX16_ARB;
	public static final int GL_MATRIX17_ARB = javax.media.opengl.GL.GL_MATRIX17_ARB;
	public static final int GL_MATRIX18_ARB = javax.media.opengl.GL.GL_MATRIX18_ARB;
	public static final int GL_MATRIX19_ARB = javax.media.opengl.GL.GL_MATRIX19_ARB;
	public static final int GL_MATRIX20_ARB = javax.media.opengl.GL.GL_MATRIX20_ARB;
	public static final int GL_MATRIX21_ARB = javax.media.opengl.GL.GL_MATRIX21_ARB;
	public static final int GL_MATRIX22_ARB = javax.media.opengl.GL.GL_MATRIX22_ARB;
	public static final int GL_MATRIX23_ARB = javax.media.opengl.GL.GL_MATRIX23_ARB;
	public static final int GL_MATRIX24_ARB = javax.media.opengl.GL.GL_MATRIX24_ARB;
	public static final int GL_MATRIX25_ARB = javax.media.opengl.GL.GL_MATRIX25_ARB;
	public static final int GL_MATRIX26_ARB = javax.media.opengl.GL.GL_MATRIX26_ARB;
	public static final int GL_MATRIX27_ARB = javax.media.opengl.GL.GL_MATRIX27_ARB;
	public static final int GL_MATRIX28_ARB = javax.media.opengl.GL.GL_MATRIX28_ARB;
	public static final int GL_MATRIX29_ARB = javax.media.opengl.GL.GL_MATRIX29_ARB;
	public static final int GL_MATRIX30_ARB = javax.media.opengl.GL.GL_MATRIX30_ARB;
	public static final int GL_MATRIX31_ARB = javax.media.opengl.GL.GL_MATRIX31_ARB;
	public static final int GL_FRAGMENT_PROGRAM_ARB = javax.media.opengl.GL.GL_FRAGMENT_PROGRAM_ARB;
	public static final int GL_PROGRAM_ALU_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_PROGRAM_ALU_INSTRUCTIONS_ARB;
	public static final int GL_PROGRAM_TEX_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_PROGRAM_TEX_INSTRUCTIONS_ARB;
	public static final int GL_PROGRAM_TEX_INDIRECTIONS_ARB = javax.media.opengl.GL.GL_PROGRAM_TEX_INDIRECTIONS_ARB;
	public static final int GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB;
	public static final int GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB;
	public static final int GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = javax.media.opengl.GL.GL_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB;
	public static final int GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_ALU_INSTRUCTIONS_ARB;
	public static final int GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_TEX_INSTRUCTIONS_ARB;
	public static final int GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_TEX_INDIRECTIONS_ARB;
	public static final int GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_NATIVE_ALU_INSTRUCTIONS_ARB;
	public static final int GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_NATIVE_TEX_INSTRUCTIONS_ARB;
	public static final int GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB = javax.media.opengl.GL.GL_MAX_PROGRAM_NATIVE_TEX_INDIRECTIONS_ARB;
	public static final int GL_MAX_TEXTURE_COORDS_ARB = javax.media.opengl.GL.GL_MAX_TEXTURE_COORDS_ARB;
	public static final int GL_MAX_TEXTURE_IMAGE_UNITS_ARB = javax.media.opengl.GL.GL_MAX_TEXTURE_IMAGE_UNITS_ARB;
	public static final int GL_BUFFER_SIZE_ARB = javax.media.opengl.GL.GL_BUFFER_SIZE_ARB;
	public static final int GL_BUFFER_USAGE_ARB = javax.media.opengl.GL.GL_BUFFER_USAGE_ARB;
	public static final int GL_ARRAY_BUFFER_ARB = javax.media.opengl.GL.GL_ARRAY_BUFFER_ARB;
	public static final int GL_ELEMENT_ARRAY_BUFFER_ARB = javax.media.opengl.GL.GL_ELEMENT_ARRAY_BUFFER_ARB;
	public static final int GL_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_VERTEX_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_VERTEX_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_NORMAL_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_NORMAL_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_COLOR_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_COLOR_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_INDEX_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_INDEX_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB;
	public static final int GL_READ_ONLY_ARB = javax.media.opengl.GL.GL_READ_ONLY_ARB;
	public static final int GL_WRITE_ONLY_ARB = javax.media.opengl.GL.GL_WRITE_ONLY_ARB;
	public static final int GL_READ_WRITE_ARB = javax.media.opengl.GL.GL_READ_WRITE_ARB;
	public static final int GL_BUFFER_ACCESS_ARB = javax.media.opengl.GL.GL_BUFFER_ACCESS_ARB;
	public static final int GL_BUFFER_MAPPED_ARB = javax.media.opengl.GL.GL_BUFFER_MAPPED_ARB;
	public static final int GL_BUFFER_MAP_POINTER_ARB = javax.media.opengl.GL.GL_BUFFER_MAP_POINTER_ARB;
	public static final int GL_STREAM_DRAW_ARB = javax.media.opengl.GL.GL_STREAM_DRAW_ARB;
	public static final int GL_STREAM_READ_ARB = javax.media.opengl.GL.GL_STREAM_READ_ARB;
	public static final int GL_STREAM_COPY_ARB = javax.media.opengl.GL.GL_STREAM_COPY_ARB;
	public static final int GL_STATIC_DRAW_ARB = javax.media.opengl.GL.GL_STATIC_DRAW_ARB;
	public static final int GL_STATIC_READ_ARB = javax.media.opengl.GL.GL_STATIC_READ_ARB;
	public static final int GL_STATIC_COPY_ARB = javax.media.opengl.GL.GL_STATIC_COPY_ARB;
	public static final int GL_DYNAMIC_DRAW_ARB = javax.media.opengl.GL.GL_DYNAMIC_DRAW_ARB;
	public static final int GL_DYNAMIC_READ_ARB = javax.media.opengl.GL.GL_DYNAMIC_READ_ARB;
	public static final int GL_DYNAMIC_COPY_ARB = javax.media.opengl.GL.GL_DYNAMIC_COPY_ARB;
	public static final int GL_QUERY_COUNTER_BITS_ARB = javax.media.opengl.GL.GL_QUERY_COUNTER_BITS_ARB;
	public static final int GL_CURRENT_QUERY_ARB = javax.media.opengl.GL.GL_CURRENT_QUERY_ARB;
	public static final int GL_QUERY_RESULT_ARB = javax.media.opengl.GL.GL_QUERY_RESULT_ARB;
	public static final int GL_QUERY_RESULT_AVAILABLE_ARB = javax.media.opengl.GL.GL_QUERY_RESULT_AVAILABLE_ARB;
	public static final int GL_SAMPLES_PASSED_ARB = javax.media.opengl.GL.GL_SAMPLES_PASSED_ARB;
	public static final int GL_PROGRAM_OBJECT_ARB = javax.media.opengl.GL.GL_PROGRAM_OBJECT_ARB;
	public static final int GL_SHADER_OBJECT_ARB = javax.media.opengl.GL.GL_SHADER_OBJECT_ARB;
	public static final int GL_OBJECT_TYPE_ARB = javax.media.opengl.GL.GL_OBJECT_TYPE_ARB;
	public static final int GL_OBJECT_SUBTYPE_ARB = javax.media.opengl.GL.GL_OBJECT_SUBTYPE_ARB;
	public static final int GL_FLOAT_VEC2_ARB = javax.media.opengl.GL.GL_FLOAT_VEC2_ARB;
	public static final int GL_FLOAT_VEC3_ARB = javax.media.opengl.GL.GL_FLOAT_VEC3_ARB;
	public static final int GL_FLOAT_VEC4_ARB = javax.media.opengl.GL.GL_FLOAT_VEC4_ARB;
	public static final int GL_INT_VEC2_ARB = javax.media.opengl.GL.GL_INT_VEC2_ARB;
	public static final int GL_INT_VEC3_ARB = javax.media.opengl.GL.GL_INT_VEC3_ARB;
	public static final int GL_INT_VEC4_ARB = javax.media.opengl.GL.GL_INT_VEC4_ARB;
	public static final int GL_BOOL_ARB = javax.media.opengl.GL.GL_BOOL_ARB;
	public static final int GL_BOOL_VEC2_ARB = javax.media.opengl.GL.GL_BOOL_VEC2_ARB;
	public static final int GL_BOOL_VEC3_ARB = javax.media.opengl.GL.GL_BOOL_VEC3_ARB;
	public static final int GL_BOOL_VEC4_ARB = javax.media.opengl.GL.GL_BOOL_VEC4_ARB;
	public static final int GL_FLOAT_MAT2_ARB = javax.media.opengl.GL.GL_FLOAT_MAT2_ARB;
	public static final int GL_FLOAT_MAT3_ARB = javax.media.opengl.GL.GL_FLOAT_MAT3_ARB;
	public static final int GL_FLOAT_MAT4_ARB = javax.media.opengl.GL.GL_FLOAT_MAT4_ARB;
	public static final int GL_SAMPLER_1D_ARB = javax.media.opengl.GL.GL_SAMPLER_1D_ARB;
	public static final int GL_SAMPLER_2D_ARB = javax.media.opengl.GL.GL_SAMPLER_2D_ARB;
	public static final int GL_SAMPLER_3D_ARB = javax.media.opengl.GL.GL_SAMPLER_3D_ARB;
	public static final int GL_SAMPLER_CUBE_ARB = javax.media.opengl.GL.GL_SAMPLER_CUBE_ARB;
	public static final int GL_SAMPLER_1D_SHADOW_ARB = javax.media.opengl.GL.GL_SAMPLER_1D_SHADOW_ARB;
	public static final int GL_SAMPLER_2D_SHADOW_ARB = javax.media.opengl.GL.GL_SAMPLER_2D_SHADOW_ARB;
	public static final int GL_SAMPLER_2D_RECT_ARB = javax.media.opengl.GL.GL_SAMPLER_2D_RECT_ARB;
	public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = javax.media.opengl.GL.GL_SAMPLER_2D_RECT_SHADOW_ARB;
	public static final int GL_OBJECT_DELETE_STATUS_ARB = javax.media.opengl.GL.GL_OBJECT_DELETE_STATUS_ARB;
	public static final int GL_OBJECT_COMPILE_STATUS_ARB = javax.media.opengl.GL.GL_OBJECT_COMPILE_STATUS_ARB;
	public static final int GL_OBJECT_LINK_STATUS_ARB = javax.media.opengl.GL.GL_OBJECT_LINK_STATUS_ARB;
	public static final int GL_OBJECT_VALIDATE_STATUS_ARB = javax.media.opengl.GL.GL_OBJECT_VALIDATE_STATUS_ARB;
	public static final int GL_OBJECT_INFO_LOG_LENGTH_ARB = javax.media.opengl.GL.GL_OBJECT_INFO_LOG_LENGTH_ARB;
	public static final int GL_OBJECT_ATTACHED_OBJECTS_ARB = javax.media.opengl.GL.GL_OBJECT_ATTACHED_OBJECTS_ARB;
	public static final int GL_OBJECT_ACTIVE_UNIFORMS_ARB = javax.media.opengl.GL.GL_OBJECT_ACTIVE_UNIFORMS_ARB;
	public static final int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = javax.media.opengl.GL.GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB;
	public static final int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = javax.media.opengl.GL.GL_OBJECT_SHADER_SOURCE_LENGTH_ARB;
	public static final int GL_VERTEX_SHADER_ARB = javax.media.opengl.GL.GL_VERTEX_SHADER_ARB;
	public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB = javax.media.opengl.GL.GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB;
	public static final int GL_MAX_VARYING_FLOATS_ARB = javax.media.opengl.GL.GL_MAX_VARYING_FLOATS_ARB;
	public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB = javax.media.opengl.GL.GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB;
	public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB = javax.media.opengl.GL.GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB;
	public static final int GL_OBJECT_ACTIVE_ATTRIBUTES_ARB = javax.media.opengl.GL.GL_OBJECT_ACTIVE_ATTRIBUTES_ARB;
	public static final int GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB = javax.media.opengl.GL.GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB;
	public static final int GL_FRAGMENT_SHADER_ARB = javax.media.opengl.GL.GL_FRAGMENT_SHADER_ARB;
	public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB = javax.media.opengl.GL.GL_MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB;
	public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT_ARB = javax.media.opengl.GL.GL_FRAGMENT_SHADER_DERIVATIVE_HINT_ARB;
	public static final int GL_SHADING_LANGUAGE_VERSION_ARB = javax.media.opengl.GL.GL_SHADING_LANGUAGE_VERSION_ARB;
	public static final int GL_POINT_SPRITE_ARB = javax.media.opengl.GL.GL_POINT_SPRITE_ARB;
	public static final int GL_COORD_REPLACE_ARB = javax.media.opengl.GL.GL_COORD_REPLACE_ARB;
	public static final int GL_MAX_DRAW_BUFFERS_ARB = javax.media.opengl.GL.GL_MAX_DRAW_BUFFERS_ARB;
	public static final int GL_DRAW_BUFFER0_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER0_ARB;
	public static final int GL_DRAW_BUFFER1_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER1_ARB;
	public static final int GL_DRAW_BUFFER2_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER2_ARB;
	public static final int GL_DRAW_BUFFER3_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER3_ARB;
	public static final int GL_DRAW_BUFFER4_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER4_ARB;
	public static final int GL_DRAW_BUFFER5_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER5_ARB;
	public static final int GL_DRAW_BUFFER6_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER6_ARB;
	public static final int GL_DRAW_BUFFER7_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER7_ARB;
	public static final int GL_DRAW_BUFFER8_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER8_ARB;
	public static final int GL_DRAW_BUFFER9_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER9_ARB;
	public static final int GL_DRAW_BUFFER10_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER10_ARB;
	public static final int GL_DRAW_BUFFER11_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER11_ARB;
	public static final int GL_DRAW_BUFFER12_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER12_ARB;
	public static final int GL_DRAW_BUFFER13_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER13_ARB;
	public static final int GL_DRAW_BUFFER14_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER14_ARB;
	public static final int GL_DRAW_BUFFER15_ARB = javax.media.opengl.GL.GL_DRAW_BUFFER15_ARB;
	public static final int GL_TEXTURE_RECTANGLE_ARB = javax.media.opengl.GL.GL_TEXTURE_RECTANGLE_ARB;
	public static final int GL_TEXTURE_BINDING_RECTANGLE_ARB = javax.media.opengl.GL.GL_TEXTURE_BINDING_RECTANGLE_ARB;
	public static final int GL_PROXY_TEXTURE_RECTANGLE_ARB = javax.media.opengl.GL.GL_PROXY_TEXTURE_RECTANGLE_ARB;
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB = javax.media.opengl.GL.GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB;
	public static final int GL_RGBA_FLOAT_MODE_ARB = javax.media.opengl.GL.GL_RGBA_FLOAT_MODE_ARB;
	public static final int GL_CLAMP_VERTEX_COLOR_ARB = javax.media.opengl.GL.GL_CLAMP_VERTEX_COLOR_ARB;
	public static final int GL_CLAMP_FRAGMENT_COLOR_ARB = javax.media.opengl.GL.GL_CLAMP_FRAGMENT_COLOR_ARB;
	public static final int GL_CLAMP_READ_COLOR_ARB = javax.media.opengl.GL.GL_CLAMP_READ_COLOR_ARB;
	public static final int GL_FIXED_ONLY_ARB = javax.media.opengl.GL.GL_FIXED_ONLY_ARB;
	public static final int GL_HALF_FLOAT_ARB = javax.media.opengl.GL.GL_HALF_FLOAT_ARB;
	public static final int GL_TEXTURE_RED_TYPE_ARB = javax.media.opengl.GL.GL_TEXTURE_RED_TYPE_ARB;
	public static final int GL_TEXTURE_GREEN_TYPE_ARB = javax.media.opengl.GL.GL_TEXTURE_GREEN_TYPE_ARB;
	public static final int GL_TEXTURE_BLUE_TYPE_ARB = javax.media.opengl.GL.GL_TEXTURE_BLUE_TYPE_ARB;
	public static final int GL_TEXTURE_ALPHA_TYPE_ARB = javax.media.opengl.GL.GL_TEXTURE_ALPHA_TYPE_ARB;
	public static final int GL_TEXTURE_LUMINANCE_TYPE_ARB = javax.media.opengl.GL.GL_TEXTURE_LUMINANCE_TYPE_ARB;
	public static final int GL_TEXTURE_INTENSITY_TYPE_ARB = javax.media.opengl.GL.GL_TEXTURE_INTENSITY_TYPE_ARB;
	public static final int GL_TEXTURE_DEPTH_TYPE_ARB = javax.media.opengl.GL.GL_TEXTURE_DEPTH_TYPE_ARB;
	public static final int GL_UNSIGNED_NORMALIZED_ARB = javax.media.opengl.GL.GL_UNSIGNED_NORMALIZED_ARB;
	public static final int GL_RGBA32F_ARB = javax.media.opengl.GL.GL_RGBA32F_ARB;
	public static final int GL_RGB32F_ARB = javax.media.opengl.GL.GL_RGB32F_ARB;
	public static final int GL_ALPHA32F_ARB = javax.media.opengl.GL.GL_ALPHA32F_ARB;
	public static final int GL_INTENSITY32F_ARB = javax.media.opengl.GL.GL_INTENSITY32F_ARB;
	public static final int GL_LUMINANCE32F_ARB = javax.media.opengl.GL.GL_LUMINANCE32F_ARB;
	public static final int GL_LUMINANCE_ALPHA32F_ARB = javax.media.opengl.GL.GL_LUMINANCE_ALPHA32F_ARB;
	public static final int GL_RGBA16F_ARB = javax.media.opengl.GL.GL_RGBA16F_ARB;
	public static final int GL_RGB16F_ARB = javax.media.opengl.GL.GL_RGB16F_ARB;
	public static final int GL_ALPHA16F_ARB = javax.media.opengl.GL.GL_ALPHA16F_ARB;
	public static final int GL_INTENSITY16F_ARB = javax.media.opengl.GL.GL_INTENSITY16F_ARB;
	public static final int GL_LUMINANCE16F_ARB = javax.media.opengl.GL.GL_LUMINANCE16F_ARB;
	public static final int GL_LUMINANCE_ALPHA16F_ARB = javax.media.opengl.GL.GL_LUMINANCE_ALPHA16F_ARB;
	public static final int GL_PIXEL_PACK_BUFFER_ARB = javax.media.opengl.GL.GL_PIXEL_PACK_BUFFER_ARB;
	public static final int GL_PIXEL_UNPACK_BUFFER_ARB = javax.media.opengl.GL.GL_PIXEL_UNPACK_BUFFER_ARB;
	public static final int GL_PIXEL_PACK_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_PIXEL_PACK_BUFFER_BINDING_ARB;
	public static final int GL_PIXEL_UNPACK_BUFFER_BINDING_ARB = javax.media.opengl.GL.GL_PIXEL_UNPACK_BUFFER_BINDING_ARB;
	public static final int GL_ABGR_EXT = javax.media.opengl.GL.GL_ABGR_EXT;
	public static final int GL_FILTER4_SGIS = javax.media.opengl.GL.GL_FILTER4_SGIS;
	public static final int GL_TEXTURE_FILTER4_SIZE_SGIS = javax.media.opengl.GL.GL_TEXTURE_FILTER4_SIZE_SGIS;
	public static final int GL_PIXEL_TEXTURE_SGIS = javax.media.opengl.GL.GL_PIXEL_TEXTURE_SGIS;
	public static final int GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS = javax.media.opengl.GL.GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS;
	public static final int GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS = javax.media.opengl.GL.GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS;
	public static final int GL_PIXEL_GROUP_COLOR_SGIS = javax.media.opengl.GL.GL_PIXEL_GROUP_COLOR_SGIS;
	public static final int GL_PIXEL_TEX_GEN_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_SGIX;
	public static final int GL_PIXEL_TEX_GEN_MODE_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_MODE_SGIX;
	public static final int GL_PACK_SKIP_VOLUMES_SGIS = javax.media.opengl.GL.GL_PACK_SKIP_VOLUMES_SGIS;
	public static final int GL_PACK_IMAGE_DEPTH_SGIS = javax.media.opengl.GL.GL_PACK_IMAGE_DEPTH_SGIS;
	public static final int GL_UNPACK_SKIP_VOLUMES_SGIS = javax.media.opengl.GL.GL_UNPACK_SKIP_VOLUMES_SGIS;
	public static final int GL_UNPACK_IMAGE_DEPTH_SGIS = javax.media.opengl.GL.GL_UNPACK_IMAGE_DEPTH_SGIS;
	public static final int GL_TEXTURE_4D_SGIS = javax.media.opengl.GL.GL_TEXTURE_4D_SGIS;
	public static final int GL_PROXY_TEXTURE_4D_SGIS = javax.media.opengl.GL.GL_PROXY_TEXTURE_4D_SGIS;
	public static final int GL_TEXTURE_4DSIZE_SGIS = javax.media.opengl.GL.GL_TEXTURE_4DSIZE_SGIS;
	public static final int GL_TEXTURE_WRAP_Q_SGIS = javax.media.opengl.GL.GL_TEXTURE_WRAP_Q_SGIS;
	public static final int GL_MAX_4D_TEXTURE_SIZE_SGIS = javax.media.opengl.GL.GL_MAX_4D_TEXTURE_SIZE_SGIS;
	public static final int GL_TEXTURE_4D_BINDING_SGIS = javax.media.opengl.GL.GL_TEXTURE_4D_BINDING_SGIS;
	public static final int GL_TEXTURE_COLOR_TABLE_SGI = javax.media.opengl.GL.GL_TEXTURE_COLOR_TABLE_SGI;
	public static final int GL_PROXY_TEXTURE_COLOR_TABLE_SGI = javax.media.opengl.GL.GL_PROXY_TEXTURE_COLOR_TABLE_SGI;
	public static final int GL_CMYK_EXT = javax.media.opengl.GL.GL_CMYK_EXT;
	public static final int GL_CMYKA_EXT = javax.media.opengl.GL.GL_CMYKA_EXT;
	public static final int GL_PACK_CMYK_HINT_EXT = javax.media.opengl.GL.GL_PACK_CMYK_HINT_EXT;
	public static final int GL_UNPACK_CMYK_HINT_EXT = javax.media.opengl.GL.GL_UNPACK_CMYK_HINT_EXT;
	public static final int GL_DETAIL_TEXTURE_2D_SGIS = javax.media.opengl.GL.GL_DETAIL_TEXTURE_2D_SGIS;
	public static final int GL_DETAIL_TEXTURE_2D_BINDING_SGIS = javax.media.opengl.GL.GL_DETAIL_TEXTURE_2D_BINDING_SGIS;
	public static final int GL_LINEAR_DETAIL_SGIS = javax.media.opengl.GL.GL_LINEAR_DETAIL_SGIS;
	public static final int GL_LINEAR_DETAIL_ALPHA_SGIS = javax.media.opengl.GL.GL_LINEAR_DETAIL_ALPHA_SGIS;
	public static final int GL_LINEAR_DETAIL_COLOR_SGIS = javax.media.opengl.GL.GL_LINEAR_DETAIL_COLOR_SGIS;
	public static final int GL_DETAIL_TEXTURE_LEVEL_SGIS = javax.media.opengl.GL.GL_DETAIL_TEXTURE_LEVEL_SGIS;
	public static final int GL_DETAIL_TEXTURE_MODE_SGIS = javax.media.opengl.GL.GL_DETAIL_TEXTURE_MODE_SGIS;
	public static final int GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS = javax.media.opengl.GL.GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS;
	public static final int GL_LINEAR_SHARPEN_SGIS = javax.media.opengl.GL.GL_LINEAR_SHARPEN_SGIS;
	public static final int GL_LINEAR_SHARPEN_ALPHA_SGIS = javax.media.opengl.GL.GL_LINEAR_SHARPEN_ALPHA_SGIS;
	public static final int GL_LINEAR_SHARPEN_COLOR_SGIS = javax.media.opengl.GL.GL_LINEAR_SHARPEN_COLOR_SGIS;
	public static final int GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS = javax.media.opengl.GL.GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS;
	public static final int GL_MULTISAMPLE_SGIS = javax.media.opengl.GL.GL_MULTISAMPLE_SGIS;
	public static final int GL_SAMPLE_ALPHA_TO_MASK_SGIS = javax.media.opengl.GL.GL_SAMPLE_ALPHA_TO_MASK_SGIS;
	public static final int GL_SAMPLE_ALPHA_TO_ONE_SGIS = javax.media.opengl.GL.GL_SAMPLE_ALPHA_TO_ONE_SGIS;
	public static final int GL_SAMPLE_MASK_SGIS = javax.media.opengl.GL.GL_SAMPLE_MASK_SGIS;
	public static final int GL_1PASS_SGIS = javax.media.opengl.GL.GL_1PASS_SGIS;
	public static final int GL_2PASS_0_SGIS = javax.media.opengl.GL.GL_2PASS_0_SGIS;
	public static final int GL_2PASS_1_SGIS = javax.media.opengl.GL.GL_2PASS_1_SGIS;
	public static final int GL_4PASS_0_SGIS = javax.media.opengl.GL.GL_4PASS_0_SGIS;
	public static final int GL_4PASS_1_SGIS = javax.media.opengl.GL.GL_4PASS_1_SGIS;
	public static final int GL_4PASS_2_SGIS = javax.media.opengl.GL.GL_4PASS_2_SGIS;
	public static final int GL_4PASS_3_SGIS = javax.media.opengl.GL.GL_4PASS_3_SGIS;
	public static final int GL_SAMPLE_BUFFERS_SGIS = javax.media.opengl.GL.GL_SAMPLE_BUFFERS_SGIS;
	public static final int GL_SAMPLES_SGIS = javax.media.opengl.GL.GL_SAMPLES_SGIS;
	public static final int GL_SAMPLE_MASK_VALUE_SGIS = javax.media.opengl.GL.GL_SAMPLE_MASK_VALUE_SGIS;
	public static final int GL_SAMPLE_MASK_INVERT_SGIS = javax.media.opengl.GL.GL_SAMPLE_MASK_INVERT_SGIS;
	public static final int GL_SAMPLE_PATTERN_SGIS = javax.media.opengl.GL.GL_SAMPLE_PATTERN_SGIS;
	public static final int GL_GENERATE_MIPMAP_SGIS = javax.media.opengl.GL.GL_GENERATE_MIPMAP_SGIS;
	public static final int GL_GENERATE_MIPMAP_HINT_SGIS = javax.media.opengl.GL.GL_GENERATE_MIPMAP_HINT_SGIS;
	public static final int GL_LINEAR_CLIPMAP_LINEAR_SGIX = javax.media.opengl.GL.GL_LINEAR_CLIPMAP_LINEAR_SGIX;
	public static final int GL_TEXTURE_CLIPMAP_CENTER_SGIX = javax.media.opengl.GL.GL_TEXTURE_CLIPMAP_CENTER_SGIX;
	public static final int GL_TEXTURE_CLIPMAP_FRAME_SGIX = javax.media.opengl.GL.GL_TEXTURE_CLIPMAP_FRAME_SGIX;
	public static final int GL_TEXTURE_CLIPMAP_OFFSET_SGIX = javax.media.opengl.GL.GL_TEXTURE_CLIPMAP_OFFSET_SGIX;
	public static final int GL_TEXTURE_CLIPMAP_VIRTUAL_DEPTH_SGIX = javax.media.opengl.GL.GL_TEXTURE_CLIPMAP_VIRTUAL_DEPTH_SGIX;
	public static final int GL_TEXTURE_CLIPMAP_LOD_OFFSET_SGIX = javax.media.opengl.GL.GL_TEXTURE_CLIPMAP_LOD_OFFSET_SGIX;
	public static final int GL_TEXTURE_CLIPMAP_DEPTH_SGIX = javax.media.opengl.GL.GL_TEXTURE_CLIPMAP_DEPTH_SGIX;
	public static final int GL_MAX_CLIPMAP_DEPTH_SGIX = javax.media.opengl.GL.GL_MAX_CLIPMAP_DEPTH_SGIX;
	public static final int GL_MAX_CLIPMAP_VIRTUAL_DEPTH_SGIX = javax.media.opengl.GL.GL_MAX_CLIPMAP_VIRTUAL_DEPTH_SGIX;
	public static final int GL_NEAREST_CLIPMAP_NEAREST_SGIX = javax.media.opengl.GL.GL_NEAREST_CLIPMAP_NEAREST_SGIX;
	public static final int GL_NEAREST_CLIPMAP_LINEAR_SGIX = javax.media.opengl.GL.GL_NEAREST_CLIPMAP_LINEAR_SGIX;
	public static final int GL_LINEAR_CLIPMAP_NEAREST_SGIX = javax.media.opengl.GL.GL_LINEAR_CLIPMAP_NEAREST_SGIX;
	public static final int GL_TEXTURE_COMPARE_SGIX = javax.media.opengl.GL.GL_TEXTURE_COMPARE_SGIX;
	public static final int GL_TEXTURE_COMPARE_OPERATOR_SGIX = javax.media.opengl.GL.GL_TEXTURE_COMPARE_OPERATOR_SGIX;
	public static final int GL_TEXTURE_LEQUAL_R_SGIX = javax.media.opengl.GL.GL_TEXTURE_LEQUAL_R_SGIX;
	public static final int GL_TEXTURE_GEQUAL_R_SGIX = javax.media.opengl.GL.GL_TEXTURE_GEQUAL_R_SGIX;
	public static final int GL_INTERLACE_SGIX = javax.media.opengl.GL.GL_INTERLACE_SGIX;
	public static final int GL_PIXEL_TILE_BEST_ALIGNMENT_SGIX = javax.media.opengl.GL.GL_PIXEL_TILE_BEST_ALIGNMENT_SGIX;
	public static final int GL_PIXEL_TILE_CACHE_INCREMENT_SGIX = javax.media.opengl.GL.GL_PIXEL_TILE_CACHE_INCREMENT_SGIX;
	public static final int GL_PIXEL_TILE_WIDTH_SGIX = javax.media.opengl.GL.GL_PIXEL_TILE_WIDTH_SGIX;
	public static final int GL_PIXEL_TILE_HEIGHT_SGIX = javax.media.opengl.GL.GL_PIXEL_TILE_HEIGHT_SGIX;
	public static final int GL_PIXEL_TILE_GRID_WIDTH_SGIX = javax.media.opengl.GL.GL_PIXEL_TILE_GRID_WIDTH_SGIX;
	public static final int GL_PIXEL_TILE_GRID_HEIGHT_SGIX = javax.media.opengl.GL.GL_PIXEL_TILE_GRID_HEIGHT_SGIX;
	public static final int GL_PIXEL_TILE_GRID_DEPTH_SGIX = javax.media.opengl.GL.GL_PIXEL_TILE_GRID_DEPTH_SGIX;
	public static final int GL_PIXEL_TILE_CACHE_SIZE_SGIX = javax.media.opengl.GL.GL_PIXEL_TILE_CACHE_SIZE_SGIX;
	public static final int GL_DUAL_ALPHA4_SGIS = javax.media.opengl.GL.GL_DUAL_ALPHA4_SGIS;
	public static final int GL_DUAL_ALPHA8_SGIS = javax.media.opengl.GL.GL_DUAL_ALPHA8_SGIS;
	public static final int GL_DUAL_ALPHA12_SGIS = javax.media.opengl.GL.GL_DUAL_ALPHA12_SGIS;
	public static final int GL_DUAL_ALPHA16_SGIS = javax.media.opengl.GL.GL_DUAL_ALPHA16_SGIS;
	public static final int GL_DUAL_LUMINANCE4_SGIS = javax.media.opengl.GL.GL_DUAL_LUMINANCE4_SGIS;
	public static final int GL_DUAL_LUMINANCE8_SGIS = javax.media.opengl.GL.GL_DUAL_LUMINANCE8_SGIS;
	public static final int GL_DUAL_LUMINANCE12_SGIS = javax.media.opengl.GL.GL_DUAL_LUMINANCE12_SGIS;
	public static final int GL_DUAL_LUMINANCE16_SGIS = javax.media.opengl.GL.GL_DUAL_LUMINANCE16_SGIS;
	public static final int GL_DUAL_INTENSITY4_SGIS = javax.media.opengl.GL.GL_DUAL_INTENSITY4_SGIS;
	public static final int GL_DUAL_INTENSITY8_SGIS = javax.media.opengl.GL.GL_DUAL_INTENSITY8_SGIS;
	public static final int GL_DUAL_INTENSITY12_SGIS = javax.media.opengl.GL.GL_DUAL_INTENSITY12_SGIS;
	public static final int GL_DUAL_INTENSITY16_SGIS = javax.media.opengl.GL.GL_DUAL_INTENSITY16_SGIS;
	public static final int GL_DUAL_LUMINANCE_ALPHA4_SGIS = javax.media.opengl.GL.GL_DUAL_LUMINANCE_ALPHA4_SGIS;
	public static final int GL_DUAL_LUMINANCE_ALPHA8_SGIS = javax.media.opengl.GL.GL_DUAL_LUMINANCE_ALPHA8_SGIS;
	public static final int GL_QUAD_ALPHA4_SGIS = javax.media.opengl.GL.GL_QUAD_ALPHA4_SGIS;
	public static final int GL_QUAD_ALPHA8_SGIS = javax.media.opengl.GL.GL_QUAD_ALPHA8_SGIS;
	public static final int GL_QUAD_LUMINANCE4_SGIS = javax.media.opengl.GL.GL_QUAD_LUMINANCE4_SGIS;
	public static final int GL_QUAD_LUMINANCE8_SGIS = javax.media.opengl.GL.GL_QUAD_LUMINANCE8_SGIS;
	public static final int GL_QUAD_INTENSITY4_SGIS = javax.media.opengl.GL.GL_QUAD_INTENSITY4_SGIS;
	public static final int GL_QUAD_INTENSITY8_SGIS = javax.media.opengl.GL.GL_QUAD_INTENSITY8_SGIS;
	public static final int GL_DUAL_TEXTURE_SELECT_SGIS = javax.media.opengl.GL.GL_DUAL_TEXTURE_SELECT_SGIS;
	public static final int GL_QUAD_TEXTURE_SELECT_SGIS = javax.media.opengl.GL.GL_QUAD_TEXTURE_SELECT_SGIS;
	public static final int GL_SPRITE_SGIX = javax.media.opengl.GL.GL_SPRITE_SGIX;
	public static final int GL_SPRITE_MODE_SGIX = javax.media.opengl.GL.GL_SPRITE_MODE_SGIX;
	public static final int GL_SPRITE_AXIS_SGIX = javax.media.opengl.GL.GL_SPRITE_AXIS_SGIX;
	public static final int GL_SPRITE_TRANSLATION_SGIX = javax.media.opengl.GL.GL_SPRITE_TRANSLATION_SGIX;
	public static final int GL_SPRITE_AXIAL_SGIX = javax.media.opengl.GL.GL_SPRITE_AXIAL_SGIX;
	public static final int GL_SPRITE_OBJECT_ALIGNED_SGIX = javax.media.opengl.GL.GL_SPRITE_OBJECT_ALIGNED_SGIX;
	public static final int GL_SPRITE_EYE_ALIGNED_SGIX = javax.media.opengl.GL.GL_SPRITE_EYE_ALIGNED_SGIX;
	public static final int GL_TEXTURE_MULTI_BUFFER_HINT_SGIX = javax.media.opengl.GL.GL_TEXTURE_MULTI_BUFFER_HINT_SGIX;
	public static final int GL_POINT_SIZE_MIN_EXT = javax.media.opengl.GL.GL_POINT_SIZE_MIN_EXT;
	public static final int GL_POINT_SIZE_MAX_EXT = javax.media.opengl.GL.GL_POINT_SIZE_MAX_EXT;
	public static final int GL_POINT_FADE_THRESHOLD_SIZE_EXT = javax.media.opengl.GL.GL_POINT_FADE_THRESHOLD_SIZE_EXT;
	public static final int GL_DISTANCE_ATTENUATION_EXT = javax.media.opengl.GL.GL_DISTANCE_ATTENUATION_EXT;
	public static final int GL_POINT_SIZE_MIN_SGIS = javax.media.opengl.GL.GL_POINT_SIZE_MIN_SGIS;
	public static final int GL_POINT_SIZE_MAX_SGIS = javax.media.opengl.GL.GL_POINT_SIZE_MAX_SGIS;
	public static final int GL_POINT_FADE_THRESHOLD_SIZE_SGIS = javax.media.opengl.GL.GL_POINT_FADE_THRESHOLD_SIZE_SGIS;
	public static final int GL_DISTANCE_ATTENUATION_SGIS = javax.media.opengl.GL.GL_DISTANCE_ATTENUATION_SGIS;
	public static final int GL_INSTRUMENT_BUFFER_POINTER_SGIX = javax.media.opengl.GL.GL_INSTRUMENT_BUFFER_POINTER_SGIX;
	public static final int GL_INSTRUMENT_MEASUREMENTS_SGIX = javax.media.opengl.GL.GL_INSTRUMENT_MEASUREMENTS_SGIX;
	public static final int GL_POST_TEXTURE_FILTER_BIAS_SGIX = javax.media.opengl.GL.GL_POST_TEXTURE_FILTER_BIAS_SGIX;
	public static final int GL_POST_TEXTURE_FILTER_SCALE_SGIX = javax.media.opengl.GL.GL_POST_TEXTURE_FILTER_SCALE_SGIX;
	public static final int GL_POST_TEXTURE_FILTER_BIAS_RANGE_SGIX = javax.media.opengl.GL.GL_POST_TEXTURE_FILTER_BIAS_RANGE_SGIX;
	public static final int GL_POST_TEXTURE_FILTER_SCALE_RANGE_SGIX = javax.media.opengl.GL.GL_POST_TEXTURE_FILTER_SCALE_RANGE_SGIX;
	public static final int GL_FRAMEZOOM_SGIX = javax.media.opengl.GL.GL_FRAMEZOOM_SGIX;
	public static final int GL_FRAMEZOOM_FACTOR_SGIX = javax.media.opengl.GL.GL_FRAMEZOOM_FACTOR_SGIX;
	public static final int GL_MAX_FRAMEZOOM_FACTOR_SGIX = javax.media.opengl.GL.GL_MAX_FRAMEZOOM_FACTOR_SGIX;
	public static final int GL_TEXTURE_DEFORMATION_BIT_SGIX = javax.media.opengl.GL.GL_TEXTURE_DEFORMATION_BIT_SGIX;
	public static final int GL_GEOMETRY_DEFORMATION_BIT_SGIX = javax.media.opengl.GL.GL_GEOMETRY_DEFORMATION_BIT_SGIX;
	public static final int GL_GEOMETRY_DEFORMATION_SGIX = javax.media.opengl.GL.GL_GEOMETRY_DEFORMATION_SGIX;
	public static final int GL_TEXTURE_DEFORMATION_SGIX = javax.media.opengl.GL.GL_TEXTURE_DEFORMATION_SGIX;
	public static final int GL_DEFORMATIONS_MASK_SGIX = javax.media.opengl.GL.GL_DEFORMATIONS_MASK_SGIX;
	public static final int GL_MAX_DEFORMATION_ORDER_SGIX = javax.media.opengl.GL.GL_MAX_DEFORMATION_ORDER_SGIX;
	public static final int GL_REFERENCE_PLANE_SGIX = javax.media.opengl.GL.GL_REFERENCE_PLANE_SGIX;
	public static final int GL_REFERENCE_PLANE_EQUATION_SGIX = javax.media.opengl.GL.GL_REFERENCE_PLANE_EQUATION_SGIX;
	public static final int GL_DEPTH_COMPONENT16_SGIX = javax.media.opengl.GL.GL_DEPTH_COMPONENT16_SGIX;
	public static final int GL_DEPTH_COMPONENT24_SGIX = javax.media.opengl.GL.GL_DEPTH_COMPONENT24_SGIX;
	public static final int GL_DEPTH_COMPONENT32_SGIX = javax.media.opengl.GL.GL_DEPTH_COMPONENT32_SGIX;
	public static final int GL_FOG_FUNC_SGIS = javax.media.opengl.GL.GL_FOG_FUNC_SGIS;
	public static final int GL_FOG_FUNC_POINTS_SGIS = javax.media.opengl.GL.GL_FOG_FUNC_POINTS_SGIS;
	public static final int GL_MAX_FOG_FUNC_POINTS_SGIS = javax.media.opengl.GL.GL_MAX_FOG_FUNC_POINTS_SGIS;
	public static final int GL_FOG_OFFSET_SGIX = javax.media.opengl.GL.GL_FOG_OFFSET_SGIX;
	public static final int GL_FOG_OFFSET_VALUE_SGIX = javax.media.opengl.GL.GL_FOG_OFFSET_VALUE_SGIX;
	public static final int GL_IMAGE_SCALE_X_HP = javax.media.opengl.GL.GL_IMAGE_SCALE_X_HP;
	public static final int GL_IMAGE_SCALE_Y_HP = javax.media.opengl.GL.GL_IMAGE_SCALE_Y_HP;
	public static final int GL_IMAGE_TRANSLATE_X_HP = javax.media.opengl.GL.GL_IMAGE_TRANSLATE_X_HP;
	public static final int GL_IMAGE_TRANSLATE_Y_HP = javax.media.opengl.GL.GL_IMAGE_TRANSLATE_Y_HP;
	public static final int GL_IMAGE_ROTATE_ANGLE_HP = javax.media.opengl.GL.GL_IMAGE_ROTATE_ANGLE_HP;
	public static final int GL_IMAGE_ROTATE_ORIGIN_X_HP = javax.media.opengl.GL.GL_IMAGE_ROTATE_ORIGIN_X_HP;
	public static final int GL_IMAGE_ROTATE_ORIGIN_Y_HP = javax.media.opengl.GL.GL_IMAGE_ROTATE_ORIGIN_Y_HP;
	public static final int GL_IMAGE_MAG_FILTER_HP = javax.media.opengl.GL.GL_IMAGE_MAG_FILTER_HP;
	public static final int GL_IMAGE_MIN_FILTER_HP = javax.media.opengl.GL.GL_IMAGE_MIN_FILTER_HP;
	public static final int GL_IMAGE_CUBIC_WEIGHT_HP = javax.media.opengl.GL.GL_IMAGE_CUBIC_WEIGHT_HP;
	public static final int GL_CUBIC_HP = javax.media.opengl.GL.GL_CUBIC_HP;
	public static final int GL_AVERAGE_HP = javax.media.opengl.GL.GL_AVERAGE_HP;
	public static final int GL_IMAGE_TRANSFORM_2D_HP = javax.media.opengl.GL.GL_IMAGE_TRANSFORM_2D_HP;
	public static final int GL_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP = javax.media.opengl.GL.GL_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP;
	public static final int GL_PROXY_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP = javax.media.opengl.GL.GL_PROXY_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP;
	public static final int GL_TEXTURE_ENV_BIAS_SGIX = javax.media.opengl.GL.GL_TEXTURE_ENV_BIAS_SGIX;
	public static final int GL_VERTEX_DATA_HINT_PGI = javax.media.opengl.GL.GL_VERTEX_DATA_HINT_PGI;
	public static final int GL_VERTEX_CONSISTENT_HINT_PGI = javax.media.opengl.GL.GL_VERTEX_CONSISTENT_HINT_PGI;
	public static final int GL_MATERIAL_SIDE_HINT_PGI = javax.media.opengl.GL.GL_MATERIAL_SIDE_HINT_PGI;
	public static final int GL_MAX_VERTEX_HINT_PGI = javax.media.opengl.GL.GL_MAX_VERTEX_HINT_PGI;
	public static final int GL_COLOR3_BIT_PGI = javax.media.opengl.GL.GL_COLOR3_BIT_PGI;
	public static final int GL_COLOR4_BIT_PGI = javax.media.opengl.GL.GL_COLOR4_BIT_PGI;
	public static final int GL_EDGEFLAG_BIT_PGI = javax.media.opengl.GL.GL_EDGEFLAG_BIT_PGI;
	public static final int GL_INDEX_BIT_PGI = javax.media.opengl.GL.GL_INDEX_BIT_PGI;
	public static final int GL_MAT_AMBIENT_BIT_PGI = javax.media.opengl.GL.GL_MAT_AMBIENT_BIT_PGI;
	public static final int GL_MAT_AMBIENT_AND_DIFFUSE_BIT_PGI = javax.media.opengl.GL.GL_MAT_AMBIENT_AND_DIFFUSE_BIT_PGI;
	public static final int GL_MAT_DIFFUSE_BIT_PGI = javax.media.opengl.GL.GL_MAT_DIFFUSE_BIT_PGI;
	public static final int GL_MAT_EMISSION_BIT_PGI = javax.media.opengl.GL.GL_MAT_EMISSION_BIT_PGI;
	public static final int GL_MAT_COLOR_INDEXES_BIT_PGI = javax.media.opengl.GL.GL_MAT_COLOR_INDEXES_BIT_PGI;
	public static final int GL_MAT_SHININESS_BIT_PGI = javax.media.opengl.GL.GL_MAT_SHININESS_BIT_PGI;
	public static final int GL_MAT_SPECULAR_BIT_PGI = javax.media.opengl.GL.GL_MAT_SPECULAR_BIT_PGI;
	public static final int GL_NORMAL_BIT_PGI = javax.media.opengl.GL.GL_NORMAL_BIT_PGI;
	public static final int GL_TEXCOORD1_BIT_PGI = javax.media.opengl.GL.GL_TEXCOORD1_BIT_PGI;
	public static final int GL_TEXCOORD2_BIT_PGI = javax.media.opengl.GL.GL_TEXCOORD2_BIT_PGI;
	public static final int GL_TEXCOORD3_BIT_PGI = javax.media.opengl.GL.GL_TEXCOORD3_BIT_PGI;
	public static final long GL_TEXCOORD4_BIT_PGI = javax.media.opengl.GL.GL_TEXCOORD4_BIT_PGI;
	public static final int GL_VERTEX23_BIT_PGI = javax.media.opengl.GL.GL_VERTEX23_BIT_PGI;
	public static final int GL_VERTEX4_BIT_PGI = javax.media.opengl.GL.GL_VERTEX4_BIT_PGI;
	public static final int GL_PREFER_DOUBLEBUFFER_HINT_PGI = javax.media.opengl.GL.GL_PREFER_DOUBLEBUFFER_HINT_PGI;
	public static final int GL_CONSERVE_MEMORY_HINT_PGI = javax.media.opengl.GL.GL_CONSERVE_MEMORY_HINT_PGI;
	public static final int GL_RECLAIM_MEMORY_HINT_PGI = javax.media.opengl.GL.GL_RECLAIM_MEMORY_HINT_PGI;
	public static final int GL_NATIVE_GRAPHICS_HANDLE_PGI = javax.media.opengl.GL.GL_NATIVE_GRAPHICS_HANDLE_PGI;
	public static final int GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI = javax.media.opengl.GL.GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI;
	public static final int GL_NATIVE_GRAPHICS_END_HINT_PGI = javax.media.opengl.GL.GL_NATIVE_GRAPHICS_END_HINT_PGI;
	public static final int GL_ALWAYS_FAST_HINT_PGI = javax.media.opengl.GL.GL_ALWAYS_FAST_HINT_PGI;
	public static final int GL_ALWAYS_SOFT_HINT_PGI = javax.media.opengl.GL.GL_ALWAYS_SOFT_HINT_PGI;
	public static final int GL_ALLOW_DRAW_OBJ_HINT_PGI = javax.media.opengl.GL.GL_ALLOW_DRAW_OBJ_HINT_PGI;
	public static final int GL_ALLOW_DRAW_WIN_HINT_PGI = javax.media.opengl.GL.GL_ALLOW_DRAW_WIN_HINT_PGI;
	public static final int GL_ALLOW_DRAW_FRG_HINT_PGI = javax.media.opengl.GL.GL_ALLOW_DRAW_FRG_HINT_PGI;
	public static final int GL_ALLOW_DRAW_MEM_HINT_PGI = javax.media.opengl.GL.GL_ALLOW_DRAW_MEM_HINT_PGI;
	public static final int GL_STRICT_DEPTHFUNC_HINT_PGI = javax.media.opengl.GL.GL_STRICT_DEPTHFUNC_HINT_PGI;
	public static final int GL_STRICT_LIGHTING_HINT_PGI = javax.media.opengl.GL.GL_STRICT_LIGHTING_HINT_PGI;
	public static final int GL_STRICT_SCISSOR_HINT_PGI = javax.media.opengl.GL.GL_STRICT_SCISSOR_HINT_PGI;
	public static final int GL_FULL_STIPPLE_HINT_PGI = javax.media.opengl.GL.GL_FULL_STIPPLE_HINT_PGI;
	public static final int GL_CLIP_NEAR_HINT_PGI = javax.media.opengl.GL.GL_CLIP_NEAR_HINT_PGI;
	public static final int GL_CLIP_FAR_HINT_PGI = javax.media.opengl.GL.GL_CLIP_FAR_HINT_PGI;
	public static final int GL_WIDE_LINE_HINT_PGI = javax.media.opengl.GL.GL_WIDE_LINE_HINT_PGI;
	public static final int GL_BACK_NORMALS_HINT_PGI = javax.media.opengl.GL.GL_BACK_NORMALS_HINT_PGI;
	public static final int GL_COLOR_INDEX1_EXT = javax.media.opengl.GL.GL_COLOR_INDEX1_EXT;
	public static final int GL_COLOR_INDEX2_EXT = javax.media.opengl.GL.GL_COLOR_INDEX2_EXT;
	public static final int GL_COLOR_INDEX4_EXT = javax.media.opengl.GL.GL_COLOR_INDEX4_EXT;
	public static final int GL_COLOR_INDEX8_EXT = javax.media.opengl.GL.GL_COLOR_INDEX8_EXT;
	public static final int GL_COLOR_INDEX12_EXT = javax.media.opengl.GL.GL_COLOR_INDEX12_EXT;
	public static final int GL_COLOR_INDEX16_EXT = javax.media.opengl.GL.GL_COLOR_INDEX16_EXT;
	public static final int GL_TEXTURE_INDEX_SIZE_EXT = javax.media.opengl.GL.GL_TEXTURE_INDEX_SIZE_EXT;
	public static final int GL_CLIP_VOLUME_CLIPPING_HINT_EXT = javax.media.opengl.GL.GL_CLIP_VOLUME_CLIPPING_HINT_EXT;
	public static final int GL_LIST_PRIORITY_SGIX = javax.media.opengl.GL.GL_LIST_PRIORITY_SGIX;
	public static final int GL_IR_INSTRUMENT1_SGIX = javax.media.opengl.GL.GL_IR_INSTRUMENT1_SGIX;
	public static final int GL_CALLIGRAPHIC_FRAGMENT_SGIX = javax.media.opengl.GL.GL_CALLIGRAPHIC_FRAGMENT_SGIX;
	public static final int GL_TEXTURE_LOD_BIAS_S_SGIX = javax.media.opengl.GL.GL_TEXTURE_LOD_BIAS_S_SGIX;
	public static final int GL_TEXTURE_LOD_BIAS_T_SGIX = javax.media.opengl.GL.GL_TEXTURE_LOD_BIAS_T_SGIX;
	public static final int GL_TEXTURE_LOD_BIAS_R_SGIX = javax.media.opengl.GL.GL_TEXTURE_LOD_BIAS_R_SGIX;
	public static final int GL_SHADOW_AMBIENT_SGIX = javax.media.opengl.GL.GL_SHADOW_AMBIENT_SGIX;
	public static final int GL_INDEX_MATERIAL_EXT = javax.media.opengl.GL.GL_INDEX_MATERIAL_EXT;
	public static final int GL_INDEX_MATERIAL_PARAMETER_EXT = javax.media.opengl.GL.GL_INDEX_MATERIAL_PARAMETER_EXT;
	public static final int GL_INDEX_MATERIAL_FACE_EXT = javax.media.opengl.GL.GL_INDEX_MATERIAL_FACE_EXT;
	public static final int GL_INDEX_TEST_EXT = javax.media.opengl.GL.GL_INDEX_TEST_EXT;
	public static final int GL_INDEX_TEST_FUNC_EXT = javax.media.opengl.GL.GL_INDEX_TEST_FUNC_EXT;
	public static final int GL_INDEX_TEST_REF_EXT = javax.media.opengl.GL.GL_INDEX_TEST_REF_EXT;
	public static final int GL_IUI_V2F_EXT = javax.media.opengl.GL.GL_IUI_V2F_EXT;
	public static final int GL_IUI_V3F_EXT = javax.media.opengl.GL.GL_IUI_V3F_EXT;
	public static final int GL_IUI_N3F_V2F_EXT = javax.media.opengl.GL.GL_IUI_N3F_V2F_EXT;
	public static final int GL_IUI_N3F_V3F_EXT = javax.media.opengl.GL.GL_IUI_N3F_V3F_EXT;
	public static final int GL_T2F_IUI_V2F_EXT = javax.media.opengl.GL.GL_T2F_IUI_V2F_EXT;
	public static final int GL_T2F_IUI_V3F_EXT = javax.media.opengl.GL.GL_T2F_IUI_V3F_EXT;
	public static final int GL_T2F_IUI_N3F_V2F_EXT = javax.media.opengl.GL.GL_T2F_IUI_N3F_V2F_EXT;
	public static final int GL_T2F_IUI_N3F_V3F_EXT = javax.media.opengl.GL.GL_T2F_IUI_N3F_V3F_EXT;
	public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = javax.media.opengl.GL.GL_ARRAY_ELEMENT_LOCK_FIRST_EXT;
	public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = javax.media.opengl.GL.GL_ARRAY_ELEMENT_LOCK_COUNT_EXT;
	public static final int GL_CULL_VERTEX_EXT = javax.media.opengl.GL.GL_CULL_VERTEX_EXT;
	public static final int GL_CULL_VERTEX_EYE_POSITION_EXT = javax.media.opengl.GL.GL_CULL_VERTEX_EYE_POSITION_EXT;
	public static final int GL_CULL_VERTEX_OBJECT_POSITION_EXT = javax.media.opengl.GL.GL_CULL_VERTEX_OBJECT_POSITION_EXT;
	public static final int GL_YCRCB_422_SGIX = javax.media.opengl.GL.GL_YCRCB_422_SGIX;
	public static final int GL_YCRCB_444_SGIX = javax.media.opengl.GL.GL_YCRCB_444_SGIX;
	public static final int GL_FRAGMENT_LIGHTING_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHTING_SGIX;
	public static final int GL_FRAGMENT_COLOR_MATERIAL_SGIX = javax.media.opengl.GL.GL_FRAGMENT_COLOR_MATERIAL_SGIX;
	public static final int GL_FRAGMENT_COLOR_MATERIAL_FACE_SGIX = javax.media.opengl.GL.GL_FRAGMENT_COLOR_MATERIAL_FACE_SGIX;
	public static final int GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_SGIX = javax.media.opengl.GL.GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_SGIX;
	public static final int GL_MAX_FRAGMENT_LIGHTS_SGIX = javax.media.opengl.GL.GL_MAX_FRAGMENT_LIGHTS_SGIX;
	public static final int GL_MAX_ACTIVE_LIGHTS_SGIX = javax.media.opengl.GL.GL_MAX_ACTIVE_LIGHTS_SGIX;
	public static final int GL_CURRENT_RASTER_NORMAL_SGIX = javax.media.opengl.GL.GL_CURRENT_RASTER_NORMAL_SGIX;
	public static final int GL_LIGHT_ENV_MODE_SGIX = javax.media.opengl.GL.GL_LIGHT_ENV_MODE_SGIX;
	public static final int GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_SGIX;
	public static final int GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_SGIX;
	public static final int GL_FRAGMENT_LIGHT_MODEL_AMBIENT_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT_MODEL_AMBIENT_SGIX;
	public static final int GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_SGIX;
	public static final int GL_FRAGMENT_LIGHT0_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT0_SGIX;
	public static final int GL_FRAGMENT_LIGHT1_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT1_SGIX;
	public static final int GL_FRAGMENT_LIGHT2_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT2_SGIX;
	public static final int GL_FRAGMENT_LIGHT3_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT3_SGIX;
	public static final int GL_FRAGMENT_LIGHT4_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT4_SGIX;
	public static final int GL_FRAGMENT_LIGHT5_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT5_SGIX;
	public static final int GL_FRAGMENT_LIGHT6_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT6_SGIX;
	public static final int GL_FRAGMENT_LIGHT7_SGIX = javax.media.opengl.GL.GL_FRAGMENT_LIGHT7_SGIX;
	public static final int GL_RASTER_POSITION_UNCLIPPED_IBM = javax.media.opengl.GL.GL_RASTER_POSITION_UNCLIPPED_IBM;
	public static final int GL_TEXTURE_LIGHTING_MODE_HP = javax.media.opengl.GL.GL_TEXTURE_LIGHTING_MODE_HP;
	public static final int GL_TEXTURE_POST_SPECULAR_HP = javax.media.opengl.GL.GL_TEXTURE_POST_SPECULAR_HP;
	public static final int GL_TEXTURE_PRE_SPECULAR_HP = javax.media.opengl.GL.GL_TEXTURE_PRE_SPECULAR_HP;
	public static final int GL_PHONG_WIN = javax.media.opengl.GL.GL_PHONG_WIN;
	public static final int GL_PHONG_HINT_WIN = javax.media.opengl.GL.GL_PHONG_HINT_WIN;
	public static final int GL_FOG_SPECULAR_TEXTURE_WIN = javax.media.opengl.GL.GL_FOG_SPECULAR_TEXTURE_WIN;
	public static final int GL_FRAGMENT_MATERIAL_EXT = javax.media.opengl.GL.GL_FRAGMENT_MATERIAL_EXT;
	public static final int GL_FRAGMENT_NORMAL_EXT = javax.media.opengl.GL.GL_FRAGMENT_NORMAL_EXT;
	public static final int GL_FRAGMENT_COLOR_EXT = javax.media.opengl.GL.GL_FRAGMENT_COLOR_EXT;
	public static final int GL_ATTENUATION_EXT = javax.media.opengl.GL.GL_ATTENUATION_EXT;
	public static final int GL_SHADOW_ATTENUATION_EXT = javax.media.opengl.GL.GL_SHADOW_ATTENUATION_EXT;
	public static final int GL_TEXTURE_APPLICATION_MODE_EXT = javax.media.opengl.GL.GL_TEXTURE_APPLICATION_MODE_EXT;
	public static final int GL_TEXTURE_LIGHT_EXT = javax.media.opengl.GL.GL_TEXTURE_LIGHT_EXT;
	public static final int GL_TEXTURE_MATERIAL_FACE_EXT = javax.media.opengl.GL.GL_TEXTURE_MATERIAL_FACE_EXT;
	public static final int GL_TEXTURE_MATERIAL_PARAMETER_EXT = javax.media.opengl.GL.GL_TEXTURE_MATERIAL_PARAMETER_EXT;
	public static final int GL_ALPHA_MIN_SGIX = javax.media.opengl.GL.GL_ALPHA_MIN_SGIX;
	public static final int GL_ALPHA_MAX_SGIX = javax.media.opengl.GL.GL_ALPHA_MAX_SGIX;
	public static final int GL_PIXEL_TEX_GEN_Q_CEILING_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_Q_CEILING_SGIX;
	public static final int GL_PIXEL_TEX_GEN_Q_ROUND_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_Q_ROUND_SGIX;
	public static final int GL_PIXEL_TEX_GEN_Q_FLOOR_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_Q_FLOOR_SGIX;
	public static final int GL_PIXEL_TEX_GEN_ALPHA_REPLACE_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_ALPHA_REPLACE_SGIX;
	public static final int GL_PIXEL_TEX_GEN_ALPHA_NO_REPLACE_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_ALPHA_NO_REPLACE_SGIX;
	public static final int GL_PIXEL_TEX_GEN_ALPHA_LS_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_ALPHA_LS_SGIX;
	public static final int GL_PIXEL_TEX_GEN_ALPHA_MS_SGIX = javax.media.opengl.GL.GL_PIXEL_TEX_GEN_ALPHA_MS_SGIX;
	public static final int GL_ASYNC_MARKER_SGIX = javax.media.opengl.GL.GL_ASYNC_MARKER_SGIX;
	public static final int GL_ASYNC_TEX_IMAGE_SGIX = javax.media.opengl.GL.GL_ASYNC_TEX_IMAGE_SGIX;
	public static final int GL_ASYNC_DRAW_PIXELS_SGIX = javax.media.opengl.GL.GL_ASYNC_DRAW_PIXELS_SGIX;
	public static final int GL_ASYNC_READ_PIXELS_SGIX = javax.media.opengl.GL.GL_ASYNC_READ_PIXELS_SGIX;
	public static final int GL_MAX_ASYNC_TEX_IMAGE_SGIX = javax.media.opengl.GL.GL_MAX_ASYNC_TEX_IMAGE_SGIX;
	public static final int GL_MAX_ASYNC_DRAW_PIXELS_SGIX = javax.media.opengl.GL.GL_MAX_ASYNC_DRAW_PIXELS_SGIX;
	public static final int GL_MAX_ASYNC_READ_PIXELS_SGIX = javax.media.opengl.GL.GL_MAX_ASYNC_READ_PIXELS_SGIX;
	public static final int GL_ASYNC_HISTOGRAM_SGIX = javax.media.opengl.GL.GL_ASYNC_HISTOGRAM_SGIX;
	public static final int GL_MAX_ASYNC_HISTOGRAM_SGIX = javax.media.opengl.GL.GL_MAX_ASYNC_HISTOGRAM_SGIX;
	public static final int GL_OCCLUSION_TEST_HP = javax.media.opengl.GL.GL_OCCLUSION_TEST_HP;
	public static final int GL_OCCLUSION_TEST_RESULT_HP = javax.media.opengl.GL.GL_OCCLUSION_TEST_RESULT_HP;
	public static final int GL_PIXEL_TRANSFORM_2D_EXT = javax.media.opengl.GL.GL_PIXEL_TRANSFORM_2D_EXT;
	public static final int GL_PIXEL_MAG_FILTER_EXT = javax.media.opengl.GL.GL_PIXEL_MAG_FILTER_EXT;
	public static final int GL_PIXEL_MIN_FILTER_EXT = javax.media.opengl.GL.GL_PIXEL_MIN_FILTER_EXT;
	public static final int GL_PIXEL_CUBIC_WEIGHT_EXT = javax.media.opengl.GL.GL_PIXEL_CUBIC_WEIGHT_EXT;
	public static final int GL_CUBIC_EXT = javax.media.opengl.GL.GL_CUBIC_EXT;
	public static final int GL_AVERAGE_EXT = javax.media.opengl.GL.GL_AVERAGE_EXT;
	public static final int GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = javax.media.opengl.GL.GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT;
	public static final int GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = javax.media.opengl.GL.GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT;
	public static final int GL_PIXEL_TRANSFORM_2D_MATRIX_EXT = javax.media.opengl.GL.GL_PIXEL_TRANSFORM_2D_MATRIX_EXT;
	public static final int GL_SHARED_TEXTURE_PALETTE_EXT = javax.media.opengl.GL.GL_SHARED_TEXTURE_PALETTE_EXT;
	public static final int GL_COLOR_SUM_EXT = javax.media.opengl.GL.GL_COLOR_SUM_EXT;
	public static final int GL_CURRENT_SECONDARY_COLOR_EXT = javax.media.opengl.GL.GL_CURRENT_SECONDARY_COLOR_EXT;
	public static final int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_SIZE_EXT;
	public static final int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_TYPE_EXT;
	public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT;
	public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_POINTER_EXT;
	public static final int GL_SECONDARY_COLOR_ARRAY_EXT = javax.media.opengl.GL.GL_SECONDARY_COLOR_ARRAY_EXT;
	public static final int GL_PERTURB_EXT = javax.media.opengl.GL.GL_PERTURB_EXT;
	public static final int GL_TEXTURE_NORMAL_EXT = javax.media.opengl.GL.GL_TEXTURE_NORMAL_EXT;
	public static final int GL_FOG_COORDINATE_SOURCE_EXT = javax.media.opengl.GL.GL_FOG_COORDINATE_SOURCE_EXT;
	public static final int GL_FOG_COORDINATE_EXT = javax.media.opengl.GL.GL_FOG_COORDINATE_EXT;
	public static final int GL_FRAGMENT_DEPTH_EXT = javax.media.opengl.GL.GL_FRAGMENT_DEPTH_EXT;
	public static final int GL_CURRENT_FOG_COORDINATE_EXT = javax.media.opengl.GL.GL_CURRENT_FOG_COORDINATE_EXT;
	public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_TYPE_EXT;
	public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_STRIDE_EXT;
	public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_POINTER_EXT;
	public static final int GL_FOG_COORDINATE_ARRAY_EXT = javax.media.opengl.GL.GL_FOG_COORDINATE_ARRAY_EXT;
	public static final int GL_SCREEN_COORDINATES_REND = javax.media.opengl.GL.GL_SCREEN_COORDINATES_REND;
	public static final int GL_INVERTED_SCREEN_W_REND = javax.media.opengl.GL.GL_INVERTED_SCREEN_W_REND;
	public static final int GL_LIGHT_MODEL_SPECULAR_VECTOR_APPLE = javax.media.opengl.GL.GL_LIGHT_MODEL_SPECULAR_VECTOR_APPLE;
	public static final int GL_TRANSFORM_HINT_APPLE = javax.media.opengl.GL.GL_TRANSFORM_HINT_APPLE;
	public static final int GL_FOG_SCALE_SGIX = javax.media.opengl.GL.GL_FOG_SCALE_SGIX;
	public static final int GL_FOG_SCALE_VALUE_SGIX = javax.media.opengl.GL.GL_FOG_SCALE_VALUE_SGIX;
	public static final int GL_UNPACK_CONSTANT_DATA_SUNX = javax.media.opengl.GL.GL_UNPACK_CONSTANT_DATA_SUNX;
	public static final int GL_TEXTURE_CONSTANT_DATA_SUNX = javax.media.opengl.GL.GL_TEXTURE_CONSTANT_DATA_SUNX;
	public static final int GL_GLOBAL_ALPHA_SUN = javax.media.opengl.GL.GL_GLOBAL_ALPHA_SUN;
	public static final int GL_GLOBAL_ALPHA_FACTOR_SUN = javax.media.opengl.GL.GL_GLOBAL_ALPHA_FACTOR_SUN;
	public static final int GL_BLEND_DST_RGB_EXT = javax.media.opengl.GL.GL_BLEND_DST_RGB_EXT;
	public static final int GL_BLEND_SRC_RGB_EXT = javax.media.opengl.GL.GL_BLEND_SRC_RGB_EXT;
	public static final int GL_BLEND_DST_ALPHA_EXT = javax.media.opengl.GL.GL_BLEND_DST_ALPHA_EXT;
	public static final int GL_BLEND_SRC_ALPHA_EXT = javax.media.opengl.GL.GL_BLEND_SRC_ALPHA_EXT;
	public static final int GL_RED_MIN_CLAMP_INGR = javax.media.opengl.GL.GL_RED_MIN_CLAMP_INGR;
	public static final int GL_GREEN_MIN_CLAMP_INGR = javax.media.opengl.GL.GL_GREEN_MIN_CLAMP_INGR;
	public static final int GL_BLUE_MIN_CLAMP_INGR = javax.media.opengl.GL.GL_BLUE_MIN_CLAMP_INGR;
	public static final int GL_ALPHA_MIN_CLAMP_INGR = javax.media.opengl.GL.GL_ALPHA_MIN_CLAMP_INGR;
	public static final int GL_RED_MAX_CLAMP_INGR = javax.media.opengl.GL.GL_RED_MAX_CLAMP_INGR;
	public static final int GL_GREEN_MAX_CLAMP_INGR = javax.media.opengl.GL.GL_GREEN_MAX_CLAMP_INGR;
	public static final int GL_BLUE_MAX_CLAMP_INGR = javax.media.opengl.GL.GL_BLUE_MAX_CLAMP_INGR;
	public static final int GL_ALPHA_MAX_CLAMP_INGR = javax.media.opengl.GL.GL_ALPHA_MAX_CLAMP_INGR;
	public static final int GL_INTERLACE_READ_INGR = javax.media.opengl.GL.GL_INTERLACE_READ_INGR;
	public static final int GL_INCR_WRAP_EXT = javax.media.opengl.GL.GL_INCR_WRAP_EXT;
	public static final int GL_DECR_WRAP_EXT = javax.media.opengl.GL.GL_DECR_WRAP_EXT;
	public static final int GL_422_EXT = javax.media.opengl.GL.GL_422_EXT;
	public static final int GL_422_REV_EXT = javax.media.opengl.GL.GL_422_REV_EXT;
	public static final int GL_422_AVERAGE_EXT = javax.media.opengl.GL.GL_422_AVERAGE_EXT;
	public static final int GL_422_REV_AVERAGE_EXT = javax.media.opengl.GL.GL_422_REV_AVERAGE_EXT;
	public static final int GL_NORMAL_MAP_NV = javax.media.opengl.GL.GL_NORMAL_MAP_NV;
	public static final int GL_REFLECTION_MAP_NV = javax.media.opengl.GL.GL_REFLECTION_MAP_NV;
	public static final int GL_WRAP_BORDER_SUN = javax.media.opengl.GL.GL_WRAP_BORDER_SUN;
	public static final int GL_MAX_TEXTURE_LOD_BIAS_EXT = javax.media.opengl.GL.GL_MAX_TEXTURE_LOD_BIAS_EXT;
	public static final int GL_TEXTURE_FILTER_CONTROL_EXT = javax.media.opengl.GL.GL_TEXTURE_FILTER_CONTROL_EXT;
	public static final int GL_TEXTURE_LOD_BIAS_EXT = javax.media.opengl.GL.GL_TEXTURE_LOD_BIAS_EXT;
	public static final int GL_TEXTURE_MAX_ANISOTROPY_EXT = javax.media.opengl.GL.GL_TEXTURE_MAX_ANISOTROPY_EXT;
	public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = javax.media.opengl.GL.GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT;
	public static final int GL_MODELVIEW0_STACK_DEPTH_EXT = javax.media.opengl.GL.GL_MODELVIEW0_STACK_DEPTH_EXT;
	public static final int GL_MODELVIEW1_STACK_DEPTH_EXT = javax.media.opengl.GL.GL_MODELVIEW1_STACK_DEPTH_EXT;
	public static final int GL_MODELVIEW0_MATRIX_EXT = javax.media.opengl.GL.GL_MODELVIEW0_MATRIX_EXT;
	public static final int GL_MODELVIEW1_MATRIX_EXT = javax.media.opengl.GL.GL_MODELVIEW1_MATRIX_EXT;
	public static final int GL_VERTEX_WEIGHTING_EXT = javax.media.opengl.GL.GL_VERTEX_WEIGHTING_EXT;
	public static final int GL_MODELVIEW0_EXT = javax.media.opengl.GL.GL_MODELVIEW0_EXT;
	public static final int GL_MODELVIEW1_EXT = javax.media.opengl.GL.GL_MODELVIEW1_EXT;
	public static final int GL_CURRENT_VERTEX_WEIGHT_EXT = javax.media.opengl.GL.GL_CURRENT_VERTEX_WEIGHT_EXT;
	public static final int GL_VERTEX_WEIGHT_ARRAY_EXT = javax.media.opengl.GL.GL_VERTEX_WEIGHT_ARRAY_EXT;
	public static final int GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT = javax.media.opengl.GL.GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT;
	public static final int GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT = javax.media.opengl.GL.GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT;
	public static final int GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT = javax.media.opengl.GL.GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT;
	public static final int GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT = javax.media.opengl.GL.GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT;
	public static final int GL_MAX_SHININESS_NV = javax.media.opengl.GL.GL_MAX_SHININESS_NV;
	public static final int GL_MAX_SPOT_EXPONENT_NV = javax.media.opengl.GL.GL_MAX_SPOT_EXPONENT_NV;
	public static final int GL_VERTEX_ARRAY_RANGE_NV = javax.media.opengl.GL.GL_VERTEX_ARRAY_RANGE_NV;
	public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = javax.media.opengl.GL.GL_VERTEX_ARRAY_RANGE_LENGTH_NV;
	public static final int GL_VERTEX_ARRAY_RANGE_VALID_NV = javax.media.opengl.GL.GL_VERTEX_ARRAY_RANGE_VALID_NV;
	public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = javax.media.opengl.GL.GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV;
	public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = javax.media.opengl.GL.GL_VERTEX_ARRAY_RANGE_POINTER_NV;
	public static final int GL_REGISTER_COMBINERS_NV = javax.media.opengl.GL.GL_REGISTER_COMBINERS_NV;
	public static final int GL_VARIABLE_A_NV = javax.media.opengl.GL.GL_VARIABLE_A_NV;
	public static final int GL_VARIABLE_B_NV = javax.media.opengl.GL.GL_VARIABLE_B_NV;
	public static final int GL_VARIABLE_C_NV = javax.media.opengl.GL.GL_VARIABLE_C_NV;
	public static final int GL_VARIABLE_D_NV = javax.media.opengl.GL.GL_VARIABLE_D_NV;
	public static final int GL_VARIABLE_E_NV = javax.media.opengl.GL.GL_VARIABLE_E_NV;
	public static final int GL_VARIABLE_F_NV = javax.media.opengl.GL.GL_VARIABLE_F_NV;
	public static final int GL_VARIABLE_G_NV = javax.media.opengl.GL.GL_VARIABLE_G_NV;
	public static final int GL_CONSTANT_COLOR0_NV = javax.media.opengl.GL.GL_CONSTANT_COLOR0_NV;
	public static final int GL_CONSTANT_COLOR1_NV = javax.media.opengl.GL.GL_CONSTANT_COLOR1_NV;
	public static final int GL_PRIMARY_COLOR_NV = javax.media.opengl.GL.GL_PRIMARY_COLOR_NV;
	public static final int GL_SECONDARY_COLOR_NV = javax.media.opengl.GL.GL_SECONDARY_COLOR_NV;
	public static final int GL_SPARE0_NV = javax.media.opengl.GL.GL_SPARE0_NV;
	public static final int GL_SPARE1_NV = javax.media.opengl.GL.GL_SPARE1_NV;
	public static final int GL_DISCARD_NV = javax.media.opengl.GL.GL_DISCARD_NV;
	public static final int GL_E_TIMES_F_NV = javax.media.opengl.GL.GL_E_TIMES_F_NV;
	public static final int GL_SPARE0_PLUS_SECONDARY_COLOR_NV = javax.media.opengl.GL.GL_SPARE0_PLUS_SECONDARY_COLOR_NV;
	public static final int GL_UNSIGNED_IDENTITY_NV = javax.media.opengl.GL.GL_UNSIGNED_IDENTITY_NV;
	public static final int GL_UNSIGNED_INVERT_NV = javax.media.opengl.GL.GL_UNSIGNED_INVERT_NV;
	public static final int GL_EXPAND_NORMAL_NV = javax.media.opengl.GL.GL_EXPAND_NORMAL_NV;
	public static final int GL_EXPAND_NEGATE_NV = javax.media.opengl.GL.GL_EXPAND_NEGATE_NV;
	public static final int GL_HALF_BIAS_NORMAL_NV = javax.media.opengl.GL.GL_HALF_BIAS_NORMAL_NV;
	public static final int GL_HALF_BIAS_NEGATE_NV = javax.media.opengl.GL.GL_HALF_BIAS_NEGATE_NV;
	public static final int GL_SIGNED_IDENTITY_NV = javax.media.opengl.GL.GL_SIGNED_IDENTITY_NV;
	public static final int GL_SIGNED_NEGATE_NV = javax.media.opengl.GL.GL_SIGNED_NEGATE_NV;
	public static final int GL_SCALE_BY_TWO_NV = javax.media.opengl.GL.GL_SCALE_BY_TWO_NV;
	public static final int GL_SCALE_BY_FOUR_NV = javax.media.opengl.GL.GL_SCALE_BY_FOUR_NV;
	public static final int GL_SCALE_BY_ONE_HALF_NV = javax.media.opengl.GL.GL_SCALE_BY_ONE_HALF_NV;
	public static final int GL_BIAS_BY_NEGATIVE_ONE_HALF_NV = javax.media.opengl.GL.GL_BIAS_BY_NEGATIVE_ONE_HALF_NV;
	public static final int GL_COMBINER_INPUT_NV = javax.media.opengl.GL.GL_COMBINER_INPUT_NV;
	public static final int GL_COMBINER_MAPPING_NV = javax.media.opengl.GL.GL_COMBINER_MAPPING_NV;
	public static final int GL_COMBINER_COMPONENT_USAGE_NV = javax.media.opengl.GL.GL_COMBINER_COMPONENT_USAGE_NV;
	public static final int GL_COMBINER_AB_DOT_PRODUCT_NV = javax.media.opengl.GL.GL_COMBINER_AB_DOT_PRODUCT_NV;
	public static final int GL_COMBINER_CD_DOT_PRODUCT_NV = javax.media.opengl.GL.GL_COMBINER_CD_DOT_PRODUCT_NV;
	public static final int GL_COMBINER_MUX_SUM_NV = javax.media.opengl.GL.GL_COMBINER_MUX_SUM_NV;
	public static final int GL_COMBINER_SCALE_NV = javax.media.opengl.GL.GL_COMBINER_SCALE_NV;
	public static final int GL_COMBINER_BIAS_NV = javax.media.opengl.GL.GL_COMBINER_BIAS_NV;
	public static final int GL_COMBINER_AB_OUTPUT_NV = javax.media.opengl.GL.GL_COMBINER_AB_OUTPUT_NV;
	public static final int GL_COMBINER_CD_OUTPUT_NV = javax.media.opengl.GL.GL_COMBINER_CD_OUTPUT_NV;
	public static final int GL_COMBINER_SUM_OUTPUT_NV = javax.media.opengl.GL.GL_COMBINER_SUM_OUTPUT_NV;
	public static final int GL_MAX_GENERAL_COMBINERS_NV = javax.media.opengl.GL.GL_MAX_GENERAL_COMBINERS_NV;
	public static final int GL_NUM_GENERAL_COMBINERS_NV = javax.media.opengl.GL.GL_NUM_GENERAL_COMBINERS_NV;
	public static final int GL_COLOR_SUM_CLAMP_NV = javax.media.opengl.GL.GL_COLOR_SUM_CLAMP_NV;
	public static final int GL_COMBINER0_NV = javax.media.opengl.GL.GL_COMBINER0_NV;
	public static final int GL_COMBINER1_NV = javax.media.opengl.GL.GL_COMBINER1_NV;
	public static final int GL_COMBINER2_NV = javax.media.opengl.GL.GL_COMBINER2_NV;
	public static final int GL_COMBINER3_NV = javax.media.opengl.GL.GL_COMBINER3_NV;
	public static final int GL_COMBINER4_NV = javax.media.opengl.GL.GL_COMBINER4_NV;
	public static final int GL_COMBINER5_NV = javax.media.opengl.GL.GL_COMBINER5_NV;
	public static final int GL_COMBINER6_NV = javax.media.opengl.GL.GL_COMBINER6_NV;
	public static final int GL_COMBINER7_NV = javax.media.opengl.GL.GL_COMBINER7_NV;
	public static final int GL_FOG_DISTANCE_MODE_NV = javax.media.opengl.GL.GL_FOG_DISTANCE_MODE_NV;
	public static final int GL_EYE_RADIAL_NV = javax.media.opengl.GL.GL_EYE_RADIAL_NV;
	public static final int GL_EYE_PLANE_ABSOLUTE_NV = javax.media.opengl.GL.GL_EYE_PLANE_ABSOLUTE_NV;
	public static final int GL_EMBOSS_LIGHT_NV = javax.media.opengl.GL.GL_EMBOSS_LIGHT_NV;
	public static final int GL_EMBOSS_CONSTANT_NV = javax.media.opengl.GL.GL_EMBOSS_CONSTANT_NV;
	public static final int GL_EMBOSS_MAP_NV = javax.media.opengl.GL.GL_EMBOSS_MAP_NV;
	public static final int GL_COMBINE4_NV = javax.media.opengl.GL.GL_COMBINE4_NV;
	public static final int GL_SOURCE3_RGB_NV = javax.media.opengl.GL.GL_SOURCE3_RGB_NV;
	public static final int GL_SOURCE3_ALPHA_NV = javax.media.opengl.GL.GL_SOURCE3_ALPHA_NV;
	public static final int GL_OPERAND3_RGB_NV = javax.media.opengl.GL.GL_OPERAND3_RGB_NV;
	public static final int GL_OPERAND3_ALPHA_NV = javax.media.opengl.GL.GL_OPERAND3_ALPHA_NV;
	public static final int GL_COMPRESSED_RGB_S3TC_DXT1_EXT = javax.media.opengl.GL.GL_COMPRESSED_RGB_S3TC_DXT1_EXT;
	public static final int GL_COMPRESSED_RGBA_S3TC_DXT1_EXT = javax.media.opengl.GL.GL_COMPRESSED_RGBA_S3TC_DXT1_EXT;
	public static final int GL_COMPRESSED_RGBA_S3TC_DXT3_EXT = javax.media.opengl.GL.GL_COMPRESSED_RGBA_S3TC_DXT3_EXT;
	public static final int GL_COMPRESSED_RGBA_S3TC_DXT5_EXT = javax.media.opengl.GL.GL_COMPRESSED_RGBA_S3TC_DXT5_EXT;
	public static final int GL_CULL_VERTEX_IBM = javax.media.opengl.GL.GL_CULL_VERTEX_IBM;
	public static final int GL_PACK_SUBSAMPLE_RATE_SGIX = javax.media.opengl.GL.GL_PACK_SUBSAMPLE_RATE_SGIX;
	public static final int GL_UNPACK_SUBSAMPLE_RATE_SGIX = javax.media.opengl.GL.GL_UNPACK_SUBSAMPLE_RATE_SGIX;
	public static final int GL_PIXEL_SUBSAMPLE_4444_SGIX = javax.media.opengl.GL.GL_PIXEL_SUBSAMPLE_4444_SGIX;
	public static final int GL_PIXEL_SUBSAMPLE_2424_SGIX = javax.media.opengl.GL.GL_PIXEL_SUBSAMPLE_2424_SGIX;
	public static final int GL_PIXEL_SUBSAMPLE_4242_SGIX = javax.media.opengl.GL.GL_PIXEL_SUBSAMPLE_4242_SGIX;
	public static final int GL_YCRCB_SGIX = javax.media.opengl.GL.GL_YCRCB_SGIX;
	public static final int GL_YCRCBA_SGIX = javax.media.opengl.GL.GL_YCRCBA_SGIX;
	public static final int GL_DEPTH_PASS_INSTRUMENT_SGIX = javax.media.opengl.GL.GL_DEPTH_PASS_INSTRUMENT_SGIX;
	public static final int GL_DEPTH_PASS_INSTRUMENT_COUNTERS_SGIX = javax.media.opengl.GL.GL_DEPTH_PASS_INSTRUMENT_COUNTERS_SGIX;
	public static final int GL_DEPTH_PASS_INSTRUMENT_MAX_SGIX = javax.media.opengl.GL.GL_DEPTH_PASS_INSTRUMENT_MAX_SGIX;
	public static final int GL_COMPRESSED_RGB_FXT1_3DFX = javax.media.opengl.GL.GL_COMPRESSED_RGB_FXT1_3DFX;
	public static final int GL_COMPRESSED_RGBA_FXT1_3DFX = javax.media.opengl.GL.GL_COMPRESSED_RGBA_FXT1_3DFX;
	public static final int GL_MULTISAMPLE_3DFX = javax.media.opengl.GL.GL_MULTISAMPLE_3DFX;
	public static final int GL_SAMPLE_BUFFERS_3DFX = javax.media.opengl.GL.GL_SAMPLE_BUFFERS_3DFX;
	public static final int GL_SAMPLES_3DFX = javax.media.opengl.GL.GL_SAMPLES_3DFX;
	public static final int GL_MULTISAMPLE_BIT_3DFX = javax.media.opengl.GL.GL_MULTISAMPLE_BIT_3DFX;
	public static final int GL_MULTISAMPLE_EXT = javax.media.opengl.GL.GL_MULTISAMPLE_EXT;
	public static final int GL_SAMPLE_ALPHA_TO_MASK_EXT = javax.media.opengl.GL.GL_SAMPLE_ALPHA_TO_MASK_EXT;
	public static final int GL_SAMPLE_ALPHA_TO_ONE_EXT = javax.media.opengl.GL.GL_SAMPLE_ALPHA_TO_ONE_EXT;
	public static final int GL_SAMPLE_MASK_EXT = javax.media.opengl.GL.GL_SAMPLE_MASK_EXT;
	public static final int GL_1PASS_EXT = javax.media.opengl.GL.GL_1PASS_EXT;
	public static final int GL_2PASS_0_EXT = javax.media.opengl.GL.GL_2PASS_0_EXT;
	public static final int GL_2PASS_1_EXT = javax.media.opengl.GL.GL_2PASS_1_EXT;
	public static final int GL_4PASS_0_EXT = javax.media.opengl.GL.GL_4PASS_0_EXT;
	public static final int GL_4PASS_1_EXT = javax.media.opengl.GL.GL_4PASS_1_EXT;
	public static final int GL_4PASS_2_EXT = javax.media.opengl.GL.GL_4PASS_2_EXT;
	public static final int GL_4PASS_3_EXT = javax.media.opengl.GL.GL_4PASS_3_EXT;
	public static final int GL_SAMPLE_BUFFERS_EXT = javax.media.opengl.GL.GL_SAMPLE_BUFFERS_EXT;
	public static final int GL_SAMPLES_EXT = javax.media.opengl.GL.GL_SAMPLES_EXT;
	public static final int GL_SAMPLE_MASK_VALUE_EXT = javax.media.opengl.GL.GL_SAMPLE_MASK_VALUE_EXT;
	public static final int GL_SAMPLE_MASK_INVERT_EXT = javax.media.opengl.GL.GL_SAMPLE_MASK_INVERT_EXT;
	public static final int GL_SAMPLE_PATTERN_EXT = javax.media.opengl.GL.GL_SAMPLE_PATTERN_EXT;
	public static final int GL_MULTISAMPLE_BIT_EXT = javax.media.opengl.GL.GL_MULTISAMPLE_BIT_EXT;
	public static final int GL_VERTEX_PRECLIP_SGIX = javax.media.opengl.GL.GL_VERTEX_PRECLIP_SGIX;
	public static final int GL_VERTEX_PRECLIP_HINT_SGIX = javax.media.opengl.GL.GL_VERTEX_PRECLIP_HINT_SGIX;
	public static final int GL_CONVOLUTION_HINT_SGIX = javax.media.opengl.GL.GL_CONVOLUTION_HINT_SGIX;
	public static final int GL_PACK_RESAMPLE_SGIX = javax.media.opengl.GL.GL_PACK_RESAMPLE_SGIX;
	public static final int GL_UNPACK_RESAMPLE_SGIX = javax.media.opengl.GL.GL_UNPACK_RESAMPLE_SGIX;
	public static final int GL_RESAMPLE_REPLICATE_SGIX = javax.media.opengl.GL.GL_RESAMPLE_REPLICATE_SGIX;
	public static final int GL_RESAMPLE_ZERO_FILL_SGIX = javax.media.opengl.GL.GL_RESAMPLE_ZERO_FILL_SGIX;
	public static final int GL_RESAMPLE_DECIMATE_SGIX = javax.media.opengl.GL.GL_RESAMPLE_DECIMATE_SGIX;
	public static final int GL_EYE_DISTANCE_TO_POINT_SGIS = javax.media.opengl.GL.GL_EYE_DISTANCE_TO_POINT_SGIS;
	public static final int GL_OBJECT_DISTANCE_TO_POINT_SGIS = javax.media.opengl.GL.GL_OBJECT_DISTANCE_TO_POINT_SGIS;
	public static final int GL_EYE_DISTANCE_TO_LINE_SGIS = javax.media.opengl.GL.GL_EYE_DISTANCE_TO_LINE_SGIS;
	public static final int GL_OBJECT_DISTANCE_TO_LINE_SGIS = javax.media.opengl.GL.GL_OBJECT_DISTANCE_TO_LINE_SGIS;
	public static final int GL_EYE_POINT_SGIS = javax.media.opengl.GL.GL_EYE_POINT_SGIS;
	public static final int GL_OBJECT_POINT_SGIS = javax.media.opengl.GL.GL_OBJECT_POINT_SGIS;
	public static final int GL_EYE_LINE_SGIS = javax.media.opengl.GL.GL_EYE_LINE_SGIS;
	public static final int GL_OBJECT_LINE_SGIS = javax.media.opengl.GL.GL_OBJECT_LINE_SGIS;
	public static final int GL_TEXTURE_COLOR_WRITEMASK_SGIS = javax.media.opengl.GL.GL_TEXTURE_COLOR_WRITEMASK_SGIS;
	public static final int GL_MIRROR_CLAMP_ATI = javax.media.opengl.GL.GL_MIRROR_CLAMP_ATI;
	public static final int GL_MIRROR_CLAMP_TO_EDGE_ATI = javax.media.opengl.GL.GL_MIRROR_CLAMP_TO_EDGE_ATI;
	public static final int GL_ALL_COMPLETED_NV = javax.media.opengl.GL.GL_ALL_COMPLETED_NV;
	public static final int GL_FENCE_STATUS_NV = javax.media.opengl.GL.GL_FENCE_STATUS_NV;
	public static final int GL_FENCE_CONDITION_NV = javax.media.opengl.GL.GL_FENCE_CONDITION_NV;
	public static final int GL_MIRRORED_REPEAT_IBM = javax.media.opengl.GL.GL_MIRRORED_REPEAT_IBM;
	public static final int GL_EVAL_2D_NV = javax.media.opengl.GL.GL_EVAL_2D_NV;
	public static final int GL_EVAL_TRIANGULAR_2D_NV = javax.media.opengl.GL.GL_EVAL_TRIANGULAR_2D_NV;
	public static final int GL_MAP_TESSELLATION_NV = javax.media.opengl.GL.GL_MAP_TESSELLATION_NV;
	public static final int GL_MAP_ATTRIB_U_ORDER_NV = javax.media.opengl.GL.GL_MAP_ATTRIB_U_ORDER_NV;
	public static final int GL_MAP_ATTRIB_V_ORDER_NV = javax.media.opengl.GL.GL_MAP_ATTRIB_V_ORDER_NV;
	public static final int GL_EVAL_FRACTIONAL_TESSELLATION_NV = javax.media.opengl.GL.GL_EVAL_FRACTIONAL_TESSELLATION_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB0_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB0_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB1_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB1_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB2_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB2_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB3_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB3_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB4_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB4_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB5_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB5_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB6_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB6_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB7_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB7_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB8_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB8_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB9_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB9_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB10_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB10_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB11_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB11_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB12_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB12_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB13_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB13_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB14_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB14_NV;
	public static final int GL_EVAL_VERTEX_ATTRIB15_NV = javax.media.opengl.GL.GL_EVAL_VERTEX_ATTRIB15_NV;
	public static final int GL_MAX_MAP_TESSELLATION_NV = javax.media.opengl.GL.GL_MAX_MAP_TESSELLATION_NV;
	public static final int GL_MAX_RATIONAL_EVAL_ORDER_NV = javax.media.opengl.GL.GL_MAX_RATIONAL_EVAL_ORDER_NV;
	public static final int GL_DEPTH_STENCIL_NV = javax.media.opengl.GL.GL_DEPTH_STENCIL_NV;
	public static final int GL_UNSIGNED_INT_24_8_NV = javax.media.opengl.GL.GL_UNSIGNED_INT_24_8_NV;
	public static final int GL_PER_STAGE_CONSTANTS_NV = javax.media.opengl.GL.GL_PER_STAGE_CONSTANTS_NV;
	public static final int GL_TEXTURE_RECTANGLE_NV = javax.media.opengl.GL.GL_TEXTURE_RECTANGLE_NV;
	public static final int GL_TEXTURE_BINDING_RECTANGLE_NV = javax.media.opengl.GL.GL_TEXTURE_BINDING_RECTANGLE_NV;
	public static final int GL_PROXY_TEXTURE_RECTANGLE_NV = javax.media.opengl.GL.GL_PROXY_TEXTURE_RECTANGLE_NV;
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE_NV = javax.media.opengl.GL.GL_MAX_RECTANGLE_TEXTURE_SIZE_NV;
	public static final int GL_OFFSET_TEXTURE_RECTANGLE_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_RECTANGLE_NV;
	public static final int GL_OFFSET_TEXTURE_RECTANGLE_SCALE_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_RECTANGLE_SCALE_NV;
	public static final int GL_DOT_PRODUCT_TEXTURE_RECTANGLE_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_TEXTURE_RECTANGLE_NV;
	public static final int GL_RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV = javax.media.opengl.GL.GL_RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV;
	public static final int GL_UNSIGNED_INT_S8_S8_8_8_NV = javax.media.opengl.GL.GL_UNSIGNED_INT_S8_S8_8_8_NV;
	public static final int GL_UNSIGNED_INT_8_8_S8_S8_REV_NV = javax.media.opengl.GL.GL_UNSIGNED_INT_8_8_S8_S8_REV_NV;
	public static final int GL_DSDT_MAG_INTENSITY_NV = javax.media.opengl.GL.GL_DSDT_MAG_INTENSITY_NV;
	public static final int GL_SHADER_CONSISTENT_NV = javax.media.opengl.GL.GL_SHADER_CONSISTENT_NV;
	public static final int GL_TEXTURE_SHADER_NV = javax.media.opengl.GL.GL_TEXTURE_SHADER_NV;
	public static final int GL_SHADER_OPERATION_NV = javax.media.opengl.GL.GL_SHADER_OPERATION_NV;
	public static final int GL_CULL_MODES_NV = javax.media.opengl.GL.GL_CULL_MODES_NV;
	public static final int GL_OFFSET_TEXTURE_MATRIX_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_MATRIX_NV;
	public static final int GL_OFFSET_TEXTURE_SCALE_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_SCALE_NV;
	public static final int GL_OFFSET_TEXTURE_BIAS_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_BIAS_NV;
	public static final int GL_OFFSET_TEXTURE_2D_MATRIX_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_2D_MATRIX_NV;
	public static final int GL_OFFSET_TEXTURE_2D_SCALE_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_2D_SCALE_NV;
	public static final int GL_OFFSET_TEXTURE_2D_BIAS_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_2D_BIAS_NV;
	public static final int GL_PREVIOUS_TEXTURE_INPUT_NV = javax.media.opengl.GL.GL_PREVIOUS_TEXTURE_INPUT_NV;
	public static final int GL_CONST_EYE_NV = javax.media.opengl.GL.GL_CONST_EYE_NV;
	public static final int GL_PASS_THROUGH_NV = javax.media.opengl.GL.GL_PASS_THROUGH_NV;
	public static final int GL_CULL_FRAGMENT_NV = javax.media.opengl.GL.GL_CULL_FRAGMENT_NV;
	public static final int GL_OFFSET_TEXTURE_2D_NV = javax.media.opengl.GL.GL_OFFSET_TEXTURE_2D_NV;
	public static final int GL_DEPENDENT_AR_TEXTURE_2D_NV = javax.media.opengl.GL.GL_DEPENDENT_AR_TEXTURE_2D_NV;
	public static final int GL_DEPENDENT_GB_TEXTURE_2D_NV = javax.media.opengl.GL.GL_DEPENDENT_GB_TEXTURE_2D_NV;
	public static final int GL_DOT_PRODUCT_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_NV;
	public static final int GL_DOT_PRODUCT_DEPTH_REPLACE_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_DEPTH_REPLACE_NV;
	public static final int GL_DOT_PRODUCT_TEXTURE_2D_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_TEXTURE_2D_NV;
	public static final int GL_DOT_PRODUCT_TEXTURE_CUBE_MAP_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_TEXTURE_CUBE_MAP_NV;
	public static final int GL_DOT_PRODUCT_DIFFUSE_CUBE_MAP_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_DIFFUSE_CUBE_MAP_NV;
	public static final int GL_DOT_PRODUCT_REFLECT_CUBE_MAP_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_REFLECT_CUBE_MAP_NV;
	public static final int GL_DOT_PRODUCT_CONST_EYE_REFLECT_CUBE_MAP_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_CONST_EYE_REFLECT_CUBE_MAP_NV;
	public static final int GL_HILO_NV = javax.media.opengl.GL.GL_HILO_NV;
	public static final int GL_DSDT_NV = javax.media.opengl.GL.GL_DSDT_NV;
	public static final int GL_DSDT_MAG_NV = javax.media.opengl.GL.GL_DSDT_MAG_NV;
	public static final int GL_DSDT_MAG_VIB_NV = javax.media.opengl.GL.GL_DSDT_MAG_VIB_NV;
	public static final int GL_HILO16_NV = javax.media.opengl.GL.GL_HILO16_NV;
	public static final int GL_SIGNED_HILO_NV = javax.media.opengl.GL.GL_SIGNED_HILO_NV;
	public static final int GL_SIGNED_HILO16_NV = javax.media.opengl.GL.GL_SIGNED_HILO16_NV;
	public static final int GL_SIGNED_RGBA_NV = javax.media.opengl.GL.GL_SIGNED_RGBA_NV;
	public static final int GL_SIGNED_RGBA8_NV = javax.media.opengl.GL.GL_SIGNED_RGBA8_NV;
	public static final int GL_SIGNED_RGB_NV = javax.media.opengl.GL.GL_SIGNED_RGB_NV;
	public static final int GL_SIGNED_RGB8_NV = javax.media.opengl.GL.GL_SIGNED_RGB8_NV;
	public static final int GL_SIGNED_LUMINANCE_NV = javax.media.opengl.GL.GL_SIGNED_LUMINANCE_NV;
	public static final int GL_SIGNED_LUMINANCE8_NV = javax.media.opengl.GL.GL_SIGNED_LUMINANCE8_NV;
	public static final int GL_SIGNED_LUMINANCE_ALPHA_NV = javax.media.opengl.GL.GL_SIGNED_LUMINANCE_ALPHA_NV;
	public static final int GL_SIGNED_LUMINANCE8_ALPHA8_NV = javax.media.opengl.GL.GL_SIGNED_LUMINANCE8_ALPHA8_NV;
	public static final int GL_SIGNED_ALPHA_NV = javax.media.opengl.GL.GL_SIGNED_ALPHA_NV;
	public static final int GL_SIGNED_ALPHA8_NV = javax.media.opengl.GL.GL_SIGNED_ALPHA8_NV;
	public static final int GL_SIGNED_INTENSITY_NV = javax.media.opengl.GL.GL_SIGNED_INTENSITY_NV;
	public static final int GL_SIGNED_INTENSITY8_NV = javax.media.opengl.GL.GL_SIGNED_INTENSITY8_NV;
	public static final int GL_DSDT8_NV = javax.media.opengl.GL.GL_DSDT8_NV;
	public static final int GL_DSDT8_MAG8_NV = javax.media.opengl.GL.GL_DSDT8_MAG8_NV;
	public static final int GL_DSDT8_MAG8_INTENSITY8_NV = javax.media.opengl.GL.GL_DSDT8_MAG8_INTENSITY8_NV;
	public static final int GL_SIGNED_RGB_UNSIGNED_ALPHA_NV = javax.media.opengl.GL.GL_SIGNED_RGB_UNSIGNED_ALPHA_NV;
	public static final int GL_SIGNED_RGB8_UNSIGNED_ALPHA8_NV = javax.media.opengl.GL.GL_SIGNED_RGB8_UNSIGNED_ALPHA8_NV;
	public static final int GL_HI_SCALE_NV = javax.media.opengl.GL.GL_HI_SCALE_NV;
	public static final int GL_LO_SCALE_NV = javax.media.opengl.GL.GL_LO_SCALE_NV;
	public static final int GL_DS_SCALE_NV = javax.media.opengl.GL.GL_DS_SCALE_NV;
	public static final int GL_DT_SCALE_NV = javax.media.opengl.GL.GL_DT_SCALE_NV;
	public static final int GL_MAGNITUDE_SCALE_NV = javax.media.opengl.GL.GL_MAGNITUDE_SCALE_NV;
	public static final int GL_VIBRANCE_SCALE_NV = javax.media.opengl.GL.GL_VIBRANCE_SCALE_NV;
	public static final int GL_HI_BIAS_NV = javax.media.opengl.GL.GL_HI_BIAS_NV;
	public static final int GL_LO_BIAS_NV = javax.media.opengl.GL.GL_LO_BIAS_NV;
	public static final int GL_DS_BIAS_NV = javax.media.opengl.GL.GL_DS_BIAS_NV;
	public static final int GL_DT_BIAS_NV = javax.media.opengl.GL.GL_DT_BIAS_NV;
	public static final int GL_MAGNITUDE_BIAS_NV = javax.media.opengl.GL.GL_MAGNITUDE_BIAS_NV;
	public static final int GL_VIBRANCE_BIAS_NV = javax.media.opengl.GL.GL_VIBRANCE_BIAS_NV;
	public static final int GL_TEXTURE_BORDER_VALUES_NV = javax.media.opengl.GL.GL_TEXTURE_BORDER_VALUES_NV;
	public static final int GL_TEXTURE_HI_SIZE_NV = javax.media.opengl.GL.GL_TEXTURE_HI_SIZE_NV;
	public static final int GL_TEXTURE_LO_SIZE_NV = javax.media.opengl.GL.GL_TEXTURE_LO_SIZE_NV;
	public static final int GL_TEXTURE_DS_SIZE_NV = javax.media.opengl.GL.GL_TEXTURE_DS_SIZE_NV;
	public static final int GL_TEXTURE_DT_SIZE_NV = javax.media.opengl.GL.GL_TEXTURE_DT_SIZE_NV;
	public static final int GL_TEXTURE_MAG_SIZE_NV = javax.media.opengl.GL.GL_TEXTURE_MAG_SIZE_NV;
	public static final int GL_DOT_PRODUCT_TEXTURE_3D_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_TEXTURE_3D_NV;
	public static final int GL_VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV = javax.media.opengl.GL.GL_VERTEX_ARRAY_RANGE_WITHOUT_FLUSH_NV;
	public static final int GL_VERTEX_PROGRAM_NV = javax.media.opengl.GL.GL_VERTEX_PROGRAM_NV;
	public static final int GL_VERTEX_STATE_PROGRAM_NV = javax.media.opengl.GL.GL_VERTEX_STATE_PROGRAM_NV;
	public static final int GL_ATTRIB_ARRAY_SIZE_NV = javax.media.opengl.GL.GL_ATTRIB_ARRAY_SIZE_NV;
	public static final int GL_ATTRIB_ARRAY_STRIDE_NV = javax.media.opengl.GL.GL_ATTRIB_ARRAY_STRIDE_NV;
	public static final int GL_ATTRIB_ARRAY_TYPE_NV = javax.media.opengl.GL.GL_ATTRIB_ARRAY_TYPE_NV;
	public static final int GL_CURRENT_ATTRIB_NV = javax.media.opengl.GL.GL_CURRENT_ATTRIB_NV;
	public static final int GL_PROGRAM_LENGTH_NV = javax.media.opengl.GL.GL_PROGRAM_LENGTH_NV;
	public static final int GL_PROGRAM_STRING_NV = javax.media.opengl.GL.GL_PROGRAM_STRING_NV;
	public static final int GL_MODELVIEW_PROJECTION_NV = javax.media.opengl.GL.GL_MODELVIEW_PROJECTION_NV;
	public static final int GL_IDENTITY_NV = javax.media.opengl.GL.GL_IDENTITY_NV;
	public static final int GL_INVERSE_NV = javax.media.opengl.GL.GL_INVERSE_NV;
	public static final int GL_TRANSPOSE_NV = javax.media.opengl.GL.GL_TRANSPOSE_NV;
	public static final int GL_INVERSE_TRANSPOSE_NV = javax.media.opengl.GL.GL_INVERSE_TRANSPOSE_NV;
	public static final int GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV = javax.media.opengl.GL.GL_MAX_TRACK_MATRIX_STACK_DEPTH_NV;
	public static final int GL_MAX_TRACK_MATRICES_NV = javax.media.opengl.GL.GL_MAX_TRACK_MATRICES_NV;
	public static final int GL_MATRIX0_NV = javax.media.opengl.GL.GL_MATRIX0_NV;
	public static final int GL_MATRIX1_NV = javax.media.opengl.GL.GL_MATRIX1_NV;
	public static final int GL_MATRIX2_NV = javax.media.opengl.GL.GL_MATRIX2_NV;
	public static final int GL_MATRIX3_NV = javax.media.opengl.GL.GL_MATRIX3_NV;
	public static final int GL_MATRIX4_NV = javax.media.opengl.GL.GL_MATRIX4_NV;
	public static final int GL_MATRIX5_NV = javax.media.opengl.GL.GL_MATRIX5_NV;
	public static final int GL_MATRIX6_NV = javax.media.opengl.GL.GL_MATRIX6_NV;
	public static final int GL_MATRIX7_NV = javax.media.opengl.GL.GL_MATRIX7_NV;
	public static final int GL_CURRENT_MATRIX_STACK_DEPTH_NV = javax.media.opengl.GL.GL_CURRENT_MATRIX_STACK_DEPTH_NV;
	public static final int GL_CURRENT_MATRIX_NV = javax.media.opengl.GL.GL_CURRENT_MATRIX_NV;
	public static final int GL_VERTEX_PROGRAM_POINT_SIZE_NV = javax.media.opengl.GL.GL_VERTEX_PROGRAM_POINT_SIZE_NV;
	public static final int GL_VERTEX_PROGRAM_TWO_SIDE_NV = javax.media.opengl.GL.GL_VERTEX_PROGRAM_TWO_SIDE_NV;
	public static final int GL_PROGRAM_PARAMETER_NV = javax.media.opengl.GL.GL_PROGRAM_PARAMETER_NV;
	public static final int GL_ATTRIB_ARRAY_POINTER_NV = javax.media.opengl.GL.GL_ATTRIB_ARRAY_POINTER_NV;
	public static final int GL_PROGRAM_TARGET_NV = javax.media.opengl.GL.GL_PROGRAM_TARGET_NV;
	public static final int GL_PROGRAM_RESIDENT_NV = javax.media.opengl.GL.GL_PROGRAM_RESIDENT_NV;
	public static final int GL_TRACK_MATRIX_NV = javax.media.opengl.GL.GL_TRACK_MATRIX_NV;
	public static final int GL_TRACK_MATRIX_TRANSFORM_NV = javax.media.opengl.GL.GL_TRACK_MATRIX_TRANSFORM_NV;
	public static final int GL_VERTEX_PROGRAM_BINDING_NV = javax.media.opengl.GL.GL_VERTEX_PROGRAM_BINDING_NV;
	public static final int GL_PROGRAM_ERROR_POSITION_NV = javax.media.opengl.GL.GL_PROGRAM_ERROR_POSITION_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY0_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY0_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY1_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY1_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY2_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY2_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY3_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY3_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY4_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY4_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY5_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY5_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY6_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY6_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY7_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY7_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY8_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY8_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY9_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY9_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY10_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY10_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY11_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY11_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY12_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY12_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY13_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY13_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY14_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY14_NV;
	public static final int GL_VERTEX_ATTRIB_ARRAY15_NV = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY15_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB0_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB0_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB1_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB1_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB2_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB2_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB3_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB3_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB4_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB4_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB5_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB5_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB6_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB6_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB7_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB7_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB8_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB8_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB9_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB9_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB10_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB10_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB11_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB11_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB12_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB12_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB13_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB13_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB14_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB14_4_NV;
	public static final int GL_MAP1_VERTEX_ATTRIB15_4_NV = javax.media.opengl.GL.GL_MAP1_VERTEX_ATTRIB15_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB0_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB0_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB1_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB1_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB2_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB2_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB3_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB3_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB4_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB4_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB5_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB5_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB6_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB6_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB7_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB7_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB8_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB8_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB9_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB9_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB10_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB10_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB11_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB11_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB12_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB12_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB13_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB13_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB14_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB14_4_NV;
	public static final int GL_MAP2_VERTEX_ATTRIB15_4_NV = javax.media.opengl.GL.GL_MAP2_VERTEX_ATTRIB15_4_NV;
	public static final int GL_TEXTURE_MAX_CLAMP_S_SGIX = javax.media.opengl.GL.GL_TEXTURE_MAX_CLAMP_S_SGIX;
	public static final int GL_TEXTURE_MAX_CLAMP_T_SGIX = javax.media.opengl.GL.GL_TEXTURE_MAX_CLAMP_T_SGIX;
	public static final int GL_TEXTURE_MAX_CLAMP_R_SGIX = javax.media.opengl.GL.GL_TEXTURE_MAX_CLAMP_R_SGIX;
	public static final int GL_SCALEBIAS_HINT_SGIX = javax.media.opengl.GL.GL_SCALEBIAS_HINT_SGIX;
	public static final int GL_INTERLACE_OML = javax.media.opengl.GL.GL_INTERLACE_OML;
	public static final int GL_INTERLACE_READ_OML = javax.media.opengl.GL.GL_INTERLACE_READ_OML;
	public static final int GL_FORMAT_SUBSAMPLE_24_24_OML = javax.media.opengl.GL.GL_FORMAT_SUBSAMPLE_24_24_OML;
	public static final int GL_FORMAT_SUBSAMPLE_244_244_OML = javax.media.opengl.GL.GL_FORMAT_SUBSAMPLE_244_244_OML;
	public static final int GL_PACK_RESAMPLE_OML = javax.media.opengl.GL.GL_PACK_RESAMPLE_OML;
	public static final int GL_UNPACK_RESAMPLE_OML = javax.media.opengl.GL.GL_UNPACK_RESAMPLE_OML;
	public static final int GL_RESAMPLE_REPLICATE_OML = javax.media.opengl.GL.GL_RESAMPLE_REPLICATE_OML;
	public static final int GL_RESAMPLE_ZERO_FILL_OML = javax.media.opengl.GL.GL_RESAMPLE_ZERO_FILL_OML;
	public static final int GL_RESAMPLE_AVERAGE_OML = javax.media.opengl.GL.GL_RESAMPLE_AVERAGE_OML;
	public static final int GL_RESAMPLE_DECIMATE_OML = javax.media.opengl.GL.GL_RESAMPLE_DECIMATE_OML;
	public static final int GL_DEPTH_STENCIL_TO_RGBA_NV = javax.media.opengl.GL.GL_DEPTH_STENCIL_TO_RGBA_NV;
	public static final int GL_DEPTH_STENCIL_TO_BGRA_NV = javax.media.opengl.GL.GL_DEPTH_STENCIL_TO_BGRA_NV;
	public static final int GL_BUMP_ROT_MATRIX_ATI = javax.media.opengl.GL.GL_BUMP_ROT_MATRIX_ATI;
	public static final int GL_BUMP_ROT_MATRIX_SIZE_ATI = javax.media.opengl.GL.GL_BUMP_ROT_MATRIX_SIZE_ATI;
	public static final int GL_BUMP_NUM_TEX_UNITS_ATI = javax.media.opengl.GL.GL_BUMP_NUM_TEX_UNITS_ATI;
	public static final int GL_BUMP_TEX_UNITS_ATI = javax.media.opengl.GL.GL_BUMP_TEX_UNITS_ATI;
	public static final int GL_DUDV_ATI = javax.media.opengl.GL.GL_DUDV_ATI;
	public static final int GL_DU8DV8_ATI = javax.media.opengl.GL.GL_DU8DV8_ATI;
	public static final int GL_BUMP_ENVMAP_ATI = javax.media.opengl.GL.GL_BUMP_ENVMAP_ATI;
	public static final int GL_BUMP_TARGET_ATI = javax.media.opengl.GL.GL_BUMP_TARGET_ATI;
	public static final int GL_FRAGMENT_SHADER_ATI = javax.media.opengl.GL.GL_FRAGMENT_SHADER_ATI;
	public static final int GL_REG_0_ATI = javax.media.opengl.GL.GL_REG_0_ATI;
	public static final int GL_REG_1_ATI = javax.media.opengl.GL.GL_REG_1_ATI;
	public static final int GL_REG_2_ATI = javax.media.opengl.GL.GL_REG_2_ATI;
	public static final int GL_REG_3_ATI = javax.media.opengl.GL.GL_REG_3_ATI;
	public static final int GL_REG_4_ATI = javax.media.opengl.GL.GL_REG_4_ATI;
	public static final int GL_REG_5_ATI = javax.media.opengl.GL.GL_REG_5_ATI;
	public static final int GL_REG_6_ATI = javax.media.opengl.GL.GL_REG_6_ATI;
	public static final int GL_REG_7_ATI = javax.media.opengl.GL.GL_REG_7_ATI;
	public static final int GL_REG_8_ATI = javax.media.opengl.GL.GL_REG_8_ATI;
	public static final int GL_REG_9_ATI = javax.media.opengl.GL.GL_REG_9_ATI;
	public static final int GL_REG_10_ATI = javax.media.opengl.GL.GL_REG_10_ATI;
	public static final int GL_REG_11_ATI = javax.media.opengl.GL.GL_REG_11_ATI;
	public static final int GL_REG_12_ATI = javax.media.opengl.GL.GL_REG_12_ATI;
	public static final int GL_REG_13_ATI = javax.media.opengl.GL.GL_REG_13_ATI;
	public static final int GL_REG_14_ATI = javax.media.opengl.GL.GL_REG_14_ATI;
	public static final int GL_REG_15_ATI = javax.media.opengl.GL.GL_REG_15_ATI;
	public static final int GL_REG_16_ATI = javax.media.opengl.GL.GL_REG_16_ATI;
	public static final int GL_REG_17_ATI = javax.media.opengl.GL.GL_REG_17_ATI;
	public static final int GL_REG_18_ATI = javax.media.opengl.GL.GL_REG_18_ATI;
	public static final int GL_REG_19_ATI = javax.media.opengl.GL.GL_REG_19_ATI;
	public static final int GL_REG_20_ATI = javax.media.opengl.GL.GL_REG_20_ATI;
	public static final int GL_REG_21_ATI = javax.media.opengl.GL.GL_REG_21_ATI;
	public static final int GL_REG_22_ATI = javax.media.opengl.GL.GL_REG_22_ATI;
	public static final int GL_REG_23_ATI = javax.media.opengl.GL.GL_REG_23_ATI;
	public static final int GL_REG_24_ATI = javax.media.opengl.GL.GL_REG_24_ATI;
	public static final int GL_REG_25_ATI = javax.media.opengl.GL.GL_REG_25_ATI;
	public static final int GL_REG_26_ATI = javax.media.opengl.GL.GL_REG_26_ATI;
	public static final int GL_REG_27_ATI = javax.media.opengl.GL.GL_REG_27_ATI;
	public static final int GL_REG_28_ATI = javax.media.opengl.GL.GL_REG_28_ATI;
	public static final int GL_REG_29_ATI = javax.media.opengl.GL.GL_REG_29_ATI;
	public static final int GL_REG_30_ATI = javax.media.opengl.GL.GL_REG_30_ATI;
	public static final int GL_REG_31_ATI = javax.media.opengl.GL.GL_REG_31_ATI;
	public static final int GL_CON_0_ATI = javax.media.opengl.GL.GL_CON_0_ATI;
	public static final int GL_CON_1_ATI = javax.media.opengl.GL.GL_CON_1_ATI;
	public static final int GL_CON_2_ATI = javax.media.opengl.GL.GL_CON_2_ATI;
	public static final int GL_CON_3_ATI = javax.media.opengl.GL.GL_CON_3_ATI;
	public static final int GL_CON_4_ATI = javax.media.opengl.GL.GL_CON_4_ATI;
	public static final int GL_CON_5_ATI = javax.media.opengl.GL.GL_CON_5_ATI;
	public static final int GL_CON_6_ATI = javax.media.opengl.GL.GL_CON_6_ATI;
	public static final int GL_CON_7_ATI = javax.media.opengl.GL.GL_CON_7_ATI;
	public static final int GL_CON_8_ATI = javax.media.opengl.GL.GL_CON_8_ATI;
	public static final int GL_CON_9_ATI = javax.media.opengl.GL.GL_CON_9_ATI;
	public static final int GL_CON_10_ATI = javax.media.opengl.GL.GL_CON_10_ATI;
	public static final int GL_CON_11_ATI = javax.media.opengl.GL.GL_CON_11_ATI;
	public static final int GL_CON_12_ATI = javax.media.opengl.GL.GL_CON_12_ATI;
	public static final int GL_CON_13_ATI = javax.media.opengl.GL.GL_CON_13_ATI;
	public static final int GL_CON_14_ATI = javax.media.opengl.GL.GL_CON_14_ATI;
	public static final int GL_CON_15_ATI = javax.media.opengl.GL.GL_CON_15_ATI;
	public static final int GL_CON_16_ATI = javax.media.opengl.GL.GL_CON_16_ATI;
	public static final int GL_CON_17_ATI = javax.media.opengl.GL.GL_CON_17_ATI;
	public static final int GL_CON_18_ATI = javax.media.opengl.GL.GL_CON_18_ATI;
	public static final int GL_CON_19_ATI = javax.media.opengl.GL.GL_CON_19_ATI;
	public static final int GL_CON_20_ATI = javax.media.opengl.GL.GL_CON_20_ATI;
	public static final int GL_CON_21_ATI = javax.media.opengl.GL.GL_CON_21_ATI;
	public static final int GL_CON_22_ATI = javax.media.opengl.GL.GL_CON_22_ATI;
	public static final int GL_CON_23_ATI = javax.media.opengl.GL.GL_CON_23_ATI;
	public static final int GL_CON_24_ATI = javax.media.opengl.GL.GL_CON_24_ATI;
	public static final int GL_CON_25_ATI = javax.media.opengl.GL.GL_CON_25_ATI;
	public static final int GL_CON_26_ATI = javax.media.opengl.GL.GL_CON_26_ATI;
	public static final int GL_CON_27_ATI = javax.media.opengl.GL.GL_CON_27_ATI;
	public static final int GL_CON_28_ATI = javax.media.opengl.GL.GL_CON_28_ATI;
	public static final int GL_CON_29_ATI = javax.media.opengl.GL.GL_CON_29_ATI;
	public static final int GL_CON_30_ATI = javax.media.opengl.GL.GL_CON_30_ATI;
	public static final int GL_CON_31_ATI = javax.media.opengl.GL.GL_CON_31_ATI;
	public static final int GL_MOV_ATI = javax.media.opengl.GL.GL_MOV_ATI;
	public static final int GL_ADD_ATI = javax.media.opengl.GL.GL_ADD_ATI;
	public static final int GL_MUL_ATI = javax.media.opengl.GL.GL_MUL_ATI;
	public static final int GL_SUB_ATI = javax.media.opengl.GL.GL_SUB_ATI;
	public static final int GL_DOT3_ATI = javax.media.opengl.GL.GL_DOT3_ATI;
	public static final int GL_DOT4_ATI = javax.media.opengl.GL.GL_DOT4_ATI;
	public static final int GL_MAD_ATI = javax.media.opengl.GL.GL_MAD_ATI;
	public static final int GL_LERP_ATI = javax.media.opengl.GL.GL_LERP_ATI;
	public static final int GL_CND_ATI = javax.media.opengl.GL.GL_CND_ATI;
	public static final int GL_CND0_ATI = javax.media.opengl.GL.GL_CND0_ATI;
	public static final int GL_DOT2_ADD_ATI = javax.media.opengl.GL.GL_DOT2_ADD_ATI;
	public static final int GL_SECONDARY_INTERPOLATOR_ATI = javax.media.opengl.GL.GL_SECONDARY_INTERPOLATOR_ATI;
	public static final int GL_NUM_FRAGMENT_REGISTERS_ATI = javax.media.opengl.GL.GL_NUM_FRAGMENT_REGISTERS_ATI;
	public static final int GL_NUM_FRAGMENT_CONSTANTS_ATI = javax.media.opengl.GL.GL_NUM_FRAGMENT_CONSTANTS_ATI;
	public static final int GL_NUM_PASSES_ATI = javax.media.opengl.GL.GL_NUM_PASSES_ATI;
	public static final int GL_NUM_INSTRUCTIONS_PER_PASS_ATI = javax.media.opengl.GL.GL_NUM_INSTRUCTIONS_PER_PASS_ATI;
	public static final int GL_NUM_INSTRUCTIONS_TOTAL_ATI = javax.media.opengl.GL.GL_NUM_INSTRUCTIONS_TOTAL_ATI;
	public static final int GL_NUM_INPUT_INTERPOLATOR_COMPONENTS_ATI = javax.media.opengl.GL.GL_NUM_INPUT_INTERPOLATOR_COMPONENTS_ATI;
	public static final int GL_NUM_LOOPBACK_COMPONENTS_ATI = javax.media.opengl.GL.GL_NUM_LOOPBACK_COMPONENTS_ATI;
	public static final int GL_COLOR_ALPHA_PAIRING_ATI = javax.media.opengl.GL.GL_COLOR_ALPHA_PAIRING_ATI;
	public static final int GL_SWIZZLE_STR_ATI = javax.media.opengl.GL.GL_SWIZZLE_STR_ATI;
	public static final int GL_SWIZZLE_STQ_ATI = javax.media.opengl.GL.GL_SWIZZLE_STQ_ATI;
	public static final int GL_SWIZZLE_STR_DR_ATI = javax.media.opengl.GL.GL_SWIZZLE_STR_DR_ATI;
	public static final int GL_SWIZZLE_STQ_DQ_ATI = javax.media.opengl.GL.GL_SWIZZLE_STQ_DQ_ATI;
	public static final int GL_SWIZZLE_STRQ_ATI = javax.media.opengl.GL.GL_SWIZZLE_STRQ_ATI;
	public static final int GL_SWIZZLE_STRQ_DQ_ATI = javax.media.opengl.GL.GL_SWIZZLE_STRQ_DQ_ATI;
	public static final int GL_RED_BIT_ATI = javax.media.opengl.GL.GL_RED_BIT_ATI;
	public static final int GL_GREEN_BIT_ATI = javax.media.opengl.GL.GL_GREEN_BIT_ATI;
	public static final int GL_BLUE_BIT_ATI = javax.media.opengl.GL.GL_BLUE_BIT_ATI;
	public static final int GL_2X_BIT_ATI = javax.media.opengl.GL.GL_2X_BIT_ATI;
	public static final int GL_4X_BIT_ATI = javax.media.opengl.GL.GL_4X_BIT_ATI;
	public static final int GL_8X_BIT_ATI = javax.media.opengl.GL.GL_8X_BIT_ATI;
	public static final int GL_HALF_BIT_ATI = javax.media.opengl.GL.GL_HALF_BIT_ATI;
	public static final int GL_QUARTER_BIT_ATI = javax.media.opengl.GL.GL_QUARTER_BIT_ATI;
	public static final int GL_EIGHTH_BIT_ATI = javax.media.opengl.GL.GL_EIGHTH_BIT_ATI;
	public static final int GL_SATURATE_BIT_ATI = javax.media.opengl.GL.GL_SATURATE_BIT_ATI;
	public static final int GL_COMP_BIT_ATI = javax.media.opengl.GL.GL_COMP_BIT_ATI;
	public static final int GL_NEGATE_BIT_ATI = javax.media.opengl.GL.GL_NEGATE_BIT_ATI;
	public static final int GL_BIAS_BIT_ATI = javax.media.opengl.GL.GL_BIAS_BIT_ATI;
	public static final int GL_PN_TRIANGLES_ATI = javax.media.opengl.GL.GL_PN_TRIANGLES_ATI;
	public static final int GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI = javax.media.opengl.GL.GL_MAX_PN_TRIANGLES_TESSELATION_LEVEL_ATI;
	public static final int GL_PN_TRIANGLES_POINT_MODE_ATI = javax.media.opengl.GL.GL_PN_TRIANGLES_POINT_MODE_ATI;
	public static final int GL_PN_TRIANGLES_NORMAL_MODE_ATI = javax.media.opengl.GL.GL_PN_TRIANGLES_NORMAL_MODE_ATI;
	public static final int GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI = javax.media.opengl.GL.GL_PN_TRIANGLES_TESSELATION_LEVEL_ATI;
	public static final int GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI = javax.media.opengl.GL.GL_PN_TRIANGLES_POINT_MODE_LINEAR_ATI;
	public static final int GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI = javax.media.opengl.GL.GL_PN_TRIANGLES_POINT_MODE_CUBIC_ATI;
	public static final int GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI = javax.media.opengl.GL.GL_PN_TRIANGLES_NORMAL_MODE_LINEAR_ATI;
	public static final int GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI = javax.media.opengl.GL.GL_PN_TRIANGLES_NORMAL_MODE_QUADRATIC_ATI;
	public static final int GL_STATIC_ATI = javax.media.opengl.GL.GL_STATIC_ATI;
	public static final int GL_DYNAMIC_ATI = javax.media.opengl.GL.GL_DYNAMIC_ATI;
	public static final int GL_PRESERVE_ATI = javax.media.opengl.GL.GL_PRESERVE_ATI;
	public static final int GL_DISCARD_ATI = javax.media.opengl.GL.GL_DISCARD_ATI;
	public static final int GL_OBJECT_BUFFER_SIZE_ATI = javax.media.opengl.GL.GL_OBJECT_BUFFER_SIZE_ATI;
	public static final int GL_OBJECT_BUFFER_USAGE_ATI = javax.media.opengl.GL.GL_OBJECT_BUFFER_USAGE_ATI;
	public static final int GL_ARRAY_OBJECT_BUFFER_ATI = javax.media.opengl.GL.GL_ARRAY_OBJECT_BUFFER_ATI;
	public static final int GL_ARRAY_OBJECT_OFFSET_ATI = javax.media.opengl.GL.GL_ARRAY_OBJECT_OFFSET_ATI;
	public static final int GL_VERTEX_SHADER_EXT = javax.media.opengl.GL.GL_VERTEX_SHADER_EXT;
	public static final int GL_VERTEX_SHADER_BINDING_EXT = javax.media.opengl.GL.GL_VERTEX_SHADER_BINDING_EXT;
	public static final int GL_OP_INDEX_EXT = javax.media.opengl.GL.GL_OP_INDEX_EXT;
	public static final int GL_OP_NEGATE_EXT = javax.media.opengl.GL.GL_OP_NEGATE_EXT;
	public static final int GL_OP_DOT3_EXT = javax.media.opengl.GL.GL_OP_DOT3_EXT;
	public static final int GL_OP_DOT4_EXT = javax.media.opengl.GL.GL_OP_DOT4_EXT;
	public static final int GL_OP_MUL_EXT = javax.media.opengl.GL.GL_OP_MUL_EXT;
	public static final int GL_OP_ADD_EXT = javax.media.opengl.GL.GL_OP_ADD_EXT;
	public static final int GL_OP_MADD_EXT = javax.media.opengl.GL.GL_OP_MADD_EXT;
	public static final int GL_OP_FRAC_EXT = javax.media.opengl.GL.GL_OP_FRAC_EXT;
	public static final int GL_OP_MAX_EXT = javax.media.opengl.GL.GL_OP_MAX_EXT;
	public static final int GL_OP_MIN_EXT = javax.media.opengl.GL.GL_OP_MIN_EXT;
	public static final int GL_OP_SET_GE_EXT = javax.media.opengl.GL.GL_OP_SET_GE_EXT;
	public static final int GL_OP_SET_LT_EXT = javax.media.opengl.GL.GL_OP_SET_LT_EXT;
	public static final int GL_OP_CLAMP_EXT = javax.media.opengl.GL.GL_OP_CLAMP_EXT;
	public static final int GL_OP_FLOOR_EXT = javax.media.opengl.GL.GL_OP_FLOOR_EXT;
	public static final int GL_OP_ROUND_EXT = javax.media.opengl.GL.GL_OP_ROUND_EXT;
	public static final int GL_OP_EXP_BASE_2_EXT = javax.media.opengl.GL.GL_OP_EXP_BASE_2_EXT;
	public static final int GL_OP_LOG_BASE_2_EXT = javax.media.opengl.GL.GL_OP_LOG_BASE_2_EXT;
	public static final int GL_OP_POWER_EXT = javax.media.opengl.GL.GL_OP_POWER_EXT;
	public static final int GL_OP_RECIP_EXT = javax.media.opengl.GL.GL_OP_RECIP_EXT;
	public static final int GL_OP_RECIP_SQRT_EXT = javax.media.opengl.GL.GL_OP_RECIP_SQRT_EXT;
	public static final int GL_OP_SUB_EXT = javax.media.opengl.GL.GL_OP_SUB_EXT;
	public static final int GL_OP_CROSS_PRODUCT_EXT = javax.media.opengl.GL.GL_OP_CROSS_PRODUCT_EXT;
	public static final int GL_OP_MULTIPLY_MATRIX_EXT = javax.media.opengl.GL.GL_OP_MULTIPLY_MATRIX_EXT;
	public static final int GL_OP_MOV_EXT = javax.media.opengl.GL.GL_OP_MOV_EXT;
	public static final int GL_OUTPUT_VERTEX_EXT = javax.media.opengl.GL.GL_OUTPUT_VERTEX_EXT;
	public static final int GL_OUTPUT_COLOR0_EXT = javax.media.opengl.GL.GL_OUTPUT_COLOR0_EXT;
	public static final int GL_OUTPUT_COLOR1_EXT = javax.media.opengl.GL.GL_OUTPUT_COLOR1_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD0_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD0_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD1_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD1_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD2_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD2_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD3_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD3_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD4_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD4_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD5_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD5_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD6_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD6_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD7_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD7_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD8_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD8_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD9_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD9_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD10_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD10_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD11_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD11_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD12_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD12_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD13_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD13_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD14_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD14_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD15_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD15_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD16_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD16_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD17_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD17_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD18_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD18_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD19_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD19_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD20_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD20_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD21_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD21_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD22_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD22_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD23_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD23_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD24_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD24_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD25_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD25_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD26_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD26_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD27_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD27_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD28_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD28_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD29_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD29_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD30_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD30_EXT;
	public static final int GL_OUTPUT_TEXTURE_COORD31_EXT = javax.media.opengl.GL.GL_OUTPUT_TEXTURE_COORD31_EXT;
	public static final int GL_OUTPUT_FOG_EXT = javax.media.opengl.GL.GL_OUTPUT_FOG_EXT;
	public static final int GL_SCALAR_EXT = javax.media.opengl.GL.GL_SCALAR_EXT;
	public static final int GL_VECTOR_EXT = javax.media.opengl.GL.GL_VECTOR_EXT;
	public static final int GL_MATRIX_EXT = javax.media.opengl.GL.GL_MATRIX_EXT;
	public static final int GL_VARIANT_EXT = javax.media.opengl.GL.GL_VARIANT_EXT;
	public static final int GL_INVARIANT_EXT = javax.media.opengl.GL.GL_INVARIANT_EXT;
	public static final int GL_LOCAL_CONSTANT_EXT = javax.media.opengl.GL.GL_LOCAL_CONSTANT_EXT;
	public static final int GL_LOCAL_EXT = javax.media.opengl.GL.GL_LOCAL_EXT;
	public static final int GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT = javax.media.opengl.GL.GL_MAX_VERTEX_SHADER_INSTRUCTIONS_EXT;
	public static final int GL_MAX_VERTEX_SHADER_VARIANTS_EXT = javax.media.opengl.GL.GL_MAX_VERTEX_SHADER_VARIANTS_EXT;
	public static final int GL_MAX_VERTEX_SHADER_INVARIANTS_EXT = javax.media.opengl.GL.GL_MAX_VERTEX_SHADER_INVARIANTS_EXT;
	public static final int GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = javax.media.opengl.GL.GL_MAX_VERTEX_SHADER_LOCAL_CONSTANTS_EXT;
	public static final int GL_MAX_VERTEX_SHADER_LOCALS_EXT = javax.media.opengl.GL.GL_MAX_VERTEX_SHADER_LOCALS_EXT;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT = javax.media.opengl.GL.GL_MAX_OPTIMIZED_VERTEX_SHADER_INSTRUCTIONS_EXT;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT = javax.media.opengl.GL.GL_MAX_OPTIMIZED_VERTEX_SHADER_VARIANTS_EXT;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = javax.media.opengl.GL.GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCAL_CONSTANTS_EXT;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT = javax.media.opengl.GL.GL_MAX_OPTIMIZED_VERTEX_SHADER_INVARIANTS_EXT;
	public static final int GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT = javax.media.opengl.GL.GL_MAX_OPTIMIZED_VERTEX_SHADER_LOCALS_EXT;
	public static final int GL_VERTEX_SHADER_INSTRUCTIONS_EXT = javax.media.opengl.GL.GL_VERTEX_SHADER_INSTRUCTIONS_EXT;
	public static final int GL_VERTEX_SHADER_VARIANTS_EXT = javax.media.opengl.GL.GL_VERTEX_SHADER_VARIANTS_EXT;
	public static final int GL_VERTEX_SHADER_INVARIANTS_EXT = javax.media.opengl.GL.GL_VERTEX_SHADER_INVARIANTS_EXT;
	public static final int GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT = javax.media.opengl.GL.GL_VERTEX_SHADER_LOCAL_CONSTANTS_EXT;
	public static final int GL_VERTEX_SHADER_LOCALS_EXT = javax.media.opengl.GL.GL_VERTEX_SHADER_LOCALS_EXT;
	public static final int GL_VERTEX_SHADER_OPTIMIZED_EXT = javax.media.opengl.GL.GL_VERTEX_SHADER_OPTIMIZED_EXT;
	public static final int GL_X_EXT = javax.media.opengl.GL.GL_X_EXT;
	public static final int GL_Y_EXT = javax.media.opengl.GL.GL_Y_EXT;
	public static final int GL_Z_EXT = javax.media.opengl.GL.GL_Z_EXT;
	public static final int GL_W_EXT = javax.media.opengl.GL.GL_W_EXT;
	public static final int GL_NEGATIVE_X_EXT = javax.media.opengl.GL.GL_NEGATIVE_X_EXT;
	public static final int GL_NEGATIVE_Y_EXT = javax.media.opengl.GL.GL_NEGATIVE_Y_EXT;
	public static final int GL_NEGATIVE_Z_EXT = javax.media.opengl.GL.GL_NEGATIVE_Z_EXT;
	public static final int GL_NEGATIVE_W_EXT = javax.media.opengl.GL.GL_NEGATIVE_W_EXT;
	public static final int GL_ZERO_EXT = javax.media.opengl.GL.GL_ZERO_EXT;
	public static final int GL_ONE_EXT = javax.media.opengl.GL.GL_ONE_EXT;
	public static final int GL_NEGATIVE_ONE_EXT = javax.media.opengl.GL.GL_NEGATIVE_ONE_EXT;
	public static final int GL_NORMALIZED_RANGE_EXT = javax.media.opengl.GL.GL_NORMALIZED_RANGE_EXT;
	public static final int GL_FULL_RANGE_EXT = javax.media.opengl.GL.GL_FULL_RANGE_EXT;
	public static final int GL_CURRENT_VERTEX_EXT = javax.media.opengl.GL.GL_CURRENT_VERTEX_EXT;
	public static final int GL_MVP_MATRIX_EXT = javax.media.opengl.GL.GL_MVP_MATRIX_EXT;
	public static final int GL_VARIANT_VALUE_EXT = javax.media.opengl.GL.GL_VARIANT_VALUE_EXT;
	public static final int GL_VARIANT_DATATYPE_EXT = javax.media.opengl.GL.GL_VARIANT_DATATYPE_EXT;
	public static final int GL_VARIANT_ARRAY_STRIDE_EXT = javax.media.opengl.GL.GL_VARIANT_ARRAY_STRIDE_EXT;
	public static final int GL_VARIANT_ARRAY_TYPE_EXT = javax.media.opengl.GL.GL_VARIANT_ARRAY_TYPE_EXT;
	public static final int GL_VARIANT_ARRAY_EXT = javax.media.opengl.GL.GL_VARIANT_ARRAY_EXT;
	public static final int GL_VARIANT_ARRAY_POINTER_EXT = javax.media.opengl.GL.GL_VARIANT_ARRAY_POINTER_EXT;
	public static final int GL_INVARIANT_VALUE_EXT = javax.media.opengl.GL.GL_INVARIANT_VALUE_EXT;
	public static final int GL_INVARIANT_DATATYPE_EXT = javax.media.opengl.GL.GL_INVARIANT_DATATYPE_EXT;
	public static final int GL_LOCAL_CONSTANT_VALUE_EXT = javax.media.opengl.GL.GL_LOCAL_CONSTANT_VALUE_EXT;
	public static final int GL_LOCAL_CONSTANT_DATATYPE_EXT = javax.media.opengl.GL.GL_LOCAL_CONSTANT_DATATYPE_EXT;
	public static final int GL_TEXTURE_RECTANGLE_EXT = javax.media.opengl.GL.GL_TEXTURE_RECTANGLE_EXT;
	public static final int GL_TEXTURE_BINDING_RECTANGLE_EXT = javax.media.opengl.GL.GL_TEXTURE_BINDING_RECTANGLE_EXT;
	public static final int GL_PROXY_TEXTURE_RECTANGLE_EXT = javax.media.opengl.GL.GL_PROXY_TEXTURE_RECTANGLE_EXT;
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE_EXT = javax.media.opengl.GL.GL_MAX_RECTANGLE_TEXTURE_SIZE_EXT;
	public static final int GL_MAX_VERTEX_STREAMS_ATI = javax.media.opengl.GL.GL_MAX_VERTEX_STREAMS_ATI;
	public static final int GL_VERTEX_STREAM0_ATI = javax.media.opengl.GL.GL_VERTEX_STREAM0_ATI;
	public static final int GL_VERTEX_STREAM1_ATI = javax.media.opengl.GL.GL_VERTEX_STREAM1_ATI;
	public static final int GL_VERTEX_STREAM2_ATI = javax.media.opengl.GL.GL_VERTEX_STREAM2_ATI;
	public static final int GL_VERTEX_STREAM3_ATI = javax.media.opengl.GL.GL_VERTEX_STREAM3_ATI;
	public static final int GL_VERTEX_STREAM4_ATI = javax.media.opengl.GL.GL_VERTEX_STREAM4_ATI;
	public static final int GL_VERTEX_STREAM5_ATI = javax.media.opengl.GL.GL_VERTEX_STREAM5_ATI;
	public static final int GL_VERTEX_STREAM6_ATI = javax.media.opengl.GL.GL_VERTEX_STREAM6_ATI;
	public static final int GL_VERTEX_STREAM7_ATI = javax.media.opengl.GL.GL_VERTEX_STREAM7_ATI;
	public static final int GL_VERTEX_SOURCE_ATI = javax.media.opengl.GL.GL_VERTEX_SOURCE_ATI;
	public static final int GL_ELEMENT_ARRAY_ATI = javax.media.opengl.GL.GL_ELEMENT_ARRAY_ATI;
	public static final int GL_ELEMENT_ARRAY_TYPE_ATI = javax.media.opengl.GL.GL_ELEMENT_ARRAY_TYPE_ATI;
	public static final int GL_ELEMENT_ARRAY_POINTER_ATI = javax.media.opengl.GL.GL_ELEMENT_ARRAY_POINTER_ATI;
	public static final int GL_QUAD_MESH_SUN = javax.media.opengl.GL.GL_QUAD_MESH_SUN;
	public static final int GL_TRIANGLE_MESH_SUN = javax.media.opengl.GL.GL_TRIANGLE_MESH_SUN;
	public static final int GL_SLICE_ACCUM_SUN = javax.media.opengl.GL.GL_SLICE_ACCUM_SUN;
	public static final int GL_MULTISAMPLE_FILTER_HINT_NV = javax.media.opengl.GL.GL_MULTISAMPLE_FILTER_HINT_NV;
	public static final int GL_DEPTH_CLAMP_NV = javax.media.opengl.GL.GL_DEPTH_CLAMP_NV;
	public static final int GL_PIXEL_COUNTER_BITS_NV = javax.media.opengl.GL.GL_PIXEL_COUNTER_BITS_NV;
	public static final int GL_CURRENT_OCCLUSION_QUERY_ID_NV = javax.media.opengl.GL.GL_CURRENT_OCCLUSION_QUERY_ID_NV;
	public static final int GL_PIXEL_COUNT_NV = javax.media.opengl.GL.GL_PIXEL_COUNT_NV;
	public static final int GL_PIXEL_COUNT_AVAILABLE_NV = javax.media.opengl.GL.GL_PIXEL_COUNT_AVAILABLE_NV;
	public static final int GL_POINT_SPRITE_NV = javax.media.opengl.GL.GL_POINT_SPRITE_NV;
	public static final int GL_COORD_REPLACE_NV = javax.media.opengl.GL.GL_COORD_REPLACE_NV;
	public static final int GL_POINT_SPRITE_R_MODE_NV = javax.media.opengl.GL.GL_POINT_SPRITE_R_MODE_NV;
	public static final int GL_OFFSET_PROJECTIVE_TEXTURE_2D_NV = javax.media.opengl.GL.GL_OFFSET_PROJECTIVE_TEXTURE_2D_NV;
	public static final int GL_OFFSET_PROJECTIVE_TEXTURE_2D_SCALE_NV = javax.media.opengl.GL.GL_OFFSET_PROJECTIVE_TEXTURE_2D_SCALE_NV;
	public static final int GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_NV = javax.media.opengl.GL.GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_NV;
	public static final int GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_SCALE_NV = javax.media.opengl.GL.GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_SCALE_NV;
	public static final int GL_OFFSET_HILO_TEXTURE_2D_NV = javax.media.opengl.GL.GL_OFFSET_HILO_TEXTURE_2D_NV;
	public static final int GL_OFFSET_HILO_TEXTURE_RECTANGLE_NV = javax.media.opengl.GL.GL_OFFSET_HILO_TEXTURE_RECTANGLE_NV;
	public static final int GL_OFFSET_HILO_PROJECTIVE_TEXTURE_2D_NV = javax.media.opengl.GL.GL_OFFSET_HILO_PROJECTIVE_TEXTURE_2D_NV;
	public static final int GL_OFFSET_HILO_PROJECTIVE_TEXTURE_RECTANGLE_NV = javax.media.opengl.GL.GL_OFFSET_HILO_PROJECTIVE_TEXTURE_RECTANGLE_NV;
	public static final int GL_DEPENDENT_HILO_TEXTURE_2D_NV = javax.media.opengl.GL.GL_DEPENDENT_HILO_TEXTURE_2D_NV;
	public static final int GL_DEPENDENT_RGB_TEXTURE_3D_NV = javax.media.opengl.GL.GL_DEPENDENT_RGB_TEXTURE_3D_NV;
	public static final int GL_DEPENDENT_RGB_TEXTURE_CUBE_MAP_NV = javax.media.opengl.GL.GL_DEPENDENT_RGB_TEXTURE_CUBE_MAP_NV;
	public static final int GL_DOT_PRODUCT_PASS_THROUGH_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_PASS_THROUGH_NV;
	public static final int GL_DOT_PRODUCT_TEXTURE_1D_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_TEXTURE_1D_NV;
	public static final int GL_DOT_PRODUCT_AFFINE_DEPTH_REPLACE_NV = javax.media.opengl.GL.GL_DOT_PRODUCT_AFFINE_DEPTH_REPLACE_NV;
	public static final int GL_HILO8_NV = javax.media.opengl.GL.GL_HILO8_NV;
	public static final int GL_SIGNED_HILO8_NV = javax.media.opengl.GL.GL_SIGNED_HILO8_NV;
	public static final int GL_FORCE_BLUE_TO_ONE_NV = javax.media.opengl.GL.GL_FORCE_BLUE_TO_ONE_NV;
	public static final int GL_STENCIL_TEST_TWO_SIDE_EXT = javax.media.opengl.GL.GL_STENCIL_TEST_TWO_SIDE_EXT;
	public static final int GL_ACTIVE_STENCIL_FACE_EXT = javax.media.opengl.GL.GL_ACTIVE_STENCIL_FACE_EXT;
	public static final int GL_TEXT_FRAGMENT_SHADER_ATI = javax.media.opengl.GL.GL_TEXT_FRAGMENT_SHADER_ATI;
	public static final int GL_UNPACK_CLIENT_STORAGE_APPLE = javax.media.opengl.GL.GL_UNPACK_CLIENT_STORAGE_APPLE;
	public static final int GL_ELEMENT_ARRAY_APPLE = javax.media.opengl.GL.GL_ELEMENT_ARRAY_APPLE;
	public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = javax.media.opengl.GL.GL_ELEMENT_ARRAY_TYPE_APPLE;
	public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = javax.media.opengl.GL.GL_ELEMENT_ARRAY_POINTER_APPLE;
	public static final int GL_DRAW_PIXELS_APPLE = javax.media.opengl.GL.GL_DRAW_PIXELS_APPLE;
	public static final int GL_FENCE_APPLE = javax.media.opengl.GL.GL_FENCE_APPLE;
	public static final int GL_VERTEX_ARRAY_BINDING_APPLE = javax.media.opengl.GL.GL_VERTEX_ARRAY_BINDING_APPLE;
	public static final int GL_VERTEX_ARRAY_RANGE_APPLE = javax.media.opengl.GL.GL_VERTEX_ARRAY_RANGE_APPLE;
	public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE = javax.media.opengl.GL.GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE;
	public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_APPLE = javax.media.opengl.GL.GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_APPLE;
	public static final int GL_VERTEX_ARRAY_RANGE_POINTER_APPLE = javax.media.opengl.GL.GL_VERTEX_ARRAY_RANGE_POINTER_APPLE;
	public static final int GL_VERTEX_ARRAY_STORAGE_HINT_APPLE = javax.media.opengl.GL.GL_VERTEX_ARRAY_STORAGE_HINT_APPLE;
	public static final int GL_STORAGE_PRIVATE_APPLE = javax.media.opengl.GL.GL_STORAGE_PRIVATE_APPLE;
	public static final int GL_STORAGE_CACHED_APPLE = javax.media.opengl.GL.GL_STORAGE_CACHED_APPLE;
	public static final int GL_STORAGE_SHARED_APPLE = javax.media.opengl.GL.GL_STORAGE_SHARED_APPLE;
	public static final int GL_YCBCR_422_APPLE = javax.media.opengl.GL.GL_YCBCR_422_APPLE;
	public static final int GL_UNSIGNED_SHORT_8_8_APPLE = javax.media.opengl.GL.GL_UNSIGNED_SHORT_8_8_APPLE;
	public static final int GL_UNSIGNED_SHORT_8_8_REV_APPLE = javax.media.opengl.GL.GL_UNSIGNED_SHORT_8_8_REV_APPLE;
	public static final int GL_RGB_S3TC = javax.media.opengl.GL.GL_RGB_S3TC;
	public static final int GL_RGB4_S3TC = javax.media.opengl.GL.GL_RGB4_S3TC;
	public static final int GL_RGBA_S3TC = javax.media.opengl.GL.GL_RGBA_S3TC;
	public static final int GL_RGBA4_S3TC = javax.media.opengl.GL.GL_RGBA4_S3TC;
	public static final int GL_MAX_DRAW_BUFFERS_ATI = javax.media.opengl.GL.GL_MAX_DRAW_BUFFERS_ATI;
	public static final int GL_DRAW_BUFFER0_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER0_ATI;
	public static final int GL_DRAW_BUFFER1_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER1_ATI;
	public static final int GL_DRAW_BUFFER2_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER2_ATI;
	public static final int GL_DRAW_BUFFER3_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER3_ATI;
	public static final int GL_DRAW_BUFFER4_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER4_ATI;
	public static final int GL_DRAW_BUFFER5_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER5_ATI;
	public static final int GL_DRAW_BUFFER6_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER6_ATI;
	public static final int GL_DRAW_BUFFER7_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER7_ATI;
	public static final int GL_DRAW_BUFFER8_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER8_ATI;
	public static final int GL_DRAW_BUFFER9_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER9_ATI;
	public static final int GL_DRAW_BUFFER10_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER10_ATI;
	public static final int GL_DRAW_BUFFER11_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER11_ATI;
	public static final int GL_DRAW_BUFFER12_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER12_ATI;
	public static final int GL_DRAW_BUFFER13_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER13_ATI;
	public static final int GL_DRAW_BUFFER14_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER14_ATI;
	public static final int GL_DRAW_BUFFER15_ATI = javax.media.opengl.GL.GL_DRAW_BUFFER15_ATI;
	public static final int GL_TYPE_RGBA_FLOAT_ATI = javax.media.opengl.GL.GL_TYPE_RGBA_FLOAT_ATI;
	public static final int GL_COLOR_CLEAR_UNCLAMPED_VALUE_ATI = javax.media.opengl.GL.GL_COLOR_CLEAR_UNCLAMPED_VALUE_ATI;
	public static final int GL_MODULATE_ADD_ATI = javax.media.opengl.GL.GL_MODULATE_ADD_ATI;
	public static final int GL_MODULATE_SIGNED_ADD_ATI = javax.media.opengl.GL.GL_MODULATE_SIGNED_ADD_ATI;
	public static final int GL_MODULATE_SUBTRACT_ATI = javax.media.opengl.GL.GL_MODULATE_SUBTRACT_ATI;
	public static final int GL_RGBA_FLOAT32_ATI = javax.media.opengl.GL.GL_RGBA_FLOAT32_ATI;
	public static final int GL_RGB_FLOAT32_ATI = javax.media.opengl.GL.GL_RGB_FLOAT32_ATI;
	public static final int GL_ALPHA_FLOAT32_ATI = javax.media.opengl.GL.GL_ALPHA_FLOAT32_ATI;
	public static final int GL_INTENSITY_FLOAT32_ATI = javax.media.opengl.GL.GL_INTENSITY_FLOAT32_ATI;
	public static final int GL_LUMINANCE_FLOAT32_ATI = javax.media.opengl.GL.GL_LUMINANCE_FLOAT32_ATI;
	public static final int GL_LUMINANCE_ALPHA_FLOAT32_ATI = javax.media.opengl.GL.GL_LUMINANCE_ALPHA_FLOAT32_ATI;
	public static final int GL_RGBA_FLOAT16_ATI = javax.media.opengl.GL.GL_RGBA_FLOAT16_ATI;
	public static final int GL_RGB_FLOAT16_ATI = javax.media.opengl.GL.GL_RGB_FLOAT16_ATI;
	public static final int GL_ALPHA_FLOAT16_ATI = javax.media.opengl.GL.GL_ALPHA_FLOAT16_ATI;
	public static final int GL_INTENSITY_FLOAT16_ATI = javax.media.opengl.GL.GL_INTENSITY_FLOAT16_ATI;
	public static final int GL_LUMINANCE_FLOAT16_ATI = javax.media.opengl.GL.GL_LUMINANCE_FLOAT16_ATI;
	public static final int GL_LUMINANCE_ALPHA_FLOAT16_ATI = javax.media.opengl.GL.GL_LUMINANCE_ALPHA_FLOAT16_ATI;
	public static final int GL_FLOAT_R_NV = javax.media.opengl.GL.GL_FLOAT_R_NV;
	public static final int GL_FLOAT_RG_NV = javax.media.opengl.GL.GL_FLOAT_RG_NV;
	public static final int GL_FLOAT_RGB_NV = javax.media.opengl.GL.GL_FLOAT_RGB_NV;
	public static final int GL_FLOAT_RGBA_NV = javax.media.opengl.GL.GL_FLOAT_RGBA_NV;
	public static final int GL_FLOAT_R16_NV = javax.media.opengl.GL.GL_FLOAT_R16_NV;
	public static final int GL_FLOAT_R32_NV = javax.media.opengl.GL.GL_FLOAT_R32_NV;
	public static final int GL_FLOAT_RG16_NV = javax.media.opengl.GL.GL_FLOAT_RG16_NV;
	public static final int GL_FLOAT_RG32_NV = javax.media.opengl.GL.GL_FLOAT_RG32_NV;
	public static final int GL_FLOAT_RGB16_NV = javax.media.opengl.GL.GL_FLOAT_RGB16_NV;
	public static final int GL_FLOAT_RGB32_NV = javax.media.opengl.GL.GL_FLOAT_RGB32_NV;
	public static final int GL_FLOAT_RGBA16_NV = javax.media.opengl.GL.GL_FLOAT_RGBA16_NV;
	public static final int GL_FLOAT_RGBA32_NV = javax.media.opengl.GL.GL_FLOAT_RGBA32_NV;
	public static final int GL_TEXTURE_FLOAT_COMPONENTS_NV = javax.media.opengl.GL.GL_TEXTURE_FLOAT_COMPONENTS_NV;
	public static final int GL_FLOAT_CLEAR_COLOR_VALUE_NV = javax.media.opengl.GL.GL_FLOAT_CLEAR_COLOR_VALUE_NV;
	public static final int GL_FLOAT_RGBA_MODE_NV = javax.media.opengl.GL.GL_FLOAT_RGBA_MODE_NV;
	public static final int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = javax.media.opengl.GL.GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV;
	public static final int GL_FRAGMENT_PROGRAM_NV = javax.media.opengl.GL.GL_FRAGMENT_PROGRAM_NV;
	public static final int GL_MAX_TEXTURE_COORDS_NV = javax.media.opengl.GL.GL_MAX_TEXTURE_COORDS_NV;
	public static final int GL_MAX_TEXTURE_IMAGE_UNITS_NV = javax.media.opengl.GL.GL_MAX_TEXTURE_IMAGE_UNITS_NV;
	public static final int GL_FRAGMENT_PROGRAM_BINDING_NV = javax.media.opengl.GL.GL_FRAGMENT_PROGRAM_BINDING_NV;
	public static final int GL_PROGRAM_ERROR_STRING_NV = javax.media.opengl.GL.GL_PROGRAM_ERROR_STRING_NV;
	public static final int GL_HALF_FLOAT_NV = javax.media.opengl.GL.GL_HALF_FLOAT_NV;
	public static final int GL_WRITE_PIXEL_DATA_RANGE_NV = javax.media.opengl.GL.GL_WRITE_PIXEL_DATA_RANGE_NV;
	public static final int GL_READ_PIXEL_DATA_RANGE_NV = javax.media.opengl.GL.GL_READ_PIXEL_DATA_RANGE_NV;
	public static final int GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = javax.media.opengl.GL.GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV;
	public static final int GL_READ_PIXEL_DATA_RANGE_LENGTH_NV = javax.media.opengl.GL.GL_READ_PIXEL_DATA_RANGE_LENGTH_NV;
	public static final int GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = javax.media.opengl.GL.GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV;
	public static final int GL_READ_PIXEL_DATA_RANGE_POINTER_NV = javax.media.opengl.GL.GL_READ_PIXEL_DATA_RANGE_POINTER_NV;
	public static final int GL_PRIMITIVE_RESTART_NV = javax.media.opengl.GL.GL_PRIMITIVE_RESTART_NV;
	public static final int GL_PRIMITIVE_RESTART_INDEX_NV = javax.media.opengl.GL.GL_PRIMITIVE_RESTART_INDEX_NV;
	public static final int GL_TEXTURE_UNSIGNED_REMAP_MODE_NV = javax.media.opengl.GL.GL_TEXTURE_UNSIGNED_REMAP_MODE_NV;
	public static final int GL_STENCIL_BACK_FUNC_ATI = javax.media.opengl.GL.GL_STENCIL_BACK_FUNC_ATI;
	public static final int GL_STENCIL_BACK_FAIL_ATI = javax.media.opengl.GL.GL_STENCIL_BACK_FAIL_ATI;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI = javax.media.opengl.GL.GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI = javax.media.opengl.GL.GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI;
	public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE_OES = javax.media.opengl.GL.GL_IMPLEMENTATION_COLOR_READ_TYPE_OES;
	public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES = javax.media.opengl.GL.GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES;
	public static final int GL_DEPTH_BOUNDS_TEST_EXT = javax.media.opengl.GL.GL_DEPTH_BOUNDS_TEST_EXT;
	public static final int GL_DEPTH_BOUNDS_EXT = javax.media.opengl.GL.GL_DEPTH_BOUNDS_EXT;
	public static final int GL_MIRROR_CLAMP_EXT = javax.media.opengl.GL.GL_MIRROR_CLAMP_EXT;
	public static final int GL_MIRROR_CLAMP_TO_EDGE_EXT = javax.media.opengl.GL.GL_MIRROR_CLAMP_TO_EDGE_EXT;
	public static final int GL_MIRROR_CLAMP_TO_BORDER_EXT = javax.media.opengl.GL.GL_MIRROR_CLAMP_TO_BORDER_EXT;
	public static final int GL_BLEND_EQUATION_RGB_EXT = javax.media.opengl.GL.GL_BLEND_EQUATION_RGB_EXT;
	public static final int GL_BLEND_EQUATION_ALPHA_EXT = javax.media.opengl.GL.GL_BLEND_EQUATION_ALPHA_EXT;
	public static final int GL_PACK_INVERT_MESA = javax.media.opengl.GL.GL_PACK_INVERT_MESA;
	public static final int GL_UNSIGNED_SHORT_8_8_MESA = javax.media.opengl.GL.GL_UNSIGNED_SHORT_8_8_MESA;
	public static final int GL_UNSIGNED_SHORT_8_8_REV_MESA = javax.media.opengl.GL.GL_UNSIGNED_SHORT_8_8_REV_MESA;
	public static final int GL_YCBCR_MESA = javax.media.opengl.GL.GL_YCBCR_MESA;
	public static final int GL_PIXEL_PACK_BUFFER_EXT = javax.media.opengl.GL.GL_PIXEL_PACK_BUFFER_EXT;
	public static final int GL_PIXEL_UNPACK_BUFFER_EXT = javax.media.opengl.GL.GL_PIXEL_UNPACK_BUFFER_EXT;
	public static final int GL_PIXEL_PACK_BUFFER_BINDING_EXT = javax.media.opengl.GL.GL_PIXEL_PACK_BUFFER_BINDING_EXT;
	public static final int GL_PIXEL_UNPACK_BUFFER_BINDING_EXT = javax.media.opengl.GL.GL_PIXEL_UNPACK_BUFFER_BINDING_EXT;
	public static final int GL_MAX_PROGRAM_EXEC_INSTRUCTIONS_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_EXEC_INSTRUCTIONS_NV;
	public static final int GL_MAX_PROGRAM_CALL_DEPTH_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_CALL_DEPTH_NV;
	public static final int GL_MAX_PROGRAM_IF_DEPTH_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_IF_DEPTH_NV;
	public static final int GL_MAX_PROGRAM_LOOP_DEPTH_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_LOOP_DEPTH_NV;
	public static final int GL_MAX_PROGRAM_LOOP_COUNT_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_LOOP_COUNT_NV;
	public static final int GL_INVALID_FRAMEBUFFER_OPERATION_EXT = javax.media.opengl.GL.GL_INVALID_FRAMEBUFFER_OPERATION_EXT;
	public static final int GL_MAX_RENDERBUFFER_SIZE_EXT = javax.media.opengl.GL.GL_MAX_RENDERBUFFER_SIZE_EXT;
	public static final int GL_FRAMEBUFFER_BINDING_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_BINDING_EXT;
	public static final int GL_RENDERBUFFER_BINDING_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_BINDING_EXT;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT;
	public static final int GL_FRAMEBUFFER_COMPLETE_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_COMPLETE_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_DUPLICATE_ATTACHMENT_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_DUPLICATE_ATTACHMENT_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT;
	public static final int GL_FRAMEBUFFER_UNSUPPORTED_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_UNSUPPORTED_EXT;
	public static final int GL_MAX_COLOR_ATTACHMENTS_EXT = javax.media.opengl.GL.GL_MAX_COLOR_ATTACHMENTS_EXT;
	public static final int GL_COLOR_ATTACHMENT0_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT0_EXT;
	public static final int GL_COLOR_ATTACHMENT1_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT1_EXT;
	public static final int GL_COLOR_ATTACHMENT2_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT2_EXT;
	public static final int GL_COLOR_ATTACHMENT3_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT3_EXT;
	public static final int GL_COLOR_ATTACHMENT4_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT4_EXT;
	public static final int GL_COLOR_ATTACHMENT5_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT5_EXT;
	public static final int GL_COLOR_ATTACHMENT6_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT6_EXT;
	public static final int GL_COLOR_ATTACHMENT7_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT7_EXT;
	public static final int GL_COLOR_ATTACHMENT8_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT8_EXT;
	public static final int GL_COLOR_ATTACHMENT9_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT9_EXT;
	public static final int GL_COLOR_ATTACHMENT10_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT10_EXT;
	public static final int GL_COLOR_ATTACHMENT11_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT11_EXT;
	public static final int GL_COLOR_ATTACHMENT12_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT12_EXT;
	public static final int GL_COLOR_ATTACHMENT13_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT13_EXT;
	public static final int GL_COLOR_ATTACHMENT14_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT14_EXT;
	public static final int GL_COLOR_ATTACHMENT15_EXT = javax.media.opengl.GL.GL_COLOR_ATTACHMENT15_EXT;
	public static final int GL_DEPTH_ATTACHMENT_EXT = javax.media.opengl.GL.GL_DEPTH_ATTACHMENT_EXT;
	public static final int GL_STENCIL_ATTACHMENT_EXT = javax.media.opengl.GL.GL_STENCIL_ATTACHMENT_EXT;
	public static final int GL_FRAMEBUFFER_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_EXT;
	public static final int GL_RENDERBUFFER_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_EXT;
	public static final int GL_RENDERBUFFER_WIDTH_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_WIDTH_EXT;
	public static final int GL_RENDERBUFFER_HEIGHT_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_HEIGHT_EXT;
	public static final int GL_RENDERBUFFER_INTERNAL_FORMAT_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_INTERNAL_FORMAT_EXT;
	public static final int GL_STENCIL_INDEX1_EXT = javax.media.opengl.GL.GL_STENCIL_INDEX1_EXT;
	public static final int GL_STENCIL_INDEX4_EXT = javax.media.opengl.GL.GL_STENCIL_INDEX4_EXT;
	public static final int GL_STENCIL_INDEX8_EXT = javax.media.opengl.GL.GL_STENCIL_INDEX8_EXT;
	public static final int GL_STENCIL_INDEX16_EXT = javax.media.opengl.GL.GL_STENCIL_INDEX16_EXT;
	public static final int GL_RENDERBUFFER_RED_SIZE_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_RED_SIZE_EXT;
	public static final int GL_RENDERBUFFER_GREEN_SIZE_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_GREEN_SIZE_EXT;
	public static final int GL_RENDERBUFFER_BLUE_SIZE_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_BLUE_SIZE_EXT;
	public static final int GL_RENDERBUFFER_ALPHA_SIZE_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_ALPHA_SIZE_EXT;
	public static final int GL_RENDERBUFFER_DEPTH_SIZE_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_DEPTH_SIZE_EXT;
	public static final int GL_RENDERBUFFER_STENCIL_SIZE_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_STENCIL_SIZE_EXT;
	public static final int GL_DEPTH_STENCIL_EXT = javax.media.opengl.GL.GL_DEPTH_STENCIL_EXT;
	public static final int GL_UNSIGNED_INT_24_8_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_24_8_EXT;
	public static final int GL_DEPTH24_STENCIL8_EXT = javax.media.opengl.GL.GL_DEPTH24_STENCIL8_EXT;
	public static final int GL_TEXTURE_STENCIL_SIZE_EXT = javax.media.opengl.GL.GL_TEXTURE_STENCIL_SIZE_EXT;
	public static final int GL_STENCIL_TAG_BITS_EXT = javax.media.opengl.GL.GL_STENCIL_TAG_BITS_EXT;
	public static final int GL_STENCIL_CLEAR_TAG_VALUE_EXT = javax.media.opengl.GL.GL_STENCIL_CLEAR_TAG_VALUE_EXT;
	public static final int GL_SRGB_EXT = javax.media.opengl.GL.GL_SRGB_EXT;
	public static final int GL_SRGB8_EXT = javax.media.opengl.GL.GL_SRGB8_EXT;
	public static final int GL_SRGB_ALPHA_EXT = javax.media.opengl.GL.GL_SRGB_ALPHA_EXT;
	public static final int GL_SRGB8_ALPHA8_EXT = javax.media.opengl.GL.GL_SRGB8_ALPHA8_EXT;
	public static final int GL_SLUMINANCE_ALPHA_EXT = javax.media.opengl.GL.GL_SLUMINANCE_ALPHA_EXT;
	public static final int GL_SLUMINANCE8_ALPHA8_EXT = javax.media.opengl.GL.GL_SLUMINANCE8_ALPHA8_EXT;
	public static final int GL_SLUMINANCE_EXT = javax.media.opengl.GL.GL_SLUMINANCE_EXT;
	public static final int GL_SLUMINANCE8_EXT = javax.media.opengl.GL.GL_SLUMINANCE8_EXT;
	public static final int GL_COMPRESSED_SRGB_EXT = javax.media.opengl.GL.GL_COMPRESSED_SRGB_EXT;
	public static final int GL_COMPRESSED_SRGB_ALPHA_EXT = javax.media.opengl.GL.GL_COMPRESSED_SRGB_ALPHA_EXT;
	public static final int GL_COMPRESSED_SLUMINANCE_EXT = javax.media.opengl.GL.GL_COMPRESSED_SLUMINANCE_EXT;
	public static final int GL_COMPRESSED_SLUMINANCE_ALPHA_EXT = javax.media.opengl.GL.GL_COMPRESSED_SLUMINANCE_ALPHA_EXT;
	public static final int GL_COMPRESSED_SRGB_S3TC_DXT1_EXT = javax.media.opengl.GL.GL_COMPRESSED_SRGB_S3TC_DXT1_EXT;
	public static final int GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT = javax.media.opengl.GL.GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT;
	public static final int GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT = javax.media.opengl.GL.GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT;
	public static final int GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT = javax.media.opengl.GL.GL_COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT;
	public static final int GL_READ_FRAMEBUFFER_EXT = javax.media.opengl.GL.GL_READ_FRAMEBUFFER_EXT;
	public static final int GL_DRAW_FRAMEBUFFER_EXT = javax.media.opengl.GL.GL_DRAW_FRAMEBUFFER_EXT;
	public static final int GL_READ_FRAMEBUFFER_BINDING_EXT = javax.media.opengl.GL.GL_READ_FRAMEBUFFER_BINDING_EXT;
	public static final int GL_DRAW_FRAMEBUFFER_BINDING_EXT = javax.media.opengl.GL.GL_DRAW_FRAMEBUFFER_BINDING_EXT;
	public static final int GL_RENDERBUFFER_SAMPLES_EXT = javax.media.opengl.GL.GL_RENDERBUFFER_SAMPLES_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT;
	public static final int GL_MAX_SAMPLES_EXT = javax.media.opengl.GL.GL_MAX_SAMPLES_EXT;
	public static final int GL_TEXTURE_1D_STACK_MESAX = javax.media.opengl.GL.GL_TEXTURE_1D_STACK_MESAX;
	public static final int GL_TEXTURE_2D_STACK_MESAX = javax.media.opengl.GL.GL_TEXTURE_2D_STACK_MESAX;
	public static final int GL_PROXY_TEXTURE_1D_STACK_MESAX = javax.media.opengl.GL.GL_PROXY_TEXTURE_1D_STACK_MESAX;
	public static final int GL_PROXY_TEXTURE_2D_STACK_MESAX = javax.media.opengl.GL.GL_PROXY_TEXTURE_2D_STACK_MESAX;
	public static final int GL_TEXTURE_1D_STACK_BINDING_MESAX = javax.media.opengl.GL.GL_TEXTURE_1D_STACK_BINDING_MESAX;
	public static final int GL_TEXTURE_2D_STACK_BINDING_MESAX = javax.media.opengl.GL.GL_TEXTURE_2D_STACK_BINDING_MESAX;
	public static final int GL_TIME_ELAPSED_EXT = javax.media.opengl.GL.GL_TIME_ELAPSED_EXT;
	public static final int GL_BUFFER_SERIALIZED_MODIFY_APPLE = javax.media.opengl.GL.GL_BUFFER_SERIALIZED_MODIFY_APPLE;
	public static final int GL_BUFFER_FLUSHING_UNMAP_APPLE = javax.media.opengl.GL.GL_BUFFER_FLUSHING_UNMAP_APPLE;
	public static final int GL_CG_VERTEX_SHADER_EXT = javax.media.opengl.GL.GL_CG_VERTEX_SHADER_EXT;
	public static final int GL_CG_FRAGMENT_SHADER_EXT = javax.media.opengl.GL.GL_CG_FRAGMENT_SHADER_EXT;
	public static final int GL_TEXTURE_BUFFER_EXT = javax.media.opengl.GL.GL_TEXTURE_BUFFER_EXT;
	public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = javax.media.opengl.GL.GL_MAX_TEXTURE_BUFFER_SIZE_EXT;
	public static final int GL_TEXTURE_BINDING_BUFFER_EXT = javax.media.opengl.GL.GL_TEXTURE_BINDING_BUFFER_EXT;
	public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = javax.media.opengl.GL.GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT;
	public static final int GL_TEXTURE_BUFFER_FORMAT_EXT = javax.media.opengl.GL.GL_TEXTURE_BUFFER_FORMAT_EXT;
	public static final int GL_SAMPLER_1D_ARRAY_EXT = javax.media.opengl.GL.GL_SAMPLER_1D_ARRAY_EXT;
	public static final int GL_SAMPLER_2D_ARRAY_EXT = javax.media.opengl.GL.GL_SAMPLER_2D_ARRAY_EXT;
	public static final int GL_SAMPLER_BUFFER_EXT = javax.media.opengl.GL.GL_SAMPLER_BUFFER_EXT;
	public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = javax.media.opengl.GL.GL_SAMPLER_1D_ARRAY_SHADOW_EXT;
	public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = javax.media.opengl.GL.GL_SAMPLER_2D_ARRAY_SHADOW_EXT;
	public static final int GL_SAMPLER_CUBE_SHADOW_EXT = javax.media.opengl.GL.GL_SAMPLER_CUBE_SHADOW_EXT;
	public static final int GL_UNSIGNED_INT_VEC2_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_VEC2_EXT;
	public static final int GL_UNSIGNED_INT_VEC3_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_VEC3_EXT;
	public static final int GL_UNSIGNED_INT_VEC4_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_VEC4_EXT;
	public static final int GL_INT_SAMPLER_1D_EXT = javax.media.opengl.GL.GL_INT_SAMPLER_1D_EXT;
	public static final int GL_INT_SAMPLER_2D_EXT = javax.media.opengl.GL.GL_INT_SAMPLER_2D_EXT;
	public static final int GL_INT_SAMPLER_3D_EXT = javax.media.opengl.GL.GL_INT_SAMPLER_3D_EXT;
	public static final int GL_INT_SAMPLER_CUBE_EXT = javax.media.opengl.GL.GL_INT_SAMPLER_CUBE_EXT;
	public static final int GL_INT_SAMPLER_2D_RECT_EXT = javax.media.opengl.GL.GL_INT_SAMPLER_2D_RECT_EXT;
	public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = javax.media.opengl.GL.GL_INT_SAMPLER_1D_ARRAY_EXT;
	public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = javax.media.opengl.GL.GL_INT_SAMPLER_2D_ARRAY_EXT;
	public static final int GL_INT_SAMPLER_BUFFER_EXT = javax.media.opengl.GL.GL_INT_SAMPLER_BUFFER_EXT;
	public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_SAMPLER_1D_EXT;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_SAMPLER_2D_EXT;
	public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_SAMPLER_3D_EXT;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_SAMPLER_CUBE_EXT;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT;
	public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT;
	public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT;
	public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = javax.media.opengl.GL.GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT;
	public static final int GL_GEOMETRY_SHADER_EXT = javax.media.opengl.GL.GL_GEOMETRY_SHADER_EXT;
	public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT = javax.media.opengl.GL.GL_MAX_GEOMETRY_VARYING_COMPONENTS_EXT;
	public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_EXT = javax.media.opengl.GL.GL_MAX_VERTEX_VARYING_COMPONENTS_EXT;
	public static final int GL_MAX_VARYING_COMPONENTS_EXT = javax.media.opengl.GL.GL_MAX_VARYING_COMPONENTS_EXT;
	public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT = javax.media.opengl.GL.GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_EXT;
	public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT = javax.media.opengl.GL.GL_MAX_GEOMETRY_OUTPUT_VERTICES_EXT;
	public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT = javax.media.opengl.GL.GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_EXT;
	public static final int GL_GEOMETRY_VERTICES_OUT_EXT = javax.media.opengl.GL.GL_GEOMETRY_VERTICES_OUT_EXT;
	public static final int GL_GEOMETRY_INPUT_TYPE_EXT = javax.media.opengl.GL.GL_GEOMETRY_INPUT_TYPE_EXT;
	public static final int GL_GEOMETRY_OUTPUT_TYPE_EXT = javax.media.opengl.GL.GL_GEOMETRY_OUTPUT_TYPE_EXT;
	public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT = javax.media.opengl.GL.GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_EXT;
	public static final int GL_LINES_ADJACENCY_EXT = javax.media.opengl.GL.GL_LINES_ADJACENCY_EXT;
	public static final int GL_LINE_STRIP_ADJACENCY_EXT = javax.media.opengl.GL.GL_LINE_STRIP_ADJACENCY_EXT;
	public static final int GL_TRIANGLES_ADJACENCY_EXT = javax.media.opengl.GL.GL_TRIANGLES_ADJACENCY_EXT;
	public static final int GL_TRIANGLE_STRIP_ADJACENCY_EXT = javax.media.opengl.GL.GL_TRIANGLE_STRIP_ADJACENCY_EXT;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_ATTACHMENT_LAYERED_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_EXT;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_EXT;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT;
	public static final int GL_PROGRAM_POINT_SIZE_EXT = javax.media.opengl.GL.GL_PROGRAM_POINT_SIZE_EXT;
	public static final int GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT = javax.media.opengl.GL.GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT;
	public static final int GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = javax.media.opengl.GL.GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT;
	public static final int GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = javax.media.opengl.GL.GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT;
	public static final int GL_MAX_BINDABLE_UNIFORM_SIZE_EXT = javax.media.opengl.GL.GL_MAX_BINDABLE_UNIFORM_SIZE_EXT;
	public static final int GL_UNIFORM_BUFFER_EXT = javax.media.opengl.GL.GL_UNIFORM_BUFFER_EXT;
	public static final int GL_UNIFORM_BUFFER_BINDING_EXT = javax.media.opengl.GL.GL_UNIFORM_BUFFER_BINDING_EXT;
	public static final int GL_FRAMEBUFFER_SRGB_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_SRGB_EXT;
	public static final int GL_FRAMEBUFFER_SRGB_CAPABLE_EXT = javax.media.opengl.GL.GL_FRAMEBUFFER_SRGB_CAPABLE_EXT;
	public static final int GL_RGB9_E5_EXT = javax.media.opengl.GL.GL_RGB9_E5_EXT;
	public static final int GL_UNSIGNED_INT_5_9_9_9_REV_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_5_9_9_9_REV_EXT;
	public static final int GL_TEXTURE_SHARED_SIZE_EXT = javax.media.opengl.GL.GL_TEXTURE_SHARED_SIZE_EXT;
	public static final int GL_R11F_G11F_B10F_EXT = javax.media.opengl.GL.GL_R11F_G11F_B10F_EXT;
	public static final int GL_UNSIGNED_INT_10F_11F_11F_REV_EXT = javax.media.opengl.GL.GL_UNSIGNED_INT_10F_11F_11F_REV_EXT;
	public static final int GL_RGBA_SIGNED_COMPONENTS_EXT = javax.media.opengl.GL.GL_RGBA_SIGNED_COMPONENTS_EXT;
	public static final int GL_TEXTURE_1D_ARRAY_EXT = javax.media.opengl.GL.GL_TEXTURE_1D_ARRAY_EXT;
	public static final int GL_PROXY_TEXTURE_1D_ARRAY_EXT = javax.media.opengl.GL.GL_PROXY_TEXTURE_1D_ARRAY_EXT;
	public static final int GL_TEXTURE_2D_ARRAY_EXT = javax.media.opengl.GL.GL_TEXTURE_2D_ARRAY_EXT;
	public static final int GL_PROXY_TEXTURE_2D_ARRAY_EXT = javax.media.opengl.GL.GL_PROXY_TEXTURE_2D_ARRAY_EXT;
	public static final int GL_TEXTURE_BINDING_1D_ARRAY_EXT = javax.media.opengl.GL.GL_TEXTURE_BINDING_1D_ARRAY_EXT;
	public static final int GL_TEXTURE_BINDING_2D_ARRAY_EXT = javax.media.opengl.GL.GL_TEXTURE_BINDING_2D_ARRAY_EXT;
	public static final int GL_MAX_ARRAY_TEXTURE_LAYERS_EXT = javax.media.opengl.GL.GL_MAX_ARRAY_TEXTURE_LAYERS_EXT;
	public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT = javax.media.opengl.GL.GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT;
	public static final int GL_RGBA32UI_EXT = javax.media.opengl.GL.GL_RGBA32UI_EXT;
	public static final int GL_RGB32UI_EXT = javax.media.opengl.GL.GL_RGB32UI_EXT;
	public static final int GL_ALPHA32UI_EXT = javax.media.opengl.GL.GL_ALPHA32UI_EXT;
	public static final int GL_INTENSITY32UI_EXT = javax.media.opengl.GL.GL_INTENSITY32UI_EXT;
	public static final int GL_LUMINANCE32UI_EXT = javax.media.opengl.GL.GL_LUMINANCE32UI_EXT;
	public static final int GL_LUMINANCE_ALPHA32UI_EXT = javax.media.opengl.GL.GL_LUMINANCE_ALPHA32UI_EXT;
	public static final int GL_RGBA16UI_EXT = javax.media.opengl.GL.GL_RGBA16UI_EXT;
	public static final int GL_RGB16UI_EXT = javax.media.opengl.GL.GL_RGB16UI_EXT;
	public static final int GL_ALPHA16UI_EXT = javax.media.opengl.GL.GL_ALPHA16UI_EXT;
	public static final int GL_INTENSITY16UI_EXT = javax.media.opengl.GL.GL_INTENSITY16UI_EXT;
	public static final int GL_LUMINANCE16UI_EXT = javax.media.opengl.GL.GL_LUMINANCE16UI_EXT;
	public static final int GL_LUMINANCE_ALPHA16UI_EXT = javax.media.opengl.GL.GL_LUMINANCE_ALPHA16UI_EXT;
	public static final int GL_RGBA8UI_EXT = javax.media.opengl.GL.GL_RGBA8UI_EXT;
	public static final int GL_RGB8UI_EXT = javax.media.opengl.GL.GL_RGB8UI_EXT;
	public static final int GL_ALPHA8UI_EXT = javax.media.opengl.GL.GL_ALPHA8UI_EXT;
	public static final int GL_INTENSITY8UI_EXT = javax.media.opengl.GL.GL_INTENSITY8UI_EXT;
	public static final int GL_LUMINANCE8UI_EXT = javax.media.opengl.GL.GL_LUMINANCE8UI_EXT;
	public static final int GL_LUMINANCE_ALPHA8UI_EXT = javax.media.opengl.GL.GL_LUMINANCE_ALPHA8UI_EXT;
	public static final int GL_RGBA32I_EXT = javax.media.opengl.GL.GL_RGBA32I_EXT;
	public static final int GL_RGB32I_EXT = javax.media.opengl.GL.GL_RGB32I_EXT;
	public static final int GL_ALPHA32I_EXT = javax.media.opengl.GL.GL_ALPHA32I_EXT;
	public static final int GL_INTENSITY32I_EXT = javax.media.opengl.GL.GL_INTENSITY32I_EXT;
	public static final int GL_LUMINANCE32I_EXT = javax.media.opengl.GL.GL_LUMINANCE32I_EXT;
	public static final int GL_LUMINANCE_ALPHA32I_EXT = javax.media.opengl.GL.GL_LUMINANCE_ALPHA32I_EXT;
	public static final int GL_RGBA16I_EXT = javax.media.opengl.GL.GL_RGBA16I_EXT;
	public static final int GL_RGB16I_EXT = javax.media.opengl.GL.GL_RGB16I_EXT;
	public static final int GL_ALPHA16I_EXT = javax.media.opengl.GL.GL_ALPHA16I_EXT;
	public static final int GL_INTENSITY16I_EXT = javax.media.opengl.GL.GL_INTENSITY16I_EXT;
	public static final int GL_LUMINANCE16I_EXT = javax.media.opengl.GL.GL_LUMINANCE16I_EXT;
	public static final int GL_LUMINANCE_ALPHA16I_EXT = javax.media.opengl.GL.GL_LUMINANCE_ALPHA16I_EXT;
	public static final int GL_RGBA8I_EXT = javax.media.opengl.GL.GL_RGBA8I_EXT;
	public static final int GL_RGB8I_EXT = javax.media.opengl.GL.GL_RGB8I_EXT;
	public static final int GL_ALPHA8I_EXT = javax.media.opengl.GL.GL_ALPHA8I_EXT;
	public static final int GL_INTENSITY8I_EXT = javax.media.opengl.GL.GL_INTENSITY8I_EXT;
	public static final int GL_LUMINANCE8I_EXT = javax.media.opengl.GL.GL_LUMINANCE8I_EXT;
	public static final int GL_LUMINANCE_ALPHA8I_EXT = javax.media.opengl.GL.GL_LUMINANCE_ALPHA8I_EXT;
	public static final int GL_RED_INTEGER_EXT = javax.media.opengl.GL.GL_RED_INTEGER_EXT;
	public static final int GL_GREEN_INTEGER_EXT = javax.media.opengl.GL.GL_GREEN_INTEGER_EXT;
	public static final int GL_BLUE_INTEGER_EXT = javax.media.opengl.GL.GL_BLUE_INTEGER_EXT;
	public static final int GL_ALPHA_INTEGER_EXT = javax.media.opengl.GL.GL_ALPHA_INTEGER_EXT;
	public static final int GL_RGB_INTEGER_EXT = javax.media.opengl.GL.GL_RGB_INTEGER_EXT;
	public static final int GL_RGBA_INTEGER_EXT = javax.media.opengl.GL.GL_RGBA_INTEGER_EXT;
	public static final int GL_BGR_INTEGER_EXT = javax.media.opengl.GL.GL_BGR_INTEGER_EXT;
	public static final int GL_BGRA_INTEGER_EXT = javax.media.opengl.GL.GL_BGRA_INTEGER_EXT;
	public static final int GL_LUMINANCE_INTEGER_EXT = javax.media.opengl.GL.GL_LUMINANCE_INTEGER_EXT;
	public static final int GL_LUMINANCE_ALPHA_INTEGER_EXT = javax.media.opengl.GL.GL_LUMINANCE_ALPHA_INTEGER_EXT;
	public static final int GL_RGBA_INTEGER_MODE_EXT = javax.media.opengl.GL.GL_RGBA_INTEGER_MODE_EXT;
	public static final int GL_DEPTH_COMPONENT32F_NV = javax.media.opengl.GL.GL_DEPTH_COMPONENT32F_NV;
	public static final int GL_DEPTH32F_STENCIL8_NV = javax.media.opengl.GL.GL_DEPTH32F_STENCIL8_NV;
	public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = javax.media.opengl.GL.GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV;
	public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = javax.media.opengl.GL.GL_DEPTH_BUFFER_FLOAT_MODE_NV;
	public static final int GL_COMPRESSED_LUMINANCE_LATC1_EXT = javax.media.opengl.GL.GL_COMPRESSED_LUMINANCE_LATC1_EXT;
	public static final int GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT = javax.media.opengl.GL.GL_COMPRESSED_SIGNED_LUMINANCE_LATC1_EXT;
	public static final int GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT = javax.media.opengl.GL.GL_COMPRESSED_LUMINANCE_ALPHA_LATC2_EXT;
	public static final int GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT = javax.media.opengl.GL.GL_COMPRESSED_SIGNED_LUMINANCE_ALPHA_LATC2_EXT;
	public static final int GL_BACK_PRIMARY_COLOR_NV = javax.media.opengl.GL.GL_BACK_PRIMARY_COLOR_NV;
	public static final int GL_BACK_SECONDARY_COLOR_NV = javax.media.opengl.GL.GL_BACK_SECONDARY_COLOR_NV;
	public static final int GL_TEXTURE_COORD_NV = javax.media.opengl.GL.GL_TEXTURE_COORD_NV;
	public static final int GL_CLIP_DISTANCE_NV = javax.media.opengl.GL.GL_CLIP_DISTANCE_NV;
	public static final int GL_VERTEX_ID_NV = javax.media.opengl.GL.GL_VERTEX_ID_NV;
	public static final int GL_PRIMITIVE_ID_NV = javax.media.opengl.GL.GL_PRIMITIVE_ID_NV;
	public static final int GL_GENERIC_ATTRIB_NV = javax.media.opengl.GL.GL_GENERIC_ATTRIB_NV;
	public static final int GL_TRANSFORM_FEEDBACK_ATTRIBS_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_ATTRIBS_NV;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV = javax.media.opengl.GL.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV;
	public static final int GL_ACTIVE_VARYINGS_NV = javax.media.opengl.GL.GL_ACTIVE_VARYINGS_NV;
	public static final int GL_ACTIVE_VARYING_MAX_LENGTH_NV = javax.media.opengl.GL.GL_ACTIVE_VARYING_MAX_LENGTH_NV;
	public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_VARYINGS_NV;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_BUFFER_START_NV;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV;
	public static final int GL_TRANSFORM_FEEDBACK_RECORD_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_RECORD_NV;
	public static final int GL_PRIMITIVES_GENERATED_NV = javax.media.opengl.GL.GL_PRIMITIVES_GENERATED_NV;
	public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV;
	public static final int GL_RASTERIZER_DISCARD_NV = javax.media.opengl.GL.GL_RASTERIZER_DISCARD_NV;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_ATTRIBS_NV = javax.media.opengl.GL.GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_ATTRIBS_NV;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV = javax.media.opengl.GL.GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV;
	public static final int GL_INTERLEAVED_ATTRIBS_NV = javax.media.opengl.GL.GL_INTERLEAVED_ATTRIBS_NV;
	public static final int GL_SEPARATE_ATTRIBS_NV = javax.media.opengl.GL.GL_SEPARATE_ATTRIBS_NV;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_BUFFER_NV;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = javax.media.opengl.GL.GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV;
	public static final int GL_GEOMETRY_PROGRAM_NV = javax.media.opengl.GL.GL_GEOMETRY_PROGRAM_NV;
	public static final int GL_MAX_PROGRAM_OUTPUT_VERTICES_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_OUTPUT_VERTICES_NV;
	public static final int GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_TOTAL_OUTPUT_COMPONENTS_NV;
	public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_NV = javax.media.opengl.GL.GL_MIN_PROGRAM_TEXEL_OFFSET_NV;
	public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_TEXEL_OFFSET_NV;
	public static final int GL_PROGRAM_ATTRIB_COMPONENTS_NV = javax.media.opengl.GL.GL_PROGRAM_ATTRIB_COMPONENTS_NV;
	public static final int GL_PROGRAM_RESULT_COMPONENTS_NV = javax.media.opengl.GL.GL_PROGRAM_RESULT_COMPONENTS_NV;
	public static final int GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV;
	public static final int GL_MAX_PROGRAM_RESULT_COMPONENTS_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_RESULT_COMPONENTS_NV;
	public static final int GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV;
	public static final int GL_MAX_PROGRAM_GENERIC_RESULTS_NV = javax.media.opengl.GL.GL_MAX_PROGRAM_GENERIC_RESULTS_NV;
	public static final int GL_RENDERBUFFER_COVERAGE_SAMPLES_NV = javax.media.opengl.GL.GL_RENDERBUFFER_COVERAGE_SAMPLES_NV;
	public static final int GL_RENDERBUFFER_COLOR_SAMPLES_NV = javax.media.opengl.GL.GL_RENDERBUFFER_COLOR_SAMPLES_NV;
	public static final int GL_MAX_RENDERBUFFER_COVERAGE_SAMPLES_NV = javax.media.opengl.GL.GL_MAX_RENDERBUFFER_COVERAGE_SAMPLES_NV;
	public static final int GL_MAX_RENDERBUFFER_COLOR_SAMPLES_NV = javax.media.opengl.GL.GL_MAX_RENDERBUFFER_COLOR_SAMPLES_NV;
	public static final int GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV = javax.media.opengl.GL.GL_MAX_MULTISAMPLE_COVERAGE_MODES_NV;
	public static final int GL_MULTISAMPLE_COVERAGE_MODES_NV = javax.media.opengl.GL.GL_MULTISAMPLE_COVERAGE_MODES_NV;
	public static final int GL_COMPRESSED_RED_RGTC1_EXT = javax.media.opengl.GL.GL_COMPRESSED_RED_RGTC1_EXT;
	public static final int GL_COMPRESSED_SIGNED_RED_RGTC1_EXT = javax.media.opengl.GL.GL_COMPRESSED_SIGNED_RED_RGTC1_EXT;
	public static final int GL_COMPRESSED_RED_GREEN_RGTC2_EXT = javax.media.opengl.GL.GL_COMPRESSED_RED_GREEN_RGTC2_EXT;
	public static final int GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT = javax.media.opengl.GL.GL_COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT;
	public static final int GL_OES_read_format = javax.media.opengl.GL.GL_OES_read_format;
	public static final int GL_GREMEDY_string_marker = javax.media.opengl.GL.GL_GREMEDY_string_marker;
	public static final int GL_MESAX_texture_stack = javax.media.opengl.GL.GL_MESAX_texture_stack;
	public static final int GL_KTX_FRONT_REGION = javax.media.opengl.GL.GL_KTX_FRONT_REGION;
	public static final int GL_KTX_BACK_REGION = javax.media.opengl.GL.GL_KTX_BACK_REGION;
	public static final int GL_KTX_Z_REGION = javax.media.opengl.GL.GL_KTX_Z_REGION;
	public static final int GL_KTX_STENCIL_REGION = javax.media.opengl.GL.GL_KTX_STENCIL_REGION;
	public static final int GL_TEXTURE_RANGE_LENGTH_APPLE = javax.media.opengl.GL.GL_TEXTURE_RANGE_LENGTH_APPLE;
	public static final int GL_TEXTURE_RANGE_POINTER_APPLE = javax.media.opengl.GL.GL_TEXTURE_RANGE_POINTER_APPLE;
	public static final int GL_TEXTURE_STORAGE_HINT_APPLE = javax.media.opengl.GL.GL_TEXTURE_STORAGE_HINT_APPLE;
	public static final int GL_TEXTURE_MINIMIZE_STORAGE_APPLE = javax.media.opengl.GL.GL_TEXTURE_MINIMIZE_STORAGE_APPLE;
	public static final int GL_HALF_APPLE = javax.media.opengl.GL.GL_HALF_APPLE;
	public static final int GL_COLOR_FLOAT_APPLE = javax.media.opengl.GL.GL_COLOR_FLOAT_APPLE;
	public static final int GL_RGBA_FLOAT32_APPLE = javax.media.opengl.GL.GL_RGBA_FLOAT32_APPLE;
	public static final int GL_RGB_FLOAT32_APPLE = javax.media.opengl.GL.GL_RGB_FLOAT32_APPLE;
	public static final int GL_ALPHA_FLOAT32_APPLE = javax.media.opengl.GL.GL_ALPHA_FLOAT32_APPLE;
	public static final int GL_INTENSITY_FLOAT32_APPLE = javax.media.opengl.GL.GL_INTENSITY_FLOAT32_APPLE;
	public static final int GL_LUMINANCE_FLOAT32_APPLE = javax.media.opengl.GL.GL_LUMINANCE_FLOAT32_APPLE;
	public static final int GL_LUMINANCE_ALPHA_FLOAT32_APPLE = javax.media.opengl.GL.GL_LUMINANCE_ALPHA_FLOAT32_APPLE;
	public static final int GL_RGBA_FLOAT16_APPLE = javax.media.opengl.GL.GL_RGBA_FLOAT16_APPLE;
	public static final int GL_RGB_FLOAT16_APPLE = javax.media.opengl.GL.GL_RGB_FLOAT16_APPLE;
	public static final int GL_ALPHA_FLOAT16_APPLE = javax.media.opengl.GL.GL_ALPHA_FLOAT16_APPLE;
	public static final int GL_INTENSITY_FLOAT16_APPLE = javax.media.opengl.GL.GL_INTENSITY_FLOAT16_APPLE;
	public static final int GL_LUMINANCE_FLOAT16_APPLE = javax.media.opengl.GL.GL_LUMINANCE_FLOAT16_APPLE;
	public static final int GL_LUMINANCE_ALPHA_FLOAT16_APPLE = javax.media.opengl.GL.GL_LUMINANCE_ALPHA_FLOAT16_APPLE;
	public static final int GL_MIN_PBUFFER_VIEWPORT_DIMS_APPLE = javax.media.opengl.GL.GL_MIN_PBUFFER_VIEWPORT_DIMS_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP1_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP1_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP2_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP2_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE;
	public static final int GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = javax.media.opengl.GL.GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE;

	private GLWrap() {}

	public static final java.lang.Object getExtension( java.lang.String a0 )
	{
		return gl.getExtension( a0 );
	}
	public static final java.lang.Object getPlatformGLExtensions()
	{
		return gl.getPlatformGLExtensions();
	}
	public static final void glAccum( int a0, float a1 )
	{
		gl.glAccum( a0, a1 );
	}
	public static final void glActiveStencilFaceEXT( int a0 )
	{
		gl.glActiveStencilFaceEXT( a0 );
	}
	public static final void glActiveTexture( int a0 )
	{
		gl.glActiveTexture( a0 );
	}
	public static final void glActiveVaryingNV( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glActiveVaryingNV( a0, a1 );
	}
	public static final void glActiveVaryingNV( int a0, byte[] a1, int a2 )
	{
		gl.glActiveVaryingNV( a0, a1, a2 );
	}
	public static final java.nio.ByteBuffer glAllocateMemoryNV( int a0, float a1, float a2, float a3 )
	{
		return gl.glAllocateMemoryNV( a0, a1, a2, a3 );
	}
	public static final void glAlphaFragmentOp1ATI( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glAlphaFragmentOp1ATI( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glAlphaFragmentOp2ATI( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8 )
	{
		gl.glAlphaFragmentOp2ATI( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glAlphaFragmentOp3ATI( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11 )
	{
		gl.glAlphaFragmentOp3ATI( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11 );
	}
	public static final void glAlphaFunc( int a0, float a1 )
	{
		gl.glAlphaFunc( a0, a1 );
	}
	public static final void glApplyTextureEXT( int a0 )
	{
		gl.glApplyTextureEXT( a0 );
	}
	public static final boolean glAreProgramsResidentNV( int a0, java.nio.IntBuffer a1, java.nio.ByteBuffer a2 )
	{
		return gl.glAreProgramsResidentNV( a0, a1, a2 );
	}
	public static final boolean glAreProgramsResidentNV( int a0, int[] a1, int a2, byte[] a3, int a4 )
	{
		return gl.glAreProgramsResidentNV( a0, a1, a2, a3, a4 );
	}
	public static final boolean glAreTexturesResident( int a0, java.nio.IntBuffer a1, java.nio.ByteBuffer a2 )
	{
		return gl.glAreTexturesResident( a0, a1, a2 );
	}
	public static final boolean glAreTexturesResident( int a0, int[] a1, int a2, byte[] a3, int a4 )
	{
		return gl.glAreTexturesResident( a0, a1, a2, a3, a4 );
	}
	public static final void glArrayElement( int a0 )
	{
		gl.glArrayElement( a0 );
	}
	public static final void glArrayObjectATI( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glArrayObjectATI( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glAsyncMarkerSGIX( int a0 )
	{
		gl.glAsyncMarkerSGIX( a0 );
	}
	public static final void glAttachObjectARB( int a0, int a1 )
	{
		gl.glAttachObjectARB( a0, a1 );
	}
	public static final void glAttachShader( int a0, int a1 )
	{
		gl.glAttachShader( a0, a1 );
	}
	public static final void glBegin( int a0 )
	{
		gl.glBegin( a0 );
	}
	public static final void glBeginFragmentShaderATI()
	{
		gl.glBeginFragmentShaderATI();
	}
	public static final void glBeginOcclusionQueryNV( int a0 )
	{
		gl.glBeginOcclusionQueryNV( a0 );
	}
	public static final void glBeginQuery( int a0, int a1 )
	{
		gl.glBeginQuery( a0, a1 );
	}
	public static final void glBeginQueryARB( int a0, int a1 )
	{
		gl.glBeginQueryARB( a0, a1 );
	}
	public static final void glBeginTransformFeedbackNV( int a0 )
	{
		gl.glBeginTransformFeedbackNV( a0 );
	}
	public static final void glBeginVertexShaderEXT()
	{
		gl.glBeginVertexShaderEXT();
	}
	public static final void glBindAttribLocation( int a0, int a1, java.lang.String a2 )
	{
		gl.glBindAttribLocation( a0, a1, a2 );
	}
	public static final void glBindAttribLocationARB( int a0, int a1, java.lang.String a2 )
	{
		gl.glBindAttribLocationARB( a0, a1, a2 );
	}
	public static final void glBindBuffer( int a0, int a1 )
	{
		gl.glBindBuffer( a0, a1 );
	}
	public static final void glBindBufferARB( int a0, int a1 )
	{
		gl.glBindBufferARB( a0, a1 );
	}
	public static final void glBindBufferBaseNV( int a0, int a1, int a2 )
	{
		gl.glBindBufferBaseNV( a0, a1, a2 );
	}
	public static final void glBindBufferOffsetNV( int a0, int a1, int a2, int a3 )
	{
		gl.glBindBufferOffsetNV( a0, a1, a2, a3 );
	}
	public static final void glBindBufferRangeNV( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glBindBufferRangeNV( a0, a1, a2, a3, a4 );
	}
	public static final void glBindFragDataLocationEXT( int a0, int a1, java.nio.ByteBuffer a2 )
	{
		gl.glBindFragDataLocationEXT( a0, a1, a2 );
	}
	public static final void glBindFragDataLocationEXT( int a0, int a1, byte[] a2, int a3 )
	{
		gl.glBindFragDataLocationEXT( a0, a1, a2, a3 );
	}
	public static final void glBindFragmentShaderATI( int a0 )
	{
		gl.glBindFragmentShaderATI( a0 );
	}
	public static final void glBindFramebufferEXT( int a0, int a1 )
	{
		gl.glBindFramebufferEXT( a0, a1 );
	}
	public static final int glBindLightParameterEXT( int a0, int a1 )
	{
		return gl.glBindLightParameterEXT( a0, a1 );
	}
	public static final int glBindMaterialParameterEXT( int a0, int a1 )
	{
		return gl.glBindMaterialParameterEXT( a0, a1 );
	}
	public static final int glBindParameterEXT( int a0 )
	{
		return gl.glBindParameterEXT( a0 );
	}
	public static final void glBindProgramARB( int a0, int a1 )
	{
		gl.glBindProgramARB( a0, a1 );
	}
	public static final void glBindProgramNV( int a0, int a1 )
	{
		gl.glBindProgramNV( a0, a1 );
	}
	public static final void glBindRenderbufferEXT( int a0, int a1 )
	{
		gl.glBindRenderbufferEXT( a0, a1 );
	}
	public static final int glBindTexGenParameterEXT( int a0, int a1, int a2 )
	{
		return gl.glBindTexGenParameterEXT( a0, a1, a2 );
	}
	public static final void glBindTexture( int a0, int a1 )
	{
		gl.glBindTexture( a0, a1 );
	}
	public static final int glBindTextureUnitParameterEXT( int a0, int a1 )
	{
		return gl.glBindTextureUnitParameterEXT( a0, a1 );
	}
	public static final void glBindVertexArrayAPPLE( int a0 )
	{
		gl.glBindVertexArrayAPPLE( a0 );
	}
	public static final void glBindVertexShaderEXT( int a0 )
	{
		gl.glBindVertexShaderEXT( a0 );
	}
	public static final void glBitmap( int a0, int a1, float a2, float a3, float a4, float a5, java.nio.ByteBuffer a6 )
	{
		gl.glBitmap( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glBitmap( int a0, int a1, float a2, float a3, float a4, float a5, byte[] a6, int a7 )
	{
		gl.glBitmap( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glBitmap( int a0, int a1, float a2, float a3, float a4, float a5, long a6 )
	{
		gl.glBitmap( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glBlendColor( float a0, float a1, float a2, float a3 )
	{
		gl.glBlendColor( a0, a1, a2, a3 );
	}
	public static final void glBlendEquation( int a0 )
	{
		gl.glBlendEquation( a0 );
	}
	public static final void glBlendEquationSeparate( int a0, int a1 )
	{
		gl.glBlendEquationSeparate( a0, a1 );
	}
	public static final void glBlendEquationSeparateEXT( int a0, int a1 )
	{
		gl.glBlendEquationSeparateEXT( a0, a1 );
	}
	public static final void glBlendFunc( int a0, int a1 )
	{
		gl.glBlendFunc( a0, a1 );
	}
	public static final void glBlendFuncSeparate( int a0, int a1, int a2, int a3 )
	{
		gl.glBlendFuncSeparate( a0, a1, a2, a3 );
	}
	public static final void glBlendFuncSeparateEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glBlendFuncSeparateEXT( a0, a1, a2, a3 );
	}
	public static final void glBlendFuncSeparateINGR( int a0, int a1, int a2, int a3 )
	{
		gl.glBlendFuncSeparateINGR( a0, a1, a2, a3 );
	}
	public static final void glBlitFramebufferEXT( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9 )
	{
		gl.glBlitFramebufferEXT( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glBufferData( int a0, int a1, java.nio.Buffer a2, int a3 )
	{
		gl.glBufferData( a0, a1, a2, a3 );
	}
	public static final void glBufferDataARB( int a0, int a1, java.nio.Buffer a2, int a3 )
	{
		gl.glBufferDataARB( a0, a1, a2, a3 );
	}
	public static final void glBufferParameteriAPPLE( int a0, int a1, int a2 )
	{
		gl.glBufferParameteriAPPLE( a0, a1, a2 );
	}
	public static final int glBufferRegionEnabled()
	{
		return gl.glBufferRegionEnabled();
	}
	public static final void glBufferSubData( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glBufferSubData( a0, a1, a2, a3 );
	}
	public static final void glBufferSubDataARB( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glBufferSubDataARB( a0, a1, a2, a3 );
	}
	public static final void glCallList( int a0 )
	{
		gl.glCallList( a0 );
	}
	public static final void glCallLists( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glCallLists( a0, a1, a2 );
	}
	public static final int glCheckFramebufferStatusEXT( int a0 )
	{
		return gl.glCheckFramebufferStatusEXT( a0 );
	}
	public static final void glClampColorARB( int a0, int a1 )
	{
		gl.glClampColorARB( a0, a1 );
	}
	public static final void glClear( int a0 )
	{
		gl.glClear( a0 );
	}
	public static final void glClearAccum( float a0, float a1, float a2, float a3 )
	{
		gl.glClearAccum( a0, a1, a2, a3 );
	}
	public static final void glClearColor( float a0, float a1, float a2, float a3 )
	{
		gl.glClearColor( a0, a1, a2, a3 );
	}
	public static final void glClearColorIiEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glClearColorIiEXT( a0, a1, a2, a3 );
	}
	public static final void glClearColorIuiEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glClearColorIuiEXT( a0, a1, a2, a3 );
	}
	public static final void glClearDepth( double a0 )
	{
		gl.glClearDepth( a0 );
	}
	public static final void glClearDepthdNV( double a0 )
	{
		gl.glClearDepthdNV( a0 );
	}
	public static final void glClearIndex( float a0 )
	{
		gl.glClearIndex( a0 );
	}
	public static final void glClearStencil( int a0 )
	{
		gl.glClearStencil( a0 );
	}
	public static final void glClientActiveTexture( int a0 )
	{
		gl.glClientActiveTexture( a0 );
	}
	public static final void glClientActiveVertexStreamATI( int a0 )
	{
		gl.glClientActiveVertexStreamATI( a0 );
	}
	public static final void glClipPlane( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glClipPlane( a0, a1 );
	}
	public static final void glClipPlane( int a0, double[] a1, int a2 )
	{
		gl.glClipPlane( a0, a1, a2 );
	}
	public static final void glColor3b( byte a0, byte a1, byte a2 )
	{
		gl.glColor3b( a0, a1, a2 );
	}
	public static final void glColor3bv( java.nio.ByteBuffer a0 )
	{
		gl.glColor3bv( a0 );
	}
	public static final void glColor3bv( byte[] a0, int a1 )
	{
		gl.glColor3bv( a0, a1 );
	}
	public static final void glColor3d( double a0, double a1, double a2 )
	{
		gl.glColor3d( a0, a1, a2 );
	}
	public static final void glColor3dv( java.nio.DoubleBuffer a0 )
	{
		gl.glColor3dv( a0 );
	}
	public static final void glColor3dv( double[] a0, int a1 )
	{
		gl.glColor3dv( a0, a1 );
	}
	public static final void glColor3f( float a0, float a1, float a2 )
	{
		gl.glColor3f( a0, a1, a2 );
	}
	public static final void glColor3fVertex3fSUN( float a0, float a1, float a2, float a3, float a4, float a5 )
	{
		gl.glColor3fVertex3fSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glColor3fVertex3fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1 )
	{
		gl.glColor3fVertex3fvSUN( a0, a1 );
	}
	public static final void glColor3fVertex3fvSUN( float[] a0, int a1, float[] a2, int a3 )
	{
		gl.glColor3fVertex3fvSUN( a0, a1, a2, a3 );
	}
	public static final void glColor3fv( java.nio.FloatBuffer a0 )
	{
		gl.glColor3fv( a0 );
	}
	public static final void glColor3fv( float[] a0, int a1 )
	{
		gl.glColor3fv( a0, a1 );
	}
	public static final void glColor3hNV( short a0, short a1, short a2 )
	{
		gl.glColor3hNV( a0, a1, a2 );
	}
	public static final void glColor3hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glColor3hvNV( a0 );
	}
	public static final void glColor3hvNV( short[] a0, int a1 )
	{
		gl.glColor3hvNV( a0, a1 );
	}
	public static final void glColor3i( int a0, int a1, int a2 )
	{
		gl.glColor3i( a0, a1, a2 );
	}
	public static final void glColor3iv( java.nio.IntBuffer a0 )
	{
		gl.glColor3iv( a0 );
	}
	public static final void glColor3iv( int[] a0, int a1 )
	{
		gl.glColor3iv( a0, a1 );
	}
	public static final void glColor3s( short a0, short a1, short a2 )
	{
		gl.glColor3s( a0, a1, a2 );
	}
	public static final void glColor3sv( java.nio.ShortBuffer a0 )
	{
		gl.glColor3sv( a0 );
	}
	public static final void glColor3sv( short[] a0, int a1 )
	{
		gl.glColor3sv( a0, a1 );
	}
	public static final void glColor3ub( byte a0, byte a1, byte a2 )
	{
		gl.glColor3ub( a0, a1, a2 );
	}
	public static final void glColor3ubv( java.nio.ByteBuffer a0 )
	{
		gl.glColor3ubv( a0 );
	}
	public static final void glColor3ubv( byte[] a0, int a1 )
	{
		gl.glColor3ubv( a0, a1 );
	}
	public static final void glColor3ui( int a0, int a1, int a2 )
	{
		gl.glColor3ui( a0, a1, a2 );
	}
	public static final void glColor3uiv( java.nio.IntBuffer a0 )
	{
		gl.glColor3uiv( a0 );
	}
	public static final void glColor3uiv( int[] a0, int a1 )
	{
		gl.glColor3uiv( a0, a1 );
	}
	public static final void glColor3us( short a0, short a1, short a2 )
	{
		gl.glColor3us( a0, a1, a2 );
	}
	public static final void glColor3usv( java.nio.ShortBuffer a0 )
	{
		gl.glColor3usv( a0 );
	}
	public static final void glColor3usv( short[] a0, int a1 )
	{
		gl.glColor3usv( a0, a1 );
	}
	public static final void glColor4b( byte a0, byte a1, byte a2, byte a3 )
	{
		gl.glColor4b( a0, a1, a2, a3 );
	}
	public static final void glColor4bv( java.nio.ByteBuffer a0 )
	{
		gl.glColor4bv( a0 );
	}
	public static final void glColor4bv( byte[] a0, int a1 )
	{
		gl.glColor4bv( a0, a1 );
	}
	public static final void glColor4d( double a0, double a1, double a2, double a3 )
	{
		gl.glColor4d( a0, a1, a2, a3 );
	}
	public static final void glColor4dv( java.nio.DoubleBuffer a0 )
	{
		gl.glColor4dv( a0 );
	}
	public static final void glColor4dv( double[] a0, int a1 )
	{
		gl.glColor4dv( a0, a1 );
	}
	public static final void glColor4f( float a0, float a1, float a2, float a3 )
	{
		gl.glColor4f( a0, a1, a2, a3 );
	}
	public static final void glColor4fNormal3fVertex3fSUN( float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9 )
	{
		gl.glColor4fNormal3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glColor4fNormal3fVertex3fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glColor4fNormal3fVertex3fvSUN( a0, a1, a2 );
	}
	public static final void glColor4fNormal3fVertex3fvSUN( float[] a0, int a1, float[] a2, int a3, float[] a4, int a5 )
	{
		gl.glColor4fNormal3fVertex3fvSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glColor4fv( java.nio.FloatBuffer a0 )
	{
		gl.glColor4fv( a0 );
	}
	public static final void glColor4fv( float[] a0, int a1 )
	{
		gl.glColor4fv( a0, a1 );
	}
	public static final void glColor4hNV( short a0, short a1, short a2, short a3 )
	{
		gl.glColor4hNV( a0, a1, a2, a3 );
	}
	public static final void glColor4hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glColor4hvNV( a0 );
	}
	public static final void glColor4hvNV( short[] a0, int a1 )
	{
		gl.glColor4hvNV( a0, a1 );
	}
	public static final void glColor4i( int a0, int a1, int a2, int a3 )
	{
		gl.glColor4i( a0, a1, a2, a3 );
	}
	public static final void glColor4iv( java.nio.IntBuffer a0 )
	{
		gl.glColor4iv( a0 );
	}
	public static final void glColor4iv( int[] a0, int a1 )
	{
		gl.glColor4iv( a0, a1 );
	}
	public static final void glColor4s( short a0, short a1, short a2, short a3 )
	{
		gl.glColor4s( a0, a1, a2, a3 );
	}
	public static final void glColor4sv( java.nio.ShortBuffer a0 )
	{
		gl.glColor4sv( a0 );
	}
	public static final void glColor4sv( short[] a0, int a1 )
	{
		gl.glColor4sv( a0, a1 );
	}
	public static final void glColor4ub( byte a0, byte a1, byte a2, byte a3 )
	{
		gl.glColor4ub( a0, a1, a2, a3 );
	}
	public static final void glColor4ubVertex2fSUN( byte a0, byte a1, byte a2, byte a3, float a4, float a5 )
	{
		gl.glColor4ubVertex2fSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glColor4ubVertex2fvSUN( java.nio.ByteBuffer a0, java.nio.FloatBuffer a1 )
	{
		gl.glColor4ubVertex2fvSUN( a0, a1 );
	}
	public static final void glColor4ubVertex2fvSUN( byte[] a0, int a1, float[] a2, int a3 )
	{
		gl.glColor4ubVertex2fvSUN( a0, a1, a2, a3 );
	}
	public static final void glColor4ubVertex3fSUN( byte a0, byte a1, byte a2, byte a3, float a4, float a5, float a6 )
	{
		gl.glColor4ubVertex3fSUN( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glColor4ubVertex3fvSUN( java.nio.ByteBuffer a0, java.nio.FloatBuffer a1 )
	{
		gl.glColor4ubVertex3fvSUN( a0, a1 );
	}
	public static final void glColor4ubVertex3fvSUN( byte[] a0, int a1, float[] a2, int a3 )
	{
		gl.glColor4ubVertex3fvSUN( a0, a1, a2, a3 );
	}
	public static final void glColor4ubv( java.nio.ByteBuffer a0 )
	{
		gl.glColor4ubv( a0 );
	}
	public static final void glColor4ubv( byte[] a0, int a1 )
	{
		gl.glColor4ubv( a0, a1 );
	}
	public static final void glColor4ui( int a0, int a1, int a2, int a3 )
	{
		gl.glColor4ui( a0, a1, a2, a3 );
	}
	public static final void glColor4uiv( java.nio.IntBuffer a0 )
	{
		gl.glColor4uiv( a0 );
	}
	public static final void glColor4uiv( int[] a0, int a1 )
	{
		gl.glColor4uiv( a0, a1 );
	}
	public static final void glColor4us( short a0, short a1, short a2, short a3 )
	{
		gl.glColor4us( a0, a1, a2, a3 );
	}
	public static final void glColor4usv( java.nio.ShortBuffer a0 )
	{
		gl.glColor4usv( a0 );
	}
	public static final void glColor4usv( short[] a0, int a1 )
	{
		gl.glColor4usv( a0, a1 );
	}
	public static final void glColorFragmentOp1ATI( int a0, int a1, int a2, int a3, int a4, int a5, int a6 )
	{
		gl.glColorFragmentOp1ATI( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glColorFragmentOp2ATI( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9 )
	{
		gl.glColorFragmentOp2ATI( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glColorFragmentOp3ATI( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11, int a12 )
	{
		gl.glColorFragmentOp3ATI( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12 );
	}
	public static final void glColorMask( boolean a0, boolean a1, boolean a2, boolean a3 )
	{
		gl.glColorMask( a0, a1, a2, a3 );
	}
	public static final void glColorMaskIndexedEXT( int a0, boolean a1, boolean a2, boolean a3, boolean a4 )
	{
		gl.glColorMaskIndexedEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glColorMaterial( int a0, int a1 )
	{
		gl.glColorMaterial( a0, a1 );
	}
	public static final void glColorPointer( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glColorPointer( a0, a1, a2, a3 );
	}
	public static final void glColorPointer( int a0, int a1, int a2, long a3 )
	{
		gl.glColorPointer( a0, a1, a2, a3 );
	}
	public static final void glColorSubTable( int a0, int a1, int a2, int a3, int a4, java.nio.Buffer a5 )
	{
		gl.glColorSubTable( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glColorSubTable( int a0, int a1, int a2, int a3, int a4, long a5 )
	{
		gl.glColorSubTable( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glColorTable( int a0, int a1, int a2, int a3, int a4, java.nio.Buffer a5 )
	{
		gl.glColorTable( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glColorTable( int a0, int a1, int a2, int a3, int a4, long a5 )
	{
		gl.glColorTable( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glColorTableEXT( int a0, int a1, int a2, int a3, int a4, java.nio.Buffer a5 )
	{
		gl.glColorTableEXT( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glColorTableParameterfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glColorTableParameterfv( a0, a1, a2 );
	}
	public static final void glColorTableParameterfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glColorTableParameterfv( a0, a1, a2, a3 );
	}
	public static final void glColorTableParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glColorTableParameteriv( a0, a1, a2 );
	}
	public static final void glColorTableParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glColorTableParameteriv( a0, a1, a2, a3 );
	}
	public static final void glCombinerInputNV( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glCombinerInputNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glCombinerOutputNV( int a0, int a1, int a2, int a3, int a4, int a5, int a6, boolean a7, boolean a8, boolean a9 )
	{
		gl.glCombinerOutputNV( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glCombinerParameterfNV( int a0, float a1 )
	{
		gl.glCombinerParameterfNV( a0, a1 );
	}
	public static final void glCombinerParameterfvNV( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glCombinerParameterfvNV( a0, a1 );
	}
	public static final void glCombinerParameterfvNV( int a0, float[] a1, int a2 )
	{
		gl.glCombinerParameterfvNV( a0, a1, a2 );
	}
	public static final void glCombinerParameteriNV( int a0, int a1 )
	{
		gl.glCombinerParameteriNV( a0, a1 );
	}
	public static final void glCombinerParameterivNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glCombinerParameterivNV( a0, a1 );
	}
	public static final void glCombinerParameterivNV( int a0, int[] a1, int a2 )
	{
		gl.glCombinerParameterivNV( a0, a1, a2 );
	}
	public static final void glCombinerStageParameterfvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glCombinerStageParameterfvNV( a0, a1, a2 );
	}
	public static final void glCombinerStageParameterfvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glCombinerStageParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glCompileShader( int a0 )
	{
		gl.glCompileShader( a0 );
	}
	public static final void glCompileShaderARB( int a0 )
	{
		gl.glCompileShaderARB( a0 );
	}
	public static final void glCompressedTexImage1D( int a0, int a1, int a2, int a3, int a4, int a5, java.nio.Buffer a6 )
	{
		gl.glCompressedTexImage1D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glCompressedTexImage1D( int a0, int a1, int a2, int a3, int a4, int a5, long a6 )
	{
		gl.glCompressedTexImage1D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glCompressedTexImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, java.nio.Buffer a7 )
	{
		gl.glCompressedTexImage2D( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glCompressedTexImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, long a7 )
	{
		gl.glCompressedTexImage2D( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glCompressedTexImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.Buffer a8 )
	{
		gl.glCompressedTexImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glCompressedTexImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, long a8 )
	{
		gl.glCompressedTexImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glCompressedTexSubImage1D( int a0, int a1, int a2, int a3, int a4, int a5, java.nio.Buffer a6 )
	{
		gl.glCompressedTexSubImage1D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glCompressedTexSubImage1D( int a0, int a1, int a2, int a3, int a4, int a5, long a6 )
	{
		gl.glCompressedTexSubImage1D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glCompressedTexSubImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.Buffer a8 )
	{
		gl.glCompressedTexSubImage2D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glCompressedTexSubImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, long a8 )
	{
		gl.glCompressedTexSubImage2D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glCompressedTexSubImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, java.nio.Buffer a10 )
	{
		gl.glCompressedTexSubImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glCompressedTexSubImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, long a10 )
	{
		gl.glCompressedTexSubImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glConvolutionFilter1D( int a0, int a1, int a2, int a3, int a4, java.nio.Buffer a5 )
	{
		gl.glConvolutionFilter1D( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glConvolutionFilter1D( int a0, int a1, int a2, int a3, int a4, long a5 )
	{
		gl.glConvolutionFilter1D( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glConvolutionFilter2D( int a0, int a1, int a2, int a3, int a4, int a5, java.nio.Buffer a6 )
	{
		gl.glConvolutionFilter2D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glConvolutionFilter2D( int a0, int a1, int a2, int a3, int a4, int a5, long a6 )
	{
		gl.glConvolutionFilter2D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glConvolutionParameterf( int a0, int a1, float a2 )
	{
		gl.glConvolutionParameterf( a0, a1, a2 );
	}
	public static final void glConvolutionParameterfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glConvolutionParameterfv( a0, a1, a2 );
	}
	public static final void glConvolutionParameterfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glConvolutionParameterfv( a0, a1, a2, a3 );
	}
	public static final void glConvolutionParameteri( int a0, int a1, int a2 )
	{
		gl.glConvolutionParameteri( a0, a1, a2 );
	}
	public static final void glConvolutionParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glConvolutionParameteriv( a0, a1, a2 );
	}
	public static final void glConvolutionParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glConvolutionParameteriv( a0, a1, a2, a3 );
	}
	public static final void glCopyColorSubTable( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glCopyColorSubTable( a0, a1, a2, a3, a4 );
	}
	public static final void glCopyColorTable( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glCopyColorTable( a0, a1, a2, a3, a4 );
	}
	public static final void glCopyConvolutionFilter1D( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glCopyConvolutionFilter1D( a0, a1, a2, a3, a4 );
	}
	public static final void glCopyConvolutionFilter2D( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glCopyConvolutionFilter2D( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glCopyPixels( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glCopyPixels( a0, a1, a2, a3, a4 );
	}
	public static final void glCopyTexImage1D( int a0, int a1, int a2, int a3, int a4, int a5, int a6 )
	{
		gl.glCopyTexImage1D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glCopyTexImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7 )
	{
		gl.glCopyTexImage2D( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glCopyTexSubImage1D( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glCopyTexSubImage1D( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glCopyTexSubImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7 )
	{
		gl.glCopyTexSubImage2D( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glCopyTexSubImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8 )
	{
		gl.glCopyTexSubImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final int glCreateProgram()
	{
		return gl.glCreateProgram();
	}
	public static final int glCreateProgramObjectARB()
	{
		return gl.glCreateProgramObjectARB();
	}
	public static final int glCreateShader( int a0 )
	{
		return gl.glCreateShader( a0 );
	}
	public static final int glCreateShaderObjectARB( int a0 )
	{
		return gl.glCreateShaderObjectARB( a0 );
	}
	public static final void glCullFace( int a0 )
	{
		gl.glCullFace( a0 );
	}
	public static final void glCullParameterdvEXT( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glCullParameterdvEXT( a0, a1 );
	}
	public static final void glCullParameterdvEXT( int a0, double[] a1, int a2 )
	{
		gl.glCullParameterdvEXT( a0, a1, a2 );
	}
	public static final void glCullParameterfvEXT( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glCullParameterfvEXT( a0, a1 );
	}
	public static final void glCullParameterfvEXT( int a0, float[] a1, int a2 )
	{
		gl.glCullParameterfvEXT( a0, a1, a2 );
	}
	public static final void glCurrentPaletteMatrixARB( int a0 )
	{
		gl.glCurrentPaletteMatrixARB( a0 );
	}
	public static final void glDeformSGIX( int a0 )
	{
		gl.glDeformSGIX( a0 );
	}
	public static final void glDeformationMap3dSGIX( int a0, double a1, double a2, int a3, int a4, double a5, double a6, int a7, int a8, double a9, double a10, int a11, int a12, java.nio.DoubleBuffer a13 )
	{
		gl.glDeformationMap3dSGIX( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13 );
	}
	public static final void glDeformationMap3dSGIX( int a0, double a1, double a2, int a3, int a4, double a5, double a6, int a7, int a8, double a9, double a10, int a11, int a12, double[] a13, int a14 )
	{
		gl.glDeformationMap3dSGIX( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14 );
	}
	public static final void glDeformationMap3fSGIX( int a0, float a1, float a2, int a3, int a4, float a5, float a6, int a7, int a8, float a9, float a10, int a11, int a12, java.nio.FloatBuffer a13 )
	{
		gl.glDeformationMap3fSGIX( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13 );
	}
	public static final void glDeformationMap3fSGIX( int a0, float a1, float a2, int a3, int a4, float a5, float a6, int a7, int a8, float a9, float a10, int a11, int a12, float[] a13, int a14 )
	{
		gl.glDeformationMap3fSGIX( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14 );
	}
	public static final void glDeleteAsyncMarkersSGIX( int a0, int a1 )
	{
		gl.glDeleteAsyncMarkersSGIX( a0, a1 );
	}
	public static final void glDeleteBufferRegion( int a0 )
	{
		gl.glDeleteBufferRegion( a0 );
	}
	public static final void glDeleteBuffers( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteBuffers( a0, a1 );
	}
	public static final void glDeleteBuffers( int a0, int[] a1, int a2 )
	{
		gl.glDeleteBuffers( a0, a1, a2 );
	}
	public static final void glDeleteBuffersARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteBuffersARB( a0, a1 );
	}
	public static final void glDeleteBuffersARB( int a0, int[] a1, int a2 )
	{
		gl.glDeleteBuffersARB( a0, a1, a2 );
	}
	public static final void glDeleteFencesAPPLE( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteFencesAPPLE( a0, a1 );
	}
	public static final void glDeleteFencesAPPLE( int a0, int[] a1, int a2 )
	{
		gl.glDeleteFencesAPPLE( a0, a1, a2 );
	}
	public static final void glDeleteFencesNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteFencesNV( a0, a1 );
	}
	public static final void glDeleteFencesNV( int a0, int[] a1, int a2 )
	{
		gl.glDeleteFencesNV( a0, a1, a2 );
	}
	public static final void glDeleteFragmentShaderATI( int a0 )
	{
		gl.glDeleteFragmentShaderATI( a0 );
	}
	public static final void glDeleteFramebuffersEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteFramebuffersEXT( a0, a1 );
	}
	public static final void glDeleteFramebuffersEXT( int a0, int[] a1, int a2 )
	{
		gl.glDeleteFramebuffersEXT( a0, a1, a2 );
	}
	public static final void glDeleteLists( int a0, int a1 )
	{
		gl.glDeleteLists( a0, a1 );
	}
	public static final void glDeleteObjectARB( int a0 )
	{
		gl.glDeleteObjectARB( a0 );
	}
	public static final void glDeleteOcclusionQueriesNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteOcclusionQueriesNV( a0, a1 );
	}
	public static final void glDeleteOcclusionQueriesNV( int a0, int[] a1, int a2 )
	{
		gl.glDeleteOcclusionQueriesNV( a0, a1, a2 );
	}
	public static final void glDeleteProgram( int a0 )
	{
		gl.glDeleteProgram( a0 );
	}
	public static final void glDeleteProgramsARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteProgramsARB( a0, a1 );
	}
	public static final void glDeleteProgramsARB( int a0, int[] a1, int a2 )
	{
		gl.glDeleteProgramsARB( a0, a1, a2 );
	}
	public static final void glDeleteProgramsNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteProgramsNV( a0, a1 );
	}
	public static final void glDeleteProgramsNV( int a0, int[] a1, int a2 )
	{
		gl.glDeleteProgramsNV( a0, a1, a2 );
	}
	public static final void glDeleteQueries( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteQueries( a0, a1 );
	}
	public static final void glDeleteQueries( int a0, int[] a1, int a2 )
	{
		gl.glDeleteQueries( a0, a1, a2 );
	}
	public static final void glDeleteQueriesARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteQueriesARB( a0, a1 );
	}
	public static final void glDeleteQueriesARB( int a0, int[] a1, int a2 )
	{
		gl.glDeleteQueriesARB( a0, a1, a2 );
	}
	public static final void glDeleteRenderbuffersEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteRenderbuffersEXT( a0, a1 );
	}
	public static final void glDeleteRenderbuffersEXT( int a0, int[] a1, int a2 )
	{
		gl.glDeleteRenderbuffersEXT( a0, a1, a2 );
	}
	public static final void glDeleteShader( int a0 )
	{
		gl.glDeleteShader( a0 );
	}
	public static final void glDeleteTextures( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteTextures( a0, a1 );
	}
	public static final void glDeleteTextures( int a0, int[] a1, int a2 )
	{
		gl.glDeleteTextures( a0, a1, a2 );
	}
	public static final void glDeleteVertexArraysAPPLE( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDeleteVertexArraysAPPLE( a0, a1 );
	}
	public static final void glDeleteVertexArraysAPPLE( int a0, int[] a1, int a2 )
	{
		gl.glDeleteVertexArraysAPPLE( a0, a1, a2 );
	}
	public static final void glDeleteVertexShaderEXT( int a0 )
	{
		gl.glDeleteVertexShaderEXT( a0 );
	}
	public static final void glDepthBoundsEXT( double a0, double a1 )
	{
		gl.glDepthBoundsEXT( a0, a1 );
	}
	public static final void glDepthBoundsdNV( double a0, double a1 )
	{
		gl.glDepthBoundsdNV( a0, a1 );
	}
	public static final void glDepthFunc( int a0 )
	{
		gl.glDepthFunc( a0 );
	}
	public static final void glDepthMask( boolean a0 )
	{
		gl.glDepthMask( a0 );
	}
	public static final void glDepthRange( double a0, double a1 )
	{
		gl.glDepthRange( a0, a1 );
	}
	public static final void glDepthRangedNV( double a0, double a1 )
	{
		gl.glDepthRangedNV( a0, a1 );
	}
	public static final void glDetachObjectARB( int a0, int a1 )
	{
		gl.glDetachObjectARB( a0, a1 );
	}
	public static final void glDetachShader( int a0, int a1 )
	{
		gl.glDetachShader( a0, a1 );
	}
	public static final void glDetailTexFuncSGIS( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glDetailTexFuncSGIS( a0, a1, a2 );
	}
	public static final void glDetailTexFuncSGIS( int a0, int a1, float[] a2, int a3 )
	{
		gl.glDetailTexFuncSGIS( a0, a1, a2, a3 );
	}
	public static final void glDisable( int a0 )
	{
		gl.glDisable( a0 );
	}
	public static final void glDisableClientState( int a0 )
	{
		gl.glDisableClientState( a0 );
	}
	public static final void glDisableIndexedEXT( int a0, int a1 )
	{
		gl.glDisableIndexedEXT( a0, a1 );
	}
	public static final void glDisableVariantClientStateEXT( int a0 )
	{
		gl.glDisableVariantClientStateEXT( a0 );
	}
	public static final void glDisableVertexAttribAPPLE( int a0, int a1 )
	{
		gl.glDisableVertexAttribAPPLE( a0, a1 );
	}
	public static final void glDisableVertexAttribArray( int a0 )
	{
		gl.glDisableVertexAttribArray( a0 );
	}
	public static final void glDisableVertexAttribArrayARB( int a0 )
	{
		gl.glDisableVertexAttribArrayARB( a0 );
	}
	public static final void glDrawArrays( int a0, int a1, int a2 )
	{
		gl.glDrawArrays( a0, a1, a2 );
	}
	public static final void glDrawArraysInstancedEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glDrawArraysInstancedEXT( a0, a1, a2, a3 );
	}
	public static final void glDrawBuffer( int a0 )
	{
		gl.glDrawBuffer( a0 );
	}
	public static final void glDrawBufferRegion( int a0, int a1, int a2, int a3, int a4, int a5, int a6 )
	{
		gl.glDrawBufferRegion( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glDrawBuffers( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDrawBuffers( a0, a1 );
	}
	public static final void glDrawBuffers( int a0, int[] a1, int a2 )
	{
		gl.glDrawBuffers( a0, a1, a2 );
	}
	public static final void glDrawBuffersARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDrawBuffersARB( a0, a1 );
	}
	public static final void glDrawBuffersARB( int a0, int[] a1, int a2 )
	{
		gl.glDrawBuffersARB( a0, a1, a2 );
	}
	public static final void glDrawBuffersATI( int a0, java.nio.IntBuffer a1 )
	{
		gl.glDrawBuffersATI( a0, a1 );
	}
	public static final void glDrawBuffersATI( int a0, int[] a1, int a2 )
	{
		gl.glDrawBuffersATI( a0, a1, a2 );
	}
	public static final void glDrawElementArrayAPPLE( int a0, int a1, int a2 )
	{
		gl.glDrawElementArrayAPPLE( a0, a1, a2 );
	}
	public static final void glDrawElementArrayATI( int a0, int a1 )
	{
		gl.glDrawElementArrayATI( a0, a1 );
	}
	public static final void glDrawElements( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glDrawElements( a0, a1, a2, a3 );
	}
	public static final void glDrawElements( int a0, int a1, int a2, long a3 )
	{
		gl.glDrawElements( a0, a1, a2, a3 );
	}
	public static final void glDrawElementsInstancedEXT( int a0, int a1, int a2, java.nio.Buffer a3, int a4 )
	{
		gl.glDrawElementsInstancedEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glDrawMeshArraysSUN( int a0, int a1, int a2, int a3 )
	{
		gl.glDrawMeshArraysSUN( a0, a1, a2, a3 );
	}
	public static final void glDrawPixels( int a0, int a1, int a2, int a3, java.nio.Buffer a4 )
	{
		gl.glDrawPixels( a0, a1, a2, a3, a4 );
	}
	public static final void glDrawPixels( int a0, int a1, int a2, int a3, long a4 )
	{
		gl.glDrawPixels( a0, a1, a2, a3, a4 );
	}
	public static final void glDrawRangeElementArrayAPPLE( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glDrawRangeElementArrayAPPLE( a0, a1, a2, a3, a4 );
	}
	public static final void glDrawRangeElementArrayATI( int a0, int a1, int a2, int a3 )
	{
		gl.glDrawRangeElementArrayATI( a0, a1, a2, a3 );
	}
	public static final void glDrawRangeElements( int a0, int a1, int a2, int a3, int a4, java.nio.Buffer a5 )
	{
		gl.glDrawRangeElements( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glDrawRangeElements( int a0, int a1, int a2, int a3, int a4, long a5 )
	{
		gl.glDrawRangeElements( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glEdgeFlag( boolean a0 )
	{
		gl.glEdgeFlag( a0 );
	}
	public static final void glEdgeFlagPointer( int a0, java.nio.Buffer a1 )
	{
		gl.glEdgeFlagPointer( a0, a1 );
	}
	public static final void glEdgeFlagPointer( int a0, long a1 )
	{
		gl.glEdgeFlagPointer( a0, a1 );
	}
	public static final void glEdgeFlagv( java.nio.ByteBuffer a0 )
	{
		gl.glEdgeFlagv( a0 );
	}
	public static final void glEdgeFlagv( byte[] a0, int a1 )
	{
		gl.glEdgeFlagv( a0, a1 );
	}
	public static final void glElementPointerAPPLE( int a0, java.nio.Buffer a1 )
	{
		gl.glElementPointerAPPLE( a0, a1 );
	}
	public static final void glElementPointerATI( int a0, java.nio.Buffer a1 )
	{
		gl.glElementPointerATI( a0, a1 );
	}
	public static final void glElementPointerATI( int a0, long a1 )
	{
		gl.glElementPointerATI( a0, a1 );
	}
	public static final void glEnable( int a0 )
	{
		gl.glEnable( a0 );
	}
	public static final void glEnableClientState( int a0 )
	{
		gl.glEnableClientState( a0 );
	}
	public static final void glEnableIndexedEXT( int a0, int a1 )
	{
		gl.glEnableIndexedEXT( a0, a1 );
	}
	public static final void glEnableVariantClientStateEXT( int a0 )
	{
		gl.glEnableVariantClientStateEXT( a0 );
	}
	public static final void glEnableVertexAttribAPPLE( int a0, int a1 )
	{
		gl.glEnableVertexAttribAPPLE( a0, a1 );
	}
	public static final void glEnableVertexAttribArray( int a0 )
	{
		gl.glEnableVertexAttribArray( a0 );
	}
	public static final void glEnableVertexAttribArrayARB( int a0 )
	{
		gl.glEnableVertexAttribArrayARB( a0 );
	}
	public static final void glEnd()
	{
		gl.glEnd();
	}
	public static final void glEndFragmentShaderATI()
	{
		gl.glEndFragmentShaderATI();
	}
	public static final void glEndList()
	{
		gl.glEndList();
	}
	public static final void glEndOcclusionQueryNV()
	{
		gl.glEndOcclusionQueryNV();
	}
	public static final void glEndQuery( int a0 )
	{
		gl.glEndQuery( a0 );
	}
	public static final void glEndQueryARB( int a0 )
	{
		gl.glEndQueryARB( a0 );
	}
	public static final void glEndTransformFeedbackNV()
	{
		gl.glEndTransformFeedbackNV();
	}
	public static final void glEndVertexShaderEXT()
	{
		gl.glEndVertexShaderEXT();
	}
	public static final void glEvalCoord1d( double a0 )
	{
		gl.glEvalCoord1d( a0 );
	}
	public static final void glEvalCoord1dv( java.nio.DoubleBuffer a0 )
	{
		gl.glEvalCoord1dv( a0 );
	}
	public static final void glEvalCoord1dv( double[] a0, int a1 )
	{
		gl.glEvalCoord1dv( a0, a1 );
	}
	public static final void glEvalCoord1f( float a0 )
	{
		gl.glEvalCoord1f( a0 );
	}
	public static final void glEvalCoord1fv( java.nio.FloatBuffer a0 )
	{
		gl.glEvalCoord1fv( a0 );
	}
	public static final void glEvalCoord1fv( float[] a0, int a1 )
	{
		gl.glEvalCoord1fv( a0, a1 );
	}
	public static final void glEvalCoord2d( double a0, double a1 )
	{
		gl.glEvalCoord2d( a0, a1 );
	}
	public static final void glEvalCoord2dv( java.nio.DoubleBuffer a0 )
	{
		gl.glEvalCoord2dv( a0 );
	}
	public static final void glEvalCoord2dv( double[] a0, int a1 )
	{
		gl.glEvalCoord2dv( a0, a1 );
	}
	public static final void glEvalCoord2f( float a0, float a1 )
	{
		gl.glEvalCoord2f( a0, a1 );
	}
	public static final void glEvalCoord2fv( java.nio.FloatBuffer a0 )
	{
		gl.glEvalCoord2fv( a0 );
	}
	public static final void glEvalCoord2fv( float[] a0, int a1 )
	{
		gl.glEvalCoord2fv( a0, a1 );
	}
	public static final void glEvalMapsNV( int a0, int a1 )
	{
		gl.glEvalMapsNV( a0, a1 );
	}
	public static final void glEvalMesh1( int a0, int a1, int a2 )
	{
		gl.glEvalMesh1( a0, a1, a2 );
	}
	public static final void glEvalMesh2( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glEvalMesh2( a0, a1, a2, a3, a4 );
	}
	public static final void glEvalPoint1( int a0 )
	{
		gl.glEvalPoint1( a0 );
	}
	public static final void glEvalPoint2( int a0, int a1 )
	{
		gl.glEvalPoint2( a0, a1 );
	}
	public static final void glExecuteProgramNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glExecuteProgramNV( a0, a1, a2 );
	}
	public static final void glExecuteProgramNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glExecuteProgramNV( a0, a1, a2, a3 );
	}
	public static final void glExtractComponentEXT( int a0, int a1, int a2 )
	{
		gl.glExtractComponentEXT( a0, a1, a2 );
	}
	public static final void glFeedbackBuffer( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glFeedbackBuffer( a0, a1, a2 );
	}
	public static final void glFinalCombinerInputNV( int a0, int a1, int a2, int a3 )
	{
		gl.glFinalCombinerInputNV( a0, a1, a2, a3 );
	}
	public static final void glFinish()
	{
		gl.glFinish();
	}
	public static final int glFinishAsyncSGIX( java.nio.IntBuffer a0 )
	{
		return gl.glFinishAsyncSGIX( a0 );
	}
	public static final int glFinishAsyncSGIX( int[] a0, int a1 )
	{
		return gl.glFinishAsyncSGIX( a0, a1 );
	}
	public static final void glFinishFenceAPPLE( int a0 )
	{
		gl.glFinishFenceAPPLE( a0 );
	}
	public static final void glFinishFenceNV( int a0 )
	{
		gl.glFinishFenceNV( a0 );
	}
	public static final void glFinishObjectAPPLE( int a0, int a1 )
	{
		gl.glFinishObjectAPPLE( a0, a1 );
	}
	public static final void glFinishRenderAPPLE()
	{
		gl.glFinishRenderAPPLE();
	}
	public static final void glFinishTextureSUNX()
	{
		gl.glFinishTextureSUNX();
	}
	public static final void glFlush()
	{
		gl.glFlush();
	}
	public static final void glFlushMappedBufferRangeAPPLE( int a0, int a1, int a2 )
	{
		gl.glFlushMappedBufferRangeAPPLE( a0, a1, a2 );
	}
	public static final void glFlushPixelDataRangeNV( int a0 )
	{
		gl.glFlushPixelDataRangeNV( a0 );
	}
	public static final void glFlushRasterSGIX()
	{
		gl.glFlushRasterSGIX();
	}
	public static final void glFlushRenderAPPLE()
	{
		gl.glFlushRenderAPPLE();
	}
	public static final void glFlushVertexArrayRangeAPPLE( int a0, java.nio.Buffer a1 )
	{
		gl.glFlushVertexArrayRangeAPPLE( a0, a1 );
	}
	public static final void glFlushVertexArrayRangeNV()
	{
		gl.glFlushVertexArrayRangeNV();
	}
	public static final void glFogCoordPointer( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glFogCoordPointer( a0, a1, a2 );
	}
	public static final void glFogCoordPointer( int a0, int a1, long a2 )
	{
		gl.glFogCoordPointer( a0, a1, a2 );
	}
	public static final void glFogCoordPointerEXT( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glFogCoordPointerEXT( a0, a1, a2 );
	}
	public static final void glFogCoordPointerEXT( int a0, int a1, long a2 )
	{
		gl.glFogCoordPointerEXT( a0, a1, a2 );
	}
	public static final void glFogCoordd( double a0 )
	{
		gl.glFogCoordd( a0 );
	}
	public static final void glFogCoorddEXT( double a0 )
	{
		gl.glFogCoorddEXT( a0 );
	}
	public static final void glFogCoorddv( java.nio.DoubleBuffer a0 )
	{
		gl.glFogCoorddv( a0 );
	}
	public static final void glFogCoorddv( double[] a0, int a1 )
	{
		gl.glFogCoorddv( a0, a1 );
	}
	public static final void glFogCoorddvEXT( java.nio.DoubleBuffer a0 )
	{
		gl.glFogCoorddvEXT( a0 );
	}
	public static final void glFogCoorddvEXT( double[] a0, int a1 )
	{
		gl.glFogCoorddvEXT( a0, a1 );
	}
	public static final void glFogCoordf( float a0 )
	{
		gl.glFogCoordf( a0 );
	}
	public static final void glFogCoordfEXT( float a0 )
	{
		gl.glFogCoordfEXT( a0 );
	}
	public static final void glFogCoordfv( java.nio.FloatBuffer a0 )
	{
		gl.glFogCoordfv( a0 );
	}
	public static final void glFogCoordfv( float[] a0, int a1 )
	{
		gl.glFogCoordfv( a0, a1 );
	}
	public static final void glFogCoordfvEXT( java.nio.FloatBuffer a0 )
	{
		gl.glFogCoordfvEXT( a0 );
	}
	public static final void glFogCoordfvEXT( float[] a0, int a1 )
	{
		gl.glFogCoordfvEXT( a0, a1 );
	}
	public static final void glFogCoordhNV( short a0 )
	{
		gl.glFogCoordhNV( a0 );
	}
	public static final void glFogCoordhvNV( java.nio.ShortBuffer a0 )
	{
		gl.glFogCoordhvNV( a0 );
	}
	public static final void glFogCoordhvNV( short[] a0, int a1 )
	{
		gl.glFogCoordhvNV( a0, a1 );
	}
	public static final void glFogFuncSGIS( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glFogFuncSGIS( a0, a1 );
	}
	public static final void glFogFuncSGIS( int a0, float[] a1, int a2 )
	{
		gl.glFogFuncSGIS( a0, a1, a2 );
	}
	public static final void glFogf( int a0, float a1 )
	{
		gl.glFogf( a0, a1 );
	}
	public static final void glFogfv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glFogfv( a0, a1 );
	}
	public static final void glFogfv( int a0, float[] a1, int a2 )
	{
		gl.glFogfv( a0, a1, a2 );
	}
	public static final void glFogi( int a0, int a1 )
	{
		gl.glFogi( a0, a1 );
	}
	public static final void glFogiv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glFogiv( a0, a1 );
	}
	public static final void glFogiv( int a0, int[] a1, int a2 )
	{
		gl.glFogiv( a0, a1, a2 );
	}
	public static final void glFragmentColorMaterialSGIX( int a0, int a1 )
	{
		gl.glFragmentColorMaterialSGIX( a0, a1 );
	}
	public static final void glFragmentLightModelfSGIX( int a0, float a1 )
	{
		gl.glFragmentLightModelfSGIX( a0, a1 );
	}
	public static final void glFragmentLightModelfvSGIX( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glFragmentLightModelfvSGIX( a0, a1 );
	}
	public static final void glFragmentLightModelfvSGIX( int a0, float[] a1, int a2 )
	{
		gl.glFragmentLightModelfvSGIX( a0, a1, a2 );
	}
	public static final void glFragmentLightModeliSGIX( int a0, int a1 )
	{
		gl.glFragmentLightModeliSGIX( a0, a1 );
	}
	public static final void glFragmentLightModelivSGIX( int a0, java.nio.IntBuffer a1 )
	{
		gl.glFragmentLightModelivSGIX( a0, a1 );
	}
	public static final void glFragmentLightModelivSGIX( int a0, int[] a1, int a2 )
	{
		gl.glFragmentLightModelivSGIX( a0, a1, a2 );
	}
	public static final void glFragmentLightfSGIX( int a0, int a1, float a2 )
	{
		gl.glFragmentLightfSGIX( a0, a1, a2 );
	}
	public static final void glFragmentLightfvSGIX( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glFragmentLightfvSGIX( a0, a1, a2 );
	}
	public static final void glFragmentLightfvSGIX( int a0, int a1, float[] a2, int a3 )
	{
		gl.glFragmentLightfvSGIX( a0, a1, a2, a3 );
	}
	public static final void glFragmentLightiSGIX( int a0, int a1, int a2 )
	{
		gl.glFragmentLightiSGIX( a0, a1, a2 );
	}
	public static final void glFragmentLightivSGIX( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glFragmentLightivSGIX( a0, a1, a2 );
	}
	public static final void glFragmentLightivSGIX( int a0, int a1, int[] a2, int a3 )
	{
		gl.glFragmentLightivSGIX( a0, a1, a2, a3 );
	}
	public static final void glFragmentMaterialfSGIX( int a0, int a1, float a2 )
	{
		gl.glFragmentMaterialfSGIX( a0, a1, a2 );
	}
	public static final void glFragmentMaterialfvSGIX( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glFragmentMaterialfvSGIX( a0, a1, a2 );
	}
	public static final void glFragmentMaterialfvSGIX( int a0, int a1, float[] a2, int a3 )
	{
		gl.glFragmentMaterialfvSGIX( a0, a1, a2, a3 );
	}
	public static final void glFragmentMaterialiSGIX( int a0, int a1, int a2 )
	{
		gl.glFragmentMaterialiSGIX( a0, a1, a2 );
	}
	public static final void glFragmentMaterialivSGIX( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glFragmentMaterialivSGIX( a0, a1, a2 );
	}
	public static final void glFragmentMaterialivSGIX( int a0, int a1, int[] a2, int a3 )
	{
		gl.glFragmentMaterialivSGIX( a0, a1, a2, a3 );
	}
	public static final void glFrameZoomSGIX( int a0 )
	{
		gl.glFrameZoomSGIX( a0 );
	}
	public static final void glFramebufferRenderbufferEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glFramebufferRenderbufferEXT( a0, a1, a2, a3 );
	}
	public static final void glFramebufferTexture1DEXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glFramebufferTexture1DEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glFramebufferTexture2DEXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glFramebufferTexture2DEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glFramebufferTexture3DEXT( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glFramebufferTexture3DEXT( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glFramebufferTextureEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glFramebufferTextureEXT( a0, a1, a2, a3 );
	}
	public static final void glFramebufferTextureFaceEXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glFramebufferTextureFaceEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glFramebufferTextureLayerEXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glFramebufferTextureLayerEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glFreeObjectBufferATI( int a0 )
	{
		gl.glFreeObjectBufferATI( a0 );
	}
	public static final void glFrontFace( int a0 )
	{
		gl.glFrontFace( a0 );
	}
	public static final void glFrustum( double a0, double a1, double a2, double a3, double a4, double a5 )
	{
		gl.glFrustum( a0, a1, a2, a3, a4, a5 );
	}
	public static final int glGenAsyncMarkersSGIX( int a0 )
	{
		return gl.glGenAsyncMarkersSGIX( a0 );
	}
	public static final void glGenBuffers( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenBuffers( a0, a1 );
	}
	public static final void glGenBuffers( int a0, int[] a1, int a2 )
	{
		gl.glGenBuffers( a0, a1, a2 );
	}
	public static final void glGenBuffersARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenBuffersARB( a0, a1 );
	}
	public static final void glGenBuffersARB( int a0, int[] a1, int a2 )
	{
		gl.glGenBuffersARB( a0, a1, a2 );
	}
	public static final void glGenFencesAPPLE( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenFencesAPPLE( a0, a1 );
	}
	public static final void glGenFencesAPPLE( int a0, int[] a1, int a2 )
	{
		gl.glGenFencesAPPLE( a0, a1, a2 );
	}
	public static final void glGenFencesNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenFencesNV( a0, a1 );
	}
	public static final void glGenFencesNV( int a0, int[] a1, int a2 )
	{
		gl.glGenFencesNV( a0, a1, a2 );
	}
	public static final int glGenFragmentShadersATI( int a0 )
	{
		return gl.glGenFragmentShadersATI( a0 );
	}
	public static final void glGenFramebuffersEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenFramebuffersEXT( a0, a1 );
	}
	public static final void glGenFramebuffersEXT( int a0, int[] a1, int a2 )
	{
		gl.glGenFramebuffersEXT( a0, a1, a2 );
	}
	public static final int glGenLists( int a0 )
	{
		return gl.glGenLists( a0 );
	}
	public static final void glGenOcclusionQueriesNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenOcclusionQueriesNV( a0, a1 );
	}
	public static final void glGenOcclusionQueriesNV( int a0, int[] a1, int a2 )
	{
		gl.glGenOcclusionQueriesNV( a0, a1, a2 );
	}
	public static final void glGenProgramsARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenProgramsARB( a0, a1 );
	}
	public static final void glGenProgramsARB( int a0, int[] a1, int a2 )
	{
		gl.glGenProgramsARB( a0, a1, a2 );
	}
	public static final void glGenProgramsNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenProgramsNV( a0, a1 );
	}
	public static final void glGenProgramsNV( int a0, int[] a1, int a2 )
	{
		gl.glGenProgramsNV( a0, a1, a2 );
	}
	public static final void glGenQueries( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenQueries( a0, a1 );
	}
	public static final void glGenQueries( int a0, int[] a1, int a2 )
	{
		gl.glGenQueries( a0, a1, a2 );
	}
	public static final void glGenQueriesARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenQueriesARB( a0, a1 );
	}
	public static final void glGenQueriesARB( int a0, int[] a1, int a2 )
	{
		gl.glGenQueriesARB( a0, a1, a2 );
	}
	public static final void glGenRenderbuffersEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenRenderbuffersEXT( a0, a1 );
	}
	public static final void glGenRenderbuffersEXT( int a0, int[] a1, int a2 )
	{
		gl.glGenRenderbuffersEXT( a0, a1, a2 );
	}
	public static final int glGenSymbolsEXT( int a0, int a1, int a2, int a3 )
	{
		return gl.glGenSymbolsEXT( a0, a1, a2, a3 );
	}
	public static final void glGenTextures( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenTextures( a0, a1 );
	}
	public static final void glGenTextures( int a0, int[] a1, int a2 )
	{
		gl.glGenTextures( a0, a1, a2 );
	}
	public static final void glGenVertexArraysAPPLE( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGenVertexArraysAPPLE( a0, a1 );
	}
	public static final void glGenVertexArraysAPPLE( int a0, int[] a1, int a2 )
	{
		gl.glGenVertexArraysAPPLE( a0, a1, a2 );
	}
	public static final int glGenVertexShadersEXT( int a0 )
	{
		return gl.glGenVertexShadersEXT( a0 );
	}
	public static final void glGenerateMipmapEXT( int a0 )
	{
		gl.glGenerateMipmapEXT( a0 );
	}
	public static final void glGetActiveAttrib( int a0, int a1, int a2, java.nio.IntBuffer a3, java.nio.IntBuffer a4, java.nio.IntBuffer a5, java.nio.ByteBuffer a6 )
	{
		gl.glGetActiveAttrib( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glGetActiveAttrib( int a0, int a1, int a2, int[] a3, int a4, int[] a5, int a6, int[] a7, int a8, byte[] a9, int a10 )
	{
		gl.glGetActiveAttrib( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glGetActiveAttribARB( int a0, int a1, int a2, java.nio.IntBuffer a3, java.nio.IntBuffer a4, java.nio.IntBuffer a5, java.nio.ByteBuffer a6 )
	{
		gl.glGetActiveAttribARB( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glGetActiveAttribARB( int a0, int a1, int a2, int[] a3, int a4, int[] a5, int a6, int[] a7, int a8, byte[] a9, int a10 )
	{
		gl.glGetActiveAttribARB( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glGetActiveUniform( int a0, int a1, int a2, java.nio.IntBuffer a3, java.nio.IntBuffer a4, java.nio.IntBuffer a5, java.nio.ByteBuffer a6 )
	{
		gl.glGetActiveUniform( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glGetActiveUniform( int a0, int a1, int a2, int[] a3, int a4, int[] a5, int a6, int[] a7, int a8, byte[] a9, int a10 )
	{
		gl.glGetActiveUniform( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glGetActiveUniformARB( int a0, int a1, int a2, java.nio.IntBuffer a3, java.nio.IntBuffer a4, java.nio.IntBuffer a5, java.nio.ByteBuffer a6 )
	{
		gl.glGetActiveUniformARB( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glGetActiveUniformARB( int a0, int a1, int a2, int[] a3, int a4, int[] a5, int a6, int[] a7, int a8, byte[] a9, int a10 )
	{
		gl.glGetActiveUniformARB( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glGetActiveVaryingNV( int a0, int a1, int a2, java.nio.IntBuffer a3, java.nio.IntBuffer a4, java.nio.IntBuffer a5, java.nio.ByteBuffer a6 )
	{
		gl.glGetActiveVaryingNV( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glGetActiveVaryingNV( int a0, int a1, int a2, int[] a3, int a4, int[] a5, int a6, int[] a7, int a8, byte[] a9, int a10 )
	{
		gl.glGetActiveVaryingNV( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glGetArrayObjectfvATI( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetArrayObjectfvATI( a0, a1, a2 );
	}
	public static final void glGetArrayObjectfvATI( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetArrayObjectfvATI( a0, a1, a2, a3 );
	}
	public static final void glGetArrayObjectivATI( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetArrayObjectivATI( a0, a1, a2 );
	}
	public static final void glGetArrayObjectivATI( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetArrayObjectivATI( a0, a1, a2, a3 );
	}
	public static final void glGetAttachedObjectsARB( int a0, int a1, java.nio.IntBuffer a2, java.nio.IntBuffer a3 )
	{
		gl.glGetAttachedObjectsARB( a0, a1, a2, a3 );
	}
	public static final void glGetAttachedObjectsARB( int a0, int a1, int[] a2, int a3, int[] a4, int a5 )
	{
		gl.glGetAttachedObjectsARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetAttachedShaders( int a0, int a1, java.nio.IntBuffer a2, java.nio.IntBuffer a3 )
	{
		gl.glGetAttachedShaders( a0, a1, a2, a3 );
	}
	public static final void glGetAttachedShaders( int a0, int a1, int[] a2, int a3, int[] a4, int a5 )
	{
		gl.glGetAttachedShaders( a0, a1, a2, a3, a4, a5 );
	}
	public static final int glGetAttribLocation( int a0, java.lang.String a1 )
	{
		return gl.glGetAttribLocation( a0, a1 );
	}
	public static final int glGetAttribLocationARB( int a0, java.lang.String a1 )
	{
		return gl.glGetAttribLocationARB( a0, a1 );
	}
	public static final void glGetBooleanIndexedvEXT( int a0, int a1, java.nio.ByteBuffer a2 )
	{
		gl.glGetBooleanIndexedvEXT( a0, a1, a2 );
	}
	public static final void glGetBooleanIndexedvEXT( int a0, int a1, byte[] a2, int a3 )
	{
		gl.glGetBooleanIndexedvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetBooleanv( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glGetBooleanv( a0, a1 );
	}
	public static final void glGetBooleanv( int a0, byte[] a1, int a2 )
	{
		gl.glGetBooleanv( a0, a1, a2 );
	}
	public static final void glGetBufferParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetBufferParameteriv( a0, a1, a2 );
	}
	public static final void glGetBufferParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetBufferParameteriv( a0, a1, a2, a3 );
	}
	public static final void glGetBufferParameterivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetBufferParameterivARB( a0, a1, a2 );
	}
	public static final void glGetBufferParameterivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetBufferParameterivARB( a0, a1, a2, a3 );
	}
	public static final void glGetBufferSubData( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glGetBufferSubData( a0, a1, a2, a3 );
	}
	public static final void glGetBufferSubDataARB( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glGetBufferSubDataARB( a0, a1, a2, a3 );
	}
	public static final void glGetClipPlane( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glGetClipPlane( a0, a1 );
	}
	public static final void glGetClipPlane( int a0, double[] a1, int a2 )
	{
		gl.glGetClipPlane( a0, a1, a2 );
	}
	public static final void glGetColorTable( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glGetColorTable( a0, a1, a2, a3 );
	}
	public static final void glGetColorTable( int a0, int a1, int a2, long a3 )
	{
		gl.glGetColorTable( a0, a1, a2, a3 );
	}
	public static final void glGetColorTableEXT( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glGetColorTableEXT( a0, a1, a2, a3 );
	}
	public static final void glGetColorTableParameterfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetColorTableParameterfv( a0, a1, a2 );
	}
	public static final void glGetColorTableParameterfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetColorTableParameterfv( a0, a1, a2, a3 );
	}
	public static final void glGetColorTableParameterfvEXT( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetColorTableParameterfvEXT( a0, a1, a2 );
	}
	public static final void glGetColorTableParameterfvEXT( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetColorTableParameterfvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetColorTableParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetColorTableParameteriv( a0, a1, a2 );
	}
	public static final void glGetColorTableParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetColorTableParameteriv( a0, a1, a2, a3 );
	}
	public static final void glGetColorTableParameterivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetColorTableParameterivEXT( a0, a1, a2 );
	}
	public static final void glGetColorTableParameterivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetColorTableParameterivEXT( a0, a1, a2, a3 );
	}
	public static final void glGetCombinerInputParameterfvNV( int a0, int a1, int a2, int a3, java.nio.FloatBuffer a4 )
	{
		gl.glGetCombinerInputParameterfvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetCombinerInputParameterfvNV( int a0, int a1, int a2, int a3, float[] a4, int a5 )
	{
		gl.glGetCombinerInputParameterfvNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetCombinerInputParameterivNV( int a0, int a1, int a2, int a3, java.nio.IntBuffer a4 )
	{
		gl.glGetCombinerInputParameterivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetCombinerInputParameterivNV( int a0, int a1, int a2, int a3, int[] a4, int a5 )
	{
		gl.glGetCombinerInputParameterivNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetCombinerOutputParameterfvNV( int a0, int a1, int a2, java.nio.FloatBuffer a3 )
	{
		gl.glGetCombinerOutputParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glGetCombinerOutputParameterfvNV( int a0, int a1, int a2, float[] a3, int a4 )
	{
		gl.glGetCombinerOutputParameterfvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetCombinerOutputParameterivNV( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glGetCombinerOutputParameterivNV( a0, a1, a2, a3 );
	}
	public static final void glGetCombinerOutputParameterivNV( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glGetCombinerOutputParameterivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetCombinerStageParameterfvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetCombinerStageParameterfvNV( a0, a1, a2 );
	}
	public static final void glGetCombinerStageParameterfvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetCombinerStageParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glGetCompressedTexImage( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glGetCompressedTexImage( a0, a1, a2 );
	}
	public static final void glGetCompressedTexImage( int a0, int a1, long a2 )
	{
		gl.glGetCompressedTexImage( a0, a1, a2 );
	}
	public static final void glGetConvolutionFilter( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glGetConvolutionFilter( a0, a1, a2, a3 );
	}
	public static final void glGetConvolutionFilter( int a0, int a1, int a2, long a3 )
	{
		gl.glGetConvolutionFilter( a0, a1, a2, a3 );
	}
	public static final void glGetConvolutionParameterfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetConvolutionParameterfv( a0, a1, a2 );
	}
	public static final void glGetConvolutionParameterfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetConvolutionParameterfv( a0, a1, a2, a3 );
	}
	public static final void glGetConvolutionParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetConvolutionParameteriv( a0, a1, a2 );
	}
	public static final void glGetConvolutionParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetConvolutionParameteriv( a0, a1, a2, a3 );
	}
	public static final void glGetDetailTexFuncSGIS( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glGetDetailTexFuncSGIS( a0, a1 );
	}
	public static final void glGetDetailTexFuncSGIS( int a0, float[] a1, int a2 )
	{
		gl.glGetDetailTexFuncSGIS( a0, a1, a2 );
	}
	public static final void glGetDoublev( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glGetDoublev( a0, a1 );
	}
	public static final void glGetDoublev( int a0, double[] a1, int a2 )
	{
		gl.glGetDoublev( a0, a1, a2 );
	}
	public static final int glGetError()
	{
		return gl.glGetError();
	}
	public static final void glGetFenceivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetFenceivNV( a0, a1, a2 );
	}
	public static final void glGetFenceivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetFenceivNV( a0, a1, a2, a3 );
	}
	public static final void glGetFinalCombinerInputParameterfvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetFinalCombinerInputParameterfvNV( a0, a1, a2 );
	}
	public static final void glGetFinalCombinerInputParameterfvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetFinalCombinerInputParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glGetFinalCombinerInputParameterivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetFinalCombinerInputParameterivNV( a0, a1, a2 );
	}
	public static final void glGetFinalCombinerInputParameterivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetFinalCombinerInputParameterivNV( a0, a1, a2, a3 );
	}
	public static final void glGetFloatv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glGetFloatv( a0, a1 );
	}
	public static final void glGetFloatv( int a0, float[] a1, int a2 )
	{
		gl.glGetFloatv( a0, a1, a2 );
	}
	public static final void glGetFogFuncSGIS( java.nio.FloatBuffer a0 )
	{
		gl.glGetFogFuncSGIS( a0 );
	}
	public static final void glGetFogFuncSGIS( float[] a0, int a1 )
	{
		gl.glGetFogFuncSGIS( a0, a1 );
	}
	public static final int glGetFragDataLocationEXT( int a0, java.nio.ByteBuffer a1 )
	{
		return gl.glGetFragDataLocationEXT( a0, a1 );
	}
	public static final int glGetFragDataLocationEXT( int a0, byte[] a1, int a2 )
	{
		return gl.glGetFragDataLocationEXT( a0, a1, a2 );
	}
	public static final void glGetFragmentLightfvSGIX( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetFragmentLightfvSGIX( a0, a1, a2 );
	}
	public static final void glGetFragmentLightfvSGIX( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetFragmentLightfvSGIX( a0, a1, a2, a3 );
	}
	public static final void glGetFragmentLightivSGIX( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetFragmentLightivSGIX( a0, a1, a2 );
	}
	public static final void glGetFragmentLightivSGIX( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetFragmentLightivSGIX( a0, a1, a2, a3 );
	}
	public static final void glGetFragmentMaterialfvSGIX( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetFragmentMaterialfvSGIX( a0, a1, a2 );
	}
	public static final void glGetFragmentMaterialfvSGIX( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetFragmentMaterialfvSGIX( a0, a1, a2, a3 );
	}
	public static final void glGetFragmentMaterialivSGIX( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetFragmentMaterialivSGIX( a0, a1, a2 );
	}
	public static final void glGetFragmentMaterialivSGIX( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetFragmentMaterialivSGIX( a0, a1, a2, a3 );
	}
	public static final void glGetFramebufferAttachmentParameterivEXT( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glGetFramebufferAttachmentParameterivEXT( a0, a1, a2, a3 );
	}
	public static final void glGetFramebufferAttachmentParameterivEXT( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glGetFramebufferAttachmentParameterivEXT( a0, a1, a2, a3, a4 );
	}
	public static final int glGetHandleARB( int a0 )
	{
		return gl.glGetHandleARB( a0 );
	}
	public static final void glGetHistogram( int a0, boolean a1, int a2, int a3, java.nio.Buffer a4 )
	{
		gl.glGetHistogram( a0, a1, a2, a3, a4 );
	}
	public static final void glGetHistogram( int a0, boolean a1, int a2, int a3, long a4 )
	{
		gl.glGetHistogram( a0, a1, a2, a3, a4 );
	}
	public static final void glGetHistogramParameterfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetHistogramParameterfv( a0, a1, a2 );
	}
	public static final void glGetHistogramParameterfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetHistogramParameterfv( a0, a1, a2, a3 );
	}
	public static final void glGetHistogramParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetHistogramParameteriv( a0, a1, a2 );
	}
	public static final void glGetHistogramParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetHistogramParameteriv( a0, a1, a2, a3 );
	}
	public static final void glGetImageTransformParameterfvHP( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetImageTransformParameterfvHP( a0, a1, a2 );
	}
	public static final void glGetImageTransformParameterfvHP( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetImageTransformParameterfvHP( a0, a1, a2, a3 );
	}
	public static final void glGetImageTransformParameterivHP( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetImageTransformParameterivHP( a0, a1, a2 );
	}
	public static final void glGetImageTransformParameterivHP( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetImageTransformParameterivHP( a0, a1, a2, a3 );
	}
	public static final void glGetInfoLogARB( int a0, int a1, java.nio.IntBuffer a2, java.nio.ByteBuffer a3 )
	{
		gl.glGetInfoLogARB( a0, a1, a2, a3 );
	}
	public static final void glGetInfoLogARB( int a0, int a1, int[] a2, int a3, byte[] a4, int a5 )
	{
		gl.glGetInfoLogARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final int glGetInstrumentsSGIX()
	{
		return gl.glGetInstrumentsSGIX();
	}
	public static final void glGetIntegerIndexedvEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetIntegerIndexedvEXT( a0, a1, a2 );
	}
	public static final void glGetIntegerIndexedvEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetIntegerIndexedvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetIntegerv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGetIntegerv( a0, a1 );
	}
	public static final void glGetIntegerv( int a0, int[] a1, int a2 )
	{
		gl.glGetIntegerv( a0, a1, a2 );
	}
	public static final void glGetInvariantBooleanvEXT( int a0, int a1, java.nio.ByteBuffer a2 )
	{
		gl.glGetInvariantBooleanvEXT( a0, a1, a2 );
	}
	public static final void glGetInvariantBooleanvEXT( int a0, int a1, byte[] a2, int a3 )
	{
		gl.glGetInvariantBooleanvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetInvariantFloatvEXT( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetInvariantFloatvEXT( a0, a1, a2 );
	}
	public static final void glGetInvariantFloatvEXT( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetInvariantFloatvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetInvariantIntegervEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetInvariantIntegervEXT( a0, a1, a2 );
	}
	public static final void glGetInvariantIntegervEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetInvariantIntegervEXT( a0, a1, a2, a3 );
	}
	public static final void glGetLightfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetLightfv( a0, a1, a2 );
	}
	public static final void glGetLightfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetLightfv( a0, a1, a2, a3 );
	}
	public static final void glGetLightiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetLightiv( a0, a1, a2 );
	}
	public static final void glGetLightiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetLightiv( a0, a1, a2, a3 );
	}
	public static final void glGetListParameterfvSGIX( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetListParameterfvSGIX( a0, a1, a2 );
	}
	public static final void glGetListParameterfvSGIX( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetListParameterfvSGIX( a0, a1, a2, a3 );
	}
	public static final void glGetListParameterivSGIX( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetListParameterivSGIX( a0, a1, a2 );
	}
	public static final void glGetListParameterivSGIX( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetListParameterivSGIX( a0, a1, a2, a3 );
	}
	public static final void glGetLocalConstantBooleanvEXT( int a0, int a1, java.nio.ByteBuffer a2 )
	{
		gl.glGetLocalConstantBooleanvEXT( a0, a1, a2 );
	}
	public static final void glGetLocalConstantBooleanvEXT( int a0, int a1, byte[] a2, int a3 )
	{
		gl.glGetLocalConstantBooleanvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetLocalConstantFloatvEXT( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetLocalConstantFloatvEXT( a0, a1, a2 );
	}
	public static final void glGetLocalConstantFloatvEXT( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetLocalConstantFloatvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetLocalConstantIntegervEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetLocalConstantIntegervEXT( a0, a1, a2 );
	}
	public static final void glGetLocalConstantIntegervEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetLocalConstantIntegervEXT( a0, a1, a2, a3 );
	}
	public static final void glGetMapAttribParameterfvNV( int a0, int a1, int a2, java.nio.FloatBuffer a3 )
	{
		gl.glGetMapAttribParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glGetMapAttribParameterfvNV( int a0, int a1, int a2, float[] a3, int a4 )
	{
		gl.glGetMapAttribParameterfvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetMapAttribParameterivNV( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glGetMapAttribParameterivNV( a0, a1, a2, a3 );
	}
	public static final void glGetMapAttribParameterivNV( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glGetMapAttribParameterivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetMapControlPointsNV( int a0, int a1, int a2, int a3, int a4, boolean a5, java.nio.Buffer a6 )
	{
		gl.glGetMapControlPointsNV( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glGetMapParameterfvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetMapParameterfvNV( a0, a1, a2 );
	}
	public static final void glGetMapParameterfvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetMapParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glGetMapParameterivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetMapParameterivNV( a0, a1, a2 );
	}
	public static final void glGetMapParameterivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetMapParameterivNV( a0, a1, a2, a3 );
	}
	public static final void glGetMapdv( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glGetMapdv( a0, a1, a2 );
	}
	public static final void glGetMapdv( int a0, int a1, double[] a2, int a3 )
	{
		gl.glGetMapdv( a0, a1, a2, a3 );
	}
	public static final void glGetMapfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetMapfv( a0, a1, a2 );
	}
	public static final void glGetMapfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetMapfv( a0, a1, a2, a3 );
	}
	public static final void glGetMapiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetMapiv( a0, a1, a2 );
	}
	public static final void glGetMapiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetMapiv( a0, a1, a2, a3 );
	}
	public static final void glGetMaterialfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetMaterialfv( a0, a1, a2 );
	}
	public static final void glGetMaterialfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetMaterialfv( a0, a1, a2, a3 );
	}
	public static final void glGetMaterialiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetMaterialiv( a0, a1, a2 );
	}
	public static final void glGetMaterialiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetMaterialiv( a0, a1, a2, a3 );
	}
	public static final void glGetMinmax( int a0, boolean a1, int a2, int a3, java.nio.Buffer a4 )
	{
		gl.glGetMinmax( a0, a1, a2, a3, a4 );
	}
	public static final void glGetMinmax( int a0, boolean a1, int a2, int a3, long a4 )
	{
		gl.glGetMinmax( a0, a1, a2, a3, a4 );
	}
	public static final void glGetMinmaxParameterfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetMinmaxParameterfv( a0, a1, a2 );
	}
	public static final void glGetMinmaxParameterfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetMinmaxParameterfv( a0, a1, a2, a3 );
	}
	public static final void glGetMinmaxParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetMinmaxParameteriv( a0, a1, a2 );
	}
	public static final void glGetMinmaxParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetMinmaxParameteriv( a0, a1, a2, a3 );
	}
	public static final void glGetObjectBufferfvATI( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetObjectBufferfvATI( a0, a1, a2 );
	}
	public static final void glGetObjectBufferfvATI( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetObjectBufferfvATI( a0, a1, a2, a3 );
	}
	public static final void glGetObjectBufferivATI( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetObjectBufferivATI( a0, a1, a2 );
	}
	public static final void glGetObjectBufferivATI( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetObjectBufferivATI( a0, a1, a2, a3 );
	}
	public static final void glGetObjectParameterfvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetObjectParameterfvARB( a0, a1, a2 );
	}
	public static final void glGetObjectParameterfvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetObjectParameterfvARB( a0, a1, a2, a3 );
	}
	public static final void glGetObjectParameterivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetObjectParameterivARB( a0, a1, a2 );
	}
	public static final void glGetObjectParameterivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetObjectParameterivARB( a0, a1, a2, a3 );
	}
	public static final void glGetOcclusionQueryivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetOcclusionQueryivNV( a0, a1, a2 );
	}
	public static final void glGetOcclusionQueryivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetOcclusionQueryivNV( a0, a1, a2, a3 );
	}
	public static final void glGetOcclusionQueryuivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetOcclusionQueryuivNV( a0, a1, a2 );
	}
	public static final void glGetOcclusionQueryuivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetOcclusionQueryuivNV( a0, a1, a2, a3 );
	}
	public static final void glGetPixelMapfv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glGetPixelMapfv( a0, a1 );
	}
	public static final void glGetPixelMapfv( int a0, float[] a1, int a2 )
	{
		gl.glGetPixelMapfv( a0, a1, a2 );
	}
	public static final void glGetPixelMapfv( int a0, long a1 )
	{
		gl.glGetPixelMapfv( a0, a1 );
	}
	public static final void glGetPixelMapuiv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGetPixelMapuiv( a0, a1 );
	}
	public static final void glGetPixelMapuiv( int a0, int[] a1, int a2 )
	{
		gl.glGetPixelMapuiv( a0, a1, a2 );
	}
	public static final void glGetPixelMapuiv( int a0, long a1 )
	{
		gl.glGetPixelMapuiv( a0, a1 );
	}
	public static final void glGetPixelMapusv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glGetPixelMapusv( a0, a1 );
	}
	public static final void glGetPixelMapusv( int a0, short[] a1, int a2 )
	{
		gl.glGetPixelMapusv( a0, a1, a2 );
	}
	public static final void glGetPixelMapusv( int a0, long a1 )
	{
		gl.glGetPixelMapusv( a0, a1 );
	}
	public static final void glGetPixelTexGenParameterfvSGIS( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glGetPixelTexGenParameterfvSGIS( a0, a1 );
	}
	public static final void glGetPixelTexGenParameterfvSGIS( int a0, float[] a1, int a2 )
	{
		gl.glGetPixelTexGenParameterfvSGIS( a0, a1, a2 );
	}
	public static final void glGetPixelTexGenParameterivSGIS( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGetPixelTexGenParameterivSGIS( a0, a1 );
	}
	public static final void glGetPixelTexGenParameterivSGIS( int a0, int[] a1, int a2 )
	{
		gl.glGetPixelTexGenParameterivSGIS( a0, a1, a2 );
	}
	public static final void glGetPolygonStipple( java.nio.ByteBuffer a0 )
	{
		gl.glGetPolygonStipple( a0 );
	}
	public static final void glGetPolygonStipple( byte[] a0, int a1 )
	{
		gl.glGetPolygonStipple( a0, a1 );
	}
	public static final void glGetPolygonStipple( long a0 )
	{
		gl.glGetPolygonStipple( a0 );
	}
	public static final void glGetProgramEnvParameterIivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetProgramEnvParameterIivNV( a0, a1, a2 );
	}
	public static final void glGetProgramEnvParameterIivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetProgramEnvParameterIivNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramEnvParameterIuivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetProgramEnvParameterIuivNV( a0, a1, a2 );
	}
	public static final void glGetProgramEnvParameterIuivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetProgramEnvParameterIuivNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramEnvParameterdvARB( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glGetProgramEnvParameterdvARB( a0, a1, a2 );
	}
	public static final void glGetProgramEnvParameterdvARB( int a0, int a1, double[] a2, int a3 )
	{
		gl.glGetProgramEnvParameterdvARB( a0, a1, a2, a3 );
	}
	public static final void glGetProgramEnvParameterfvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetProgramEnvParameterfvARB( a0, a1, a2 );
	}
	public static final void glGetProgramEnvParameterfvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetProgramEnvParameterfvARB( a0, a1, a2, a3 );
	}
	public static final void glGetProgramInfoLog( int a0, int a1, java.nio.IntBuffer a2, java.nio.ByteBuffer a3 )
	{
		gl.glGetProgramInfoLog( a0, a1, a2, a3 );
	}
	public static final void glGetProgramInfoLog( int a0, int a1, int[] a2, int a3, byte[] a4, int a5 )
	{
		gl.glGetProgramInfoLog( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetProgramLocalParameterIivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetProgramLocalParameterIivNV( a0, a1, a2 );
	}
	public static final void glGetProgramLocalParameterIivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetProgramLocalParameterIivNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramLocalParameterIuivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetProgramLocalParameterIuivNV( a0, a1, a2 );
	}
	public static final void glGetProgramLocalParameterIuivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetProgramLocalParameterIuivNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramLocalParameterdvARB( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glGetProgramLocalParameterdvARB( a0, a1, a2 );
	}
	public static final void glGetProgramLocalParameterdvARB( int a0, int a1, double[] a2, int a3 )
	{
		gl.glGetProgramLocalParameterdvARB( a0, a1, a2, a3 );
	}
	public static final void glGetProgramLocalParameterfvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetProgramLocalParameterfvARB( a0, a1, a2 );
	}
	public static final void glGetProgramLocalParameterfvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetProgramLocalParameterfvARB( a0, a1, a2, a3 );
	}
	public static final void glGetProgramNamedParameterdvNV( int a0, int a1, java.lang.String a2, java.nio.DoubleBuffer a3 )
	{
		gl.glGetProgramNamedParameterdvNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramNamedParameterdvNV( int a0, int a1, java.lang.String a2, double[] a3, int a4 )
	{
		gl.glGetProgramNamedParameterdvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetProgramNamedParameterfvNV( int a0, int a1, java.lang.String a2, java.nio.FloatBuffer a3 )
	{
		gl.glGetProgramNamedParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramNamedParameterfvNV( int a0, int a1, java.lang.String a2, float[] a3, int a4 )
	{
		gl.glGetProgramNamedParameterfvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetProgramParameterdvNV( int a0, int a1, int a2, java.nio.DoubleBuffer a3 )
	{
		gl.glGetProgramParameterdvNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramParameterdvNV( int a0, int a1, int a2, double[] a3, int a4 )
	{
		gl.glGetProgramParameterdvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetProgramParameterfvNV( int a0, int a1, int a2, java.nio.FloatBuffer a3 )
	{
		gl.glGetProgramParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramParameterfvNV( int a0, int a1, int a2, float[] a3, int a4 )
	{
		gl.glGetProgramParameterfvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetProgramStringARB( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glGetProgramStringARB( a0, a1, a2 );
	}
	public static final void glGetProgramStringNV( int a0, int a1, java.nio.ByteBuffer a2 )
	{
		gl.glGetProgramStringNV( a0, a1, a2 );
	}
	public static final void glGetProgramStringNV( int a0, int a1, byte[] a2, int a3 )
	{
		gl.glGetProgramStringNV( a0, a1, a2, a3 );
	}
	public static final void glGetProgramiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetProgramiv( a0, a1, a2 );
	}
	public static final void glGetProgramiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetProgramiv( a0, a1, a2, a3 );
	}
	public static final void glGetProgramivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetProgramivARB( a0, a1, a2 );
	}
	public static final void glGetProgramivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetProgramivARB( a0, a1, a2, a3 );
	}
	public static final void glGetProgramivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetProgramivNV( a0, a1, a2 );
	}
	public static final void glGetProgramivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetProgramivNV( a0, a1, a2, a3 );
	}
	public static final void glGetQueryObjecti64vEXT( int a0, int a1, java.nio.LongBuffer a2 )
	{
		gl.glGetQueryObjecti64vEXT( a0, a1, a2 );
	}
	public static final void glGetQueryObjecti64vEXT( int a0, int a1, long[] a2, int a3 )
	{
		gl.glGetQueryObjecti64vEXT( a0, a1, a2, a3 );
	}
	public static final void glGetQueryObjectiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetQueryObjectiv( a0, a1, a2 );
	}
	public static final void glGetQueryObjectiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetQueryObjectiv( a0, a1, a2, a3 );
	}
	public static final void glGetQueryObjectivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetQueryObjectivARB( a0, a1, a2 );
	}
	public static final void glGetQueryObjectivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetQueryObjectivARB( a0, a1, a2, a3 );
	}
	public static final void glGetQueryObjectui64vEXT( int a0, int a1, java.nio.LongBuffer a2 )
	{
		gl.glGetQueryObjectui64vEXT( a0, a1, a2 );
	}
	public static final void glGetQueryObjectui64vEXT( int a0, int a1, long[] a2, int a3 )
	{
		gl.glGetQueryObjectui64vEXT( a0, a1, a2, a3 );
	}
	public static final void glGetQueryObjectuiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetQueryObjectuiv( a0, a1, a2 );
	}
	public static final void glGetQueryObjectuiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetQueryObjectuiv( a0, a1, a2, a3 );
	}
	public static final void glGetQueryObjectuivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetQueryObjectuivARB( a0, a1, a2 );
	}
	public static final void glGetQueryObjectuivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetQueryObjectuivARB( a0, a1, a2, a3 );
	}
	public static final void glGetQueryiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetQueryiv( a0, a1, a2 );
	}
	public static final void glGetQueryiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetQueryiv( a0, a1, a2, a3 );
	}
	public static final void glGetQueryivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetQueryivARB( a0, a1, a2 );
	}
	public static final void glGetQueryivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetQueryivARB( a0, a1, a2, a3 );
	}
	public static final void glGetRenderbufferParameterivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetRenderbufferParameterivEXT( a0, a1, a2 );
	}
	public static final void glGetRenderbufferParameterivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetRenderbufferParameterivEXT( a0, a1, a2, a3 );
	}
	public static final void glGetSeparableFilter( int a0, int a1, int a2, java.nio.Buffer a3, java.nio.Buffer a4, java.nio.Buffer a5 )
	{
		gl.glGetSeparableFilter( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetSeparableFilter( int a0, int a1, int a2, long a3, long a4, long a5 )
	{
		gl.glGetSeparableFilter( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetShaderInfoLog( int a0, int a1, java.nio.IntBuffer a2, java.nio.ByteBuffer a3 )
	{
		gl.glGetShaderInfoLog( a0, a1, a2, a3 );
	}
	public static final void glGetShaderInfoLog( int a0, int a1, int[] a2, int a3, byte[] a4, int a5 )
	{
		gl.glGetShaderInfoLog( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetShaderSource( int a0, int a1, java.nio.IntBuffer a2, java.nio.ByteBuffer a3 )
	{
		gl.glGetShaderSource( a0, a1, a2, a3 );
	}
	public static final void glGetShaderSource( int a0, int a1, int[] a2, int a3, byte[] a4, int a5 )
	{
		gl.glGetShaderSource( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetShaderSourceARB( int a0, int a1, java.nio.IntBuffer a2, java.nio.ByteBuffer a3 )
	{
		gl.glGetShaderSourceARB( a0, a1, a2, a3 );
	}
	public static final void glGetShaderSourceARB( int a0, int a1, int[] a2, int a3, byte[] a4, int a5 )
	{
		gl.glGetShaderSourceARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glGetShaderiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetShaderiv( a0, a1, a2 );
	}
	public static final void glGetShaderiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetShaderiv( a0, a1, a2, a3 );
	}
	public static final void glGetSharpenTexFuncSGIS( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glGetSharpenTexFuncSGIS( a0, a1 );
	}
	public static final void glGetSharpenTexFuncSGIS( int a0, float[] a1, int a2 )
	{
		gl.glGetSharpenTexFuncSGIS( a0, a1, a2 );
	}
	public static final java.lang.String glGetString( int a0 )
	{
		return gl.glGetString( a0 );
	}
	public static final void glGetTexBumpParameterfvATI( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glGetTexBumpParameterfvATI( a0, a1 );
	}
	public static final void glGetTexBumpParameterfvATI( int a0, float[] a1, int a2 )
	{
		gl.glGetTexBumpParameterfvATI( a0, a1, a2 );
	}
	public static final void glGetTexBumpParameterivATI( int a0, java.nio.IntBuffer a1 )
	{
		gl.glGetTexBumpParameterivATI( a0, a1 );
	}
	public static final void glGetTexBumpParameterivATI( int a0, int[] a1, int a2 )
	{
		gl.glGetTexBumpParameterivATI( a0, a1, a2 );
	}
	public static final void glGetTexEnvfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetTexEnvfv( a0, a1, a2 );
	}
	public static final void glGetTexEnvfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetTexEnvfv( a0, a1, a2, a3 );
	}
	public static final void glGetTexEnviv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetTexEnviv( a0, a1, a2 );
	}
	public static final void glGetTexEnviv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetTexEnviv( a0, a1, a2, a3 );
	}
	public static final void glGetTexFilterFuncSGIS( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetTexFilterFuncSGIS( a0, a1, a2 );
	}
	public static final void glGetTexFilterFuncSGIS( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetTexFilterFuncSGIS( a0, a1, a2, a3 );
	}
	public static final void glGetTexGendv( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glGetTexGendv( a0, a1, a2 );
	}
	public static final void glGetTexGendv( int a0, int a1, double[] a2, int a3 )
	{
		gl.glGetTexGendv( a0, a1, a2, a3 );
	}
	public static final void glGetTexGenfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetTexGenfv( a0, a1, a2 );
	}
	public static final void glGetTexGenfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetTexGenfv( a0, a1, a2, a3 );
	}
	public static final void glGetTexGeniv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetTexGeniv( a0, a1, a2 );
	}
	public static final void glGetTexGeniv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetTexGeniv( a0, a1, a2, a3 );
	}
	public static final void glGetTexImage( int a0, int a1, int a2, int a3, java.nio.Buffer a4 )
	{
		gl.glGetTexImage( a0, a1, a2, a3, a4 );
	}
	public static final void glGetTexImage( int a0, int a1, int a2, int a3, long a4 )
	{
		gl.glGetTexImage( a0, a1, a2, a3, a4 );
	}
	public static final void glGetTexLevelParameterfv( int a0, int a1, int a2, java.nio.FloatBuffer a3 )
	{
		gl.glGetTexLevelParameterfv( a0, a1, a2, a3 );
	}
	public static final void glGetTexLevelParameterfv( int a0, int a1, int a2, float[] a3, int a4 )
	{
		gl.glGetTexLevelParameterfv( a0, a1, a2, a3, a4 );
	}
	public static final void glGetTexLevelParameteriv( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glGetTexLevelParameteriv( a0, a1, a2, a3 );
	}
	public static final void glGetTexLevelParameteriv( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glGetTexLevelParameteriv( a0, a1, a2, a3, a4 );
	}
	public static final void glGetTexParameterIivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetTexParameterIivEXT( a0, a1, a2 );
	}
	public static final void glGetTexParameterIivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetTexParameterIivEXT( a0, a1, a2, a3 );
	}
	public static final void glGetTexParameterIuivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetTexParameterIuivEXT( a0, a1, a2 );
	}
	public static final void glGetTexParameterIuivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetTexParameterIuivEXT( a0, a1, a2, a3 );
	}
	public static final void glGetTexParameterfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetTexParameterfv( a0, a1, a2 );
	}
	public static final void glGetTexParameterfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetTexParameterfv( a0, a1, a2, a3 );
	}
	public static final void glGetTexParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetTexParameteriv( a0, a1, a2 );
	}
	public static final void glGetTexParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetTexParameteriv( a0, a1, a2, a3 );
	}
	public static final void glGetTrackMatrixivNV( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glGetTrackMatrixivNV( a0, a1, a2, a3 );
	}
	public static final void glGetTrackMatrixivNV( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glGetTrackMatrixivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glGetTransformFeedbackVaryingNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetTransformFeedbackVaryingNV( a0, a1, a2 );
	}
	public static final void glGetTransformFeedbackVaryingNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetTransformFeedbackVaryingNV( a0, a1, a2, a3 );
	}
	public static final int glGetUniformBufferSizeEXT( int a0, int a1 )
	{
		return gl.glGetUniformBufferSizeEXT( a0, a1 );
	}
	public static final int glGetUniformLocation( int a0, java.lang.String a1 )
	{
		return gl.glGetUniformLocation( a0, a1 );
	}
	public static final int glGetUniformLocationARB( int a0, java.lang.String a1 )
	{
		return gl.glGetUniformLocationARB( a0, a1 );
	}
	public static final int glGetUniformOffsetEXT( int a0, int a1 )
	{
		return gl.glGetUniformOffsetEXT( a0, a1 );
	}
	public static final void glGetUniformfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetUniformfv( a0, a1, a2 );
	}
	public static final void glGetUniformfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetUniformfv( a0, a1, a2, a3 );
	}
	public static final void glGetUniformfvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetUniformfvARB( a0, a1, a2 );
	}
	public static final void glGetUniformfvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetUniformfvARB( a0, a1, a2, a3 );
	}
	public static final void glGetUniformiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetUniformiv( a0, a1, a2 );
	}
	public static final void glGetUniformiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetUniformiv( a0, a1, a2, a3 );
	}
	public static final void glGetUniformivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetUniformivARB( a0, a1, a2 );
	}
	public static final void glGetUniformivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetUniformivARB( a0, a1, a2, a3 );
	}
	public static final void glGetUniformuivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetUniformuivEXT( a0, a1, a2 );
	}
	public static final void glGetUniformuivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetUniformuivEXT( a0, a1, a2, a3 );
	}
	public static final void glGetVariantArrayObjectfvATI( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetVariantArrayObjectfvATI( a0, a1, a2 );
	}
	public static final void glGetVariantArrayObjectfvATI( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetVariantArrayObjectfvATI( a0, a1, a2, a3 );
	}
	public static final void glGetVariantArrayObjectivATI( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetVariantArrayObjectivATI( a0, a1, a2 );
	}
	public static final void glGetVariantArrayObjectivATI( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetVariantArrayObjectivATI( a0, a1, a2, a3 );
	}
	public static final void glGetVariantBooleanvEXT( int a0, int a1, java.nio.ByteBuffer a2 )
	{
		gl.glGetVariantBooleanvEXT( a0, a1, a2 );
	}
	public static final void glGetVariantBooleanvEXT( int a0, int a1, byte[] a2, int a3 )
	{
		gl.glGetVariantBooleanvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetVariantFloatvEXT( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetVariantFloatvEXT( a0, a1, a2 );
	}
	public static final void glGetVariantFloatvEXT( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetVariantFloatvEXT( a0, a1, a2, a3 );
	}
	public static final void glGetVariantIntegervEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetVariantIntegervEXT( a0, a1, a2 );
	}
	public static final void glGetVariantIntegervEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetVariantIntegervEXT( a0, a1, a2, a3 );
	}
	public static final int glGetVaryingLocationNV( int a0, java.nio.ByteBuffer a1 )
	{
		return gl.glGetVaryingLocationNV( a0, a1 );
	}
	public static final int glGetVaryingLocationNV( int a0, byte[] a1, int a2 )
	{
		return gl.glGetVaryingLocationNV( a0, a1, a2 );
	}
	public static final void glGetVertexAttribArrayObjectfvATI( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetVertexAttribArrayObjectfvATI( a0, a1, a2 );
	}
	public static final void glGetVertexAttribArrayObjectfvATI( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetVertexAttribArrayObjectfvATI( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribArrayObjectivATI( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetVertexAttribArrayObjectivATI( a0, a1, a2 );
	}
	public static final void glGetVertexAttribArrayObjectivATI( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetVertexAttribArrayObjectivATI( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribIivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetVertexAttribIivEXT( a0, a1, a2 );
	}
	public static final void glGetVertexAttribIivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetVertexAttribIivEXT( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribIuivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetVertexAttribIuivEXT( a0, a1, a2 );
	}
	public static final void glGetVertexAttribIuivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetVertexAttribIuivEXT( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribdv( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glGetVertexAttribdv( a0, a1, a2 );
	}
	public static final void glGetVertexAttribdv( int a0, int a1, double[] a2, int a3 )
	{
		gl.glGetVertexAttribdv( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribdvARB( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glGetVertexAttribdvARB( a0, a1, a2 );
	}
	public static final void glGetVertexAttribdvARB( int a0, int a1, double[] a2, int a3 )
	{
		gl.glGetVertexAttribdvARB( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribdvNV( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glGetVertexAttribdvNV( a0, a1, a2 );
	}
	public static final void glGetVertexAttribdvNV( int a0, int a1, double[] a2, int a3 )
	{
		gl.glGetVertexAttribdvNV( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetVertexAttribfv( a0, a1, a2 );
	}
	public static final void glGetVertexAttribfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetVertexAttribfv( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribfvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetVertexAttribfvARB( a0, a1, a2 );
	}
	public static final void glGetVertexAttribfvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetVertexAttribfvARB( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribfvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glGetVertexAttribfvNV( a0, a1, a2 );
	}
	public static final void glGetVertexAttribfvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glGetVertexAttribfvNV( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetVertexAttribiv( a0, a1, a2 );
	}
	public static final void glGetVertexAttribiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetVertexAttribiv( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetVertexAttribivARB( a0, a1, a2 );
	}
	public static final void glGetVertexAttribivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetVertexAttribivARB( a0, a1, a2, a3 );
	}
	public static final void glGetVertexAttribivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glGetVertexAttribivNV( a0, a1, a2 );
	}
	public static final void glGetVertexAttribivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glGetVertexAttribivNV( a0, a1, a2, a3 );
	}
	public static final void glGlobalAlphaFactorbSUN( byte a0 )
	{
		gl.glGlobalAlphaFactorbSUN( a0 );
	}
	public static final void glGlobalAlphaFactordSUN( double a0 )
	{
		gl.glGlobalAlphaFactordSUN( a0 );
	}
	public static final void glGlobalAlphaFactorfSUN( float a0 )
	{
		gl.glGlobalAlphaFactorfSUN( a0 );
	}
	public static final void glGlobalAlphaFactoriSUN( int a0 )
	{
		gl.glGlobalAlphaFactoriSUN( a0 );
	}
	public static final void glGlobalAlphaFactorsSUN( short a0 )
	{
		gl.glGlobalAlphaFactorsSUN( a0 );
	}
	public static final void glGlobalAlphaFactorubSUN( byte a0 )
	{
		gl.glGlobalAlphaFactorubSUN( a0 );
	}
	public static final void glGlobalAlphaFactoruiSUN( int a0 )
	{
		gl.glGlobalAlphaFactoruiSUN( a0 );
	}
	public static final void glGlobalAlphaFactorusSUN( short a0 )
	{
		gl.glGlobalAlphaFactorusSUN( a0 );
	}
	public static final void glHint( int a0, int a1 )
	{
		gl.glHint( a0, a1 );
	}
	public static final void glHintPGI( int a0, int a1 )
	{
		gl.glHintPGI( a0, a1 );
	}
	public static final void glHistogram( int a0, int a1, int a2, boolean a3 )
	{
		gl.glHistogram( a0, a1, a2, a3 );
	}
	public static final void glIglooInterfaceSGIX( int a0, java.nio.Buffer a1 )
	{
		gl.glIglooInterfaceSGIX( a0, a1 );
	}
	public static final void glImageTransformParameterfHP( int a0, int a1, float a2 )
	{
		gl.glImageTransformParameterfHP( a0, a1, a2 );
	}
	public static final void glImageTransformParameterfvHP( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glImageTransformParameterfvHP( a0, a1, a2 );
	}
	public static final void glImageTransformParameterfvHP( int a0, int a1, float[] a2, int a3 )
	{
		gl.glImageTransformParameterfvHP( a0, a1, a2, a3 );
	}
	public static final void glImageTransformParameteriHP( int a0, int a1, int a2 )
	{
		gl.glImageTransformParameteriHP( a0, a1, a2 );
	}
	public static final void glImageTransformParameterivHP( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glImageTransformParameterivHP( a0, a1, a2 );
	}
	public static final void glImageTransformParameterivHP( int a0, int a1, int[] a2, int a3 )
	{
		gl.glImageTransformParameterivHP( a0, a1, a2, a3 );
	}
	public static final void glIndexFuncEXT( int a0, float a1 )
	{
		gl.glIndexFuncEXT( a0, a1 );
	}
	public static final void glIndexMask( int a0 )
	{
		gl.glIndexMask( a0 );
	}
	public static final void glIndexMaterialEXT( int a0, int a1 )
	{
		gl.glIndexMaterialEXT( a0, a1 );
	}
	public static final void glIndexPointer( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glIndexPointer( a0, a1, a2 );
	}
	public static final void glIndexd( double a0 )
	{
		gl.glIndexd( a0 );
	}
	public static final void glIndexdv( java.nio.DoubleBuffer a0 )
	{
		gl.glIndexdv( a0 );
	}
	public static final void glIndexdv( double[] a0, int a1 )
	{
		gl.glIndexdv( a0, a1 );
	}
	public static final void glIndexf( float a0 )
	{
		gl.glIndexf( a0 );
	}
	public static final void glIndexfv( java.nio.FloatBuffer a0 )
	{
		gl.glIndexfv( a0 );
	}
	public static final void glIndexfv( float[] a0, int a1 )
	{
		gl.glIndexfv( a0, a1 );
	}
	public static final void glIndexi( int a0 )
	{
		gl.glIndexi( a0 );
	}
	public static final void glIndexiv( java.nio.IntBuffer a0 )
	{
		gl.glIndexiv( a0 );
	}
	public static final void glIndexiv( int[] a0, int a1 )
	{
		gl.glIndexiv( a0, a1 );
	}
	public static final void glIndexs( short a0 )
	{
		gl.glIndexs( a0 );
	}
	public static final void glIndexsv( java.nio.ShortBuffer a0 )
	{
		gl.glIndexsv( a0 );
	}
	public static final void glIndexsv( short[] a0, int a1 )
	{
		gl.glIndexsv( a0, a1 );
	}
	public static final void glIndexub( byte a0 )
	{
		gl.glIndexub( a0 );
	}
	public static final void glIndexubv( java.nio.ByteBuffer a0 )
	{
		gl.glIndexubv( a0 );
	}
	public static final void glIndexubv( byte[] a0, int a1 )
	{
		gl.glIndexubv( a0, a1 );
	}
	public static final void glInitNames()
	{
		gl.glInitNames();
	}
	public static final void glInsertComponentEXT( int a0, int a1, int a2 )
	{
		gl.glInsertComponentEXT( a0, a1, a2 );
	}
	public static final void glInstrumentsBufferSGIX( int a0, java.nio.IntBuffer a1 )
	{
		gl.glInstrumentsBufferSGIX( a0, a1 );
	}
	public static final void glInstrumentsBufferSGIX( int a0, int[] a1, int a2 )
	{
		gl.glInstrumentsBufferSGIX( a0, a1, a2 );
	}
	public static final void glInterleavedArrays( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glInterleavedArrays( a0, a1, a2 );
	}
	public static final void glInterleavedArrays( int a0, int a1, long a2 )
	{
		gl.glInterleavedArrays( a0, a1, a2 );
	}
	public static final boolean glIsAsyncMarkerSGIX( int a0 )
	{
		return gl.glIsAsyncMarkerSGIX( a0 );
	}
	public static final boolean glIsBuffer( int a0 )
	{
		return gl.glIsBuffer( a0 );
	}
	public static final boolean glIsBufferARB( int a0 )
	{
		return gl.glIsBufferARB( a0 );
	}
	public static final boolean glIsEnabled( int a0 )
	{
		return gl.glIsEnabled( a0 );
	}
	public static final boolean glIsEnabledIndexedEXT( int a0, int a1 )
	{
		return gl.glIsEnabledIndexedEXT( a0, a1 );
	}
	public static final boolean glIsFenceAPPLE( int a0 )
	{
		return gl.glIsFenceAPPLE( a0 );
	}
	public static final boolean glIsFenceNV( int a0 )
	{
		return gl.glIsFenceNV( a0 );
	}
	public static final boolean glIsFramebufferEXT( int a0 )
	{
		return gl.glIsFramebufferEXT( a0 );
	}
	public static final boolean glIsList( int a0 )
	{
		return gl.glIsList( a0 );
	}
	public static final boolean glIsObjectBufferATI( int a0 )
	{
		return gl.glIsObjectBufferATI( a0 );
	}
	public static final boolean glIsOcclusionQueryNV( int a0 )
	{
		return gl.glIsOcclusionQueryNV( a0 );
	}
	public static final boolean glIsProgram( int a0 )
	{
		return gl.glIsProgram( a0 );
	}
	public static final boolean glIsProgramARB( int a0 )
	{
		return gl.glIsProgramARB( a0 );
	}
	public static final boolean glIsProgramNV( int a0 )
	{
		return gl.glIsProgramNV( a0 );
	}
	public static final boolean glIsQuery( int a0 )
	{
		return gl.glIsQuery( a0 );
	}
	public static final boolean glIsQueryARB( int a0 )
	{
		return gl.glIsQueryARB( a0 );
	}
	public static final boolean glIsRenderbufferEXT( int a0 )
	{
		return gl.glIsRenderbufferEXT( a0 );
	}
	public static final boolean glIsShader( int a0 )
	{
		return gl.glIsShader( a0 );
	}
	public static final boolean glIsTexture( int a0 )
	{
		return gl.glIsTexture( a0 );
	}
	public static final boolean glIsVariantEnabledEXT( int a0, int a1 )
	{
		return gl.glIsVariantEnabledEXT( a0, a1 );
	}
	public static final boolean glIsVertexArrayAPPLE( int a0 )
	{
		return gl.glIsVertexArrayAPPLE( a0 );
	}
	public static final boolean glIsVertexAttribEnabledAPPLE( int a0, int a1 )
	{
		return gl.glIsVertexAttribEnabledAPPLE( a0, a1 );
	}
	public static final void glLightEnviSGIX( int a0, int a1 )
	{
		gl.glLightEnviSGIX( a0, a1 );
	}
	public static final void glLightModelf( int a0, float a1 )
	{
		gl.glLightModelf( a0, a1 );
	}
	public static final void glLightModelfv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glLightModelfv( a0, a1 );
	}
	public static final void glLightModelfv( int a0, float[] a1, int a2 )
	{
		gl.glLightModelfv( a0, a1, a2 );
	}
	public static final void glLightModeli( int a0, int a1 )
	{
		gl.glLightModeli( a0, a1 );
	}
	public static final void glLightModeliv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glLightModeliv( a0, a1 );
	}
	public static final void glLightModeliv( int a0, int[] a1, int a2 )
	{
		gl.glLightModeliv( a0, a1, a2 );
	}
	public static final void glLightf( int a0, int a1, float a2 )
	{
		gl.glLightf( a0, a1, a2 );
	}
	public static final void glLightfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glLightfv( a0, a1, a2 );
	}
	public static final void glLightfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glLightfv( a0, a1, a2, a3 );
	}
	public static final void glLighti( int a0, int a1, int a2 )
	{
		gl.glLighti( a0, a1, a2 );
	}
	public static final void glLightiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glLightiv( a0, a1, a2 );
	}
	public static final void glLightiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glLightiv( a0, a1, a2, a3 );
	}
	public static final void glLineStipple( int a0, short a1 )
	{
		gl.glLineStipple( a0, a1 );
	}
	public static final void glLineWidth( float a0 )
	{
		gl.glLineWidth( a0 );
	}
	public static final void glLinkProgram( int a0 )
	{
		gl.glLinkProgram( a0 );
	}
	public static final void glLinkProgramARB( int a0 )
	{
		gl.glLinkProgramARB( a0 );
	}
	public static final void glListBase( int a0 )
	{
		gl.glListBase( a0 );
	}
	public static final void glListParameterfSGIX( int a0, int a1, float a2 )
	{
		gl.glListParameterfSGIX( a0, a1, a2 );
	}
	public static final void glListParameterfvSGIX( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glListParameterfvSGIX( a0, a1, a2 );
	}
	public static final void glListParameterfvSGIX( int a0, int a1, float[] a2, int a3 )
	{
		gl.glListParameterfvSGIX( a0, a1, a2, a3 );
	}
	public static final void glListParameteriSGIX( int a0, int a1, int a2 )
	{
		gl.glListParameteriSGIX( a0, a1, a2 );
	}
	public static final void glListParameterivSGIX( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glListParameterivSGIX( a0, a1, a2 );
	}
	public static final void glListParameterivSGIX( int a0, int a1, int[] a2, int a3 )
	{
		gl.glListParameterivSGIX( a0, a1, a2, a3 );
	}
	public static final void glLoadIdentity()
	{
		gl.glLoadIdentity();
	}
	public static final void glLoadIdentityDeformationMapSGIX( int a0 )
	{
		gl.glLoadIdentityDeformationMapSGIX( a0 );
	}
	public static final void glLoadMatrixd( java.nio.DoubleBuffer a0 )
	{
		gl.glLoadMatrixd( a0 );
	}
	public static final void glLoadMatrixd( double[] a0, int a1 )
	{
		gl.glLoadMatrixd( a0, a1 );
	}
	public static final void glLoadMatrixf( java.nio.FloatBuffer a0 )
	{
		gl.glLoadMatrixf( a0 );
	}
	public static final void glLoadMatrixf( float[] a0, int a1 )
	{
		gl.glLoadMatrixf( a0, a1 );
	}
	public static final void glLoadName( int a0 )
	{
		gl.glLoadName( a0 );
	}
	public static final void glLoadProgramNV( int a0, int a1, int a2, java.lang.String a3 )
	{
		gl.glLoadProgramNV( a0, a1, a2, a3 );
	}
	public static final void glLoadTransposeMatrixd( java.nio.DoubleBuffer a0 )
	{
		gl.glLoadTransposeMatrixd( a0 );
	}
	public static final void glLoadTransposeMatrixd( double[] a0, int a1 )
	{
		gl.glLoadTransposeMatrixd( a0, a1 );
	}
	public static final void glLoadTransposeMatrixf( java.nio.FloatBuffer a0 )
	{
		gl.glLoadTransposeMatrixf( a0 );
	}
	public static final void glLoadTransposeMatrixf( float[] a0, int a1 )
	{
		gl.glLoadTransposeMatrixf( a0, a1 );
	}
	public static final void glLockArraysEXT( int a0, int a1 )
	{
		gl.glLockArraysEXT( a0, a1 );
	}
	public static final void glLogicOp( int a0 )
	{
		gl.glLogicOp( a0 );
	}
	public static final void glMap1d( int a0, double a1, double a2, int a3, int a4, java.nio.DoubleBuffer a5 )
	{
		gl.glMap1d( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMap1d( int a0, double a1, double a2, int a3, int a4, double[] a5, int a6 )
	{
		gl.glMap1d( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glMap1f( int a0, float a1, float a2, int a3, int a4, java.nio.FloatBuffer a5 )
	{
		gl.glMap1f( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMap1f( int a0, float a1, float a2, int a3, int a4, float[] a5, int a6 )
	{
		gl.glMap1f( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glMap2d( int a0, double a1, double a2, int a3, int a4, double a5, double a6, int a7, int a8, java.nio.DoubleBuffer a9 )
	{
		gl.glMap2d( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glMap2d( int a0, double a1, double a2, int a3, int a4, double a5, double a6, int a7, int a8, double[] a9, int a10 )
	{
		gl.glMap2d( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glMap2f( int a0, float a1, float a2, int a3, int a4, float a5, float a6, int a7, int a8, java.nio.FloatBuffer a9 )
	{
		gl.glMap2f( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glMap2f( int a0, float a1, float a2, int a3, int a4, float a5, float a6, int a7, int a8, float[] a9, int a10 )
	{
		gl.glMap2f( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final java.nio.ByteBuffer glMapBuffer( int a0, int a1 )
	{
		return gl.glMapBuffer( a0, a1 );
	}
	public static final java.nio.ByteBuffer glMapBufferARB( int a0, int a1 )
	{
		return gl.glMapBufferARB( a0, a1 );
	}
	public static final void glMapControlPointsNV( int a0, int a1, int a2, int a3, int a4, int a5, int a6, boolean a7, java.nio.Buffer a8 )
	{
		gl.glMapControlPointsNV( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glMapGrid1d( int a0, double a1, double a2 )
	{
		gl.glMapGrid1d( a0, a1, a2 );
	}
	public static final void glMapGrid1f( int a0, float a1, float a2 )
	{
		gl.glMapGrid1f( a0, a1, a2 );
	}
	public static final void glMapGrid2d( int a0, double a1, double a2, int a3, double a4, double a5 )
	{
		gl.glMapGrid2d( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMapGrid2f( int a0, float a1, float a2, int a3, float a4, float a5 )
	{
		gl.glMapGrid2f( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMapParameterfvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glMapParameterfvNV( a0, a1, a2 );
	}
	public static final void glMapParameterfvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glMapParameterfvNV( a0, a1, a2, a3 );
	}
	public static final void glMapParameterivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glMapParameterivNV( a0, a1, a2 );
	}
	public static final void glMapParameterivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glMapParameterivNV( a0, a1, a2, a3 );
	}
	public static final void glMapVertexAttrib1dAPPLE( int a0, int a1, double a2, double a3, int a4, int a5, java.nio.DoubleBuffer a6 )
	{
		gl.glMapVertexAttrib1dAPPLE( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glMapVertexAttrib1dAPPLE( int a0, int a1, double a2, double a3, int a4, int a5, double[] a6, int a7 )
	{
		gl.glMapVertexAttrib1dAPPLE( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glMapVertexAttrib1fAPPLE( int a0, int a1, float a2, float a3, int a4, int a5, java.nio.FloatBuffer a6 )
	{
		gl.glMapVertexAttrib1fAPPLE( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glMapVertexAttrib1fAPPLE( int a0, int a1, float a2, float a3, int a4, int a5, float[] a6, int a7 )
	{
		gl.glMapVertexAttrib1fAPPLE( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glMapVertexAttrib2dAPPLE( int a0, int a1, double a2, double a3, int a4, int a5, double a6, double a7, int a8, int a9, java.nio.DoubleBuffer a10 )
	{
		gl.glMapVertexAttrib2dAPPLE( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glMapVertexAttrib2dAPPLE( int a0, int a1, double a2, double a3, int a4, int a5, double a6, double a7, int a8, int a9, double[] a10, int a11 )
	{
		gl.glMapVertexAttrib2dAPPLE( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11 );
	}
	public static final void glMapVertexAttrib2fAPPLE( int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7, int a8, int a9, java.nio.FloatBuffer a10 )
	{
		gl.glMapVertexAttrib2fAPPLE( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glMapVertexAttrib2fAPPLE( int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7, int a8, int a9, float[] a10, int a11 )
	{
		gl.glMapVertexAttrib2fAPPLE( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11 );
	}
	public static final void glMaterialf( int a0, int a1, float a2 )
	{
		gl.glMaterialf( a0, a1, a2 );
	}
	public static final void glMaterialfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glMaterialfv( a0, a1, a2 );
	}
	public static final void glMaterialfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glMaterialfv( a0, a1, a2, a3 );
	}
	public static final void glMateriali( int a0, int a1, int a2 )
	{
		gl.glMateriali( a0, a1, a2 );
	}
	public static final void glMaterialiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glMaterialiv( a0, a1, a2 );
	}
	public static final void glMaterialiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glMaterialiv( a0, a1, a2, a3 );
	}
	public static final void glMatrixIndexPointerARB( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glMatrixIndexPointerARB( a0, a1, a2, a3 );
	}
	public static final void glMatrixIndexPointerARB( int a0, int a1, int a2, long a3 )
	{
		gl.glMatrixIndexPointerARB( a0, a1, a2, a3 );
	}
	public static final void glMatrixIndexubvARB( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glMatrixIndexubvARB( a0, a1 );
	}
	public static final void glMatrixIndexubvARB( int a0, byte[] a1, int a2 )
	{
		gl.glMatrixIndexubvARB( a0, a1, a2 );
	}
	public static final void glMatrixIndexuivARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glMatrixIndexuivARB( a0, a1 );
	}
	public static final void glMatrixIndexuivARB( int a0, int[] a1, int a2 )
	{
		gl.glMatrixIndexuivARB( a0, a1, a2 );
	}
	public static final void glMatrixIndexusvARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMatrixIndexusvARB( a0, a1 );
	}
	public static final void glMatrixIndexusvARB( int a0, short[] a1, int a2 )
	{
		gl.glMatrixIndexusvARB( a0, a1, a2 );
	}
	public static final void glMatrixMode( int a0 )
	{
		gl.glMatrixMode( a0 );
	}
	public static final void glMinmax( int a0, int a1, boolean a2 )
	{
		gl.glMinmax( a0, a1, a2 );
	}
	public static final void glMultMatrixd( java.nio.DoubleBuffer a0 )
	{
		gl.glMultMatrixd( a0 );
	}
	public static final void glMultMatrixd( double[] a0, int a1 )
	{
		gl.glMultMatrixd( a0, a1 );
	}
	public static final void glMultMatrixf( java.nio.FloatBuffer a0 )
	{
		gl.glMultMatrixf( a0 );
	}
	public static final void glMultMatrixf( float[] a0, int a1 )
	{
		gl.glMultMatrixf( a0, a1 );
	}
	public static final void glMultTransposeMatrixd( java.nio.DoubleBuffer a0 )
	{
		gl.glMultTransposeMatrixd( a0 );
	}
	public static final void glMultTransposeMatrixd( double[] a0, int a1 )
	{
		gl.glMultTransposeMatrixd( a0, a1 );
	}
	public static final void glMultTransposeMatrixf( java.nio.FloatBuffer a0 )
	{
		gl.glMultTransposeMatrixf( a0 );
	}
	public static final void glMultTransposeMatrixf( float[] a0, int a1 )
	{
		gl.glMultTransposeMatrixf( a0, a1 );
	}
	public static final void glMultiDrawArrays( int a0, java.nio.IntBuffer a1, java.nio.IntBuffer a2, int a3 )
	{
		gl.glMultiDrawArrays( a0, a1, a2, a3 );
	}
	public static final void glMultiDrawArrays( int a0, int[] a1, int a2, int[] a3, int a4, int a5 )
	{
		gl.glMultiDrawArrays( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMultiDrawArraysEXT( int a0, java.nio.IntBuffer a1, java.nio.IntBuffer a2, int a3 )
	{
		gl.glMultiDrawArraysEXT( a0, a1, a2, a3 );
	}
	public static final void glMultiDrawArraysEXT( int a0, int[] a1, int a2, int[] a3, int a4, int a5 )
	{
		gl.glMultiDrawArraysEXT( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMultiDrawElementArrayAPPLE( int a0, java.nio.IntBuffer a1, java.nio.IntBuffer a2, int a3 )
	{
		gl.glMultiDrawElementArrayAPPLE( a0, a1, a2, a3 );
	}
	public static final void glMultiDrawElementArrayAPPLE( int a0, int[] a1, int a2, int[] a3, int a4, int a5 )
	{
		gl.glMultiDrawElementArrayAPPLE( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMultiDrawElements( int a0, java.nio.IntBuffer a1, int a2, java.nio.Buffer[] a3, int a4 )
	{
		gl.glMultiDrawElements( a0, a1, a2, a3, a4 );
	}
	public static final void glMultiDrawElements( int a0, int[] a1, int a2, int a3, java.nio.Buffer[] a4, int a5 )
	{
		gl.glMultiDrawElements( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMultiDrawElementsEXT( int a0, java.nio.IntBuffer a1, int a2, java.nio.Buffer[] a3, int a4 )
	{
		gl.glMultiDrawElementsEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glMultiDrawElementsEXT( int a0, int[] a1, int a2, int a3, java.nio.Buffer[] a4, int a5 )
	{
		gl.glMultiDrawElementsEXT( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMultiDrawRangeElementArrayAPPLE( int a0, int a1, int a2, java.nio.IntBuffer a3, java.nio.IntBuffer a4, int a5 )
	{
		gl.glMultiDrawRangeElementArrayAPPLE( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMultiDrawRangeElementArrayAPPLE( int a0, int a1, int a2, int[] a3, int a4, int[] a5, int a6, int a7 )
	{
		gl.glMultiDrawRangeElementArrayAPPLE( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glMultiModeDrawArraysIBM( java.nio.IntBuffer a0, java.nio.IntBuffer a1, java.nio.IntBuffer a2, int a3, int a4 )
	{
		gl.glMultiModeDrawArraysIBM( a0, a1, a2, a3, a4 );
	}
	public static final void glMultiModeDrawArraysIBM( int[] a0, int a1, int[] a2, int a3, int[] a4, int a5, int a6, int a7 )
	{
		gl.glMultiModeDrawArraysIBM( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glMultiModeDrawElementsIBM( java.nio.IntBuffer a0, java.nio.IntBuffer a1, int a2, java.nio.Buffer[] a3, int a4, int a5 )
	{
		gl.glMultiModeDrawElementsIBM( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glMultiModeDrawElementsIBM( int[] a0, int a1, int[] a2, int a3, int a4, java.nio.Buffer[] a5, int a6, int a7 )
	{
		gl.glMultiModeDrawElementsIBM( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glMultiTexCoord1d( int a0, double a1 )
	{
		gl.glMultiTexCoord1d( a0, a1 );
	}
	public static final void glMultiTexCoord1dv( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glMultiTexCoord1dv( a0, a1 );
	}
	public static final void glMultiTexCoord1dv( int a0, double[] a1, int a2 )
	{
		gl.glMultiTexCoord1dv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord1f( int a0, float a1 )
	{
		gl.glMultiTexCoord1f( a0, a1 );
	}
	public static final void glMultiTexCoord1fv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glMultiTexCoord1fv( a0, a1 );
	}
	public static final void glMultiTexCoord1fv( int a0, float[] a1, int a2 )
	{
		gl.glMultiTexCoord1fv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord1hNV( int a0, short a1 )
	{
		gl.glMultiTexCoord1hNV( a0, a1 );
	}
	public static final void glMultiTexCoord1hvNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMultiTexCoord1hvNV( a0, a1 );
	}
	public static final void glMultiTexCoord1hvNV( int a0, short[] a1, int a2 )
	{
		gl.glMultiTexCoord1hvNV( a0, a1, a2 );
	}
	public static final void glMultiTexCoord1i( int a0, int a1 )
	{
		gl.glMultiTexCoord1i( a0, a1 );
	}
	public static final void glMultiTexCoord1iv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glMultiTexCoord1iv( a0, a1 );
	}
	public static final void glMultiTexCoord1iv( int a0, int[] a1, int a2 )
	{
		gl.glMultiTexCoord1iv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord1s( int a0, short a1 )
	{
		gl.glMultiTexCoord1s( a0, a1 );
	}
	public static final void glMultiTexCoord1sv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMultiTexCoord1sv( a0, a1 );
	}
	public static final void glMultiTexCoord1sv( int a0, short[] a1, int a2 )
	{
		gl.glMultiTexCoord1sv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2d( int a0, double a1, double a2 )
	{
		gl.glMultiTexCoord2d( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2dv( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glMultiTexCoord2dv( a0, a1 );
	}
	public static final void glMultiTexCoord2dv( int a0, double[] a1, int a2 )
	{
		gl.glMultiTexCoord2dv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2f( int a0, float a1, float a2 )
	{
		gl.glMultiTexCoord2f( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2fv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glMultiTexCoord2fv( a0, a1 );
	}
	public static final void glMultiTexCoord2fv( int a0, float[] a1, int a2 )
	{
		gl.glMultiTexCoord2fv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2hNV( int a0, short a1, short a2 )
	{
		gl.glMultiTexCoord2hNV( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2hvNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMultiTexCoord2hvNV( a0, a1 );
	}
	public static final void glMultiTexCoord2hvNV( int a0, short[] a1, int a2 )
	{
		gl.glMultiTexCoord2hvNV( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2i( int a0, int a1, int a2 )
	{
		gl.glMultiTexCoord2i( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2iv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glMultiTexCoord2iv( a0, a1 );
	}
	public static final void glMultiTexCoord2iv( int a0, int[] a1, int a2 )
	{
		gl.glMultiTexCoord2iv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2s( int a0, short a1, short a2 )
	{
		gl.glMultiTexCoord2s( a0, a1, a2 );
	}
	public static final void glMultiTexCoord2sv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMultiTexCoord2sv( a0, a1 );
	}
	public static final void glMultiTexCoord2sv( int a0, short[] a1, int a2 )
	{
		gl.glMultiTexCoord2sv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord3d( int a0, double a1, double a2, double a3 )
	{
		gl.glMultiTexCoord3d( a0, a1, a2, a3 );
	}
	public static final void glMultiTexCoord3dv( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glMultiTexCoord3dv( a0, a1 );
	}
	public static final void glMultiTexCoord3dv( int a0, double[] a1, int a2 )
	{
		gl.glMultiTexCoord3dv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord3f( int a0, float a1, float a2, float a3 )
	{
		gl.glMultiTexCoord3f( a0, a1, a2, a3 );
	}
	public static final void glMultiTexCoord3fv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glMultiTexCoord3fv( a0, a1 );
	}
	public static final void glMultiTexCoord3fv( int a0, float[] a1, int a2 )
	{
		gl.glMultiTexCoord3fv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord3hNV( int a0, short a1, short a2, short a3 )
	{
		gl.glMultiTexCoord3hNV( a0, a1, a2, a3 );
	}
	public static final void glMultiTexCoord3hvNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMultiTexCoord3hvNV( a0, a1 );
	}
	public static final void glMultiTexCoord3hvNV( int a0, short[] a1, int a2 )
	{
		gl.glMultiTexCoord3hvNV( a0, a1, a2 );
	}
	public static final void glMultiTexCoord3i( int a0, int a1, int a2, int a3 )
	{
		gl.glMultiTexCoord3i( a0, a1, a2, a3 );
	}
	public static final void glMultiTexCoord3iv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glMultiTexCoord3iv( a0, a1 );
	}
	public static final void glMultiTexCoord3iv( int a0, int[] a1, int a2 )
	{
		gl.glMultiTexCoord3iv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord3s( int a0, short a1, short a2, short a3 )
	{
		gl.glMultiTexCoord3s( a0, a1, a2, a3 );
	}
	public static final void glMultiTexCoord3sv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMultiTexCoord3sv( a0, a1 );
	}
	public static final void glMultiTexCoord3sv( int a0, short[] a1, int a2 )
	{
		gl.glMultiTexCoord3sv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord4d( int a0, double a1, double a2, double a3, double a4 )
	{
		gl.glMultiTexCoord4d( a0, a1, a2, a3, a4 );
	}
	public static final void glMultiTexCoord4dv( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glMultiTexCoord4dv( a0, a1 );
	}
	public static final void glMultiTexCoord4dv( int a0, double[] a1, int a2 )
	{
		gl.glMultiTexCoord4dv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord4f( int a0, float a1, float a2, float a3, float a4 )
	{
		gl.glMultiTexCoord4f( a0, a1, a2, a3, a4 );
	}
	public static final void glMultiTexCoord4fv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glMultiTexCoord4fv( a0, a1 );
	}
	public static final void glMultiTexCoord4fv( int a0, float[] a1, int a2 )
	{
		gl.glMultiTexCoord4fv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord4hNV( int a0, short a1, short a2, short a3, short a4 )
	{
		gl.glMultiTexCoord4hNV( a0, a1, a2, a3, a4 );
	}
	public static final void glMultiTexCoord4hvNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMultiTexCoord4hvNV( a0, a1 );
	}
	public static final void glMultiTexCoord4hvNV( int a0, short[] a1, int a2 )
	{
		gl.glMultiTexCoord4hvNV( a0, a1, a2 );
	}
	public static final void glMultiTexCoord4i( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glMultiTexCoord4i( a0, a1, a2, a3, a4 );
	}
	public static final void glMultiTexCoord4iv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glMultiTexCoord4iv( a0, a1 );
	}
	public static final void glMultiTexCoord4iv( int a0, int[] a1, int a2 )
	{
		gl.glMultiTexCoord4iv( a0, a1, a2 );
	}
	public static final void glMultiTexCoord4s( int a0, short a1, short a2, short a3, short a4 )
	{
		gl.glMultiTexCoord4s( a0, a1, a2, a3, a4 );
	}
	public static final void glMultiTexCoord4sv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glMultiTexCoord4sv( a0, a1 );
	}
	public static final void glMultiTexCoord4sv( int a0, short[] a1, int a2 )
	{
		gl.glMultiTexCoord4sv( a0, a1, a2 );
	}
	public static final int glNewBufferRegion( int a0 )
	{
		return gl.glNewBufferRegion( a0 );
	}
	public static final void glNewList( int a0, int a1 )
	{
		gl.glNewList( a0, a1 );
	}
	public static final int glNewObjectBufferATI( int a0, java.nio.Buffer a1, int a2 )
	{
		return gl.glNewObjectBufferATI( a0, a1, a2 );
	}
	public static final void glNormal3b( byte a0, byte a1, byte a2 )
	{
		gl.glNormal3b( a0, a1, a2 );
	}
	public static final void glNormal3bv( java.nio.ByteBuffer a0 )
	{
		gl.glNormal3bv( a0 );
	}
	public static final void glNormal3bv( byte[] a0, int a1 )
	{
		gl.glNormal3bv( a0, a1 );
	}
	public static final void glNormal3d( double a0, double a1, double a2 )
	{
		gl.glNormal3d( a0, a1, a2 );
	}
	public static final void glNormal3dv( java.nio.DoubleBuffer a0 )
	{
		gl.glNormal3dv( a0 );
	}
	public static final void glNormal3dv( double[] a0, int a1 )
	{
		gl.glNormal3dv( a0, a1 );
	}
	public static final void glNormal3f( float a0, float a1, float a2 )
	{
		gl.glNormal3f( a0, a1, a2 );
	}
	public static final void glNormal3fVertex3fSUN( float a0, float a1, float a2, float a3, float a4, float a5 )
	{
		gl.glNormal3fVertex3fSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glNormal3fVertex3fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1 )
	{
		gl.glNormal3fVertex3fvSUN( a0, a1 );
	}
	public static final void glNormal3fVertex3fvSUN( float[] a0, int a1, float[] a2, int a3 )
	{
		gl.glNormal3fVertex3fvSUN( a0, a1, a2, a3 );
	}
	public static final void glNormal3fv( java.nio.FloatBuffer a0 )
	{
		gl.glNormal3fv( a0 );
	}
	public static final void glNormal3fv( float[] a0, int a1 )
	{
		gl.glNormal3fv( a0, a1 );
	}
	public static final void glNormal3hNV( short a0, short a1, short a2 )
	{
		gl.glNormal3hNV( a0, a1, a2 );
	}
	public static final void glNormal3hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glNormal3hvNV( a0 );
	}
	public static final void glNormal3hvNV( short[] a0, int a1 )
	{
		gl.glNormal3hvNV( a0, a1 );
	}
	public static final void glNormal3i( int a0, int a1, int a2 )
	{
		gl.glNormal3i( a0, a1, a2 );
	}
	public static final void glNormal3iv( java.nio.IntBuffer a0 )
	{
		gl.glNormal3iv( a0 );
	}
	public static final void glNormal3iv( int[] a0, int a1 )
	{
		gl.glNormal3iv( a0, a1 );
	}
	public static final void glNormal3s( short a0, short a1, short a2 )
	{
		gl.glNormal3s( a0, a1, a2 );
	}
	public static final void glNormal3sv( java.nio.ShortBuffer a0 )
	{
		gl.glNormal3sv( a0 );
	}
	public static final void glNormal3sv( short[] a0, int a1 )
	{
		gl.glNormal3sv( a0, a1 );
	}
	public static final void glNormalPointer( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glNormalPointer( a0, a1, a2 );
	}
	public static final void glNormalPointer( int a0, int a1, long a2 )
	{
		gl.glNormalPointer( a0, a1, a2 );
	}
	public static final void glNormalStream3bATI( int a0, byte a1, byte a2, byte a3 )
	{
		gl.glNormalStream3bATI( a0, a1, a2, a3 );
	}
	public static final void glNormalStream3bvATI( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glNormalStream3bvATI( a0, a1 );
	}
	public static final void glNormalStream3bvATI( int a0, byte[] a1, int a2 )
	{
		gl.glNormalStream3bvATI( a0, a1, a2 );
	}
	public static final void glNormalStream3dATI( int a0, double a1, double a2, double a3 )
	{
		gl.glNormalStream3dATI( a0, a1, a2, a3 );
	}
	public static final void glNormalStream3dvATI( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glNormalStream3dvATI( a0, a1 );
	}
	public static final void glNormalStream3dvATI( int a0, double[] a1, int a2 )
	{
		gl.glNormalStream3dvATI( a0, a1, a2 );
	}
	public static final void glNormalStream3fATI( int a0, float a1, float a2, float a3 )
	{
		gl.glNormalStream3fATI( a0, a1, a2, a3 );
	}
	public static final void glNormalStream3fvATI( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glNormalStream3fvATI( a0, a1 );
	}
	public static final void glNormalStream3fvATI( int a0, float[] a1, int a2 )
	{
		gl.glNormalStream3fvATI( a0, a1, a2 );
	}
	public static final void glNormalStream3iATI( int a0, int a1, int a2, int a3 )
	{
		gl.glNormalStream3iATI( a0, a1, a2, a3 );
	}
	public static final void glNormalStream3ivATI( int a0, java.nio.IntBuffer a1 )
	{
		gl.glNormalStream3ivATI( a0, a1 );
	}
	public static final void glNormalStream3ivATI( int a0, int[] a1, int a2 )
	{
		gl.glNormalStream3ivATI( a0, a1, a2 );
	}
	public static final void glNormalStream3sATI( int a0, short a1, short a2, short a3 )
	{
		gl.glNormalStream3sATI( a0, a1, a2, a3 );
	}
	public static final void glNormalStream3svATI( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glNormalStream3svATI( a0, a1 );
	}
	public static final void glNormalStream3svATI( int a0, short[] a1, int a2 )
	{
		gl.glNormalStream3svATI( a0, a1, a2 );
	}
	public static final void glOrtho( double a0, double a1, double a2, double a3, double a4, double a5 )
	{
		gl.glOrtho( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glPNTrianglesfATI( int a0, float a1 )
	{
		gl.glPNTrianglesfATI( a0, a1 );
	}
	public static final void glPNTrianglesiATI( int a0, int a1 )
	{
		gl.glPNTrianglesiATI( a0, a1 );
	}
	public static final void glPassTexCoordATI( int a0, int a1, int a2 )
	{
		gl.glPassTexCoordATI( a0, a1, a2 );
	}
	public static final void glPassThrough( float a0 )
	{
		gl.glPassThrough( a0 );
	}
	public static final void glPixelDataRangeNV( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glPixelDataRangeNV( a0, a1, a2 );
	}
	public static final void glPixelMapfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glPixelMapfv( a0, a1, a2 );
	}
	public static final void glPixelMapfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glPixelMapfv( a0, a1, a2, a3 );
	}
	public static final void glPixelMapfv( int a0, int a1, long a2 )
	{
		gl.glPixelMapfv( a0, a1, a2 );
	}
	public static final void glPixelMapuiv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glPixelMapuiv( a0, a1, a2 );
	}
	public static final void glPixelMapuiv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glPixelMapuiv( a0, a1, a2, a3 );
	}
	public static final void glPixelMapuiv( int a0, int a1, long a2 )
	{
		gl.glPixelMapuiv( a0, a1, a2 );
	}
	public static final void glPixelMapusv( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glPixelMapusv( a0, a1, a2 );
	}
	public static final void glPixelMapusv( int a0, int a1, short[] a2, int a3 )
	{
		gl.glPixelMapusv( a0, a1, a2, a3 );
	}
	public static final void glPixelMapusv( int a0, int a1, long a2 )
	{
		gl.glPixelMapusv( a0, a1, a2 );
	}
	public static final void glPixelStoref( int a0, float a1 )
	{
		gl.glPixelStoref( a0, a1 );
	}
	public static final void glPixelStorei( int a0, int a1 )
	{
		gl.glPixelStorei( a0, a1 );
	}
	public static final void glPixelTexGenParameterfSGIS( int a0, float a1 )
	{
		gl.glPixelTexGenParameterfSGIS( a0, a1 );
	}
	public static final void glPixelTexGenParameterfvSGIS( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glPixelTexGenParameterfvSGIS( a0, a1 );
	}
	public static final void glPixelTexGenParameterfvSGIS( int a0, float[] a1, int a2 )
	{
		gl.glPixelTexGenParameterfvSGIS( a0, a1, a2 );
	}
	public static final void glPixelTexGenParameteriSGIS( int a0, int a1 )
	{
		gl.glPixelTexGenParameteriSGIS( a0, a1 );
	}
	public static final void glPixelTexGenParameterivSGIS( int a0, java.nio.IntBuffer a1 )
	{
		gl.glPixelTexGenParameterivSGIS( a0, a1 );
	}
	public static final void glPixelTexGenParameterivSGIS( int a0, int[] a1, int a2 )
	{
		gl.glPixelTexGenParameterivSGIS( a0, a1, a2 );
	}
	public static final void glPixelTexGenSGIX( int a0 )
	{
		gl.glPixelTexGenSGIX( a0 );
	}
	public static final void glPixelTransferf( int a0, float a1 )
	{
		gl.glPixelTransferf( a0, a1 );
	}
	public static final void glPixelTransferi( int a0, int a1 )
	{
		gl.glPixelTransferi( a0, a1 );
	}
	public static final void glPixelTransformParameterfEXT( int a0, int a1, float a2 )
	{
		gl.glPixelTransformParameterfEXT( a0, a1, a2 );
	}
	public static final void glPixelTransformParameterfvEXT( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glPixelTransformParameterfvEXT( a0, a1, a2 );
	}
	public static final void glPixelTransformParameterfvEXT( int a0, int a1, float[] a2, int a3 )
	{
		gl.glPixelTransformParameterfvEXT( a0, a1, a2, a3 );
	}
	public static final void glPixelTransformParameteriEXT( int a0, int a1, int a2 )
	{
		gl.glPixelTransformParameteriEXT( a0, a1, a2 );
	}
	public static final void glPixelTransformParameterivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glPixelTransformParameterivEXT( a0, a1, a2 );
	}
	public static final void glPixelTransformParameterivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glPixelTransformParameterivEXT( a0, a1, a2, a3 );
	}
	public static final void glPixelZoom( float a0, float a1 )
	{
		gl.glPixelZoom( a0, a1 );
	}
	public static final void glPointParameterf( int a0, float a1 )
	{
		gl.glPointParameterf( a0, a1 );
	}
	public static final void glPointParameterfARB( int a0, float a1 )
	{
		gl.glPointParameterfARB( a0, a1 );
	}
	public static final void glPointParameterfEXT( int a0, float a1 )
	{
		gl.glPointParameterfEXT( a0, a1 );
	}
	public static final void glPointParameterfSGIS( int a0, float a1 )
	{
		gl.glPointParameterfSGIS( a0, a1 );
	}
	public static final void glPointParameterfv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glPointParameterfv( a0, a1 );
	}
	public static final void glPointParameterfv( int a0, float[] a1, int a2 )
	{
		gl.glPointParameterfv( a0, a1, a2 );
	}
	public static final void glPointParameterfvARB( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glPointParameterfvARB( a0, a1 );
	}
	public static final void glPointParameterfvARB( int a0, float[] a1, int a2 )
	{
		gl.glPointParameterfvARB( a0, a1, a2 );
	}
	public static final void glPointParameterfvEXT( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glPointParameterfvEXT( a0, a1 );
	}
	public static final void glPointParameterfvEXT( int a0, float[] a1, int a2 )
	{
		gl.glPointParameterfvEXT( a0, a1, a2 );
	}
	public static final void glPointParameterfvSGIS( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glPointParameterfvSGIS( a0, a1 );
	}
	public static final void glPointParameterfvSGIS( int a0, float[] a1, int a2 )
	{
		gl.glPointParameterfvSGIS( a0, a1, a2 );
	}
	public static final void glPointParameteri( int a0, int a1 )
	{
		gl.glPointParameteri( a0, a1 );
	}
	public static final void glPointParameteriNV( int a0, int a1 )
	{
		gl.glPointParameteriNV( a0, a1 );
	}
	public static final void glPointParameteriv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glPointParameteriv( a0, a1 );
	}
	public static final void glPointParameteriv( int a0, int[] a1, int a2 )
	{
		gl.glPointParameteriv( a0, a1, a2 );
	}
	public static final void glPointParameterivNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glPointParameterivNV( a0, a1 );
	}
	public static final void glPointParameterivNV( int a0, int[] a1, int a2 )
	{
		gl.glPointParameterivNV( a0, a1, a2 );
	}
	public static final void glPointSize( float a0 )
	{
		gl.glPointSize( a0 );
	}
	public static final int glPollAsyncSGIX( java.nio.IntBuffer a0 )
	{
		return gl.glPollAsyncSGIX( a0 );
	}
	public static final int glPollAsyncSGIX( int[] a0, int a1 )
	{
		return gl.glPollAsyncSGIX( a0, a1 );
	}
	public static final int glPollInstrumentsSGIX( java.nio.IntBuffer a0 )
	{
		return gl.glPollInstrumentsSGIX( a0 );
	}
	public static final int glPollInstrumentsSGIX( int[] a0, int a1 )
	{
		return gl.glPollInstrumentsSGIX( a0, a1 );
	}
	public static final void glPolygonMode( int a0, int a1 )
	{
		gl.glPolygonMode( a0, a1 );
	}
	public static final void glPolygonOffset( float a0, float a1 )
	{
		gl.glPolygonOffset( a0, a1 );
	}
	public static final void glPolygonStipple( java.nio.ByteBuffer a0 )
	{
		gl.glPolygonStipple( a0 );
	}
	public static final void glPolygonStipple( byte[] a0, int a1 )
	{
		gl.glPolygonStipple( a0, a1 );
	}
	public static final void glPolygonStipple( long a0 )
	{
		gl.glPolygonStipple( a0 );
	}
	public static final void glPopAttrib()
	{
		gl.glPopAttrib();
	}
	public static final void glPopClientAttrib()
	{
		gl.glPopClientAttrib();
	}
	public static final void glPopMatrix()
	{
		gl.glPopMatrix();
	}
	public static final void glPopName()
	{
		gl.glPopName();
	}
	public static final void glPrimitiveRestartIndexNV( int a0 )
	{
		gl.glPrimitiveRestartIndexNV( a0 );
	}
	public static final void glPrimitiveRestartNV()
	{
		gl.glPrimitiveRestartNV();
	}
	public static final void glPrioritizeTextures( int a0, java.nio.IntBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glPrioritizeTextures( a0, a1, a2 );
	}
	public static final void glPrioritizeTextures( int a0, int[] a1, int a2, float[] a3, int a4 )
	{
		gl.glPrioritizeTextures( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramBufferParametersIivNV( int a0, int a1, int a2, int a3, java.nio.IntBuffer a4 )
	{
		gl.glProgramBufferParametersIivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramBufferParametersIivNV( int a0, int a1, int a2, int a3, int[] a4, int a5 )
	{
		gl.glProgramBufferParametersIivNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramBufferParametersIuivNV( int a0, int a1, int a2, int a3, java.nio.IntBuffer a4 )
	{
		gl.glProgramBufferParametersIuivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramBufferParametersIuivNV( int a0, int a1, int a2, int a3, int[] a4, int a5 )
	{
		gl.glProgramBufferParametersIuivNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramBufferParametersfvNV( int a0, int a1, int a2, int a3, java.nio.FloatBuffer a4 )
	{
		gl.glProgramBufferParametersfvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramBufferParametersfvNV( int a0, int a1, int a2, int a3, float[] a4, int a5 )
	{
		gl.glProgramBufferParametersfvNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramEnvParameter4dARB( int a0, int a1, double a2, double a3, double a4, double a5 )
	{
		gl.glProgramEnvParameter4dARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramEnvParameter4dvARB( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glProgramEnvParameter4dvARB( a0, a1, a2 );
	}
	public static final void glProgramEnvParameter4dvARB( int a0, int a1, double[] a2, int a3 )
	{
		gl.glProgramEnvParameter4dvARB( a0, a1, a2, a3 );
	}
	public static final void glProgramEnvParameter4fARB( int a0, int a1, float a2, float a3, float a4, float a5 )
	{
		gl.glProgramEnvParameter4fARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramEnvParameter4fvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glProgramEnvParameter4fvARB( a0, a1, a2 );
	}
	public static final void glProgramEnvParameter4fvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glProgramEnvParameter4fvARB( a0, a1, a2, a3 );
	}
	public static final void glProgramEnvParameterI4iNV( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glProgramEnvParameterI4iNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramEnvParameterI4ivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glProgramEnvParameterI4ivNV( a0, a1, a2 );
	}
	public static final void glProgramEnvParameterI4ivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glProgramEnvParameterI4ivNV( a0, a1, a2, a3 );
	}
	public static final void glProgramEnvParameterI4uiNV( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glProgramEnvParameterI4uiNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramEnvParameterI4uivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glProgramEnvParameterI4uivNV( a0, a1, a2 );
	}
	public static final void glProgramEnvParameterI4uivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glProgramEnvParameterI4uivNV( a0, a1, a2, a3 );
	}
	public static final void glProgramEnvParameters4fvEXT( int a0, int a1, int a2, java.nio.FloatBuffer a3 )
	{
		gl.glProgramEnvParameters4fvEXT( a0, a1, a2, a3 );
	}
	public static final void glProgramEnvParameters4fvEXT( int a0, int a1, int a2, float[] a3, int a4 )
	{
		gl.glProgramEnvParameters4fvEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramEnvParametersI4ivNV( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glProgramEnvParametersI4ivNV( a0, a1, a2, a3 );
	}
	public static final void glProgramEnvParametersI4ivNV( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glProgramEnvParametersI4ivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramEnvParametersI4uivNV( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glProgramEnvParametersI4uivNV( a0, a1, a2, a3 );
	}
	public static final void glProgramEnvParametersI4uivNV( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glProgramEnvParametersI4uivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramLocalParameter4dARB( int a0, int a1, double a2, double a3, double a4, double a5 )
	{
		gl.glProgramLocalParameter4dARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramLocalParameter4dvARB( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glProgramLocalParameter4dvARB( a0, a1, a2 );
	}
	public static final void glProgramLocalParameter4dvARB( int a0, int a1, double[] a2, int a3 )
	{
		gl.glProgramLocalParameter4dvARB( a0, a1, a2, a3 );
	}
	public static final void glProgramLocalParameter4fARB( int a0, int a1, float a2, float a3, float a4, float a5 )
	{
		gl.glProgramLocalParameter4fARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramLocalParameter4fvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glProgramLocalParameter4fvARB( a0, a1, a2 );
	}
	public static final void glProgramLocalParameter4fvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glProgramLocalParameter4fvARB( a0, a1, a2, a3 );
	}
	public static final void glProgramLocalParameterI4iNV( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glProgramLocalParameterI4iNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramLocalParameterI4ivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glProgramLocalParameterI4ivNV( a0, a1, a2 );
	}
	public static final void glProgramLocalParameterI4ivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glProgramLocalParameterI4ivNV( a0, a1, a2, a3 );
	}
	public static final void glProgramLocalParameterI4uiNV( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glProgramLocalParameterI4uiNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramLocalParameterI4uivNV( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glProgramLocalParameterI4uivNV( a0, a1, a2 );
	}
	public static final void glProgramLocalParameterI4uivNV( int a0, int a1, int[] a2, int a3 )
	{
		gl.glProgramLocalParameterI4uivNV( a0, a1, a2, a3 );
	}
	public static final void glProgramLocalParameters4fvEXT( int a0, int a1, int a2, java.nio.FloatBuffer a3 )
	{
		gl.glProgramLocalParameters4fvEXT( a0, a1, a2, a3 );
	}
	public static final void glProgramLocalParameters4fvEXT( int a0, int a1, int a2, float[] a3, int a4 )
	{
		gl.glProgramLocalParameters4fvEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramLocalParametersI4ivNV( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glProgramLocalParametersI4ivNV( a0, a1, a2, a3 );
	}
	public static final void glProgramLocalParametersI4ivNV( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glProgramLocalParametersI4ivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramLocalParametersI4uivNV( int a0, int a1, int a2, java.nio.IntBuffer a3 )
	{
		gl.glProgramLocalParametersI4uivNV( a0, a1, a2, a3 );
	}
	public static final void glProgramLocalParametersI4uivNV( int a0, int a1, int a2, int[] a3, int a4 )
	{
		gl.glProgramLocalParametersI4uivNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramNamedParameter4dNV( int a0, int a1, java.lang.String a2, double a3, double a4, double a5, double a6 )
	{
		gl.glProgramNamedParameter4dNV( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glProgramNamedParameter4dvNV( int a0, int a1, java.lang.String a2, java.nio.DoubleBuffer a3 )
	{
		gl.glProgramNamedParameter4dvNV( a0, a1, a2, a3 );
	}
	public static final void glProgramNamedParameter4dvNV( int a0, int a1, java.lang.String a2, double[] a3, int a4 )
	{
		gl.glProgramNamedParameter4dvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramNamedParameter4fNV( int a0, int a1, java.lang.String a2, float a3, float a4, float a5, float a6 )
	{
		gl.glProgramNamedParameter4fNV( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glProgramNamedParameter4fvNV( int a0, int a1, java.lang.String a2, java.nio.FloatBuffer a3 )
	{
		gl.glProgramNamedParameter4fvNV( a0, a1, a2, a3 );
	}
	public static final void glProgramNamedParameter4fvNV( int a0, int a1, java.lang.String a2, float[] a3, int a4 )
	{
		gl.glProgramNamedParameter4fvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramParameter4dNV( int a0, int a1, double a2, double a3, double a4, double a5 )
	{
		gl.glProgramParameter4dNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramParameter4dvNV( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glProgramParameter4dvNV( a0, a1, a2 );
	}
	public static final void glProgramParameter4dvNV( int a0, int a1, double[] a2, int a3 )
	{
		gl.glProgramParameter4dvNV( a0, a1, a2, a3 );
	}
	public static final void glProgramParameter4fNV( int a0, int a1, float a2, float a3, float a4, float a5 )
	{
		gl.glProgramParameter4fNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glProgramParameter4fvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glProgramParameter4fvNV( a0, a1, a2 );
	}
	public static final void glProgramParameter4fvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glProgramParameter4fvNV( a0, a1, a2, a3 );
	}
	public static final void glProgramParameteriEXT( int a0, int a1, int a2 )
	{
		gl.glProgramParameteriEXT( a0, a1, a2 );
	}
	public static final void glProgramParameters4dvNV( int a0, int a1, int a2, java.nio.DoubleBuffer a3 )
	{
		gl.glProgramParameters4dvNV( a0, a1, a2, a3 );
	}
	public static final void glProgramParameters4dvNV( int a0, int a1, int a2, double[] a3, int a4 )
	{
		gl.glProgramParameters4dvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramParameters4fvNV( int a0, int a1, int a2, java.nio.FloatBuffer a3 )
	{
		gl.glProgramParameters4fvNV( a0, a1, a2, a3 );
	}
	public static final void glProgramParameters4fvNV( int a0, int a1, int a2, float[] a3, int a4 )
	{
		gl.glProgramParameters4fvNV( a0, a1, a2, a3, a4 );
	}
	public static final void glProgramStringARB( int a0, int a1, int a2, java.lang.String a3 )
	{
		gl.glProgramStringARB( a0, a1, a2, a3 );
	}
	public static final void glProgramVertexLimitNV( int a0, int a1 )
	{
		gl.glProgramVertexLimitNV( a0, a1 );
	}
	public static final void glPushAttrib( int a0 )
	{
		gl.glPushAttrib( a0 );
	}
	public static final void glPushClientAttrib( int a0 )
	{
		gl.glPushClientAttrib( a0 );
	}
	public static final void glPushMatrix()
	{
		gl.glPushMatrix();
	}
	public static final void glPushName( int a0 )
	{
		gl.glPushName( a0 );
	}
	public static final void glRasterPos2d( double a0, double a1 )
	{
		gl.glRasterPos2d( a0, a1 );
	}
	public static final void glRasterPos2dv( java.nio.DoubleBuffer a0 )
	{
		gl.glRasterPos2dv( a0 );
	}
	public static final void glRasterPos2dv( double[] a0, int a1 )
	{
		gl.glRasterPos2dv( a0, a1 );
	}
	public static final void glRasterPos2f( float a0, float a1 )
	{
		gl.glRasterPos2f( a0, a1 );
	}
	public static final void glRasterPos2fv( java.nio.FloatBuffer a0 )
	{
		gl.glRasterPos2fv( a0 );
	}
	public static final void glRasterPos2fv( float[] a0, int a1 )
	{
		gl.glRasterPos2fv( a0, a1 );
	}
	public static final void glRasterPos2i( int a0, int a1 )
	{
		gl.glRasterPos2i( a0, a1 );
	}
	public static final void glRasterPos2iv( java.nio.IntBuffer a0 )
	{
		gl.glRasterPos2iv( a0 );
	}
	public static final void glRasterPos2iv( int[] a0, int a1 )
	{
		gl.glRasterPos2iv( a0, a1 );
	}
	public static final void glRasterPos2s( short a0, short a1 )
	{
		gl.glRasterPos2s( a0, a1 );
	}
	public static final void glRasterPos2sv( java.nio.ShortBuffer a0 )
	{
		gl.glRasterPos2sv( a0 );
	}
	public static final void glRasterPos2sv( short[] a0, int a1 )
	{
		gl.glRasterPos2sv( a0, a1 );
	}
	public static final void glRasterPos3d( double a0, double a1, double a2 )
	{
		gl.glRasterPos3d( a0, a1, a2 );
	}
	public static final void glRasterPos3dv( java.nio.DoubleBuffer a0 )
	{
		gl.glRasterPos3dv( a0 );
	}
	public static final void glRasterPos3dv( double[] a0, int a1 )
	{
		gl.glRasterPos3dv( a0, a1 );
	}
	public static final void glRasterPos3f( float a0, float a1, float a2 )
	{
		gl.glRasterPos3f( a0, a1, a2 );
	}
	public static final void glRasterPos3fv( java.nio.FloatBuffer a0 )
	{
		gl.glRasterPos3fv( a0 );
	}
	public static final void glRasterPos3fv( float[] a0, int a1 )
	{
		gl.glRasterPos3fv( a0, a1 );
	}
	public static final void glRasterPos3i( int a0, int a1, int a2 )
	{
		gl.glRasterPos3i( a0, a1, a2 );
	}
	public static final void glRasterPos3iv( java.nio.IntBuffer a0 )
	{
		gl.glRasterPos3iv( a0 );
	}
	public static final void glRasterPos3iv( int[] a0, int a1 )
	{
		gl.glRasterPos3iv( a0, a1 );
	}
	public static final void glRasterPos3s( short a0, short a1, short a2 )
	{
		gl.glRasterPos3s( a0, a1, a2 );
	}
	public static final void glRasterPos3sv( java.nio.ShortBuffer a0 )
	{
		gl.glRasterPos3sv( a0 );
	}
	public static final void glRasterPos3sv( short[] a0, int a1 )
	{
		gl.glRasterPos3sv( a0, a1 );
	}
	public static final void glRasterPos4d( double a0, double a1, double a2, double a3 )
	{
		gl.glRasterPos4d( a0, a1, a2, a3 );
	}
	public static final void glRasterPos4dv( java.nio.DoubleBuffer a0 )
	{
		gl.glRasterPos4dv( a0 );
	}
	public static final void glRasterPos4dv( double[] a0, int a1 )
	{
		gl.glRasterPos4dv( a0, a1 );
	}
	public static final void glRasterPos4f( float a0, float a1, float a2, float a3 )
	{
		gl.glRasterPos4f( a0, a1, a2, a3 );
	}
	public static final void glRasterPos4fv( java.nio.FloatBuffer a0 )
	{
		gl.glRasterPos4fv( a0 );
	}
	public static final void glRasterPos4fv( float[] a0, int a1 )
	{
		gl.glRasterPos4fv( a0, a1 );
	}
	public static final void glRasterPos4i( int a0, int a1, int a2, int a3 )
	{
		gl.glRasterPos4i( a0, a1, a2, a3 );
	}
	public static final void glRasterPos4iv( java.nio.IntBuffer a0 )
	{
		gl.glRasterPos4iv( a0 );
	}
	public static final void glRasterPos4iv( int[] a0, int a1 )
	{
		gl.glRasterPos4iv( a0, a1 );
	}
	public static final void glRasterPos4s( short a0, short a1, short a2, short a3 )
	{
		gl.glRasterPos4s( a0, a1, a2, a3 );
	}
	public static final void glRasterPos4sv( java.nio.ShortBuffer a0 )
	{
		gl.glRasterPos4sv( a0 );
	}
	public static final void glRasterPos4sv( short[] a0, int a1 )
	{
		gl.glRasterPos4sv( a0, a1 );
	}
	public static final void glReadBuffer( int a0 )
	{
		gl.glReadBuffer( a0 );
	}
	public static final void glReadBufferRegion( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glReadBufferRegion( a0, a1, a2, a3, a4 );
	}
	public static final void glReadInstrumentsSGIX( int a0 )
	{
		gl.glReadInstrumentsSGIX( a0 );
	}
	public static final void glReadPixels( int a0, int a1, int a2, int a3, int a4, int a5, java.nio.Buffer a6 )
	{
		gl.glReadPixels( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glReadPixels( int a0, int a1, int a2, int a3, int a4, int a5, long a6 )
	{
		gl.glReadPixels( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glRectd( double a0, double a1, double a2, double a3 )
	{
		gl.glRectd( a0, a1, a2, a3 );
	}
	public static final void glRectdv( java.nio.DoubleBuffer a0, java.nio.DoubleBuffer a1 )
	{
		gl.glRectdv( a0, a1 );
	}
	public static final void glRectdv( double[] a0, int a1, double[] a2, int a3 )
	{
		gl.glRectdv( a0, a1, a2, a3 );
	}
	public static final void glRectf( float a0, float a1, float a2, float a3 )
	{
		gl.glRectf( a0, a1, a2, a3 );
	}
	public static final void glRectfv( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1 )
	{
		gl.glRectfv( a0, a1 );
	}
	public static final void glRectfv( float[] a0, int a1, float[] a2, int a3 )
	{
		gl.glRectfv( a0, a1, a2, a3 );
	}
	public static final void glRecti( int a0, int a1, int a2, int a3 )
	{
		gl.glRecti( a0, a1, a2, a3 );
	}
	public static final void glRectiv( java.nio.IntBuffer a0, java.nio.IntBuffer a1 )
	{
		gl.glRectiv( a0, a1 );
	}
	public static final void glRectiv( int[] a0, int a1, int[] a2, int a3 )
	{
		gl.glRectiv( a0, a1, a2, a3 );
	}
	public static final void glRects( short a0, short a1, short a2, short a3 )
	{
		gl.glRects( a0, a1, a2, a3 );
	}
	public static final void glRectsv( java.nio.ShortBuffer a0, java.nio.ShortBuffer a1 )
	{
		gl.glRectsv( a0, a1 );
	}
	public static final void glRectsv( short[] a0, int a1, short[] a2, int a3 )
	{
		gl.glRectsv( a0, a1, a2, a3 );
	}
	public static final void glReferencePlaneSGIX( java.nio.DoubleBuffer a0 )
	{
		gl.glReferencePlaneSGIX( a0 );
	}
	public static final void glReferencePlaneSGIX( double[] a0, int a1 )
	{
		gl.glReferencePlaneSGIX( a0, a1 );
	}
	public static final int glRenderMode( int a0 )
	{
		return gl.glRenderMode( a0 );
	}
	public static final void glRenderbufferStorageEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glRenderbufferStorageEXT( a0, a1, a2, a3 );
	}
	public static final void glRenderbufferStorageMultisampleCoverageNV( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glRenderbufferStorageMultisampleCoverageNV( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glRenderbufferStorageMultisampleEXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glRenderbufferStorageMultisampleEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glReplacementCodeuiColor3fVertex3fSUN( int a0, float a1, float a2, float a3, float a4, float a5, float a6 )
	{
		gl.glReplacementCodeuiColor3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glReplacementCodeuiColor3fVertex3fvSUN( java.nio.IntBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glReplacementCodeuiColor3fVertex3fvSUN( a0, a1, a2 );
	}
	public static final void glReplacementCodeuiColor3fVertex3fvSUN( int[] a0, int a1, float[] a2, int a3, float[] a4, int a5 )
	{
		gl.glReplacementCodeuiColor3fVertex3fvSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glReplacementCodeuiColor4fNormal3fVertex3fSUN( int a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9, float a10 )
	{
		gl.glReplacementCodeuiColor4fNormal3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glReplacementCodeuiColor4fNormal3fVertex3fvSUN( java.nio.IntBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2, java.nio.FloatBuffer a3 )
	{
		gl.glReplacementCodeuiColor4fNormal3fVertex3fvSUN( a0, a1, a2, a3 );
	}
	public static final void glReplacementCodeuiColor4fNormal3fVertex3fvSUN( int[] a0, int a1, float[] a2, int a3, float[] a4, int a5, float[] a6, int a7 )
	{
		gl.glReplacementCodeuiColor4fNormal3fVertex3fvSUN( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glReplacementCodeuiColor4ubVertex3fSUN( int a0, byte a1, byte a2, byte a3, byte a4, float a5, float a6, float a7 )
	{
		gl.glReplacementCodeuiColor4ubVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glReplacementCodeuiColor4ubVertex3fvSUN( java.nio.IntBuffer a0, java.nio.ByteBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glReplacementCodeuiColor4ubVertex3fvSUN( a0, a1, a2 );
	}
	public static final void glReplacementCodeuiColor4ubVertex3fvSUN( int[] a0, int a1, byte[] a2, int a3, float[] a4, int a5 )
	{
		gl.glReplacementCodeuiColor4ubVertex3fvSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glReplacementCodeuiNormal3fVertex3fSUN( int a0, float a1, float a2, float a3, float a4, float a5, float a6 )
	{
		gl.glReplacementCodeuiNormal3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glReplacementCodeuiNormal3fVertex3fvSUN( java.nio.IntBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glReplacementCodeuiNormal3fVertex3fvSUN( a0, a1, a2 );
	}
	public static final void glReplacementCodeuiNormal3fVertex3fvSUN( int[] a0, int a1, float[] a2, int a3, float[] a4, int a5 )
	{
		gl.glReplacementCodeuiNormal3fVertex3fvSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN( int a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9, float a10, float a11, float a12 )
	{
		gl.glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12 );
	}
	public static final void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN( java.nio.IntBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2, java.nio.FloatBuffer a3, java.nio.FloatBuffer a4 )
	{
		gl.glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN( a0, a1, a2, a3, a4 );
	}
	public static final void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN( int[] a0, int a1, float[] a2, int a3, float[] a4, int a5, float[] a6, int a7, float[] a8, int a9 )
	{
		gl.glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN( int a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8 )
	{
		gl.glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN( java.nio.IntBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2, java.nio.FloatBuffer a3 )
	{
		gl.glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN( a0, a1, a2, a3 );
	}
	public static final void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN( int[] a0, int a1, float[] a2, int a3, float[] a4, int a5, float[] a6, int a7 )
	{
		gl.glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glReplacementCodeuiTexCoord2fVertex3fSUN( int a0, float a1, float a2, float a3, float a4, float a5 )
	{
		gl.glReplacementCodeuiTexCoord2fVertex3fSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glReplacementCodeuiTexCoord2fVertex3fvSUN( java.nio.IntBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glReplacementCodeuiTexCoord2fVertex3fvSUN( a0, a1, a2 );
	}
	public static final void glReplacementCodeuiTexCoord2fVertex3fvSUN( int[] a0, int a1, float[] a2, int a3, float[] a4, int a5 )
	{
		gl.glReplacementCodeuiTexCoord2fVertex3fvSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glReplacementCodeuiVertex3fSUN( int a0, float a1, float a2, float a3 )
	{
		gl.glReplacementCodeuiVertex3fSUN( a0, a1, a2, a3 );
	}
	public static final void glReplacementCodeuiVertex3fvSUN( java.nio.IntBuffer a0, java.nio.FloatBuffer a1 )
	{
		gl.glReplacementCodeuiVertex3fvSUN( a0, a1 );
	}
	public static final void glReplacementCodeuiVertex3fvSUN( int[] a0, int a1, float[] a2, int a3 )
	{
		gl.glReplacementCodeuiVertex3fvSUN( a0, a1, a2, a3 );
	}
	public static final void glRequestResidentProgramsNV( int a0, java.nio.IntBuffer a1 )
	{
		gl.glRequestResidentProgramsNV( a0, a1 );
	}
	public static final void glRequestResidentProgramsNV( int a0, int[] a1, int a2 )
	{
		gl.glRequestResidentProgramsNV( a0, a1, a2 );
	}
	public static final void glResetHistogram( int a0 )
	{
		gl.glResetHistogram( a0 );
	}
	public static final void glResetMinmax( int a0 )
	{
		gl.glResetMinmax( a0 );
	}
	public static final void glResizeBuffersMESA()
	{
		gl.glResizeBuffersMESA();
	}
	public static final void glRotated( double a0, double a1, double a2, double a3 )
	{
		gl.glRotated( a0, a1, a2, a3 );
	}
	public static final void glRotatef( float a0, float a1, float a2, float a3 )
	{
		gl.glRotatef( a0, a1, a2, a3 );
	}
	public static final void glSampleCoverage( float a0, boolean a1 )
	{
		gl.glSampleCoverage( a0, a1 );
	}
	public static final void glSampleMapATI( int a0, int a1, int a2 )
	{
		gl.glSampleMapATI( a0, a1, a2 );
	}
	public static final void glSampleMaskEXT( float a0, boolean a1 )
	{
		gl.glSampleMaskEXT( a0, a1 );
	}
	public static final void glSampleMaskSGIS( float a0, boolean a1 )
	{
		gl.glSampleMaskSGIS( a0, a1 );
	}
	public static final void glSamplePatternEXT( int a0 )
	{
		gl.glSamplePatternEXT( a0 );
	}
	public static final void glSamplePatternSGIS( int a0 )
	{
		gl.glSamplePatternSGIS( a0 );
	}
	public static final void glScaled( double a0, double a1, double a2 )
	{
		gl.glScaled( a0, a1, a2 );
	}
	public static final void glScalef( float a0, float a1, float a2 )
	{
		gl.glScalef( a0, a1, a2 );
	}
	public static final void glScissor( int a0, int a1, int a2, int a3 )
	{
		gl.glScissor( a0, a1, a2, a3 );
	}
	public static final void glSecondaryColor3b( byte a0, byte a1, byte a2 )
	{
		gl.glSecondaryColor3b( a0, a1, a2 );
	}
	public static final void glSecondaryColor3bEXT( byte a0, byte a1, byte a2 )
	{
		gl.glSecondaryColor3bEXT( a0, a1, a2 );
	}
	public static final void glSecondaryColor3bv( java.nio.ByteBuffer a0 )
	{
		gl.glSecondaryColor3bv( a0 );
	}
	public static final void glSecondaryColor3bv( byte[] a0, int a1 )
	{
		gl.glSecondaryColor3bv( a0, a1 );
	}
	public static final void glSecondaryColor3bvEXT( java.nio.ByteBuffer a0 )
	{
		gl.glSecondaryColor3bvEXT( a0 );
	}
	public static final void glSecondaryColor3bvEXT( byte[] a0, int a1 )
	{
		gl.glSecondaryColor3bvEXT( a0, a1 );
	}
	public static final void glSecondaryColor3d( double a0, double a1, double a2 )
	{
		gl.glSecondaryColor3d( a0, a1, a2 );
	}
	public static final void glSecondaryColor3dEXT( double a0, double a1, double a2 )
	{
		gl.glSecondaryColor3dEXT( a0, a1, a2 );
	}
	public static final void glSecondaryColor3dv( java.nio.DoubleBuffer a0 )
	{
		gl.glSecondaryColor3dv( a0 );
	}
	public static final void glSecondaryColor3dv( double[] a0, int a1 )
	{
		gl.glSecondaryColor3dv( a0, a1 );
	}
	public static final void glSecondaryColor3dvEXT( java.nio.DoubleBuffer a0 )
	{
		gl.glSecondaryColor3dvEXT( a0 );
	}
	public static final void glSecondaryColor3dvEXT( double[] a0, int a1 )
	{
		gl.glSecondaryColor3dvEXT( a0, a1 );
	}
	public static final void glSecondaryColor3f( float a0, float a1, float a2 )
	{
		gl.glSecondaryColor3f( a0, a1, a2 );
	}
	public static final void glSecondaryColor3fEXT( float a0, float a1, float a2 )
	{
		gl.glSecondaryColor3fEXT( a0, a1, a2 );
	}
	public static final void glSecondaryColor3fv( java.nio.FloatBuffer a0 )
	{
		gl.glSecondaryColor3fv( a0 );
	}
	public static final void glSecondaryColor3fv( float[] a0, int a1 )
	{
		gl.glSecondaryColor3fv( a0, a1 );
	}
	public static final void glSecondaryColor3fvEXT( java.nio.FloatBuffer a0 )
	{
		gl.glSecondaryColor3fvEXT( a0 );
	}
	public static final void glSecondaryColor3fvEXT( float[] a0, int a1 )
	{
		gl.glSecondaryColor3fvEXT( a0, a1 );
	}
	public static final void glSecondaryColor3hNV( short a0, short a1, short a2 )
	{
		gl.glSecondaryColor3hNV( a0, a1, a2 );
	}
	public static final void glSecondaryColor3hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glSecondaryColor3hvNV( a0 );
	}
	public static final void glSecondaryColor3hvNV( short[] a0, int a1 )
	{
		gl.glSecondaryColor3hvNV( a0, a1 );
	}
	public static final void glSecondaryColor3i( int a0, int a1, int a2 )
	{
		gl.glSecondaryColor3i( a0, a1, a2 );
	}
	public static final void glSecondaryColor3iEXT( int a0, int a1, int a2 )
	{
		gl.glSecondaryColor3iEXT( a0, a1, a2 );
	}
	public static final void glSecondaryColor3iv( java.nio.IntBuffer a0 )
	{
		gl.glSecondaryColor3iv( a0 );
	}
	public static final void glSecondaryColor3iv( int[] a0, int a1 )
	{
		gl.glSecondaryColor3iv( a0, a1 );
	}
	public static final void glSecondaryColor3ivEXT( java.nio.IntBuffer a0 )
	{
		gl.glSecondaryColor3ivEXT( a0 );
	}
	public static final void glSecondaryColor3ivEXT( int[] a0, int a1 )
	{
		gl.glSecondaryColor3ivEXT( a0, a1 );
	}
	public static final void glSecondaryColor3s( short a0, short a1, short a2 )
	{
		gl.glSecondaryColor3s( a0, a1, a2 );
	}
	public static final void glSecondaryColor3sEXT( short a0, short a1, short a2 )
	{
		gl.glSecondaryColor3sEXT( a0, a1, a2 );
	}
	public static final void glSecondaryColor3sv( java.nio.ShortBuffer a0 )
	{
		gl.glSecondaryColor3sv( a0 );
	}
	public static final void glSecondaryColor3sv( short[] a0, int a1 )
	{
		gl.glSecondaryColor3sv( a0, a1 );
	}
	public static final void glSecondaryColor3svEXT( java.nio.ShortBuffer a0 )
	{
		gl.glSecondaryColor3svEXT( a0 );
	}
	public static final void glSecondaryColor3svEXT( short[] a0, int a1 )
	{
		gl.glSecondaryColor3svEXT( a0, a1 );
	}
	public static final void glSecondaryColor3ub( byte a0, byte a1, byte a2 )
	{
		gl.glSecondaryColor3ub( a0, a1, a2 );
	}
	public static final void glSecondaryColor3ubEXT( byte a0, byte a1, byte a2 )
	{
		gl.glSecondaryColor3ubEXT( a0, a1, a2 );
	}
	public static final void glSecondaryColor3ubv( java.nio.ByteBuffer a0 )
	{
		gl.glSecondaryColor3ubv( a0 );
	}
	public static final void glSecondaryColor3ubv( byte[] a0, int a1 )
	{
		gl.glSecondaryColor3ubv( a0, a1 );
	}
	public static final void glSecondaryColor3ubvEXT( java.nio.ByteBuffer a0 )
	{
		gl.glSecondaryColor3ubvEXT( a0 );
	}
	public static final void glSecondaryColor3ubvEXT( byte[] a0, int a1 )
	{
		gl.glSecondaryColor3ubvEXT( a0, a1 );
	}
	public static final void glSecondaryColor3ui( int a0, int a1, int a2 )
	{
		gl.glSecondaryColor3ui( a0, a1, a2 );
	}
	public static final void glSecondaryColor3uiEXT( int a0, int a1, int a2 )
	{
		gl.glSecondaryColor3uiEXT( a0, a1, a2 );
	}
	public static final void glSecondaryColor3uiv( java.nio.IntBuffer a0 )
	{
		gl.glSecondaryColor3uiv( a0 );
	}
	public static final void glSecondaryColor3uiv( int[] a0, int a1 )
	{
		gl.glSecondaryColor3uiv( a0, a1 );
	}
	public static final void glSecondaryColor3uivEXT( java.nio.IntBuffer a0 )
	{
		gl.glSecondaryColor3uivEXT( a0 );
	}
	public static final void glSecondaryColor3uivEXT( int[] a0, int a1 )
	{
		gl.glSecondaryColor3uivEXT( a0, a1 );
	}
	public static final void glSecondaryColor3us( short a0, short a1, short a2 )
	{
		gl.glSecondaryColor3us( a0, a1, a2 );
	}
	public static final void glSecondaryColor3usEXT( short a0, short a1, short a2 )
	{
		gl.glSecondaryColor3usEXT( a0, a1, a2 );
	}
	public static final void glSecondaryColor3usv( java.nio.ShortBuffer a0 )
	{
		gl.glSecondaryColor3usv( a0 );
	}
	public static final void glSecondaryColor3usv( short[] a0, int a1 )
	{
		gl.glSecondaryColor3usv( a0, a1 );
	}
	public static final void glSecondaryColor3usvEXT( java.nio.ShortBuffer a0 )
	{
		gl.glSecondaryColor3usvEXT( a0 );
	}
	public static final void glSecondaryColor3usvEXT( short[] a0, int a1 )
	{
		gl.glSecondaryColor3usvEXT( a0, a1 );
	}
	public static final void glSecondaryColorPointer( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glSecondaryColorPointer( a0, a1, a2, a3 );
	}
	public static final void glSecondaryColorPointer( int a0, int a1, int a2, long a3 )
	{
		gl.glSecondaryColorPointer( a0, a1, a2, a3 );
	}
	public static final void glSecondaryColorPointerEXT( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glSecondaryColorPointerEXT( a0, a1, a2, a3 );
	}
	public static final void glSecondaryColorPointerEXT( int a0, int a1, int a2, long a3 )
	{
		gl.glSecondaryColorPointerEXT( a0, a1, a2, a3 );
	}
	public static final void glSelectBuffer( int a0, java.nio.IntBuffer a1 )
	{
		gl.glSelectBuffer( a0, a1 );
	}
	public static final void glSeparableFilter2D( int a0, int a1, int a2, int a3, int a4, int a5, java.nio.Buffer a6, java.nio.Buffer a7 )
	{
		gl.glSeparableFilter2D( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glSeparableFilter2D( int a0, int a1, int a2, int a3, int a4, int a5, long a6, long a7 )
	{
		gl.glSeparableFilter2D( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glSetFenceAPPLE( int a0 )
	{
		gl.glSetFenceAPPLE( a0 );
	}
	public static final void glSetFenceNV( int a0, int a1 )
	{
		gl.glSetFenceNV( a0, a1 );
	}
	public static final void glSetFragmentShaderConstantATI( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glSetFragmentShaderConstantATI( a0, a1 );
	}
	public static final void glSetFragmentShaderConstantATI( int a0, float[] a1, int a2 )
	{
		gl.glSetFragmentShaderConstantATI( a0, a1, a2 );
	}
	public static final void glSetInvariantEXT( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glSetInvariantEXT( a0, a1, a2 );
	}
	public static final void glSetLocalConstantEXT( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glSetLocalConstantEXT( a0, a1, a2 );
	}
	public static final void glShadeModel( int a0 )
	{
		gl.glShadeModel( a0 );
	}
	public static final void glShaderOp1EXT( int a0, int a1, int a2 )
	{
		gl.glShaderOp1EXT( a0, a1, a2 );
	}
	public static final void glShaderOp2EXT( int a0, int a1, int a2, int a3 )
	{
		gl.glShaderOp2EXT( a0, a1, a2, a3 );
	}
	public static final void glShaderOp3EXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glShaderOp3EXT( a0, a1, a2, a3, a4 );
	}
	public static final void glShaderSource( int a0, int a1, java.lang.String[] a2, java.nio.IntBuffer a3 )
	{
		gl.glShaderSource( a0, a1, a2, a3 );
	}
	public static final void glShaderSource( int a0, int a1, java.lang.String[] a2, int[] a3, int a4 )
	{
		gl.glShaderSource( a0, a1, a2, a3, a4 );
	}
	public static final void glShaderSourceARB( int a0, int a1, java.lang.String[] a2, java.nio.IntBuffer a3 )
	{
		gl.glShaderSourceARB( a0, a1, a2, a3 );
	}
	public static final void glShaderSourceARB( int a0, int a1, java.lang.String[] a2, int[] a3, int a4 )
	{
		gl.glShaderSourceARB( a0, a1, a2, a3, a4 );
	}
	public static final void glSharpenTexFuncSGIS( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glSharpenTexFuncSGIS( a0, a1, a2 );
	}
	public static final void glSharpenTexFuncSGIS( int a0, int a1, float[] a2, int a3 )
	{
		gl.glSharpenTexFuncSGIS( a0, a1, a2, a3 );
	}
	public static final void glSpriteParameterfSGIX( int a0, float a1 )
	{
		gl.glSpriteParameterfSGIX( a0, a1 );
	}
	public static final void glSpriteParameterfvSGIX( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glSpriteParameterfvSGIX( a0, a1 );
	}
	public static final void glSpriteParameterfvSGIX( int a0, float[] a1, int a2 )
	{
		gl.glSpriteParameterfvSGIX( a0, a1, a2 );
	}
	public static final void glSpriteParameteriSGIX( int a0, int a1 )
	{
		gl.glSpriteParameteriSGIX( a0, a1 );
	}
	public static final void glSpriteParameterivSGIX( int a0, java.nio.IntBuffer a1 )
	{
		gl.glSpriteParameterivSGIX( a0, a1 );
	}
	public static final void glSpriteParameterivSGIX( int a0, int[] a1, int a2 )
	{
		gl.glSpriteParameterivSGIX( a0, a1, a2 );
	}
	public static final void glStartInstrumentsSGIX()
	{
		gl.glStartInstrumentsSGIX();
	}
	public static final void glStencilClearTagEXT( int a0, int a1 )
	{
		gl.glStencilClearTagEXT( a0, a1 );
	}
	public static final void glStencilFunc( int a0, int a1, int a2 )
	{
		gl.glStencilFunc( a0, a1, a2 );
	}
	public static final void glStencilFuncSeparate( int a0, int a1, int a2, int a3 )
	{
		gl.glStencilFuncSeparate( a0, a1, a2, a3 );
	}
	public static final void glStencilFuncSeparateATI( int a0, int a1, int a2, int a3 )
	{
		gl.glStencilFuncSeparateATI( a0, a1, a2, a3 );
	}
	public static final void glStencilMask( int a0 )
	{
		gl.glStencilMask( a0 );
	}
	public static final void glStencilMaskSeparate( int a0, int a1 )
	{
		gl.glStencilMaskSeparate( a0, a1 );
	}
	public static final void glStencilOp( int a0, int a1, int a2 )
	{
		gl.glStencilOp( a0, a1, a2 );
	}
	public static final void glStencilOpSeparate( int a0, int a1, int a2, int a3 )
	{
		gl.glStencilOpSeparate( a0, a1, a2, a3 );
	}
	public static final void glStencilOpSeparateATI( int a0, int a1, int a2, int a3 )
	{
		gl.glStencilOpSeparateATI( a0, a1, a2, a3 );
	}
	public static final void glStopInstrumentsSGIX( int a0 )
	{
		gl.glStopInstrumentsSGIX( a0 );
	}
	public static final void glStringMarkerGREMEDY( int a0, java.nio.Buffer a1 )
	{
		gl.glStringMarkerGREMEDY( a0, a1 );
	}
	public static final void glSwapAPPLE()
	{
		gl.glSwapAPPLE();
	}
	public static final void glSwizzleEXT( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glSwizzleEXT( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glTagSampleBufferSGIX()
	{
		gl.glTagSampleBufferSGIX();
	}
	public static final void glTbufferMask3DFX( int a0 )
	{
		gl.glTbufferMask3DFX( a0 );
	}
	public static final boolean glTestFenceAPPLE( int a0 )
	{
		return gl.glTestFenceAPPLE( a0 );
	}
	public static final boolean glTestFenceNV( int a0 )
	{
		return gl.glTestFenceNV( a0 );
	}
	public static final boolean glTestObjectAPPLE( int a0, int a1 )
	{
		return gl.glTestObjectAPPLE( a0, a1 );
	}
	public static final void glTexBufferEXT( int a0, int a1, int a2 )
	{
		gl.glTexBufferEXT( a0, a1, a2 );
	}
	public static final void glTexBumpParameterfvATI( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glTexBumpParameterfvATI( a0, a1 );
	}
	public static final void glTexBumpParameterfvATI( int a0, float[] a1, int a2 )
	{
		gl.glTexBumpParameterfvATI( a0, a1, a2 );
	}
	public static final void glTexBumpParameterivATI( int a0, java.nio.IntBuffer a1 )
	{
		gl.glTexBumpParameterivATI( a0, a1 );
	}
	public static final void glTexBumpParameterivATI( int a0, int[] a1, int a2 )
	{
		gl.glTexBumpParameterivATI( a0, a1, a2 );
	}
	public static final void glTexCoord1d( double a0 )
	{
		gl.glTexCoord1d( a0 );
	}
	public static final void glTexCoord1dv( java.nio.DoubleBuffer a0 )
	{
		gl.glTexCoord1dv( a0 );
	}
	public static final void glTexCoord1dv( double[] a0, int a1 )
	{
		gl.glTexCoord1dv( a0, a1 );
	}
	public static final void glTexCoord1f( float a0 )
	{
		gl.glTexCoord1f( a0 );
	}
	public static final void glTexCoord1fv( java.nio.FloatBuffer a0 )
	{
		gl.glTexCoord1fv( a0 );
	}
	public static final void glTexCoord1fv( float[] a0, int a1 )
	{
		gl.glTexCoord1fv( a0, a1 );
	}
	public static final void glTexCoord1hNV( short a0 )
	{
		gl.glTexCoord1hNV( a0 );
	}
	public static final void glTexCoord1hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glTexCoord1hvNV( a0 );
	}
	public static final void glTexCoord1hvNV( short[] a0, int a1 )
	{
		gl.glTexCoord1hvNV( a0, a1 );
	}
	public static final void glTexCoord1i( int a0 )
	{
		gl.glTexCoord1i( a0 );
	}
	public static final void glTexCoord1iv( java.nio.IntBuffer a0 )
	{
		gl.glTexCoord1iv( a0 );
	}
	public static final void glTexCoord1iv( int[] a0, int a1 )
	{
		gl.glTexCoord1iv( a0, a1 );
	}
	public static final void glTexCoord1s( short a0 )
	{
		gl.glTexCoord1s( a0 );
	}
	public static final void glTexCoord1sv( java.nio.ShortBuffer a0 )
	{
		gl.glTexCoord1sv( a0 );
	}
	public static final void glTexCoord1sv( short[] a0, int a1 )
	{
		gl.glTexCoord1sv( a0, a1 );
	}
	public static final void glTexCoord2d( double a0, double a1 )
	{
		gl.glTexCoord2d( a0, a1 );
	}
	public static final void glTexCoord2dv( java.nio.DoubleBuffer a0 )
	{
		gl.glTexCoord2dv( a0 );
	}
	public static final void glTexCoord2dv( double[] a0, int a1 )
	{
		gl.glTexCoord2dv( a0, a1 );
	}
	public static final void glTexCoord2f( float a0, float a1 )
	{
		gl.glTexCoord2f( a0, a1 );
	}
	public static final void glTexCoord2fColor3fVertex3fSUN( float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7 )
	{
		gl.glTexCoord2fColor3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glTexCoord2fColor3fVertex3fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glTexCoord2fColor3fVertex3fvSUN( a0, a1, a2 );
	}
	public static final void glTexCoord2fColor3fVertex3fvSUN( float[] a0, int a1, float[] a2, int a3, float[] a4, int a5 )
	{
		gl.glTexCoord2fColor3fVertex3fvSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glTexCoord2fColor4fNormal3fVertex3fSUN( float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9, float a10, float a11 )
	{
		gl.glTexCoord2fColor4fNormal3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11 );
	}
	public static final void glTexCoord2fColor4fNormal3fVertex3fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2, java.nio.FloatBuffer a3 )
	{
		gl.glTexCoord2fColor4fNormal3fVertex3fvSUN( a0, a1, a2, a3 );
	}
	public static final void glTexCoord2fColor4fNormal3fVertex3fvSUN( float[] a0, int a1, float[] a2, int a3, float[] a4, int a5, float[] a6, int a7 )
	{
		gl.glTexCoord2fColor4fNormal3fVertex3fvSUN( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glTexCoord2fColor4ubVertex3fSUN( float a0, float a1, byte a2, byte a3, byte a4, byte a5, float a6, float a7, float a8 )
	{
		gl.glTexCoord2fColor4ubVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glTexCoord2fColor4ubVertex3fvSUN( java.nio.FloatBuffer a0, java.nio.ByteBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glTexCoord2fColor4ubVertex3fvSUN( a0, a1, a2 );
	}
	public static final void glTexCoord2fColor4ubVertex3fvSUN( float[] a0, int a1, byte[] a2, int a3, float[] a4, int a5 )
	{
		gl.glTexCoord2fColor4ubVertex3fvSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glTexCoord2fNormal3fVertex3fSUN( float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7 )
	{
		gl.glTexCoord2fNormal3fVertex3fSUN( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glTexCoord2fNormal3fVertex3fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2 )
	{
		gl.glTexCoord2fNormal3fVertex3fvSUN( a0, a1, a2 );
	}
	public static final void glTexCoord2fNormal3fVertex3fvSUN( float[] a0, int a1, float[] a2, int a3, float[] a4, int a5 )
	{
		gl.glTexCoord2fNormal3fVertex3fvSUN( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glTexCoord2fVertex3fSUN( float a0, float a1, float a2, float a3, float a4 )
	{
		gl.glTexCoord2fVertex3fSUN( a0, a1, a2, a3, a4 );
	}
	public static final void glTexCoord2fVertex3fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1 )
	{
		gl.glTexCoord2fVertex3fvSUN( a0, a1 );
	}
	public static final void glTexCoord2fVertex3fvSUN( float[] a0, int a1, float[] a2, int a3 )
	{
		gl.glTexCoord2fVertex3fvSUN( a0, a1, a2, a3 );
	}
	public static final void glTexCoord2fv( java.nio.FloatBuffer a0 )
	{
		gl.glTexCoord2fv( a0 );
	}
	public static final void glTexCoord2fv( float[] a0, int a1 )
	{
		gl.glTexCoord2fv( a0, a1 );
	}
	public static final void glTexCoord2hNV( short a0, short a1 )
	{
		gl.glTexCoord2hNV( a0, a1 );
	}
	public static final void glTexCoord2hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glTexCoord2hvNV( a0 );
	}
	public static final void glTexCoord2hvNV( short[] a0, int a1 )
	{
		gl.glTexCoord2hvNV( a0, a1 );
	}
	public static final void glTexCoord2i( int a0, int a1 )
	{
		gl.glTexCoord2i( a0, a1 );
	}
	public static final void glTexCoord2iv( java.nio.IntBuffer a0 )
	{
		gl.glTexCoord2iv( a0 );
	}
	public static final void glTexCoord2iv( int[] a0, int a1 )
	{
		gl.glTexCoord2iv( a0, a1 );
	}
	public static final void glTexCoord2s( short a0, short a1 )
	{
		gl.glTexCoord2s( a0, a1 );
	}
	public static final void glTexCoord2sv( java.nio.ShortBuffer a0 )
	{
		gl.glTexCoord2sv( a0 );
	}
	public static final void glTexCoord2sv( short[] a0, int a1 )
	{
		gl.glTexCoord2sv( a0, a1 );
	}
	public static final void glTexCoord3d( double a0, double a1, double a2 )
	{
		gl.glTexCoord3d( a0, a1, a2 );
	}
	public static final void glTexCoord3dv( java.nio.DoubleBuffer a0 )
	{
		gl.glTexCoord3dv( a0 );
	}
	public static final void glTexCoord3dv( double[] a0, int a1 )
	{
		gl.glTexCoord3dv( a0, a1 );
	}
	public static final void glTexCoord3f( float a0, float a1, float a2 )
	{
		gl.glTexCoord3f( a0, a1, a2 );
	}
	public static final void glTexCoord3fv( java.nio.FloatBuffer a0 )
	{
		gl.glTexCoord3fv( a0 );
	}
	public static final void glTexCoord3fv( float[] a0, int a1 )
	{
		gl.glTexCoord3fv( a0, a1 );
	}
	public static final void glTexCoord3hNV( short a0, short a1, short a2 )
	{
		gl.glTexCoord3hNV( a0, a1, a2 );
	}
	public static final void glTexCoord3hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glTexCoord3hvNV( a0 );
	}
	public static final void glTexCoord3hvNV( short[] a0, int a1 )
	{
		gl.glTexCoord3hvNV( a0, a1 );
	}
	public static final void glTexCoord3i( int a0, int a1, int a2 )
	{
		gl.glTexCoord3i( a0, a1, a2 );
	}
	public static final void glTexCoord3iv( java.nio.IntBuffer a0 )
	{
		gl.glTexCoord3iv( a0 );
	}
	public static final void glTexCoord3iv( int[] a0, int a1 )
	{
		gl.glTexCoord3iv( a0, a1 );
	}
	public static final void glTexCoord3s( short a0, short a1, short a2 )
	{
		gl.glTexCoord3s( a0, a1, a2 );
	}
	public static final void glTexCoord3sv( java.nio.ShortBuffer a0 )
	{
		gl.glTexCoord3sv( a0 );
	}
	public static final void glTexCoord3sv( short[] a0, int a1 )
	{
		gl.glTexCoord3sv( a0, a1 );
	}
	public static final void glTexCoord4d( double a0, double a1, double a2, double a3 )
	{
		gl.glTexCoord4d( a0, a1, a2, a3 );
	}
	public static final void glTexCoord4dv( java.nio.DoubleBuffer a0 )
	{
		gl.glTexCoord4dv( a0 );
	}
	public static final void glTexCoord4dv( double[] a0, int a1 )
	{
		gl.glTexCoord4dv( a0, a1 );
	}
	public static final void glTexCoord4f( float a0, float a1, float a2, float a3 )
	{
		gl.glTexCoord4f( a0, a1, a2, a3 );
	}
	public static final void glTexCoord4fColor4fNormal3fVertex4fSUN( float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9, float a10, float a11, float a12, float a13, float a14 )
	{
		gl.glTexCoord4fColor4fNormal3fVertex4fSUN( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14 );
	}
	public static final void glTexCoord4fColor4fNormal3fVertex4fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1, java.nio.FloatBuffer a2, java.nio.FloatBuffer a3 )
	{
		gl.glTexCoord4fColor4fNormal3fVertex4fvSUN( a0, a1, a2, a3 );
	}
	public static final void glTexCoord4fColor4fNormal3fVertex4fvSUN( float[] a0, int a1, float[] a2, int a3, float[] a4, int a5, float[] a6, int a7 )
	{
		gl.glTexCoord4fColor4fNormal3fVertex4fvSUN( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glTexCoord4fVertex4fSUN( float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7 )
	{
		gl.glTexCoord4fVertex4fSUN( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glTexCoord4fVertex4fvSUN( java.nio.FloatBuffer a0, java.nio.FloatBuffer a1 )
	{
		gl.glTexCoord4fVertex4fvSUN( a0, a1 );
	}
	public static final void glTexCoord4fVertex4fvSUN( float[] a0, int a1, float[] a2, int a3 )
	{
		gl.glTexCoord4fVertex4fvSUN( a0, a1, a2, a3 );
	}
	public static final void glTexCoord4fv( java.nio.FloatBuffer a0 )
	{
		gl.glTexCoord4fv( a0 );
	}
	public static final void glTexCoord4fv( float[] a0, int a1 )
	{
		gl.glTexCoord4fv( a0, a1 );
	}
	public static final void glTexCoord4hNV( short a0, short a1, short a2, short a3 )
	{
		gl.glTexCoord4hNV( a0, a1, a2, a3 );
	}
	public static final void glTexCoord4hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glTexCoord4hvNV( a0 );
	}
	public static final void glTexCoord4hvNV( short[] a0, int a1 )
	{
		gl.glTexCoord4hvNV( a0, a1 );
	}
	public static final void glTexCoord4i( int a0, int a1, int a2, int a3 )
	{
		gl.glTexCoord4i( a0, a1, a2, a3 );
	}
	public static final void glTexCoord4iv( java.nio.IntBuffer a0 )
	{
		gl.glTexCoord4iv( a0 );
	}
	public static final void glTexCoord4iv( int[] a0, int a1 )
	{
		gl.glTexCoord4iv( a0, a1 );
	}
	public static final void glTexCoord4s( short a0, short a1, short a2, short a3 )
	{
		gl.glTexCoord4s( a0, a1, a2, a3 );
	}
	public static final void glTexCoord4sv( java.nio.ShortBuffer a0 )
	{
		gl.glTexCoord4sv( a0 );
	}
	public static final void glTexCoord4sv( short[] a0, int a1 )
	{
		gl.glTexCoord4sv( a0, a1 );
	}
	public static final void glTexCoordPointer( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glTexCoordPointer( a0, a1, a2, a3 );
	}
	public static final void glTexCoordPointer( int a0, int a1, int a2, long a3 )
	{
		gl.glTexCoordPointer( a0, a1, a2, a3 );
	}
	public static final void glTexEnvf( int a0, int a1, float a2 )
	{
		gl.glTexEnvf( a0, a1, a2 );
	}
	public static final void glTexEnvfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glTexEnvfv( a0, a1, a2 );
	}
	public static final void glTexEnvfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glTexEnvfv( a0, a1, a2, a3 );
	}
	public static final void glTexEnvi( int a0, int a1, int a2 )
	{
		gl.glTexEnvi( a0, a1, a2 );
	}
	public static final void glTexEnviv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glTexEnviv( a0, a1, a2 );
	}
	public static final void glTexEnviv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glTexEnviv( a0, a1, a2, a3 );
	}
	public static final void glTexFilterFuncSGIS( int a0, int a1, int a2, java.nio.FloatBuffer a3 )
	{
		gl.glTexFilterFuncSGIS( a0, a1, a2, a3 );
	}
	public static final void glTexFilterFuncSGIS( int a0, int a1, int a2, float[] a3, int a4 )
	{
		gl.glTexFilterFuncSGIS( a0, a1, a2, a3, a4 );
	}
	public static final void glTexGend( int a0, int a1, double a2 )
	{
		gl.glTexGend( a0, a1, a2 );
	}
	public static final void glTexGendv( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glTexGendv( a0, a1, a2 );
	}
	public static final void glTexGendv( int a0, int a1, double[] a2, int a3 )
	{
		gl.glTexGendv( a0, a1, a2, a3 );
	}
	public static final void glTexGenf( int a0, int a1, float a2 )
	{
		gl.glTexGenf( a0, a1, a2 );
	}
	public static final void glTexGenfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glTexGenfv( a0, a1, a2 );
	}
	public static final void glTexGenfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glTexGenfv( a0, a1, a2, a3 );
	}
	public static final void glTexGeni( int a0, int a1, int a2 )
	{
		gl.glTexGeni( a0, a1, a2 );
	}
	public static final void glTexGeniv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glTexGeniv( a0, a1, a2 );
	}
	public static final void glTexGeniv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glTexGeniv( a0, a1, a2, a3 );
	}
	public static final void glTexImage1D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, java.nio.Buffer a7 )
	{
		gl.glTexImage1D( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glTexImage1D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, long a7 )
	{
		gl.glTexImage1D( a0, a1, a2, a3, a4, a5, a6, a7 );
	}
	public static final void glTexImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.Buffer a8 )
	{
		gl.glTexImage2D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glTexImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, long a8 )
	{
		gl.glTexImage2D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glTexImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, java.nio.Buffer a9 )
	{
		gl.glTexImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glTexImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, long a9 )
	{
		gl.glTexImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 );
	}
	public static final void glTexImage4DSGIS( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, java.nio.Buffer a10 )
	{
		gl.glTexImage4DSGIS( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glTexParameterIivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glTexParameterIivEXT( a0, a1, a2 );
	}
	public static final void glTexParameterIivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glTexParameterIivEXT( a0, a1, a2, a3 );
	}
	public static final void glTexParameterIuivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glTexParameterIuivEXT( a0, a1, a2 );
	}
	public static final void glTexParameterIuivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glTexParameterIuivEXT( a0, a1, a2, a3 );
	}
	public static final void glTexParameterf( int a0, int a1, float a2 )
	{
		gl.glTexParameterf( a0, a1, a2 );
	}
	public static final void glTexParameterfv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glTexParameterfv( a0, a1, a2 );
	}
	public static final void glTexParameterfv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glTexParameterfv( a0, a1, a2, a3 );
	}
	public static final void glTexParameteri( int a0, int a1, int a2 )
	{
		gl.glTexParameteri( a0, a1, a2 );
	}
	public static final void glTexParameteriv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glTexParameteriv( a0, a1, a2 );
	}
	public static final void glTexParameteriv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glTexParameteriv( a0, a1, a2, a3 );
	}
	public static final void glTexSubImage1D( int a0, int a1, int a2, int a3, int a4, int a5, java.nio.Buffer a6 )
	{
		gl.glTexSubImage1D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glTexSubImage1D( int a0, int a1, int a2, int a3, int a4, int a5, long a6 )
	{
		gl.glTexSubImage1D( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glTexSubImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.Buffer a8 )
	{
		gl.glTexSubImage2D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glTexSubImage2D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, long a8 )
	{
		gl.glTexSubImage2D( a0, a1, a2, a3, a4, a5, a6, a7, a8 );
	}
	public static final void glTexSubImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, java.nio.Buffer a10 )
	{
		gl.glTexSubImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glTexSubImage3D( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, long a10 )
	{
		gl.glTexSubImage3D( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 );
	}
	public static final void glTexSubImage4DSGIS( int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11, java.nio.Buffer a12 )
	{
		gl.glTexSubImage4DSGIS( a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12 );
	}
	public static final void glTextureColorMaskSGIS( boolean a0, boolean a1, boolean a2, boolean a3 )
	{
		gl.glTextureColorMaskSGIS( a0, a1, a2, a3 );
	}
	public static final void glTextureLightEXT( int a0 )
	{
		gl.glTextureLightEXT( a0 );
	}
	public static final void glTextureMaterialEXT( int a0, int a1 )
	{
		gl.glTextureMaterialEXT( a0, a1 );
	}
	public static final void glTextureNormalEXT( int a0 )
	{
		gl.glTextureNormalEXT( a0 );
	}
	public static final void glTextureRangeAPPLE( int a0, int a1, java.nio.Buffer a2 )
	{
		gl.glTextureRangeAPPLE( a0, a1, a2 );
	}
	public static final void glTrackMatrixNV( int a0, int a1, int a2, int a3 )
	{
		gl.glTrackMatrixNV( a0, a1, a2, a3 );
	}
	public static final void glTransformFeedbackAttribsNV( int a0, java.nio.IntBuffer a1, int a2 )
	{
		gl.glTransformFeedbackAttribsNV( a0, a1, a2 );
	}
	public static final void glTransformFeedbackAttribsNV( int a0, int[] a1, int a2, int a3 )
	{
		gl.glTransformFeedbackAttribsNV( a0, a1, a2, a3 );
	}
	public static final void glTransformFeedbackVaryingsNV( int a0, int a1, java.nio.IntBuffer a2, int a3 )
	{
		gl.glTransformFeedbackVaryingsNV( a0, a1, a2, a3 );
	}
	public static final void glTransformFeedbackVaryingsNV( int a0, int a1, int[] a2, int a3, int a4 )
	{
		gl.glTransformFeedbackVaryingsNV( a0, a1, a2, a3, a4 );
	}
	public static final void glTranslated( double a0, double a1, double a2 )
	{
		gl.glTranslated( a0, a1, a2 );
	}
	public static final void glTranslatef( float a0, float a1, float a2 )
	{
		gl.glTranslatef( a0, a1, a2 );
	}
	public static final void glUniform1f( int a0, float a1 )
	{
		gl.glUniform1f( a0, a1 );
	}
	public static final void glUniform1fARB( int a0, float a1 )
	{
		gl.glUniform1fARB( a0, a1 );
	}
	public static final void glUniform1fv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glUniform1fv( a0, a1, a2 );
	}
	public static final void glUniform1fv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glUniform1fv( a0, a1, a2, a3 );
	}
	public static final void glUniform1fvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glUniform1fvARB( a0, a1, a2 );
	}
	public static final void glUniform1fvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glUniform1fvARB( a0, a1, a2, a3 );
	}
	public static final void glUniform1i( int a0, int a1 )
	{
		gl.glUniform1i( a0, a1 );
	}
	public static final void glUniform1iARB( int a0, int a1 )
	{
		gl.glUniform1iARB( a0, a1 );
	}
	public static final void glUniform1iv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform1iv( a0, a1, a2 );
	}
	public static final void glUniform1iv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform1iv( a0, a1, a2, a3 );
	}
	public static final void glUniform1ivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform1ivARB( a0, a1, a2 );
	}
	public static final void glUniform1ivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform1ivARB( a0, a1, a2, a3 );
	}
	public static final void glUniform1uiEXT( int a0, int a1 )
	{
		gl.glUniform1uiEXT( a0, a1 );
	}
	public static final void glUniform1uivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform1uivEXT( a0, a1, a2 );
	}
	public static final void glUniform1uivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform1uivEXT( a0, a1, a2, a3 );
	}
	public static final void glUniform2f( int a0, float a1, float a2 )
	{
		gl.glUniform2f( a0, a1, a2 );
	}
	public static final void glUniform2fARB( int a0, float a1, float a2 )
	{
		gl.glUniform2fARB( a0, a1, a2 );
	}
	public static final void glUniform2fv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glUniform2fv( a0, a1, a2 );
	}
	public static final void glUniform2fv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glUniform2fv( a0, a1, a2, a3 );
	}
	public static final void glUniform2fvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glUniform2fvARB( a0, a1, a2 );
	}
	public static final void glUniform2fvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glUniform2fvARB( a0, a1, a2, a3 );
	}
	public static final void glUniform2i( int a0, int a1, int a2 )
	{
		gl.glUniform2i( a0, a1, a2 );
	}
	public static final void glUniform2iARB( int a0, int a1, int a2 )
	{
		gl.glUniform2iARB( a0, a1, a2 );
	}
	public static final void glUniform2iv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform2iv( a0, a1, a2 );
	}
	public static final void glUniform2iv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform2iv( a0, a1, a2, a3 );
	}
	public static final void glUniform2ivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform2ivARB( a0, a1, a2 );
	}
	public static final void glUniform2ivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform2ivARB( a0, a1, a2, a3 );
	}
	public static final void glUniform2uiEXT( int a0, int a1, int a2 )
	{
		gl.glUniform2uiEXT( a0, a1, a2 );
	}
	public static final void glUniform2uivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform2uivEXT( a0, a1, a2 );
	}
	public static final void glUniform2uivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform2uivEXT( a0, a1, a2, a3 );
	}
	public static final void glUniform3f( int a0, float a1, float a2, float a3 )
	{
		gl.glUniform3f( a0, a1, a2, a3 );
	}
	public static final void glUniform3fARB( int a0, float a1, float a2, float a3 )
	{
		gl.glUniform3fARB( a0, a1, a2, a3 );
	}
	public static final void glUniform3fv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glUniform3fv( a0, a1, a2 );
	}
	public static final void glUniform3fv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glUniform3fv( a0, a1, a2, a3 );
	}
	public static final void glUniform3fvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glUniform3fvARB( a0, a1, a2 );
	}
	public static final void glUniform3fvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glUniform3fvARB( a0, a1, a2, a3 );
	}
	public static final void glUniform3i( int a0, int a1, int a2, int a3 )
	{
		gl.glUniform3i( a0, a1, a2, a3 );
	}
	public static final void glUniform3iARB( int a0, int a1, int a2, int a3 )
	{
		gl.glUniform3iARB( a0, a1, a2, a3 );
	}
	public static final void glUniform3iv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform3iv( a0, a1, a2 );
	}
	public static final void glUniform3iv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform3iv( a0, a1, a2, a3 );
	}
	public static final void glUniform3ivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform3ivARB( a0, a1, a2 );
	}
	public static final void glUniform3ivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform3ivARB( a0, a1, a2, a3 );
	}
	public static final void glUniform3uiEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glUniform3uiEXT( a0, a1, a2, a3 );
	}
	public static final void glUniform3uivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform3uivEXT( a0, a1, a2 );
	}
	public static final void glUniform3uivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform3uivEXT( a0, a1, a2, a3 );
	}
	public static final void glUniform4f( int a0, float a1, float a2, float a3, float a4 )
	{
		gl.glUniform4f( a0, a1, a2, a3, a4 );
	}
	public static final void glUniform4fARB( int a0, float a1, float a2, float a3, float a4 )
	{
		gl.glUniform4fARB( a0, a1, a2, a3, a4 );
	}
	public static final void glUniform4fv( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glUniform4fv( a0, a1, a2 );
	}
	public static final void glUniform4fv( int a0, int a1, float[] a2, int a3 )
	{
		gl.glUniform4fv( a0, a1, a2, a3 );
	}
	public static final void glUniform4fvARB( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glUniform4fvARB( a0, a1, a2 );
	}
	public static final void glUniform4fvARB( int a0, int a1, float[] a2, int a3 )
	{
		gl.glUniform4fvARB( a0, a1, a2, a3 );
	}
	public static final void glUniform4i( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glUniform4i( a0, a1, a2, a3, a4 );
	}
	public static final void glUniform4iARB( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glUniform4iARB( a0, a1, a2, a3, a4 );
	}
	public static final void glUniform4iv( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform4iv( a0, a1, a2 );
	}
	public static final void glUniform4iv( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform4iv( a0, a1, a2, a3 );
	}
	public static final void glUniform4ivARB( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform4ivARB( a0, a1, a2 );
	}
	public static final void glUniform4ivARB( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform4ivARB( a0, a1, a2, a3 );
	}
	public static final void glUniform4uiEXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glUniform4uiEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glUniform4uivEXT( int a0, int a1, java.nio.IntBuffer a2 )
	{
		gl.glUniform4uivEXT( a0, a1, a2 );
	}
	public static final void glUniform4uivEXT( int a0, int a1, int[] a2, int a3 )
	{
		gl.glUniform4uivEXT( a0, a1, a2, a3 );
	}
	public static final void glUniformBufferEXT( int a0, int a1, int a2 )
	{
		gl.glUniformBufferEXT( a0, a1, a2 );
	}
	public static final void glUniformMatrix2fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix2fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix2fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix2fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix2fvARB( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix2fvARB( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix2fvARB( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix2fvARB( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix2x3fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix2x3fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix2x3fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix2x3fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix2x4fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix2x4fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix2x4fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix2x4fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix3fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix3fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix3fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix3fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix3fvARB( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix3fvARB( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix3fvARB( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix3fvARB( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix3x2fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix3x2fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix3x2fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix3x2fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix3x4fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix3x4fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix3x4fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix3x4fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix4fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix4fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix4fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix4fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix4fvARB( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix4fvARB( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix4fvARB( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix4fvARB( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix4x2fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix4x2fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix4x2fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix4x2fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUniformMatrix4x3fv( int a0, int a1, boolean a2, java.nio.FloatBuffer a3 )
	{
		gl.glUniformMatrix4x3fv( a0, a1, a2, a3 );
	}
	public static final void glUniformMatrix4x3fv( int a0, int a1, boolean a2, float[] a3, int a4 )
	{
		gl.glUniformMatrix4x3fv( a0, a1, a2, a3, a4 );
	}
	public static final void glUnlockArraysEXT()
	{
		gl.glUnlockArraysEXT();
	}
	public static final boolean glUnmapBuffer( int a0 )
	{
		return gl.glUnmapBuffer( a0 );
	}
	public static final boolean glUnmapBufferARB( int a0 )
	{
		return gl.glUnmapBufferARB( a0 );
	}
	public static final void glUpdateObjectBufferATI( int a0, int a1, int a2, java.nio.Buffer a3, int a4 )
	{
		gl.glUpdateObjectBufferATI( a0, a1, a2, a3, a4 );
	}
	public static final void glUseProgram( int a0 )
	{
		gl.glUseProgram( a0 );
	}
	public static final void glUseProgramObjectARB( int a0 )
	{
		gl.glUseProgramObjectARB( a0 );
	}
	public static final void glValidateProgram( int a0 )
	{
		gl.glValidateProgram( a0 );
	}
	public static final void glValidateProgramARB( int a0 )
	{
		gl.glValidateProgramARB( a0 );
	}
	public static final void glVariantArrayObjectATI( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glVariantArrayObjectATI( a0, a1, a2, a3, a4 );
	}
	public static final void glVariantPointerEXT( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glVariantPointerEXT( a0, a1, a2, a3 );
	}
	public static final void glVariantPointerEXT( int a0, int a1, int a2, long a3 )
	{
		gl.glVariantPointerEXT( a0, a1, a2, a3 );
	}
	public static final void glVariantbvEXT( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVariantbvEXT( a0, a1 );
	}
	public static final void glVariantbvEXT( int a0, byte[] a1, int a2 )
	{
		gl.glVariantbvEXT( a0, a1, a2 );
	}
	public static final void glVariantdvEXT( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVariantdvEXT( a0, a1 );
	}
	public static final void glVariantdvEXT( int a0, double[] a1, int a2 )
	{
		gl.glVariantdvEXT( a0, a1, a2 );
	}
	public static final void glVariantfvEXT( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVariantfvEXT( a0, a1 );
	}
	public static final void glVariantfvEXT( int a0, float[] a1, int a2 )
	{
		gl.glVariantfvEXT( a0, a1, a2 );
	}
	public static final void glVariantivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVariantivEXT( a0, a1 );
	}
	public static final void glVariantivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVariantivEXT( a0, a1, a2 );
	}
	public static final void glVariantsvEXT( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVariantsvEXT( a0, a1 );
	}
	public static final void glVariantsvEXT( int a0, short[] a1, int a2 )
	{
		gl.glVariantsvEXT( a0, a1, a2 );
	}
	public static final void glVariantubvEXT( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVariantubvEXT( a0, a1 );
	}
	public static final void glVariantubvEXT( int a0, byte[] a1, int a2 )
	{
		gl.glVariantubvEXT( a0, a1, a2 );
	}
	public static final void glVariantuivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVariantuivEXT( a0, a1 );
	}
	public static final void glVariantuivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVariantuivEXT( a0, a1, a2 );
	}
	public static final void glVariantusvEXT( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVariantusvEXT( a0, a1 );
	}
	public static final void glVariantusvEXT( int a0, short[] a1, int a2 )
	{
		gl.glVariantusvEXT( a0, a1, a2 );
	}
	public static final void glVertex2d( double a0, double a1 )
	{
		gl.glVertex2d( a0, a1 );
	}
	public static final void glVertex2dv( java.nio.DoubleBuffer a0 )
	{
		gl.glVertex2dv( a0 );
	}
	public static final void glVertex2dv( double[] a0, int a1 )
	{
		gl.glVertex2dv( a0, a1 );
	}
	public static final void glVertex2f( float a0, float a1 )
	{
		gl.glVertex2f( a0, a1 );
	}
	public static final void glVertex2fv( java.nio.FloatBuffer a0 )
	{
		gl.glVertex2fv( a0 );
	}
	public static final void glVertex2fv( float[] a0, int a1 )
	{
		gl.glVertex2fv( a0, a1 );
	}
	public static final void glVertex2hNV( short a0, short a1 )
	{
		gl.glVertex2hNV( a0, a1 );
	}
	public static final void glVertex2hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glVertex2hvNV( a0 );
	}
	public static final void glVertex2hvNV( short[] a0, int a1 )
	{
		gl.glVertex2hvNV( a0, a1 );
	}
	public static final void glVertex2i( int a0, int a1 )
	{
		gl.glVertex2i( a0, a1 );
	}
	public static final void glVertex2iv( java.nio.IntBuffer a0 )
	{
		gl.glVertex2iv( a0 );
	}
	public static final void glVertex2iv( int[] a0, int a1 )
	{
		gl.glVertex2iv( a0, a1 );
	}
	public static final void glVertex2s( short a0, short a1 )
	{
		gl.glVertex2s( a0, a1 );
	}
	public static final void glVertex2sv( java.nio.ShortBuffer a0 )
	{
		gl.glVertex2sv( a0 );
	}
	public static final void glVertex2sv( short[] a0, int a1 )
	{
		gl.glVertex2sv( a0, a1 );
	}
	public static final void glVertex3d( double a0, double a1, double a2 )
	{
		gl.glVertex3d( a0, a1, a2 );
	}
	public static final void glVertex3dv( java.nio.DoubleBuffer a0 )
	{
		gl.glVertex3dv( a0 );
	}
	public static final void glVertex3dv( double[] a0, int a1 )
	{
		gl.glVertex3dv( a0, a1 );
	}
	public static final void glVertex3f( float a0, float a1, float a2 )
	{
		gl.glVertex3f( a0, a1, a2 );
	}
	public static final void glVertex3fv( java.nio.FloatBuffer a0 )
	{
		gl.glVertex3fv( a0 );
	}
	public static final void glVertex3fv( float[] a0, int a1 )
	{
		gl.glVertex3fv( a0, a1 );
	}
	public static final void glVertex3hNV( short a0, short a1, short a2 )
	{
		gl.glVertex3hNV( a0, a1, a2 );
	}
	public static final void glVertex3hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glVertex3hvNV( a0 );
	}
	public static final void glVertex3hvNV( short[] a0, int a1 )
	{
		gl.glVertex3hvNV( a0, a1 );
	}
	public static final void glVertex3i( int a0, int a1, int a2 )
	{
		gl.glVertex3i( a0, a1, a2 );
	}
	public static final void glVertex3iv( java.nio.IntBuffer a0 )
	{
		gl.glVertex3iv( a0 );
	}
	public static final void glVertex3iv( int[] a0, int a1 )
	{
		gl.glVertex3iv( a0, a1 );
	}
	public static final void glVertex3s( short a0, short a1, short a2 )
	{
		gl.glVertex3s( a0, a1, a2 );
	}
	public static final void glVertex3sv( java.nio.ShortBuffer a0 )
	{
		gl.glVertex3sv( a0 );
	}
	public static final void glVertex3sv( short[] a0, int a1 )
	{
		gl.glVertex3sv( a0, a1 );
	}
	public static final void glVertex4d( double a0, double a1, double a2, double a3 )
	{
		gl.glVertex4d( a0, a1, a2, a3 );
	}
	public static final void glVertex4dv( java.nio.DoubleBuffer a0 )
	{
		gl.glVertex4dv( a0 );
	}
	public static final void glVertex4dv( double[] a0, int a1 )
	{
		gl.glVertex4dv( a0, a1 );
	}
	public static final void glVertex4f( float a0, float a1, float a2, float a3 )
	{
		gl.glVertex4f( a0, a1, a2, a3 );
	}
	public static final void glVertex4fv( java.nio.FloatBuffer a0 )
	{
		gl.glVertex4fv( a0 );
	}
	public static final void glVertex4fv( float[] a0, int a1 )
	{
		gl.glVertex4fv( a0, a1 );
	}
	public static final void glVertex4hNV( short a0, short a1, short a2, short a3 )
	{
		gl.glVertex4hNV( a0, a1, a2, a3 );
	}
	public static final void glVertex4hvNV( java.nio.ShortBuffer a0 )
	{
		gl.glVertex4hvNV( a0 );
	}
	public static final void glVertex4hvNV( short[] a0, int a1 )
	{
		gl.glVertex4hvNV( a0, a1 );
	}
	public static final void glVertex4i( int a0, int a1, int a2, int a3 )
	{
		gl.glVertex4i( a0, a1, a2, a3 );
	}
	public static final void glVertex4iv( java.nio.IntBuffer a0 )
	{
		gl.glVertex4iv( a0 );
	}
	public static final void glVertex4iv( int[] a0, int a1 )
	{
		gl.glVertex4iv( a0, a1 );
	}
	public static final void glVertex4s( short a0, short a1, short a2, short a3 )
	{
		gl.glVertex4s( a0, a1, a2, a3 );
	}
	public static final void glVertex4sv( java.nio.ShortBuffer a0 )
	{
		gl.glVertex4sv( a0 );
	}
	public static final void glVertex4sv( short[] a0, int a1 )
	{
		gl.glVertex4sv( a0, a1 );
	}
	public static final void glVertexArrayParameteriAPPLE( int a0, int a1 )
	{
		gl.glVertexArrayParameteriAPPLE( a0, a1 );
	}
	public static final void glVertexArrayRangeAPPLE( int a0, java.nio.Buffer a1 )
	{
		gl.glVertexArrayRangeAPPLE( a0, a1 );
	}
	public static final void glVertexArrayRangeNV( int a0, java.nio.Buffer a1 )
	{
		gl.glVertexArrayRangeNV( a0, a1 );
	}
	public static final void glVertexAttrib1d( int a0, double a1 )
	{
		gl.glVertexAttrib1d( a0, a1 );
	}
	public static final void glVertexAttrib1dARB( int a0, double a1 )
	{
		gl.glVertexAttrib1dARB( a0, a1 );
	}
	public static final void glVertexAttrib1dNV( int a0, double a1 )
	{
		gl.glVertexAttrib1dNV( a0, a1 );
	}
	public static final void glVertexAttrib1dv( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib1dv( a0, a1 );
	}
	public static final void glVertexAttrib1dv( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib1dv( a0, a1, a2 );
	}
	public static final void glVertexAttrib1dvARB( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib1dvARB( a0, a1 );
	}
	public static final void glVertexAttrib1dvARB( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib1dvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib1dvNV( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib1dvNV( a0, a1 );
	}
	public static final void glVertexAttrib1dvNV( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib1dvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib1f( int a0, float a1 )
	{
		gl.glVertexAttrib1f( a0, a1 );
	}
	public static final void glVertexAttrib1fARB( int a0, float a1 )
	{
		gl.glVertexAttrib1fARB( a0, a1 );
	}
	public static final void glVertexAttrib1fNV( int a0, float a1 )
	{
		gl.glVertexAttrib1fNV( a0, a1 );
	}
	public static final void glVertexAttrib1fv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib1fv( a0, a1 );
	}
	public static final void glVertexAttrib1fv( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib1fv( a0, a1, a2 );
	}
	public static final void glVertexAttrib1fvARB( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib1fvARB( a0, a1 );
	}
	public static final void glVertexAttrib1fvARB( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib1fvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib1fvNV( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib1fvNV( a0, a1 );
	}
	public static final void glVertexAttrib1fvNV( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib1fvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib1hNV( int a0, short a1 )
	{
		gl.glVertexAttrib1hNV( a0, a1 );
	}
	public static final void glVertexAttrib1hvNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib1hvNV( a0, a1 );
	}
	public static final void glVertexAttrib1hvNV( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib1hvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib1s( int a0, short a1 )
	{
		gl.glVertexAttrib1s( a0, a1 );
	}
	public static final void glVertexAttrib1sARB( int a0, short a1 )
	{
		gl.glVertexAttrib1sARB( a0, a1 );
	}
	public static final void glVertexAttrib1sNV( int a0, short a1 )
	{
		gl.glVertexAttrib1sNV( a0, a1 );
	}
	public static final void glVertexAttrib1sv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib1sv( a0, a1 );
	}
	public static final void glVertexAttrib1sv( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib1sv( a0, a1, a2 );
	}
	public static final void glVertexAttrib1svARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib1svARB( a0, a1 );
	}
	public static final void glVertexAttrib1svARB( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib1svARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib1svNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib1svNV( a0, a1 );
	}
	public static final void glVertexAttrib1svNV( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib1svNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib2d( int a0, double a1, double a2 )
	{
		gl.glVertexAttrib2d( a0, a1, a2 );
	}
	public static final void glVertexAttrib2dARB( int a0, double a1, double a2 )
	{
		gl.glVertexAttrib2dARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib2dNV( int a0, double a1, double a2 )
	{
		gl.glVertexAttrib2dNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib2dv( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib2dv( a0, a1 );
	}
	public static final void glVertexAttrib2dv( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib2dv( a0, a1, a2 );
	}
	public static final void glVertexAttrib2dvARB( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib2dvARB( a0, a1 );
	}
	public static final void glVertexAttrib2dvARB( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib2dvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib2dvNV( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib2dvNV( a0, a1 );
	}
	public static final void glVertexAttrib2dvNV( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib2dvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib2f( int a0, float a1, float a2 )
	{
		gl.glVertexAttrib2f( a0, a1, a2 );
	}
	public static final void glVertexAttrib2fARB( int a0, float a1, float a2 )
	{
		gl.glVertexAttrib2fARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib2fNV( int a0, float a1, float a2 )
	{
		gl.glVertexAttrib2fNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib2fv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib2fv( a0, a1 );
	}
	public static final void glVertexAttrib2fv( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib2fv( a0, a1, a2 );
	}
	public static final void glVertexAttrib2fvARB( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib2fvARB( a0, a1 );
	}
	public static final void glVertexAttrib2fvARB( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib2fvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib2fvNV( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib2fvNV( a0, a1 );
	}
	public static final void glVertexAttrib2fvNV( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib2fvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib2hNV( int a0, short a1, short a2 )
	{
		gl.glVertexAttrib2hNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib2hvNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib2hvNV( a0, a1 );
	}
	public static final void glVertexAttrib2hvNV( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib2hvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib2s( int a0, short a1, short a2 )
	{
		gl.glVertexAttrib2s( a0, a1, a2 );
	}
	public static final void glVertexAttrib2sARB( int a0, short a1, short a2 )
	{
		gl.glVertexAttrib2sARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib2sNV( int a0, short a1, short a2 )
	{
		gl.glVertexAttrib2sNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib2sv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib2sv( a0, a1 );
	}
	public static final void glVertexAttrib2sv( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib2sv( a0, a1, a2 );
	}
	public static final void glVertexAttrib2svARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib2svARB( a0, a1 );
	}
	public static final void glVertexAttrib2svARB( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib2svARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib2svNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib2svNV( a0, a1 );
	}
	public static final void glVertexAttrib2svNV( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib2svNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib3d( int a0, double a1, double a2, double a3 )
	{
		gl.glVertexAttrib3d( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3dARB( int a0, double a1, double a2, double a3 )
	{
		gl.glVertexAttrib3dARB( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3dNV( int a0, double a1, double a2, double a3 )
	{
		gl.glVertexAttrib3dNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3dv( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib3dv( a0, a1 );
	}
	public static final void glVertexAttrib3dv( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib3dv( a0, a1, a2 );
	}
	public static final void glVertexAttrib3dvARB( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib3dvARB( a0, a1 );
	}
	public static final void glVertexAttrib3dvARB( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib3dvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib3dvNV( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib3dvNV( a0, a1 );
	}
	public static final void glVertexAttrib3dvNV( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib3dvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib3f( int a0, float a1, float a2, float a3 )
	{
		gl.glVertexAttrib3f( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3fARB( int a0, float a1, float a2, float a3 )
	{
		gl.glVertexAttrib3fARB( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3fNV( int a0, float a1, float a2, float a3 )
	{
		gl.glVertexAttrib3fNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3fv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib3fv( a0, a1 );
	}
	public static final void glVertexAttrib3fv( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib3fv( a0, a1, a2 );
	}
	public static final void glVertexAttrib3fvARB( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib3fvARB( a0, a1 );
	}
	public static final void glVertexAttrib3fvARB( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib3fvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib3fvNV( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib3fvNV( a0, a1 );
	}
	public static final void glVertexAttrib3fvNV( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib3fvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib3hNV( int a0, short a1, short a2, short a3 )
	{
		gl.glVertexAttrib3hNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3hvNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib3hvNV( a0, a1 );
	}
	public static final void glVertexAttrib3hvNV( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib3hvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib3s( int a0, short a1, short a2, short a3 )
	{
		gl.glVertexAttrib3s( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3sARB( int a0, short a1, short a2, short a3 )
	{
		gl.glVertexAttrib3sARB( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3sNV( int a0, short a1, short a2, short a3 )
	{
		gl.glVertexAttrib3sNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttrib3sv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib3sv( a0, a1 );
	}
	public static final void glVertexAttrib3sv( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib3sv( a0, a1, a2 );
	}
	public static final void glVertexAttrib3svARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib3svARB( a0, a1 );
	}
	public static final void glVertexAttrib3svARB( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib3svARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib3svNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib3svNV( a0, a1 );
	}
	public static final void glVertexAttrib3svNV( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib3svNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib4Nbv( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4Nbv( a0, a1 );
	}
	public static final void glVertexAttrib4Nbv( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4Nbv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4NbvARB( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4NbvARB( a0, a1 );
	}
	public static final void glVertexAttrib4NbvARB( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4NbvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4Niv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttrib4Niv( a0, a1 );
	}
	public static final void glVertexAttrib4Niv( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttrib4Niv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4NivARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttrib4NivARB( a0, a1 );
	}
	public static final void glVertexAttrib4NivARB( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttrib4NivARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4Nsv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4Nsv( a0, a1 );
	}
	public static final void glVertexAttrib4Nsv( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4Nsv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4NsvARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4NsvARB( a0, a1 );
	}
	public static final void glVertexAttrib4NsvARB( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4NsvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4Nub( int a0, byte a1, byte a2, byte a3, byte a4 )
	{
		gl.glVertexAttrib4Nub( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4NubARB( int a0, byte a1, byte a2, byte a3, byte a4 )
	{
		gl.glVertexAttrib4NubARB( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4Nubv( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4Nubv( a0, a1 );
	}
	public static final void glVertexAttrib4Nubv( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4Nubv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4NubvARB( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4NubvARB( a0, a1 );
	}
	public static final void glVertexAttrib4NubvARB( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4NubvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4Nuiv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttrib4Nuiv( a0, a1 );
	}
	public static final void glVertexAttrib4Nuiv( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttrib4Nuiv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4NuivARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttrib4NuivARB( a0, a1 );
	}
	public static final void glVertexAttrib4NuivARB( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttrib4NuivARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4Nusv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4Nusv( a0, a1 );
	}
	public static final void glVertexAttrib4Nusv( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4Nusv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4NusvARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4NusvARB( a0, a1 );
	}
	public static final void glVertexAttrib4NusvARB( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4NusvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4bv( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4bv( a0, a1 );
	}
	public static final void glVertexAttrib4bv( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4bv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4bvARB( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4bvARB( a0, a1 );
	}
	public static final void glVertexAttrib4bvARB( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4bvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4d( int a0, double a1, double a2, double a3, double a4 )
	{
		gl.glVertexAttrib4d( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4dARB( int a0, double a1, double a2, double a3, double a4 )
	{
		gl.glVertexAttrib4dARB( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4dNV( int a0, double a1, double a2, double a3, double a4 )
	{
		gl.glVertexAttrib4dNV( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4dv( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib4dv( a0, a1 );
	}
	public static final void glVertexAttrib4dv( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib4dv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4dvARB( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib4dvARB( a0, a1 );
	}
	public static final void glVertexAttrib4dvARB( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib4dvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4dvNV( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexAttrib4dvNV( a0, a1 );
	}
	public static final void glVertexAttrib4dvNV( int a0, double[] a1, int a2 )
	{
		gl.glVertexAttrib4dvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib4f( int a0, float a1, float a2, float a3, float a4 )
	{
		gl.glVertexAttrib4f( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4fARB( int a0, float a1, float a2, float a3, float a4 )
	{
		gl.glVertexAttrib4fARB( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4fNV( int a0, float a1, float a2, float a3, float a4 )
	{
		gl.glVertexAttrib4fNV( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4fv( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib4fv( a0, a1 );
	}
	public static final void glVertexAttrib4fv( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib4fv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4fvARB( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib4fvARB( a0, a1 );
	}
	public static final void glVertexAttrib4fvARB( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib4fvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4fvNV( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexAttrib4fvNV( a0, a1 );
	}
	public static final void glVertexAttrib4fvNV( int a0, float[] a1, int a2 )
	{
		gl.glVertexAttrib4fvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib4hNV( int a0, short a1, short a2, short a3, short a4 )
	{
		gl.glVertexAttrib4hNV( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4hvNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4hvNV( a0, a1 );
	}
	public static final void glVertexAttrib4hvNV( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4hvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib4iv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttrib4iv( a0, a1 );
	}
	public static final void glVertexAttrib4iv( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttrib4iv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4ivARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttrib4ivARB( a0, a1 );
	}
	public static final void glVertexAttrib4ivARB( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttrib4ivARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4s( int a0, short a1, short a2, short a3, short a4 )
	{
		gl.glVertexAttrib4s( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4sARB( int a0, short a1, short a2, short a3, short a4 )
	{
		gl.glVertexAttrib4sARB( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4sNV( int a0, short a1, short a2, short a3, short a4 )
	{
		gl.glVertexAttrib4sNV( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4sv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4sv( a0, a1 );
	}
	public static final void glVertexAttrib4sv( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4sv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4svARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4svARB( a0, a1 );
	}
	public static final void glVertexAttrib4svARB( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4svARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4svNV( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4svNV( a0, a1 );
	}
	public static final void glVertexAttrib4svNV( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4svNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib4ubNV( int a0, byte a1, byte a2, byte a3, byte a4 )
	{
		gl.glVertexAttrib4ubNV( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttrib4ubv( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4ubv( a0, a1 );
	}
	public static final void glVertexAttrib4ubv( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4ubv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4ubvARB( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4ubvARB( a0, a1 );
	}
	public static final void glVertexAttrib4ubvARB( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4ubvARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4ubvNV( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttrib4ubvNV( a0, a1 );
	}
	public static final void glVertexAttrib4ubvNV( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttrib4ubvNV( a0, a1, a2 );
	}
	public static final void glVertexAttrib4uiv( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttrib4uiv( a0, a1 );
	}
	public static final void glVertexAttrib4uiv( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttrib4uiv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4uivARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttrib4uivARB( a0, a1 );
	}
	public static final void glVertexAttrib4uivARB( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttrib4uivARB( a0, a1, a2 );
	}
	public static final void glVertexAttrib4usv( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4usv( a0, a1 );
	}
	public static final void glVertexAttrib4usv( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4usv( a0, a1, a2 );
	}
	public static final void glVertexAttrib4usvARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttrib4usvARB( a0, a1 );
	}
	public static final void glVertexAttrib4usvARB( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttrib4usvARB( a0, a1, a2 );
	}
	public static final void glVertexAttribArrayObjectATI( int a0, int a1, int a2, boolean a3, int a4, int a5, int a6 )
	{
		gl.glVertexAttribArrayObjectATI( a0, a1, a2, a3, a4, a5, a6 );
	}
	public static final void glVertexAttribI1iEXT( int a0, int a1 )
	{
		gl.glVertexAttribI1iEXT( a0, a1 );
	}
	public static final void glVertexAttribI1ivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttribI1ivEXT( a0, a1 );
	}
	public static final void glVertexAttribI1ivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttribI1ivEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI1uiEXT( int a0, int a1 )
	{
		gl.glVertexAttribI1uiEXT( a0, a1 );
	}
	public static final void glVertexAttribI1uivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttribI1uivEXT( a0, a1 );
	}
	public static final void glVertexAttribI1uivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttribI1uivEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI2iEXT( int a0, int a1, int a2 )
	{
		gl.glVertexAttribI2iEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI2ivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttribI2ivEXT( a0, a1 );
	}
	public static final void glVertexAttribI2ivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttribI2ivEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI2uiEXT( int a0, int a1, int a2 )
	{
		gl.glVertexAttribI2uiEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI2uivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttribI2uivEXT( a0, a1 );
	}
	public static final void glVertexAttribI2uivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttribI2uivEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI3iEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glVertexAttribI3iEXT( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribI3ivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttribI3ivEXT( a0, a1 );
	}
	public static final void glVertexAttribI3ivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttribI3ivEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI3uiEXT( int a0, int a1, int a2, int a3 )
	{
		gl.glVertexAttribI3uiEXT( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribI3uivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttribI3uivEXT( a0, a1 );
	}
	public static final void glVertexAttribI3uivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttribI3uivEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI4bvEXT( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttribI4bvEXT( a0, a1 );
	}
	public static final void glVertexAttribI4bvEXT( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttribI4bvEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI4iEXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glVertexAttribI4iEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttribI4ivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttribI4ivEXT( a0, a1 );
	}
	public static final void glVertexAttribI4ivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttribI4ivEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI4svEXT( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttribI4svEXT( a0, a1 );
	}
	public static final void glVertexAttribI4svEXT( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttribI4svEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI4ubvEXT( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glVertexAttribI4ubvEXT( a0, a1 );
	}
	public static final void glVertexAttribI4ubvEXT( int a0, byte[] a1, int a2 )
	{
		gl.glVertexAttribI4ubvEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI4uiEXT( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glVertexAttribI4uiEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttribI4uivEXT( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexAttribI4uivEXT( a0, a1 );
	}
	public static final void glVertexAttribI4uivEXT( int a0, int[] a1, int a2 )
	{
		gl.glVertexAttribI4uivEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribI4usvEXT( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexAttribI4usvEXT( a0, a1 );
	}
	public static final void glVertexAttribI4usvEXT( int a0, short[] a1, int a2 )
	{
		gl.glVertexAttribI4usvEXT( a0, a1, a2 );
	}
	public static final void glVertexAttribIPointerEXT( int a0, int a1, int a2, int a3, java.nio.Buffer a4 )
	{
		gl.glVertexAttribIPointerEXT( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttribPointer( int a0, int a1, int a2, boolean a3, int a4, java.nio.Buffer a5 )
	{
		gl.glVertexAttribPointer( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glVertexAttribPointer( int a0, int a1, int a2, boolean a3, int a4, long a5 )
	{
		gl.glVertexAttribPointer( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glVertexAttribPointerARB( int a0, int a1, int a2, boolean a3, int a4, java.nio.Buffer a5 )
	{
		gl.glVertexAttribPointerARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glVertexAttribPointerARB( int a0, int a1, int a2, boolean a3, int a4, long a5 )
	{
		gl.glVertexAttribPointerARB( a0, a1, a2, a3, a4, a5 );
	}
	public static final void glVertexAttribPointerNV( int a0, int a1, int a2, int a3, java.nio.Buffer a4 )
	{
		gl.glVertexAttribPointerNV( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttribPointerNV( int a0, int a1, int a2, int a3, long a4 )
	{
		gl.glVertexAttribPointerNV( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexAttribs1dvNV( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glVertexAttribs1dvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs1dvNV( int a0, int a1, double[] a2, int a3 )
	{
		gl.glVertexAttribs1dvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs1fvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glVertexAttribs1fvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs1fvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glVertexAttribs1fvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs1hvNV( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glVertexAttribs1hvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs1hvNV( int a0, int a1, short[] a2, int a3 )
	{
		gl.glVertexAttribs1hvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs1svNV( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glVertexAttribs1svNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs1svNV( int a0, int a1, short[] a2, int a3 )
	{
		gl.glVertexAttribs1svNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs2dvNV( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glVertexAttribs2dvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs2dvNV( int a0, int a1, double[] a2, int a3 )
	{
		gl.glVertexAttribs2dvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs2fvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glVertexAttribs2fvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs2fvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glVertexAttribs2fvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs2hvNV( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glVertexAttribs2hvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs2hvNV( int a0, int a1, short[] a2, int a3 )
	{
		gl.glVertexAttribs2hvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs2svNV( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glVertexAttribs2svNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs2svNV( int a0, int a1, short[] a2, int a3 )
	{
		gl.glVertexAttribs2svNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs3dvNV( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glVertexAttribs3dvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs3dvNV( int a0, int a1, double[] a2, int a3 )
	{
		gl.glVertexAttribs3dvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs3fvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glVertexAttribs3fvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs3fvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glVertexAttribs3fvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs3hvNV( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glVertexAttribs3hvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs3hvNV( int a0, int a1, short[] a2, int a3 )
	{
		gl.glVertexAttribs3hvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs3svNV( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glVertexAttribs3svNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs3svNV( int a0, int a1, short[] a2, int a3 )
	{
		gl.glVertexAttribs3svNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs4dvNV( int a0, int a1, java.nio.DoubleBuffer a2 )
	{
		gl.glVertexAttribs4dvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs4dvNV( int a0, int a1, double[] a2, int a3 )
	{
		gl.glVertexAttribs4dvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs4fvNV( int a0, int a1, java.nio.FloatBuffer a2 )
	{
		gl.glVertexAttribs4fvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs4fvNV( int a0, int a1, float[] a2, int a3 )
	{
		gl.glVertexAttribs4fvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs4hvNV( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glVertexAttribs4hvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs4hvNV( int a0, int a1, short[] a2, int a3 )
	{
		gl.glVertexAttribs4hvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs4svNV( int a0, int a1, java.nio.ShortBuffer a2 )
	{
		gl.glVertexAttribs4svNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs4svNV( int a0, int a1, short[] a2, int a3 )
	{
		gl.glVertexAttribs4svNV( a0, a1, a2, a3 );
	}
	public static final void glVertexAttribs4ubvNV( int a0, int a1, java.nio.ByteBuffer a2 )
	{
		gl.glVertexAttribs4ubvNV( a0, a1, a2 );
	}
	public static final void glVertexAttribs4ubvNV( int a0, int a1, byte[] a2, int a3 )
	{
		gl.glVertexAttribs4ubvNV( a0, a1, a2, a3 );
	}
	public static final void glVertexBlendARB( int a0 )
	{
		gl.glVertexBlendARB( a0 );
	}
	public static final void glVertexBlendEnvfATI( int a0, float a1 )
	{
		gl.glVertexBlendEnvfATI( a0, a1 );
	}
	public static final void glVertexBlendEnviATI( int a0, int a1 )
	{
		gl.glVertexBlendEnviATI( a0, a1 );
	}
	public static final void glVertexPointer( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glVertexPointer( a0, a1, a2, a3 );
	}
	public static final void glVertexPointer( int a0, int a1, int a2, long a3 )
	{
		gl.glVertexPointer( a0, a1, a2, a3 );
	}
	public static final void glVertexStream1dATI( int a0, double a1 )
	{
		gl.glVertexStream1dATI( a0, a1 );
	}
	public static final void glVertexStream1dvATI( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexStream1dvATI( a0, a1 );
	}
	public static final void glVertexStream1dvATI( int a0, double[] a1, int a2 )
	{
		gl.glVertexStream1dvATI( a0, a1, a2 );
	}
	public static final void glVertexStream1fATI( int a0, float a1 )
	{
		gl.glVertexStream1fATI( a0, a1 );
	}
	public static final void glVertexStream1fvATI( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexStream1fvATI( a0, a1 );
	}
	public static final void glVertexStream1fvATI( int a0, float[] a1, int a2 )
	{
		gl.glVertexStream1fvATI( a0, a1, a2 );
	}
	public static final void glVertexStream1iATI( int a0, int a1 )
	{
		gl.glVertexStream1iATI( a0, a1 );
	}
	public static final void glVertexStream1ivATI( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexStream1ivATI( a0, a1 );
	}
	public static final void glVertexStream1ivATI( int a0, int[] a1, int a2 )
	{
		gl.glVertexStream1ivATI( a0, a1, a2 );
	}
	public static final void glVertexStream1sATI( int a0, short a1 )
	{
		gl.glVertexStream1sATI( a0, a1 );
	}
	public static final void glVertexStream1svATI( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexStream1svATI( a0, a1 );
	}
	public static final void glVertexStream1svATI( int a0, short[] a1, int a2 )
	{
		gl.glVertexStream1svATI( a0, a1, a2 );
	}
	public static final void glVertexStream2dATI( int a0, double a1, double a2 )
	{
		gl.glVertexStream2dATI( a0, a1, a2 );
	}
	public static final void glVertexStream2dvATI( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexStream2dvATI( a0, a1 );
	}
	public static final void glVertexStream2dvATI( int a0, double[] a1, int a2 )
	{
		gl.glVertexStream2dvATI( a0, a1, a2 );
	}
	public static final void glVertexStream2fATI( int a0, float a1, float a2 )
	{
		gl.glVertexStream2fATI( a0, a1, a2 );
	}
	public static final void glVertexStream2fvATI( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexStream2fvATI( a0, a1 );
	}
	public static final void glVertexStream2fvATI( int a0, float[] a1, int a2 )
	{
		gl.glVertexStream2fvATI( a0, a1, a2 );
	}
	public static final void glVertexStream2iATI( int a0, int a1, int a2 )
	{
		gl.glVertexStream2iATI( a0, a1, a2 );
	}
	public static final void glVertexStream2ivATI( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexStream2ivATI( a0, a1 );
	}
	public static final void glVertexStream2ivATI( int a0, int[] a1, int a2 )
	{
		gl.glVertexStream2ivATI( a0, a1, a2 );
	}
	public static final void glVertexStream2sATI( int a0, short a1, short a2 )
	{
		gl.glVertexStream2sATI( a0, a1, a2 );
	}
	public static final void glVertexStream2svATI( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexStream2svATI( a0, a1 );
	}
	public static final void glVertexStream2svATI( int a0, short[] a1, int a2 )
	{
		gl.glVertexStream2svATI( a0, a1, a2 );
	}
	public static final void glVertexStream3dATI( int a0, double a1, double a2, double a3 )
	{
		gl.glVertexStream3dATI( a0, a1, a2, a3 );
	}
	public static final void glVertexStream3dvATI( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexStream3dvATI( a0, a1 );
	}
	public static final void glVertexStream3dvATI( int a0, double[] a1, int a2 )
	{
		gl.glVertexStream3dvATI( a0, a1, a2 );
	}
	public static final void glVertexStream3fATI( int a0, float a1, float a2, float a3 )
	{
		gl.glVertexStream3fATI( a0, a1, a2, a3 );
	}
	public static final void glVertexStream3fvATI( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexStream3fvATI( a0, a1 );
	}
	public static final void glVertexStream3fvATI( int a0, float[] a1, int a2 )
	{
		gl.glVertexStream3fvATI( a0, a1, a2 );
	}
	public static final void glVertexStream3iATI( int a0, int a1, int a2, int a3 )
	{
		gl.glVertexStream3iATI( a0, a1, a2, a3 );
	}
	public static final void glVertexStream3ivATI( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexStream3ivATI( a0, a1 );
	}
	public static final void glVertexStream3ivATI( int a0, int[] a1, int a2 )
	{
		gl.glVertexStream3ivATI( a0, a1, a2 );
	}
	public static final void glVertexStream3sATI( int a0, short a1, short a2, short a3 )
	{
		gl.glVertexStream3sATI( a0, a1, a2, a3 );
	}
	public static final void glVertexStream3svATI( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexStream3svATI( a0, a1 );
	}
	public static final void glVertexStream3svATI( int a0, short[] a1, int a2 )
	{
		gl.glVertexStream3svATI( a0, a1, a2 );
	}
	public static final void glVertexStream4dATI( int a0, double a1, double a2, double a3, double a4 )
	{
		gl.glVertexStream4dATI( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexStream4dvATI( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glVertexStream4dvATI( a0, a1 );
	}
	public static final void glVertexStream4dvATI( int a0, double[] a1, int a2 )
	{
		gl.glVertexStream4dvATI( a0, a1, a2 );
	}
	public static final void glVertexStream4fATI( int a0, float a1, float a2, float a3, float a4 )
	{
		gl.glVertexStream4fATI( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexStream4fvATI( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glVertexStream4fvATI( a0, a1 );
	}
	public static final void glVertexStream4fvATI( int a0, float[] a1, int a2 )
	{
		gl.glVertexStream4fvATI( a0, a1, a2 );
	}
	public static final void glVertexStream4iATI( int a0, int a1, int a2, int a3, int a4 )
	{
		gl.glVertexStream4iATI( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexStream4ivATI( int a0, java.nio.IntBuffer a1 )
	{
		gl.glVertexStream4ivATI( a0, a1 );
	}
	public static final void glVertexStream4ivATI( int a0, int[] a1, int a2 )
	{
		gl.glVertexStream4ivATI( a0, a1, a2 );
	}
	public static final void glVertexStream4sATI( int a0, short a1, short a2, short a3, short a4 )
	{
		gl.glVertexStream4sATI( a0, a1, a2, a3, a4 );
	}
	public static final void glVertexStream4svATI( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glVertexStream4svATI( a0, a1 );
	}
	public static final void glVertexStream4svATI( int a0, short[] a1, int a2 )
	{
		gl.glVertexStream4svATI( a0, a1, a2 );
	}
	public static final void glVertexWeightPointerEXT( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glVertexWeightPointerEXT( a0, a1, a2, a3 );
	}
	public static final void glVertexWeightPointerEXT( int a0, int a1, int a2, long a3 )
	{
		gl.glVertexWeightPointerEXT( a0, a1, a2, a3 );
	}
	public static final void glVertexWeightfEXT( float a0 )
	{
		gl.glVertexWeightfEXT( a0 );
	}
	public static final void glVertexWeightfvEXT( java.nio.FloatBuffer a0 )
	{
		gl.glVertexWeightfvEXT( a0 );
	}
	public static final void glVertexWeightfvEXT( float[] a0, int a1 )
	{
		gl.glVertexWeightfvEXT( a0, a1 );
	}
	public static final void glVertexWeighthNV( short a0 )
	{
		gl.glVertexWeighthNV( a0 );
	}
	public static final void glVertexWeighthvNV( java.nio.ShortBuffer a0 )
	{
		gl.glVertexWeighthvNV( a0 );
	}
	public static final void glVertexWeighthvNV( short[] a0, int a1 )
	{
		gl.glVertexWeighthvNV( a0, a1 );
	}
	public static final void glViewport( int a0, int a1, int a2, int a3 )
	{
		gl.glViewport( a0, a1, a2, a3 );
	}
	public static final void glWeightPointerARB( int a0, int a1, int a2, java.nio.Buffer a3 )
	{
		gl.glWeightPointerARB( a0, a1, a2, a3 );
	}
	public static final void glWeightPointerARB( int a0, int a1, int a2, long a3 )
	{
		gl.glWeightPointerARB( a0, a1, a2, a3 );
	}
	public static final void glWeightbvARB( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glWeightbvARB( a0, a1 );
	}
	public static final void glWeightbvARB( int a0, byte[] a1, int a2 )
	{
		gl.glWeightbvARB( a0, a1, a2 );
	}
	public static final void glWeightdvARB( int a0, java.nio.DoubleBuffer a1 )
	{
		gl.glWeightdvARB( a0, a1 );
	}
	public static final void glWeightdvARB( int a0, double[] a1, int a2 )
	{
		gl.glWeightdvARB( a0, a1, a2 );
	}
	public static final void glWeightfvARB( int a0, java.nio.FloatBuffer a1 )
	{
		gl.glWeightfvARB( a0, a1 );
	}
	public static final void glWeightfvARB( int a0, float[] a1, int a2 )
	{
		gl.glWeightfvARB( a0, a1, a2 );
	}
	public static final void glWeightivARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glWeightivARB( a0, a1 );
	}
	public static final void glWeightivARB( int a0, int[] a1, int a2 )
	{
		gl.glWeightivARB( a0, a1, a2 );
	}
	public static final void glWeightsvARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glWeightsvARB( a0, a1 );
	}
	public static final void glWeightsvARB( int a0, short[] a1, int a2 )
	{
		gl.glWeightsvARB( a0, a1, a2 );
	}
	public static final void glWeightubvARB( int a0, java.nio.ByteBuffer a1 )
	{
		gl.glWeightubvARB( a0, a1 );
	}
	public static final void glWeightubvARB( int a0, byte[] a1, int a2 )
	{
		gl.glWeightubvARB( a0, a1, a2 );
	}
	public static final void glWeightuivARB( int a0, java.nio.IntBuffer a1 )
	{
		gl.glWeightuivARB( a0, a1 );
	}
	public static final void glWeightuivARB( int a0, int[] a1, int a2 )
	{
		gl.glWeightuivARB( a0, a1, a2 );
	}
	public static final void glWeightusvARB( int a0, java.nio.ShortBuffer a1 )
	{
		gl.glWeightusvARB( a0, a1 );
	}
	public static final void glWeightusvARB( int a0, short[] a1, int a2 )
	{
		gl.glWeightusvARB( a0, a1, a2 );
	}
	public static final void glWindowPos2d( double a0, double a1 )
	{
		gl.glWindowPos2d( a0, a1 );
	}
	public static final void glWindowPos2dARB( double a0, double a1 )
	{
		gl.glWindowPos2dARB( a0, a1 );
	}
	public static final void glWindowPos2dMESA( double a0, double a1 )
	{
		gl.glWindowPos2dMESA( a0, a1 );
	}
	public static final void glWindowPos2dv( java.nio.DoubleBuffer a0 )
	{
		gl.glWindowPos2dv( a0 );
	}
	public static final void glWindowPos2dv( double[] a0, int a1 )
	{
		gl.glWindowPos2dv( a0, a1 );
	}
	public static final void glWindowPos2dvARB( java.nio.DoubleBuffer a0 )
	{
		gl.glWindowPos2dvARB( a0 );
	}
	public static final void glWindowPos2dvARB( double[] a0, int a1 )
	{
		gl.glWindowPos2dvARB( a0, a1 );
	}
	public static final void glWindowPos2dvMESA( java.nio.DoubleBuffer a0 )
	{
		gl.glWindowPos2dvMESA( a0 );
	}
	public static final void glWindowPos2dvMESA( double[] a0, int a1 )
	{
		gl.glWindowPos2dvMESA( a0, a1 );
	}
	public static final void glWindowPos2f( float a0, float a1 )
	{
		gl.glWindowPos2f( a0, a1 );
	}
	public static final void glWindowPos2fARB( float a0, float a1 )
	{
		gl.glWindowPos2fARB( a0, a1 );
	}
	public static final void glWindowPos2fMESA( float a0, float a1 )
	{
		gl.glWindowPos2fMESA( a0, a1 );
	}
	public static final void glWindowPos2fv( java.nio.FloatBuffer a0 )
	{
		gl.glWindowPos2fv( a0 );
	}
	public static final void glWindowPos2fv( float[] a0, int a1 )
	{
		gl.glWindowPos2fv( a0, a1 );
	}
	public static final void glWindowPos2fvARB( java.nio.FloatBuffer a0 )
	{
		gl.glWindowPos2fvARB( a0 );
	}
	public static final void glWindowPos2fvARB( float[] a0, int a1 )
	{
		gl.glWindowPos2fvARB( a0, a1 );
	}
	public static final void glWindowPos2fvMESA( java.nio.FloatBuffer a0 )
	{
		gl.glWindowPos2fvMESA( a0 );
	}
	public static final void glWindowPos2fvMESA( float[] a0, int a1 )
	{
		gl.glWindowPos2fvMESA( a0, a1 );
	}
	public static final void glWindowPos2i( int a0, int a1 )
	{
		gl.glWindowPos2i( a0, a1 );
	}
	public static final void glWindowPos2iARB( int a0, int a1 )
	{
		gl.glWindowPos2iARB( a0, a1 );
	}
	public static final void glWindowPos2iMESA( int a0, int a1 )
	{
		gl.glWindowPos2iMESA( a0, a1 );
	}
	public static final void glWindowPos2iv( java.nio.IntBuffer a0 )
	{
		gl.glWindowPos2iv( a0 );
	}
	public static final void glWindowPos2iv( int[] a0, int a1 )
	{
		gl.glWindowPos2iv( a0, a1 );
	}
	public static final void glWindowPos2ivARB( java.nio.IntBuffer a0 )
	{
		gl.glWindowPos2ivARB( a0 );
	}
	public static final void glWindowPos2ivARB( int[] a0, int a1 )
	{
		gl.glWindowPos2ivARB( a0, a1 );
	}
	public static final void glWindowPos2ivMESA( java.nio.IntBuffer a0 )
	{
		gl.glWindowPos2ivMESA( a0 );
	}
	public static final void glWindowPos2ivMESA( int[] a0, int a1 )
	{
		gl.glWindowPos2ivMESA( a0, a1 );
	}
	public static final void glWindowPos2s( short a0, short a1 )
	{
		gl.glWindowPos2s( a0, a1 );
	}
	public static final void glWindowPos2sARB( short a0, short a1 )
	{
		gl.glWindowPos2sARB( a0, a1 );
	}
	public static final void glWindowPos2sMESA( short a0, short a1 )
	{
		gl.glWindowPos2sMESA( a0, a1 );
	}
	public static final void glWindowPos2sv( java.nio.ShortBuffer a0 )
	{
		gl.glWindowPos2sv( a0 );
	}
	public static final void glWindowPos2sv( short[] a0, int a1 )
	{
		gl.glWindowPos2sv( a0, a1 );
	}
	public static final void glWindowPos2svARB( java.nio.ShortBuffer a0 )
	{
		gl.glWindowPos2svARB( a0 );
	}
	public static final void glWindowPos2svARB( short[] a0, int a1 )
	{
		gl.glWindowPos2svARB( a0, a1 );
	}
	public static final void glWindowPos2svMESA( java.nio.ShortBuffer a0 )
	{
		gl.glWindowPos2svMESA( a0 );
	}
	public static final void glWindowPos2svMESA( short[] a0, int a1 )
	{
		gl.glWindowPos2svMESA( a0, a1 );
	}
	public static final void glWindowPos3d( double a0, double a1, double a2 )
	{
		gl.glWindowPos3d( a0, a1, a2 );
	}
	public static final void glWindowPos3dARB( double a0, double a1, double a2 )
	{
		gl.glWindowPos3dARB( a0, a1, a2 );
	}
	public static final void glWindowPos3dMESA( double a0, double a1, double a2 )
	{
		gl.glWindowPos3dMESA( a0, a1, a2 );
	}
	public static final void glWindowPos3dv( java.nio.DoubleBuffer a0 )
	{
		gl.glWindowPos3dv( a0 );
	}
	public static final void glWindowPos3dv( double[] a0, int a1 )
	{
		gl.glWindowPos3dv( a0, a1 );
	}
	public static final void glWindowPos3dvARB( java.nio.DoubleBuffer a0 )
	{
		gl.glWindowPos3dvARB( a0 );
	}
	public static final void glWindowPos3dvARB( double[] a0, int a1 )
	{
		gl.glWindowPos3dvARB( a0, a1 );
	}
	public static final void glWindowPos3dvMESA( java.nio.DoubleBuffer a0 )
	{
		gl.glWindowPos3dvMESA( a0 );
	}
	public static final void glWindowPos3dvMESA( double[] a0, int a1 )
	{
		gl.glWindowPos3dvMESA( a0, a1 );
	}
	public static final void glWindowPos3f( float a0, float a1, float a2 )
	{
		gl.glWindowPos3f( a0, a1, a2 );
	}
	public static final void glWindowPos3fARB( float a0, float a1, float a2 )
	{
		gl.glWindowPos3fARB( a0, a1, a2 );
	}
	public static final void glWindowPos3fMESA( float a0, float a1, float a2 )
	{
		gl.glWindowPos3fMESA( a0, a1, a2 );
	}
	public static final void glWindowPos3fv( java.nio.FloatBuffer a0 )
	{
		gl.glWindowPos3fv( a0 );
	}
	public static final void glWindowPos3fv( float[] a0, int a1 )
	{
		gl.glWindowPos3fv( a0, a1 );
	}
	public static final void glWindowPos3fvARB( java.nio.FloatBuffer a0 )
	{
		gl.glWindowPos3fvARB( a0 );
	}
	public static final void glWindowPos3fvARB( float[] a0, int a1 )
	{
		gl.glWindowPos3fvARB( a0, a1 );
	}
	public static final void glWindowPos3fvMESA( java.nio.FloatBuffer a0 )
	{
		gl.glWindowPos3fvMESA( a0 );
	}
	public static final void glWindowPos3fvMESA( float[] a0, int a1 )
	{
		gl.glWindowPos3fvMESA( a0, a1 );
	}
	public static final void glWindowPos3i( int a0, int a1, int a2 )
	{
		gl.glWindowPos3i( a0, a1, a2 );
	}
	public static final void glWindowPos3iARB( int a0, int a1, int a2 )
	{
		gl.glWindowPos3iARB( a0, a1, a2 );
	}
	public static final void glWindowPos3iMESA( int a0, int a1, int a2 )
	{
		gl.glWindowPos3iMESA( a0, a1, a2 );
	}
	public static final void glWindowPos3iv( java.nio.IntBuffer a0 )
	{
		gl.glWindowPos3iv( a0 );
	}
	public static final void glWindowPos3iv( int[] a0, int a1 )
	{
		gl.glWindowPos3iv( a0, a1 );
	}
	public static final void glWindowPos3ivARB( java.nio.IntBuffer a0 )
	{
		gl.glWindowPos3ivARB( a0 );
	}
	public static final void glWindowPos3ivARB( int[] a0, int a1 )
	{
		gl.glWindowPos3ivARB( a0, a1 );
	}
	public static final void glWindowPos3ivMESA( java.nio.IntBuffer a0 )
	{
		gl.glWindowPos3ivMESA( a0 );
	}
	public static final void glWindowPos3ivMESA( int[] a0, int a1 )
	{
		gl.glWindowPos3ivMESA( a0, a1 );
	}
	public static final void glWindowPos3s( short a0, short a1, short a2 )
	{
		gl.glWindowPos3s( a0, a1, a2 );
	}
	public static final void glWindowPos3sARB( short a0, short a1, short a2 )
	{
		gl.glWindowPos3sARB( a0, a1, a2 );
	}
	public static final void glWindowPos3sMESA( short a0, short a1, short a2 )
	{
		gl.glWindowPos3sMESA( a0, a1, a2 );
	}
	public static final void glWindowPos3sv( java.nio.ShortBuffer a0 )
	{
		gl.glWindowPos3sv( a0 );
	}
	public static final void glWindowPos3sv( short[] a0, int a1 )
	{
		gl.glWindowPos3sv( a0, a1 );
	}
	public static final void glWindowPos3svARB( java.nio.ShortBuffer a0 )
	{
		gl.glWindowPos3svARB( a0 );
	}
	public static final void glWindowPos3svARB( short[] a0, int a1 )
	{
		gl.glWindowPos3svARB( a0, a1 );
	}
	public static final void glWindowPos3svMESA( java.nio.ShortBuffer a0 )
	{
		gl.glWindowPos3svMESA( a0 );
	}
	public static final void glWindowPos3svMESA( short[] a0, int a1 )
	{
		gl.glWindowPos3svMESA( a0, a1 );
	}
	public static final void glWindowPos4dMESA( double a0, double a1, double a2, double a3 )
	{
		gl.glWindowPos4dMESA( a0, a1, a2, a3 );
	}
	public static final void glWindowPos4dvMESA( java.nio.DoubleBuffer a0 )
	{
		gl.glWindowPos4dvMESA( a0 );
	}
	public static final void glWindowPos4dvMESA( double[] a0, int a1 )
	{
		gl.glWindowPos4dvMESA( a0, a1 );
	}
	public static final void glWindowPos4fMESA( float a0, float a1, float a2, float a3 )
	{
		gl.glWindowPos4fMESA( a0, a1, a2, a3 );
	}
	public static final void glWindowPos4fvMESA( java.nio.FloatBuffer a0 )
	{
		gl.glWindowPos4fvMESA( a0 );
	}
	public static final void glWindowPos4fvMESA( float[] a0, int a1 )
	{
		gl.glWindowPos4fvMESA( a0, a1 );
	}
	public static final void glWindowPos4iMESA( int a0, int a1, int a2, int a3 )
	{
		gl.glWindowPos4iMESA( a0, a1, a2, a3 );
	}
	public static final void glWindowPos4ivMESA( java.nio.IntBuffer a0 )
	{
		gl.glWindowPos4ivMESA( a0 );
	}
	public static final void glWindowPos4ivMESA( int[] a0, int a1 )
	{
		gl.glWindowPos4ivMESA( a0, a1 );
	}
	public static final void glWindowPos4sMESA( short a0, short a1, short a2, short a3 )
	{
		gl.glWindowPos4sMESA( a0, a1, a2, a3 );
	}
	public static final void glWindowPos4svMESA( java.nio.ShortBuffer a0 )
	{
		gl.glWindowPos4svMESA( a0 );
	}
	public static final void glWindowPos4svMESA( short[] a0, int a1 )
	{
		gl.glWindowPos4svMESA( a0, a1 );
	}
	public static final void glWriteMaskEXT( int a0, int a1, int a2, int a3, int a4, int a5 )
	{
		gl.glWriteMaskEXT( a0, a1, a2, a3, a4, a5 );
	}
	public static final boolean isExtensionAvailable( java.lang.String a0 )
	{
		return gl.isExtensionAvailable( a0 );
	}
	public static final boolean isFunctionAvailable( java.lang.String a0 )
	{
		return gl.isFunctionAvailable( a0 );
	}
	public static final void setSwapInterval( int a0 )
	{
		gl.setSwapInterval( a0 );
	}
}
