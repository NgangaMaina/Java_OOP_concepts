package Threads;

/*Thread synchronization is crucial to avoid race conditions, which occur when two or more threads try to access shared
resources simultaneously and the outcome depends on the order of execution
 */

public class SynchronizedCounter {
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public synchronized int getCount(){
        return count;
    }

    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i<1000; i++){
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 0; i<1000; i++){
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Final count (With synchronization intergrated): " +counter.getCount());
    }
}
