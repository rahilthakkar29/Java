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