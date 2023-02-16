

import  java.util.*;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread t = new Thread(thread);
        t.start(); // start the thread

        try {
            Thread.sleep(2000); // pause the main thread for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.stop(); // stop the thread

        // start the thread again
        thread = new MyThread();
        t = new Thread(thread);
        t.start();
      //  thread.stop();
    }
}

class MyThread implements Runnable {
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(2000); // pause the thread for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        running = false;
    }
}