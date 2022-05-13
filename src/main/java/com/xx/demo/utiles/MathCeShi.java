package com.xx.demo.utiles;

import static java.lang.Math.sin;

public class MathCeShi {
    public static String getType(Object o) {
        return o.getClass().toString(); //使用int类型的getClass()方法
    }

    public static void main(String[] args) {
        String Str = new String("www.runoob.com");
        char[] chars = Str.toCharArray();
        System.out.print("返回值 :" );
        System.out.println( Str.toCharArray() );
        System.out.println(getType(chars));
    }

    private static void test7() {
        String Str1 = new String("runoob");
        String Str2 = Str1;
        String Str3 = new String("runoob");
        String Str4 = "runooB";
        boolean retVal;

        retVal = Str1.equals( Str2 );
        System.out.println("返回值 = " + retVal );

        retVal = Str1.equals( Str3 );
        System.out.println("返回值 = " + retVal );

        boolean equals = Str1.equals(Str4);
        System.out.println("equals = " + equals);

        boolean b = Str1.equalsIgnoreCase(Str4);
        System.out.println("b = " + b);
    }

    private static void test6() {
        String str1 = "String1";
        String str2 = "String2";
        StringBuffer str3 = new StringBuffer( "String1");
        String str4 = "String1";

        boolean  result = str1.contentEquals( str3 );
        System.out.println(result);

        result = str2.contentEquals( str3 );
        System.out.println(result);

        boolean equals = str1.equals(str4);
        System.out.println("equals = " + equals);

        System.out.println(str1 == str4);
    }

    private static void test5() {
        String myStr = "Runoob";
        System.out.println(myStr.contains("Runoob"));
    }

    private static void test4() {
        String s = "www.runoob.com";
        char result = s.charAt(6);
        System.out.println(getType(result));
        System.out.println("result = " + result);
    }

    private static void test3() {
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);
    }

    private static void test2(String[] args) {
        String fs;
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", 0.1, 1, "张三");
        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s",  1.0, 1, 1);
        System.out.println();
        System.out.println(fs);
        System.out.println("fs = " + fs);
        String aa = "1111";
        System.out.println("aa = " + aa);
        System.out.println("MathCeShi.main");
        System.out.println("args = [" + args + "]");
        System.out.println("args = [" + args + "]");
        System.out.println("fs = " + fs);
    }

    private static void test1() {
        double math = Math.random();
        double v = Double.parseDouble("555");
        System.out.println(v);
        System.out.println(getType(v));

        char ch = 'a';

// Unicode 字符表示形式
        char uniChar = '\u039A';


// 字符数组
        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
        System.out.println(ch);
        System.out.println(uniChar);
        System.out.println("\f"+getType(charArray));
    }
}
