package Threads;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running  ");
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread();
        thread.start();

    }
}
