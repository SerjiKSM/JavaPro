package net.ukr.ksm;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Created with IntelliJ IDEA.
 * User: Serhio
 * Date: 01.11.15
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */

// before JRE 8u20
class MyArrayListBefore8u20<E> extends ArrayList {

    @Override
    public void sort(Comparator<? super E> c) {
        Collections.sort(this, c);
    }

}

class MyArrayListAfter8u20<E> extends ArrayList {

    static boolean is8u20;

    static {
        is8u20 = false;
        try {
            Class<?> cls = Class.forName("java.util.ArrayList");
            Method[] methods = cls.getMethods();
            for (Method m : methods) {
                if ("sort".equals(m.getName())) {
                    is8u20 = true;
                    break;
                }
            }

        } catch (Exception e) {
            ;
        }
    }

    @Override
    public void sort(Comparator<? super E> c) {
        if (is8u20) {
            super.sort(c);
        } else {
            Collections.sort(this, c);
        }

    }

}


public class Main {

    public static void main(String[] args) {

        MyArrayListBefore8u20<String> list1 = new MyArrayListBefore8u20<String>();
        list1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        MyArrayListAfter8u20<String> list2 = new MyArrayListAfter8u20<String>();
        list2.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }

}
