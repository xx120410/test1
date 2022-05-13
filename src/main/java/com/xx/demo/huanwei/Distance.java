package com.xx.demo.huanwei;

import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticCurve;
import org.gavaghan.geodesy.GlobalCoordinates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ssss
 * @date 2022/3/29 16:41
 */
public class Distance {
//    public static void main(String[] args) {
////        104.7263409301	31.5202975364  104.7265939458	31.5269060647
//        System.out.println("经纬度距离计算结果：" + getDistance(104.7571457084, 31.4630559394, 104.7574163276, 31.462231705) + "米");
//    }
//
//


    public static void main(String[] args) {

        double distanse = getDistance(31.5168127821, 104.7319032853, 31.5167251922, 104.7323945704);
        String disStr = distanse+"km";
        System.out.println(disStr);
        List<Map<String,Double>> list = new ArrayList();
        Map<String,Double> map = new HashMap<>();
        map.put("lon",104.7389291213);
        map.put("lat",31.4739182586	);
        System.out.println("经纬度距离计算结果：" + getDistance1(104.7319032853,	31.5168127821, 104.7323945704	,31.5167251922) + "千米");
    }

    public static double getDistance1(double longitudeFrom, double latitudeFrom, double longitudeTo, double latitudeTo) {
        GlobalCoordinates source = new GlobalCoordinates(latitudeFrom, longitudeFrom);
        GlobalCoordinates target = new GlobalCoordinates(latitudeTo, longitudeTo);

        return new GeodeticCalculator().calculateGeodeticCurve(Ellipsoid.Sphere, source, target).getEllipsoidalDistance()/1000;
    }

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }
    private static double EARTH_RADIUS = 6378.137;
    //地球半径
    public static double getDistance(double lat1, double lng1, double lat2,
                                     double lng2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000d) / 10000d;

        return s;

    }


}
