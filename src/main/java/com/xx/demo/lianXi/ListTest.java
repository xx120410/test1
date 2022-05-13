package com.xx.demo.lianXi;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ssss
 * @date 2022/1/25 15:38
 */
public class ListTest {
    @Scheduled(fixedDelay = 10000)
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("18");
        list.add("男");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
