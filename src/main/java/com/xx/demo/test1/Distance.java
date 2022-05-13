package com.xx.demo.test1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author ssss
 * @date 2022/5/7 8:42
 */
public class Distance {

    /**
     * 地球半径 - 单位：米
     */
//    public static final Double EARTH_R_METERS = 6370996.81;


    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    /**
     * 根据经纬度来计算距离
     *
     * @param EARTH_R_METERS -- 半径
     * @param lng1           -- 点1经度
     * @param lat1           -- 点1纬度
     * @param lng2           -- 点2经度
     * @param lat2           -- 点2纬度
     * @return
     */
//    public static Double getLatLngDistance(double lng1, double lat1,
//                                           double lng2, double lat2) {
//        Double result = EARTH_R_METERS * Math.acos(Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180) * Math.cos((lng1 - lng2) * Math.PI / 180)
//                + Math.sin(lat1 * Math.PI / 180) * Math.sin(lat2 * Math.PI / 180));
//        return result;
//    }

    public static Double getDistance(Double lat1, Double lng1,Double lat2 , Double lng2) {
        double patm = 2;
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double difference = radLat1 - radLat2;
        double mdifference = rad(lng1) - rad(lng2);
        double distance = patm * Math.asin(Math.sqrt(Math.pow(Math.sin(difference / patm), patm)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(mdifference / patm), patm)));
        distance = distance * EARTH_RADIUS;
//        String distanceStr = String.valueOf(distance);
        return distance;
    }

    public static void main(String[] args) {
        Double[] lng = {104.6842474,
                104.6832805,
                104.6870084,
                104.6849644,
                104.6865334,
                104.6882143,
                104.6905253,
                104.6907453,
                104.6908193,
                104.6913283,
                104.6916563,
                104.6923733,
                104.6916963,
                104.6910123,
                104.6921083,
                104.6933863,
                104.6936213,
                104.6933603,
                104.6942743,
                104.6947453,
                104.6943913,
                104.6942503,
                104.6950843,
                104.6956844,
                104.6968154,
                104.6971684,
                104.6968174,
                104.6954173

        };

        Double[] lat = {
                31.5170288,
                31.51624676,
                31.51516396,
                31.51470087,
                31.51466395,
                31.51479401,
                31.5134441,
                31.5133451,
                31.5133201,
                31.51294612,
                31.51273412,
                31.51242414,
                31.51280012,
                31.51304611,
                31.51249713,
                31.51227314,
                31.51224414,
                31.51222414,
                31.51201914,
                31.51191314,
                31.51208914,
                31.51206414,
                31.51197914,
                31.51180213,
                31.51138312,
                31.51124611,
                31.51138112,
                31.51195013

        };
        Double latLngDistance = 0.0;
        for (int i = 0; i < lat.length; i++) {
            if (i < lat.length - 1) {
                System.out.println("i = " + i);
                latLngDistance += getDistance(lng[i], lat[i], lng[i + 1], lat[i + 1]);
            }else {
                System.out.println("iiiiii = " + i);
                latLngDistance += getDistance(lng[i-1], lat[i-1], lng[i], lat[i]);
            }
        }
        System.out.println(lat.length+" =latLngDistance = " + latLngDistance);
    }
}
