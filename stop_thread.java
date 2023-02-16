public class stop_thread {
    public static void main(String[] args) {
        int i=0;
        THread thread=new THread();
        Thread t1=new Thread(thread);
        while(i<20){
            t1.start();
            try{
                t1.sleep(200);

            }catch(InterruptedException e){
                System.out.println(e);
            }
            thread.stop();
            i++;
        }
        thread = new THread();
        t1 = new Thread(thread);
        t1.start();

    }
}

class THread implements Runnable{
    boolean flag=true;
    public void run(){
        while(flag){
            System.out.println("Thread is running");
            try{
               Thread.sleep(200);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public void stop(){
        flag=false;
    }
}