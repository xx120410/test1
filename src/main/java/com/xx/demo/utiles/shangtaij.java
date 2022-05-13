package com.xx.demo.utiles;

/**
 * @author ssss
 * @date 2022/1/20 16:28
 */
import java.util.Scanner;

public class shangtaij  {
    int zhongshu=0;

    void loti(int shenyu){
        if(shenyu>1){
            loti(shenyu-1);
            loti(shenyu-2);
        }else {
            ++zhongshu;
            return;
        }
//        System.out.println(zhongshu+"==="+shenyu);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        shangtaij go=new shangtaij();
        go.loti(in.nextInt());
        System.out.println(go.zhongshu);
    }
}