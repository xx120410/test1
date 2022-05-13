package com.xx.demo.huanwei;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ssss
 * @date 2022/3/29 14:24
 */
public class MapDT {
    public static void main(String[] args) {
//        // 被检测的经纬度点
//        String X="116.377872";
//        String Y="39.91103";
//        // 商业区域（百度多边形区域经纬度集合）
//        String partitionLocation = "116.377679_39.911113,116.378052_39.911085,116.378047_39.910933,116.377679_39.910937";
        String jwd = "[{\"longitude\":\"104.743916\",\"latitude\":\"31.485843\"},{\"longitude\":\"104.742836\"," +
                "\"latitude\":\"31.485488\"},{\"longitude\":\"104.74068\",\"latitude\":\"31.483826\"},{\"longitude\"" +
                ":\"104.740287\",\"latitude\":\"31.482294\"},{\"longitude\":\"104.740449\",\"latitude\":\"31.480554\"}," +
                "{\"longitude\":\"104.741607\",\"latitude\":\"31.478691\"},{\"longitude\":\"104.7415\",\"latitude\":" +
                "\"31.47518\"},{\"longitude\":\"104.743914\",\"latitude\":\"31.474094\"},{\"longitude\":\"104.745811\"" +
                ",\"latitude\":\"31.473363\"},{\"longitude\":\"104.749908\",\"latitude\":\"31.473548\"},{\"longitude\"" +
                ":\"104.749476\",\"latitude\":\"31.47595\"},{\"longitude\":\"104.749189\",\"latitude\":\"31.477859\"}," +
                "{\"longitude\":\"104.749306\",\"latitude\":\"31.480815\"},{\"longitude\":\"104.749054\",\"latitude\":" +
                "\"31.482663\"},{\"longitude\":\"104.749099\",\"latitude\":\"31.485466\"},{\"longitude\":\"104.74591\"" +
                ",\"latitude\":\"31.485827\"},{\"longitude\":\"104.743916\",\"latitude\":\"31.485843\"},{\"longitude\"" +
                ":\"104.743916\",\"latitude\":\"31.485843\"},{\"longitude\":\"104.743916\",\"latitude\":\"31.485843\"},{" +
                "\"longitude\":\"104.743916\",\"latitude\":\"31.485843\"},{\"longitude\":\"104.743916\",\"latitude\":\"3" +
                "1.485843\"},{\"longitude\":\"104.743916\",\"latitude\":\"31.485843\"}]";
        JSONArray jsonObject1 = (JSONArray) JSON.parse(jwd);
        System.out.println("jsonObject1 = " + jsonObject1);
        List<Map<String,String>> list1 = new ArrayList<>();
        for (Object o :jsonObject1 ) {
            JSONObject obj = (JSONObject) o;
            Map<String,String> map1 = new HashMap<>();
            map1.put("longitude", (String) obj.get("longitude"));
            map1.put("latitude", (String) obj.get("latitude"));
            list1.add(map1);
        }
        System.out.println("list1 = " + list1);
//        System.out.println("list = " + list);
        boolean inPolygon = isInPolygon(104.7454877167	,31.4827447952, list1);
        System.out.println("inPolygon = " + inPolygon);
    }

    /**
     * 判断当前位置是否在多边形区域内
     */
    public static boolean isInPolygon(double x,double y,List list){

//        double p_x =Double.parseDouble(X);
//        double p_y =Double.parseDouble(Y);
        Point2D.Double point = new Point2D.Double(x, y);

        List<Point2D.Double> pointList= new ArrayList<Point2D.Double>();
//        String[] strList = partitionLocation.split(",");

        for (Object obj : list){
            Map map = (Map) obj;
//            String[] points = str.split("_");
            double polygonPoint_x=Double.parseDouble((String) map.get("longitude"));
            double polygonPoint_y=Double.parseDouble((String) map.get("latitude"));
            Point2D.Double polygonPoint = new Point2D.Double(polygonPoint_x,polygonPoint_y);
            pointList.add(polygonPoint);
        }

        return IsPtInPoly(point,pointList);
    }
    /**
     * 判断点是否在多边形内，如果点位于多边形的顶点或边上，也算做点在多边形内，直接返回true
     * @param point 检测点
     * @param pts   多边形的顶点
     * @return      点在多边形内返回true,否则返回false
     */
    public static boolean IsPtInPoly(Point2D.Double point, List<Point2D.Double> pts){

        int N = pts.size();
        boolean boundOrVertex = true; //如果点位于多边形的顶点或边上，也算做点在多边形内，直接返回true
        int intersectCount = 0;//cross points count of x
        double precision = 2e-10; //浮点类型计算时候与0比较时候的容差
        Point2D.Double p1, p2;//neighbour bound vertices
        Point2D.Double p = point; //当前点

        p1 = pts.get(0);//left vertex
        for(int i = 1; i <= N; ++i){//check all rays
            if(p.equals(p1)){
                return boundOrVertex;//p is an vertex
            }

            p2 = pts.get(i % N);
            if(p.x < Math.min(p1.x, p2.x) || p.x > Math.max(p1.x, p2.x)){
                p1 = p2;
                continue;
            }

            if(p.x > Math.min(p1.x, p2.x) && p.x < Math.max(p1.x, p2.x)){
                if(p.y <= Math.max(p1.y, p2.y)){
                    if(p1.x == p2.x && p.y >= Math.min(p1.y, p2.y)){
                        return boundOrVertex;
                    }

                    if(p1.y == p2.y){
                        if(p1.y == p.y){
                            return boundOrVertex;
                        }else{//before ray
                            ++intersectCount;
                        }
                    }else{
                        double xinters = (p.x - p1.x) * (p2.y - p1.y) / (p2.x - p1.x) + p1.y;
                        if(Math.abs(p.y - xinters) < precision){
                            return boundOrVertex;
                        }

                        if(p.y < xinters){
                            ++intersectCount;
                        }
                    }
                }
            }else{
                if(p.x == p2.x && p.y <= p2.y){
                    Point2D.Double p3 = pts.get((i+1) % N);
                    if(p.x >= Math.min(p1.x, p3.x) && p.x <= Math.max(p1.x, p3.x)){
                        ++intersectCount;
                    }else{
                        intersectCount += 2;
                    }
                }
            }
            p1 = p2;
        }

        if(intersectCount % 2 == 0){//偶数在多边形外
            return false;
        } else { //奇数在多边形内
            return true;
        }
    }

}
