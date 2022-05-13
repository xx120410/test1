package com.xx.demo.utiles;

import com.xx.demo.entity.Employee;

/**
 * @author ssss
 * @date 2022/1/10 10:36
 */
public class CeShi {
    public static void main(String [] args)
    {
        int[] a= {1,2,3};
        for (int i : a) {
            
        }

        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            
        }

        int i = calculateCount(4, 2);
        System.out.println(i);
    }

    private static int calculateCount(int ladder, int maxJump) {
        int jump = 0;
        if (ladder == 0) {
            return 1;
        }
        if (ladder >= maxJump) {
            // 剩下的楼梯大于最大可跳跃数
            for (int i = 1; i <= maxJump; i++) {
                jump += calculateCount(ladder - i, maxJump);
            }
        } else {
            // 剩下的楼梯不足最大可跳跃数
            jump = calculateCount(ladder, ladder);
        }
        return jump;
    }

    public static <T> int bisearch1(T[] x, T key){
        int bisearch = bisearch(x, key);
        if(bisearch == -1){
            int len = x.length/2;
            return -1;
        }else{
            return bisearch;
        }
    }

    public static  <T> int bisearch(T[] x, T key){
        int len = x.length/2;
        System.out.println(len);
        int sum = 0;
        for (int i = 0; i < len; i++) {
            T t = x[i];
            if(key == t){

                return i;
            }
            sum++ ;
//            System.out.println(t +"========"+ key);
        }
//        System.out.println("======:"+sum);
        return -1;
    }

    private static void test1() {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();

        System.out.println(s.getByName());
        System.out.println("---");
        System.out.println(e.getByName());
    }
}
