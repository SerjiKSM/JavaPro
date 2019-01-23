package net.ukr.ksm;

/**
 * Created with IntelliJ IDEA.
 * User: Serhio
 * Date: 01.11.15
 * Time: 22:23
 * To change this template use File | Settings | File Templates.
 */


import java.lang.reflect.Method;

//MyAnnotation.java:

//MethodAnnotation.java:

public class Main {

    @MyAnnotation(param2="test")
    static private final class Test {
        @MethodAnnotation
        public void myMethod() {}
    }
    public static void main(String[] args) {
        final Class<?> cls = Test.class;
        if (cls.isAnnotationPresent(MyAnnotation.class))
            System.out.println("Class is annotated");
        MyAnnotation an = cls.getAnnotation(MyAnnotation.class);
        System.out.println(an.param1() + ", " + an.param2());
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodAnnotation.class)) {
                System.out.println("Method " +
                        method.getName() +
                        " is marked with MethodAnnotation");
            }
        }
    }

}
