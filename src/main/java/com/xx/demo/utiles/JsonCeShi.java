package com.xx.demo.utiles;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xx.demo.entity.Hello;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JsonCeShi {
    public static void main(String[] args) {
       int[] i = {1,3,4,5};
        System.out.println("i = " + Arrays.toString(i));
        String[] s = {"553sada","tewtgre","66666"};
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));

        List<Hello> list = new ArrayList<>();
        String format = getTime();
        list.add(new Hello("张三",format,98));
        list.add(new Hello("李四",format,16));
        list.add(new Hello("王二",format,45));
        list.add(new Hello("麻子",format,35));
        System.out.println("list = " + list);
    }

    /**
     * @param aa:
     * @param bb:
     * @author 张三
     * @date 2022/1/10 11:53
     *
    */
    private static void listToJson(String aa,int bb) {
        try {
            List<Hello> list = new ArrayList<>();
            String format = getTime();
            list.add(new Hello("张三",format,98));
            list.add(new Hello("李四",format,16));
            list.add(new Hello("王二",format,45));
            list.add(new Hello("麻子",format,35));
            ObjectMapper om = new ObjectMapper();
            String s = om.writeValueAsString(list);
            System.out.println(s);
            System.out.println(aa);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    /**
     * @author 张三
     * @date 2022/1/10 11:54
     *
    */
    private static String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        return simpleDateFormat.format(date);
    }

    /**
     * @author 张三
     * @date 2022/1/10 11:00
     * 方法：对象转JSON
    */
    private static void objectToJson() {
        try {
            String format = getTime();
            Hello hello = new Hello("张三",format,44);
            ObjectMapper objectMapper = new ObjectMapper();
            String om = objectMapper.writeValueAsString(hello);
            System.out.println(om);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
