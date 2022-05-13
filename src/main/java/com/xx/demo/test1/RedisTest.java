package com.xx.demo.test1;

import cn.hylexus.jt808.vo.DeviceReturnDO;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

import static com.xx.demo.test1.RedisUtils.objectDeserialization;

/**
 * @author ssss
 * @date 2022/5/12 11:40
 */
public class RedisTest {


//    private RedisTemplate redisTemplate;

    public static void main(String[] args) {
        Jedis jedis = RedisUtils.getJedis();
        jedis.del("#hw808#84005684213");
        jedis.del("#hw808#92705479161");
        jedis.del("deviceSerial92705479161");
//        DeviceReturnDO o = (DeviceReturnDO) objectDeserialization(s);
//        System.out.println("o = " + o);
//        System.out.println("s1 = " + s1);
//        jedis.set("测试","测试111");
//        System.out.println("s = " + s);
//        List list = new LinkedList();
//        list.add("张三");
//        list.add("李四");
//        list.add("王二");
//        list.add("麻子");
////        jedis.rpush("姓名","1","张三","李四","王二","麻子","2");
//        List<String> xm = jedis.lrange("姓名",0,-1);
//        System.out.println("xm = " + xm);
//        System.out.println(jedis.get("测试"));
//        Long cs = jedis.del("测试");
//        System.out.println("cs = " + cs);
    }

    private static List<Person> getPersonList() {
        Person p1 = new Person();
        p1.setId(1L);
        p1.setName("张一");
        p1.setAge(11);

        Person p2 = new Person();
        p2.setId(2L);
        p2.setName("张二");
        p2.setAge(22);

        Person p3 = new Person();
        p3.setId(3L);
        p3.setName("张三");
        p3.setAge(33);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        return list;
    }
}
