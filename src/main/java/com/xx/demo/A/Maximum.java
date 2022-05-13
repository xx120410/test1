package com.xx.demo.A;

import java.util.Scanner;

/**
 * @author gdc
 * @date 2022/4/18 10:41
 * 获取最大值
 */
public class Maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        System.out.println("请输入第一个整数：");
        if (scan.hasNext()){
            int one = scan.nextInt();
            System.out.println("请输入第二个数：");
            int two = scan.nextInt();
            System.out.println("请输入第三个数：");
            int three = scan.nextInt();
            //求最大值
            if (one > two){
                max = one;
            }else{
                max = two;
            }
            if (max < three){
                max = three;
            }
            System.out.println("最大值 = " + max);
        }
        //关闭资源
        scan.close();
    }
}
