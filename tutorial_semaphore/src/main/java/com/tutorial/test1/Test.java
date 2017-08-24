package com.tutorial.test1;

import sun.applet.Main;

/**
 * Created by Jimmy on 2017/8/22.
 */
public class Test {

    public static void main(String[] args){
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");

        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
