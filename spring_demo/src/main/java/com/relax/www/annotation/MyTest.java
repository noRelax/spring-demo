
package com.relax.www.annotation;
/** 
* @ClassName: Retention 
* @Description: TODO(注解类) 
* @author no_relax 
* @date 2016年9月28日 下午1:51:02 
*  
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyTest {
    long time() default -1;
}

