package com.tutorial.test1;

/**
 * Created by Jimmy on 2017/8/22.
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service){
        super();
        this.service = service;
    }

    public void run(){
        service.testMethod();
    }
}
