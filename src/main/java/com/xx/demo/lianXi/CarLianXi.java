package com.xx.demo.lianXi;

import com.xx.demo.entity.Car;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.TimeZone;
/**
 * @author ssss
 * @date 2022/2/7 17:18
 */
public class CarLianXi {

    private static DateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm") ;

    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        String format = dateFormat.format(date);
//        String format = "2022-04-13 02:11:24";
//        String[] s = format.split(" ");
//        String[] split = s[1].split(":");
//        int hh = Integer.valueOf(split[0]) - 8;
//        String date1 = null;
//        if (hh<10 && hh >0){
//            date1 = s[0] + "T0" + hh +":"+ split[1]+":"+split[2];
//        }
//        if (hh<0){
//            String[] split1 = s[0].split("-");
//            int day0 = Integer.valueOf(split1[2]) - 1;
//            String day = null;
//            if (day0>0 && day0<10){
//                day = "0" + day0;
//            }else if (day0 == 0){
//
//            }
//            hh = 24+hh;
//            date1 = split1[0] +"-" +split1[1] + "-" +day0 + "T" + hh +":"+ split[1]+":"+split[2];
//        }
//        System.out.println(dateFormat.format(date));
//        System.out.println("hh = " + hh);
//        System.out.println("date1 = " + date1);
        String getutctimestr = getutctimestr();
        System.out.println("getutctimestr = " + getutctimestr);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        System.out.println("sdf1 = " + sdf1);
//        System.out.println();
//        String replace = getutctimestr.replace(" ", "T");
//        System.out.println("replace = " + replace);



    }

    public static String getutctimestr() {

        StringBuffer utctimebuffer = new StringBuffer();

// 1、取得本地时间：

        Calendar cal = Calendar.getInstance() ;

// 2、取得时间偏移量：

        int zoneoffset = cal.get(Calendar.ZONE_OFFSET);

// 3、取得夏令时差：

        int dstoffset = cal.get(Calendar.DST_OFFSET);

// 4、从本地时间里扣除这些差量，即可以取得utc时间：

        cal.add(Calendar.MILLISECOND, -(zoneoffset + dstoffset));

        int year = cal.get(Calendar.YEAR);

        int month = cal.get(Calendar.MONTH)+1;

        int day = cal.get(Calendar.DAY_OF_MONTH);

        int hour = cal.get(Calendar.HOUR_OF_DAY);

        int minute = cal.get(Calendar.MINUTE);

        utctimebuffer.append(year).append("-").append(month).append("-").append(day) ;

        utctimebuffer.append(" ").append(hour).append(":").append(minute) ;

        try{

//            Date parse = format.parse(utctimebuffer.toString());
//            System.out.println("parse = " + parse);
            String s = utctimebuffer.toString();
            String replace = s.replace(" ", "T");
            return replace;

        }catch(Exception e) {

            e.printStackTrace();

        }

        return null ;

    }
}
