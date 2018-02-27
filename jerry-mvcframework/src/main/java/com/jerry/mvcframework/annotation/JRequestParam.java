package com.jerry.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * Created by Yangjy on 2018/2/27.
 */
@Target({ElementType.PARAMETER})     //方法参数
@Retention(RetentionPolicy.RUNTIME)     //注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented     //说明该注解将被包含在javadoc中
public @interface JRequestParam {

    String value() default "";


}
