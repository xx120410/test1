package com.xx.demo.utiles;

import java.util.Iterator;

/**
 * @author ssss
 * @date 2022/1/21 14:12
 */
enum Color {
    RED,
    GREEN,
    BLUE
}

class Test1 {
    // 执行输出结果
    public static void main(String[] args)
    {
        for (Color co : Color.values()) {
            switch (co){
                case RED:
                    System.out.println("co红色 = " + co);
                    break;
                case BLUE:
                    System.out.println("co蓝色 = " + co);
                    continue;
                case GREEN:
                    System.out.println("绿色");
                    break;
            }
        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }
    }
}