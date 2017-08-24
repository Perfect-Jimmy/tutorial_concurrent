package com.tutorial.test1;

/**
 * Created by Jimmy on 2017/8/22.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service){
        super();
        this.service = service;
    }

    public void run(){
        service.testMethod();
    }
}
