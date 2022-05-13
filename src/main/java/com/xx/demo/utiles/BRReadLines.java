package com.xx.demo.utiles;

import java.io.*;
import java.util.Scanner;

/**
 * @author ssss
 * @date 2022/1/17 11:54
 */
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str1 = scan.nextLine();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}