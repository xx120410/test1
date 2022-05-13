package com.xx.demo.entity;

/**
 * @author ssss
 * @date 2022/2/7 17:22
 */

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @see com.xx.demo.entity.Car
 */
public class CarCeShi {

    private String name;
    public static void main(String[] args) throws ParseException {
        List<String> list = new ArrayList<>();
        list. add("x");
        Collection<String> clist = Collections. unmodifiableCollection(list);
        clist. add("y"); // 运行时此行报错
        System. out. println(list. size());
    }

    private static void test18() {
        List list = new LinkedList();
        list.add("张三");
        list.add("李四");
        list.add("麻子");
        System.out.println("list = " + list);
        Object[] strings = list.toArray();
        System.out.println("strings = " + Arrays.toString(strings));
        String[] string = new String[]{"王二","瞎子"};
        List<String> strings1 = Arrays.asList(string);
        System.out.println("strings1 = " + strings1);
    }

    private static void test19() {
        Set s = new TreeSet();
        String string = "aabbcddeffoo00ppg65";
        for (int i = 0; i < string.length(); i++) {
            String c = string.charAt(i)+"";
//            s.add(c);
        }
        s.add("张");
        s.add("张");
        s.add("三");
        s.add("三");
        s.add("时");
        System.out.println("s = " + s);
    }

    private static void test22() {
        String aa = "abcde";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(aa);
        System.out.println("stringBuffer.reverse() = " + stringBuffer.reverse());
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("张三");
        StringBuilder reverse = stringBuilder.reverse();

        System.out.println("reverse = " + reverse);
        System.out.println("reverse.toString() = " + reverse.toString());
        System.out.println("reverse.insert(1,\"zz\") = " + reverse.insert(1,"abcd"));
        System.out.println("reverse.delete(1,2) = " + reverse.delete(1,4));
        reverse.setCharAt(0,'v');
        System.out.println(reverse);
    }

