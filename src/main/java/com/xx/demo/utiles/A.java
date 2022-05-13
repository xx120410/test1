package com.xx.demo.utiles;

/**
 * @author ssss
 * @date 2022/1/18 9:22
 */
//public class A {
//    private String a;
//
//    private int b;
////    public A(){
////        System.out.println("父类空参构造方法");
////    }
//
//    public A(String a, int b) {
//        this.a = a;
//        this.b = b;
//        System.out.println(this.a+"----" + this.b);
//    }
//
//    public void tea(String redTea){
//        System.out.println(redTea);
//    }
//}

/**
 * @author 张三
 * @date 2022/1/19 14:31
 *单例模式，饿汉式
*/
//class A {
//    private static A a = new A();
//
//    private A() {
//    }
//
//    public static A getA() {
//        return a;
//    }
//
//    public void print(){
//        System.out.println("hello A");
//    }
//}

import com.xx.demo.service.Test;

/**
 * @author 张三
 * @date 2022/1/19 14:35
 *懒汉式
*/
class A {

    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}

class B extends A{

    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}

class Hello {

    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }

}


class c {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        char a='张';
        System.out.println(a);
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());

    }

    private static void test2() {
        String a= "张三";
        String b="张三";
        String c= new String("张三");
        String d = new String("张三");

        Integer t = 1;
        Integer p = 1;

        if (c.equals(d)){
            System.out.println("相同");
        }else{
            System.out.println("不相等");
        }

        if (a==b){
            System.out.println("相同");
        }else{
            System.out.println("不相等");
        }
    }

    private static void test1() {
        int[] a = {1,2,4};
        System.out.println(a);
        byte[] b = {5,6,7};
        char[] c = {'a','b','c'};
        String[] s = {a[1]+"",b+"",c+""};
        A:
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <b.length; j++) {
                if (a[i] == 2){
                    System.out.println("退出了");
                    break A;
                }
            }
            System.out.println(i+" ==== "+a[i]);
        }
    }
}
