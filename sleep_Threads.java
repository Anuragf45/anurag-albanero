import java.util.*;
public class sleep_Threads {
    public static void main(String[] args) {
  Thread T1=new Thread();
 thread1 t1=new thread1();
 t1.start();
 try{
     t1.sleep(2000);
 }catch (InterruptedException e){
     System.out.println(e);
 }

    }
}



//creating a thread and it should be stopped in 2 sec and again it should get started.