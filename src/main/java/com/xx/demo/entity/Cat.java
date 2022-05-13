package com.xx.demo.entity;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author ssss
 * @date 2022/4/2 15:36
 */
public final class Cat {
    public Cat(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
class CatCeShi {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add("1");
        set.add("22");
        set.add("3");
        set.add("4");
        set.add("556");
        System.out.println("set = " + set);
        Set set1 = new HashSet();
        set1.add("12");
        set1.add("3");
        set1.add("7");
        set1.add("4");
        set1.add("4");
        set1.add("5");
        System.out.println("set1 = " + set1);

    }

    private static void test3() {
        List list = new Stack();
//        list.add("aa");
        list.add("bb");
//        list.
        System.out.println("list = " + list.isEmpty());
    }

    private static void test2() {
        String str1 = " aa bb";
        String str2 = new String("aa");
        String str3 = "aa";
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));
        System.out.println(Arrays.toString(str1.getBytes()) +"---"+Arrays.toString(str3.getBytes())
                +"===" + Arrays.toString(str2.getBytes()));
        System.out.println(str1.trim());
        System.out.println(str1.length());
        String replace = str1.replace(" ", "");
        System.out.println(replace);
    }

    private static void test1() {
        Cat cat = new Cat("张三");
        Cat car1 = new Cat("张三");
        System.out.println("cat = " + cat.toString());
        System.out.println("car1 = " + car1.toString());
        System.out.println(cat.toString() == car1.toString());
        System.out.println(car1.toString().equals(cat.toString()));

        String s1 = new String("老王");
        String s2 = new String("老王");
        System.out.println(s1.equals(s2)); // true

        Byte b = new Byte("12");
        System.out.println("b = " + b);
        int a = b;
        System.out.println("a = " + (a==b));
        System.out.println("-----------------------");
        String str1 = "通话";
        String str2 = "重地";
        System. out. println(String. format("str1：%d | str2：%d",  str1. hashCode(),str2. hashCode()));
        System. out. println(str1. equals(str2));
        System.out.println();

        String str3 = "通话";
        System.out.println(str1==str3);
        System.out.println("s1 =  " + s1.hashCode());
        s1 = s1+"00000000";
        System.out.println("s1 =33   == " + s1.hashCode());
        StringBuffer aa = new StringBuffer("123");

        System.out.println(aa+"----------"+aa.getClass());
        System.out.println();
        aa = aa.append("456");
        System.out.println(aa+"----------"+aa.getClass());
    }
}
