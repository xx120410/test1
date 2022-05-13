package com.xx.demo.A;

import java.util.Scanner;

/**
 * @author gdc
 * @date 2022/4/18 11:30
 * 输入一个数，判断正负
 */
public class PlusOrMinus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (scan.hasNext()){
            int x = scan.nextInt();
            //计算函数
            if (x > 0){
                System.out.println(",程序输出：" + "\n" + x + "是一个正数");
            }else if (x < 0 ){
                System.out.println(",程序输出：" + "\n" + x + "是一个负数");
            }else {
                System.out.println(",程序输出：" + "\n" + x + "即非正数也非负数");
            }
        }
        //关闭资源
        scan.close();
    }
}
