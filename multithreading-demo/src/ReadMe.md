# Multithreading

### Index

1. [Introduction](#1introduction)
2. [The ways to define Thread](#2ways-to-define-threads)
   - By extending Thread class
   - By implementing Runnable interface
3. Getting & Setting name of thread
4. Thread priority
5. The methods to prevent Thread execution
   - yield()
   - join()
   - sleep()
6. Synchronization
7. Inter thread communication
8. Deadlock
9. Daemon threads
10. Multithreading enhancement


## 1.Introduction

- Multitasking: Executing multiple task simultaneously
- Student example: At same time listen, write notes, watch mobile etc
  - Process Based multitasking: Executing multiple task simultaneously, where each task is a separate independent process/program.
      - Running different tasks/applications at same time. i.e: Editor, music player, browser, etc.
      - It is applicable at the OS level only.
  - Thread Based multitasking: Executing several tasks simultaneously, where each task is a separate independent part of a same program.
    - Here, each task/part is called a Thread.
    - It is the best suitable at program level.


- Whether it is process or thread based, the main objective of multitasking is to reduce response/ideal time of the system and to improve the performance.
- The main important application areas of multithreading are, 
  - To develop multimedia graphics.
  - To develop animations 
  - To develop video games
  - To develop web servers and application servers
  - etc
- When compared with the old languages, developing multithreaded applications in Java is very easy. Because, Java provides inbuilt support for multithreading with the rich API[Thread, Runnable, ThreadGroup,...]

## 2.Ways to define threads
- What is thread?
  - Thread is a separate flow of execution
  - Each thread has independent work to do

- Defining a thread
    - We can define Thread by following two ways:
      - By extending Thread class
      - By implementing Runnable interface

```java
/*
* Defining the Thread
*/
class MyThread extends Thread {
    @Override
    public void run() {
        // Job of the Thread
        for(int i = 0; i<10; i++) {
            System.out.println("Child Thread"); // executed by Child thread
        }
    }
}
```

```java
class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();    // Thread instantiation
        t.start();  // start of a Thread
        // 1 Main thread till t.start() method
        // Main thread created a child thread
        for(int i = 0; i<10; i++) {
            System.out.println("Main Thread"); // executed by Main thread
        }
    }
}
```

- **Thread Scheduler:** It is a part of JVM. It is responsible to schedule Threads that is, if multiple methods are waiting to get chance of execution then which order threads will be executed is decided by Thread Scheduler.
We can't expect exact algorithm for it. It is varied from JVM to JVM, as we can't exact thread execution order and exact output. hence, whenever situation comes to multithreading there is no guarantee for exact output.
But, we can provide several possible outputs.
- **Difference between t.start() and t.run()?**
  - In the case of t.start() a new Thread will be created, which is responsible for the execution of run method.
  - But in the case of t.run() a new Thread won't be created and the run method will be executed just like a normal method call by Main thread.
  - Hence, in the above program if we replace t.start() with t.run() then the output is child thread * 10 then main thread * 10.
  - This total output is produced by only Main thread.
- **Importance of Thread class start method**
  - Thread class start method is responsible to register the Thread with Thread Scheduler and all other mandatory activities.
  - Hence, without executing Thread class start method there is no chance of start new Thread in java.
  - Due to this Thread class start method is considers as Heart of Multithreading.
- **Overloading of run()**
  - Overloading of run method is possible, but Thread class start method invoke no-args run method.
  - The other overloaded method we have to call explicitly like a normal method call.
- **If we are not overriding run()**
  - If you're not overriding the run method then Thread class run method will be executed which has empty execution.
Hence, no output will be there.
  - It is highly recommended override run(), otherwise don't go for Multithreading.
- **Override start()**
  - In this case only Main thread will be executed, no new thread will be created.
  - It is not recommended to override start(), otherwise don't go for multithreading concept.
- **Thread lifecycle**
  - MyThread t = new MT()(New/Born state) --> t.start(Ready/Runnable) --> Thread scheduler allocates process(Running) --> of run() method completes(Dead)
- After starting a thread if we're trying to restart the same thread then wwe'll get RuntimeException: IllegalThreadStateException
- Some other states: Wait, Notify, timed out, sleep, request I/O -> wait


## Thread Priorities

- In java,
  - MIN_PRIORITY = 1
  - AVE_PRIORITY = 5
  - MAX_PRIORITY = 10

## Thread class
- **Constructors**
  - Thread()
  - Thread(Runnable r)
  - Thread(Runnable r, String name)
  - Thread(ThreadGroup g, String name)
  - Thread(String name)
- **getxxx()/setxxx()**
  - long getId()
  - String getName()
  - int getPriority()
  - ThreadState getState()
  - ThreadGroup getThreadGroup()
  - void setName(String name)
  - void setPriority(int p)
  - void setDaemon(boolean d)     // Thread with least priority which runs in background. i.e: JVM garbage collector
- **Enquiry**
  - boolean isAlive()
  - boolean isDaemon()
  - boolean isInterrupted()
- **Instance Methods**
  - void interrupt()
  - void join()       // Instead of getting terminated it can wait others to complete. i.e: Main thread
  - void join(long millis)
  - void run()
  - void start()
- **Static Methods**
  - int activeCount()     // tells how many threads are active in group
  - Thread currentThread()   // get reference of current thread
  - void yield()  // Higher priority thread will wait for some time to give time to lower priority thread.
  - void dumpStack()    // 

* Starvation: It is a situation which might happen because of the priorities of the thread. i.e: Lower priority thread might not called








