package com.rahil.runnable;

public class Test {
    public static void main(String[] args) {
       // ThreadDemo td = new ThreadDemo();
        Thread t = new Thread(new ThreadDemo());
        t.start();
        for (int i = 0; i<10; i++) {
            System.out.println("Main Thread");
        }
    }
}