    private static void test11() {
        //        Date datee = new Date();
//        System.out.println("datee = " + datee);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(datee);
//        Date parse2 = new Date();
//        try {
//            parse2 = simpleDateFormat.format(datee);
//            System.out.println("parse2 = " + parse2);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        //-128 ~ +127 之间
        Integer a = 5;
        int b = 5;
        Integer c = new Integer(5);
        Integer d = 5;

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println(a == d);

        //-128 ~ +127 之外
        a = 128;

        b = 128;
        c = new Integer(128);
        d = 128;
        System.out.println();

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.equals(c));
        System.out.println(a == c);
        System.out.println(a == d);
    }

    private static void test10() {
        String testString =  "{length:'00:57:13',endTime:'2022-03-16 13:33:45.0',startTime:'2022-03-16 12:36:31.0',date:'2022-03-16'}";
        JSONObject jsonObject = JSONObject.parseObject(testString);
        System.out.println("jsonObject = " + jsonObject);
        String a = "1.0";
        String[] split = a.split("\\.");
        System.out.println("split[0] = " + split[0]);

        System.out.println();
        String a1 = "aaa  sdfsf";
        List<String> strings = new ArrayList<>();
        String ab = "{\"date\":\""+a+"\",\"startTime\":\""+a1+"\",\"endTime\":\""+a+"\",\"length\":\""+a1+"\"}";
        strings.add(ab);
        strings.add(ab);
        System.out.println(strings+"");
    }

    private static void test9() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        String[] s = format.split(" ");
        String s1 = s[0];
        System.out.println("s1 = " + s1);
    }

    private static void test8() {
        int[] aa = {12033,  12035, 12168, 12041, 12169, 12171, 12161,12045, 12048};
        int[] bb = {12033, 12161, 12035, 12168};
        List<Integer> list = new ArrayList();
        for (int i = 0; i < aa.length; i++) {
            list.add(aa[i]);
        }
        List<Integer> list1 = new ArrayList();
        for (int i = 0; i < bb.length; i++) {
            list1.add(bb[i]);
        }
        System.out.println("list = " + list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            int next = (int) iterator.next();
            System.out.println("next = " + next);
            for (int i = 0; i < list1.size(); i++) {
                if (next == list1.get(i)){
                    iterator.remove();
                }
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//            int a = (int) list.get(i);
//            for (int j = 0; j < list1.size(); j++) {
//                if (a== (int)list1.get(j)){
//                    list.remove(i);
//                    list1.remove(j);
////                    System.out.println("j = " + j);
//                }
//            }
//        }
        System.out.println(list.get(1));
        System.out.println("list = " + list);
    }

    private static void test7() {
        List list = new ArrayList();
        list.add('1');
        list.add('2');

        list.add('3');
        list.add('4');
        list.add('5');
        List<Object> tempList = list.subList(1, 3);
        System.out.println(tempList);
    }

    private static void test6() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2022-03-06 09:20:00");
        long ts = date.getTime()/1000;
        String res = String.valueOf(ts);
        System.out.println(res);

        Date d = new Date();
        SimpleDateFormat sbf = new SimpleDateFormat("HH:mm:ss");
        String format = sbf.format(d);
        System.out.println(d.getTime());

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long time = timestamp.getTime()/1000;
        System.out.println(time);

        long start = ts;
        long end = time;
        long diffSeconds = end - start;
        Double minute = new BigDecimal((float) diffSeconds / 60).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        Double hour = new BigDecimal((float) diffSeconds / (60 * 60)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(minute);   //打印结果：0.92
        System.out.println(hour);   //打印结果：0.02
    }

    private static void test5() {
        Date d = new Date();
        SimpleDateFormat sbf = new SimpleDateFormat("HH:mm:ss");
        String format = sbf.format(d);
        System.out.println(format);
        int current = Integer.valueOf(format.substring(0,2))*60*60 + Integer.valueOf(format.substring(3,5))*60 + Integer.valueOf(format.substring(6,8));

//        String r = "[{\"start\":\"04:30:00\",\"end\":\"09:30:00\"},{\"start\":\"12:30:00\",\"end\":\"14:30:00\"},{\"start\":\"19:20:00\",\"end\":\"21:00\"}]";
//        String r ="[{\"start\":\"05:30\",\"end\":\"07:30\"},{\"start\":\"20:30\",\"end\":\"21:30\"}]";
        String r = "[{\"start\":\"12:00:00\",\"end\":\"19:00\"}]";
        String ss = "";
        for (int i = 0; i < r.length(); i++) {
            char c = r.charAt(i);
            int b = c;
            if (b>=48 && b <= 57){
                ss +=c;
//                System.out.println("c = " + c);
            }
            if (c == ','){
                ss += c;
            }
        }
        String[] split = ss.split(",");
        int[] sum =new int[split.length];
        for (int i = 0; i < split.length; i++) {
            String s = split[i].toString();
            System.out.println("s = " + s);
            String substring = s.substring(0, 2);
            String substring1 = s.substring(2, 4);
            int aa = Integer.valueOf(substring)*60*60 + Integer.valueOf(substring1)*60;
            sum[i] = aa;
            System.out.println("substring = " + substring);
            System.out.println("substring1 = " + substring1);
            System.out.println("aa = " + aa);
            System.out.println();

        }
        System.out.println("ss = " + ss);
        for (int i = 0; i < sum.length; i++) {
            if (i%2 == 0){
                if (current > sum[i] && current <sum[i+1]){
                    System.out.println("================"+sum[i]);
                }
            }
        }
        System.out.println("sum = " + sum[1]);
//        int i = a.indexOf("\"start\":",6);
//        System.out.println(i);
//
//        String s = "xXccxxxXX";
//        // 从头开始查找是否存在指定的字符         //结果如下
//        System.out.println(s.indexOf("c"));     //2
//        // 从第四个字符位置开始往后继续查找，包含当前位置
//        System.out.println(s.indexOf("c", 3));  //3
//        //若指定字符串中没有该字符则系统返回-1
//        System.out.println(s.indexOf("y"));     //-1
//        System.out.println(s.lastIndexOf("x")); //6
    }

    private static void test4() {
        String a = "[{\"start\":\"09:00\",\"end\":\"18:00\"}]";
        String b = "[{\"start\":\"05:30\",\"end\":\"07:30\"},{\"start\":\"20:30\",\"end\":\"21:30\"}]";
        Date d = new Date();
        SimpleDateFormat sbf = new SimpleDateFormat("HH:mm:ss");
        String format = sbf.format(d);
        System.out.println(format);
        int current = Integer.valueOf(format.substring(0,2))*60*60 + Integer.valueOf(format.substring(3,5))*60 + Integer.valueOf(format.substring(6,8));
        System.out.println(current);
        int sum = 0;
        if (a.length() == 33){
            String startH = a.substring(11,13);
            String startM = a.substring(14,16);
            String endH = a.substring(25,27);
            String endM = a.substring(28,30);
            int start = Integer.valueOf(startH)*60*60 + Integer.valueOf(startM)*60;
            int end = Integer.valueOf(endH)*60*60 + Integer.valueOf(endM)*60;
            if (current > start && current <end){
                sum++;
            }
            System.out.println(start+"------" +end);
        }
        if (b.length() == 65){
            String startH1 = b.substring(11,13);
            String startM1 = b.substring(14,16);
            String endH1 = b.substring(25,27);
            String endM1 = b.substring(28,30);
            String startH2 = b.substring(43,45);
            String startM2 = b.substring(46,48);
            String endH2 = b.substring(57,59);
            String endM2 = b.substring(60,62);
            int start1 = Integer.valueOf(startH1)*60*60 + Integer.valueOf(startM1)*60;
            int end1 = Integer.valueOf(endH1)*60*60 + Integer.valueOf(endM1)*60;
            int start2 = Integer.valueOf(startH2)*60*60 + Integer.valueOf(startM2)*60;
            int end2 = Integer.valueOf(endH2)*60*60 + Integer.valueOf(endM2)*60;
            if (current > start1 && current <end1){
                sum++;
            }
            if (current > start2 && current <end2){
                sum++;
            }
        }
    }

    private static void test3() {
        String[][] arr = {{"1","44"},{"aa","张三"}};
        int[] aa = new int[8];
        String[] bb = new String[3];
        bb[0] = "1";
        bb[1] = "张三";
//         bb[2] = "李四";
        System.out.println(Arrays.toString(bb));
        System.out.println(arr);
//        System.exit(0);
    }

    private static void test2() {
        byte a = 1;
        byte b=2;
        int c =  a+b;
        System.out.println(c);
    }

    private static void test1() {
        Car car = new Car();
        Class aClass = car.getClass();
        car.color = "蓝色";
        car.show();
        CarCeShi c = new  CarCeShi();
        c.name = "奥迪";
        System.out.println(c.name);
        System.out.println('a');
        System.out.println('0');
        System.out.println("abcd");
        System.out.println(2.1);
        System.out.println(6);
        int b= 16;
        char a=(char) b;
        System.out.println("a = " + a);

        char r = 't';
        int p = r;
//        System.out.println(p);
        System.out.println("p = " + p);
        char z = '\u8C6A';
        System.out.println("z = " + z);
    }
}
