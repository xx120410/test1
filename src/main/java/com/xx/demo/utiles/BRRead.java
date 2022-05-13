package com.xx.demo.utiles;

import org.joda.time.DateTimeZone;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;

import static java.util.TimeZone.*;

/**
 * @author ssss
 * @date 2022/1/17 11:38
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        Date date1 = new Date();
        System.out.println("date1 = " + date1);
        long l = System.currentTimeMillis()/1000;
        int a= (int) l;
        System.out.println("a = " + a);
        System.out.println("l = " + l);
        DateFormat formatterIST = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        formatterIST.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata")); // better than using IST

        Date date = null;
        try {
            date = formatterIST.parse("15-05-2014 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(formatterIST.format(date)); // output: 15-05-2014 00:00:00

        DateFormat formatterUTC = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        formatterUTC.setTimeZone(TimeZone.getTimeZone("UTC")); // UTC timezone

        System.out.println(formatterUTC.format(date)); // output: 14-05-2014 18:30:00

// output in system timezone using pattern "EEE MMM dd HH:mm:ss zzz yyyy"

        System.out.println(date.toString()); // output in my timezone: Wed May 14 20:30:00 CEST 2014
    }
    private static void test1() throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}