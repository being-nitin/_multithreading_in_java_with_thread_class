package com.codechef;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	achieving multithreading with the help of thread class:
	*/
    multi1 thread1 = new multi1();
    multi2 thread2 = new multi2();
    thread1.start();
    thread2.start();
    }
}
class multi1 extends Thread{
    public void run(){
        System.out.println("thread1 is running");
    }
}
class multi2 extends Thread{
    public void run(){
        System.out.println("thread2 is running");
    }
}
/* after extending the thread class there should be a run method and to execute that run method we have to call
start method.
 */