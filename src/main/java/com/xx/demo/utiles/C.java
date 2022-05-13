package com.xx.demo.utiles;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ssss
 * @date 2022/4/21 15:04
 */
public class C implements Cloneable,Serializable {

    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 2;
        int c = 1;
        int d = 2;
        if ((a == b && b == d) || (a == c && b == d)) {
            System.out.println("-------");
        }
        //1、new关键字
        C c1 = new C();
        int ceshi = c1.ceshi();
        System.out.println("ceshi = " + ceshi);

        //2、使用class类的newInstance()方法
        C t = C.class.newInstance();
        int ceshi1 = t.ceshi();
        System.out.println("ceshi1 = " + ceshi1);

        //3、使用构造函数类的newInstance()方法
        Constructor s = C.class.getConstructor();
        C o = (C) s.newInstance();
        int ceshi2 = o.ceshi();
        System.out.println("ceshi2 = " + ceshi2);

        //4、clone方法，创建一个新对象，将对象复制给新对象
        C clone = (C) c1.clone();
        int ceshi3 = clone.ceshi();
        System.out.println("ceshi3 = " + ceshi3);

        //5、使用反序列化
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        out.writeObject(c1);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        C o1 = (C) in.readObject();
        in.close();
        int ceshi4 = o1.ceshi();
        System.out.println("ceshi4 = " + ceshi4);
    }

    public int ceshi() {
        return 1;
    }
}
