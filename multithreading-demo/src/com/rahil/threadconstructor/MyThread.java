package com.rahil.threadconstructor;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        int count = 1;
        while (count < 11) {
            System.out.println(count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
        }
    }
}
