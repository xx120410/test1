package com.xx.demo.entity;

/**
 * @author ssss
 * @date 2022/4/6 11:47
 */
public class Father {

    private String name;

    public String getName() {
        System.out.println("父类获取name");
        return name;
    }

    public void setName(String name) {
        System.out.println("父类设置name");
        this.name = name;
    }
}
