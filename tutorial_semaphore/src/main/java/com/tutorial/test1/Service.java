package com.tutorial.test1;

import java.util.concurrent.Semaphore;

/**
 * Created by Jimmy on 2017/8/22.
 */
public class Service {
    private Semaphore semaphore = new Semaphore(2);//permit代表同一时间内允许X个线程可以执行acquire和release之间的代码

    public void testMethod(){
        try {
            semaphore.acquire();//获取一个许可，若无许可能够获得，则会一直等待，直到获得许可
            System.out.println(Thread.currentThread().getName()+" begin="+System.currentTimeMillis());
            Thread.sleep(1000*5);
            System.out.println(Thread.currentThread().getName()+" end="+System.currentTimeMillis());
            semaphore.release();//释放许可。注意，在释放许可之前，必须先获获得许可
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
