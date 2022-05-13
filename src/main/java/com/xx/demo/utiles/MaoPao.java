package com.xx.demo.utiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ssss
 * @date 2022/1/24 17:02
 */
public class MaoPao {
    /**
     * @param ls:
     * @author 张三
     * @date 2022/1/24 17:14
     * 降序
    */
    public int[] paiXu(int[] ls){
        int c;
        for (int i = 0; i < ls.length-1; i++) {
            for (int j = 0; j < ls.length-i-1; j++) {
                if (ls[j] > ls[j+1]){
                    c = ls[j];
                    ls[j]=ls[j+1];
                    ls[j+1] = c;
                }
            }
        }

        return ls;
    }

    public Integer getMax(int[] ls){
        int max;
        for (int i = 0; i < ls.length-1; i++) {
            if (ls[i] > ls[i+1]){
                max = ls[i];
                ls[i]=ls[i+1];
                ls[i+1] = max;
            }
        }
        int l = ls[ls.length - 1];
        return l;
    }

    public static void main(String[] args) {
//        int[] i = {2,1,4,5,7,4};
        int[] i = new int[]{8,0,98,1115,100,-1,87,568};
        MaoPao mp = new MaoPao();
        int[] ints = mp.paiXu(i);
        System.out.println(Arrays.toString(ints));

        Integer max = mp.getMax(i);
        System.out.println(max);

        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (int j = 0; j < sites.size(); j++) {
            String s = sites.get(j);
            System.out.println(s);
        }

    }

}
