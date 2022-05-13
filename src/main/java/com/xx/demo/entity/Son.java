package com.xx.demo.entity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ssss
 * @date 2022/4/6 11:46
 */
public class Son extends Father{
    private String name;

    @Override
    public String getName() {
        System.out.println("子类获取name");
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println("子类设置name");
        this.name = name;
    }

    public static void main(String[] args) {
        Father father = new Son();
        father.setName("张三");

        Father father1 = new Father();
        father1.setName("李四");
        List<String> list = new LinkedList<>();
        list.add("张三");
        list.add("李四");
        list.add("王二");
        list.add("麻子");
        list.add("翠花");
        list.add("小黑");
        list.add("小胖");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("王二")||list.get(i).equals("麻子")||list.get(i).equals("翠花")){
                list.remove(i);
                i--;
            }
        }
        System.out.println("list = " + list);

        List<String> list1 = new LinkedList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王二");
        list1.add("麻子");
        list1.add("翠花");
        list1.add("小黑");
        list1.add("小胖");
        ListIterator<String> iterator = list1.listIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("王二")||next.equals("麻子")||next.equals("翠花")){
                iterator.remove();
            }
        }
        System.out.println("list1 = " + list1);

    }
}
