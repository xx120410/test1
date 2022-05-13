package com.xx.demo.lianXi;

/**
 * @author ssss
 * @date 2022/4/6 15:03
 */
public class ThreadLianXi extends Thread {

    @Override
    public void run(){
        System.out.println("开启线程");
    }
}

class CeShi1 {
    public static void main(String[] args) {
        ThreadLianXi th = new ThreadLianXi();
        th.start();
    }
}