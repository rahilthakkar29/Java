package com.rahil.threadconstructor;



public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread("Thread1");
        Thread t2 = new Thread(new MyRun());
        Thread t3 = new Thread(new MyRun(), "Thread3");
        MyThread t4 = new MyThread("Thread4");

        /*
        // Thread methods
        System.out.println("ID:: " +t4.getId());
        System.out.println("Name:: " +t4.getName());
        System.out.println("Default Priority:: " +t4.getPriority());
        t4.setPriority(10);
        System.out.println("New Priority:: " +t4.getPriority());
     //   t4.start();
        System.out.println("State:: " +t4.getState());
        System.out.println("Alive:: " +t4.isAlive());

         */

        // Thread sleep example
        t4.start();
    }
}
