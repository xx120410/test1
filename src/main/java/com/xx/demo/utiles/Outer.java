package com.xx.demo.utiles;

/**
 * @author ssss
 * @date 2022/1/24 15:16
 */
class Outer {

    static class Inner {}

    public static void foo() { new Inner(); }

    public void bar() { new Inner(); }

    public static void main(String[] args) {
        new Inner();
    }
}

