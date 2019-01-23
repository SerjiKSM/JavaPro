package net.ukr.ksm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Class<?> cls = TestAnnotetion.class;

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            if (method.isAnnotationPresent(Test.class)){
                Test test = method.getAnnotation(Test.class);
                Double result = (Double) method.invoke(null, test.a(), test.b());
                System.out.print("Result: = " + result);
            }
        }
    }

}
