package net.ukr.ksm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args){

        Container container = new Container();
        Class<?> containerClass = container.getClass();

        if(!containerClass.isAnnotationPresent(SaveToPath.class)){
            System.out.println("Error");
            return;
        }

        SaveToPath saveToPathAnnotation = containerClass.getAnnotation(SaveToPath.class);

        String path = saveToPathAnnotation.path();

        Method[] methods = containerClass.getDeclaredMethods();

        for (Method method : methods){
            if(method.isAnnotationPresent(Save.class)){
                try {
                    method.invoke(container, path);
                    System.out.println("File save!");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }



    }

}
