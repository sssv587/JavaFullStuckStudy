package com.bytedance.java.java_senior_study.day05.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/18 - 23:39
 * @Description
 */

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotations {
    MyAnnotation[] value();
}
