package com.xx.demo.utiles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author ssss
 * @date 2022/4/19 15:53
 */
public class DateCeShi {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        String format2 = simpleDateFormat2.format(new Date());
        Date date = simpleDateFormat2.parse(format2);
        System.out.println("date = " + date);
    }
}
