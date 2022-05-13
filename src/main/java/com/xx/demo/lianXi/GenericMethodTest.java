package com.xx.demo.lianXi;

/**
 * @author ssss
 * @date 2022/1/25 11:30
 */
public class GenericMethodTest {
    public static <E> void getArray(E[] arr){
        for (E e : arr) {
            System.out.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] i = {2,9,6,4,2,7};
        Double[] d = {1.1,3.4,6.4,3.2};
        Character[] c = {'a','4','b','r'};
        System.out.println("Integer引用类型：");
        getArray(i);
        System.out.println("Double引用类型：");
        getArray(d);
        System.out.println("字符引用类型：");
        getArray(c);

        Integer a = 127;
        Integer t = 127;
        System.out.println(a==t);
        System.out.println(a.equals(t));
    }
}
