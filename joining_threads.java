

public class joining_threads {
    public static void main(String[] args) {
        thread1 T1=new thread1();
        thread2 T2=new thread2();
        thread3 T3=new thread3();

       T2.start();

       try{
      T2.join();
       }catch(InterruptedException e){
           System.out.println(e);
       }
        T1.start();
        T3.start();
    }
}


class thread1 extends Thread {
    int i=0;
    public void run(){
        while(i<50) {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class thread2 extends Thread{
    int i=0;
    public void run(){
        while(i<50){
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

class thread3 extends  Thread{
    int i=0;
    public  void run(){
        while(i<50){
            System.out.println("Thread 3 is running");
            i++;
        }
    }

}


/*
Join is function of Thread which exceutes a partucular thread on priority. and then executes rest of the threads.
* */


//configuration and beans in spring boot
//ioc
//annotations