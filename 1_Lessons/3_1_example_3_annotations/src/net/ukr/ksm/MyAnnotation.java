package net.ukr.ksm;

import java.lang.annotation.*;

@Inherited
@Target(value= ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String param1() default "string";
    String param2();
}
