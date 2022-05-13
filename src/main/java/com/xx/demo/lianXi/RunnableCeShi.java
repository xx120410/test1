package com.xx.demo.lianXi;

/**
 * @author ssss
 * @date 2022/4/6 15:12
 */
public class RunnableCeShi implements Runnable {
    @Override
    public void run() {
        System.out.println("开启线程------");
    }
}

class CeShi2 {
    public static void main(String[] args) {
        RunnableCeShi runnableCeShi = new RunnableCeShi();
        new Thread(runnableCeShi).start();
    }
}


