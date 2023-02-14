import java.util.*;
public class multiThread {
    public static void main(String[] args) {
        MyThread1 T1=new MyThread1();
        MyThread2 T2=new MyThread2();
        T1.start();
        T2.start();
    }
}


 class MyThread1 extends Thread{
  public void run(){
      int i=0;
      while(i<50){
          System.out.println("Thread 1 is running");
          System.out.println("rohit sharma pulling on short ball");
          i++;
      }
  }
}

class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Thread 2 is running");
            System.out.println("Virat playing cover drives");
            i++;
        }
    }
}


//here we have created two threads and using start function to run each of the threads and can easily see that due to multithread property
//compiler is giving time to both of the threads concurrently.

// This is the process of extending thread class.