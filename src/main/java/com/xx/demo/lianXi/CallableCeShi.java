package com.xx.demo.lianXi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ssss
 * @date 2022/4/6 15:19
 */
public class CallableCeShi implements Callable {
    @Override
    public Object call() throws Exception {
        String name = "张三";
        System.out.println("name = " + name);
        return name;
    }

    public static void main(String[] args) {
        CallableCeShi callableCeShi = new CallableCeShi();
        FutureTask<String> result = new FutureTask<>(callableCeShi);

        Thread thread = new Thread(result);
        thread.start();
        try {
            System.out.println("result.toString() = " + result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
