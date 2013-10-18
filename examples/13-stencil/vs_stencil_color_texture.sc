$input a_position, a_texcoord0
$output v_texcoord0

/*
 * Copyright 2013 Dario Manesku. All rights reserved.
 * License: http://www.opensource.org/licenses/BSD-2-Clause
 */

#include "../common/common.sh" 

void main()
{
	gl_Position = mul(u_modelViewProj, vec4(a_position, 1.0) );

    v_texcoord0 = a_texcoord0;
}
