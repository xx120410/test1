package com.xx.demo.A;

import java.util.Scanner;

/**
 * @author gdc
 * @date 2022/4/18 11:03
 * 获取对应数
 */
public class OutputValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int y = 0;
        if (scan.hasNext()){
            int x = scan.nextInt();
            //计算函数
            if (x < 1){
                y = x;
            }else if (x >= 1 && x <10){
                y = 2 * x - 1;
            }else {
                y = 3 * x -11;
            }
            System.out.println("y = " + y);
        }
        //关闭资源
        scan.close();
    }
}
