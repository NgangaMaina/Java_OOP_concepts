package SingletonDesignPattern;

public class Singleton {

    private static Singleton instance = null;
    private int counter = 0; //Keeps track of the number of times the increment counter method is called.
    private Singleton(){
        //private constructor to prevent direct instantiation.
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }

    public void incrementCounter(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    public static void main(String[] args) {
        Singleton  singleton1=Singleton.getInstance();
        /*Get instance is called again but this time 'instance' is not 'null'
           (it references the previously created 'Singleton' instance). 'Singleton2'
            is assigned the same 'singleton' instance as 'Singleton1' .*/
        Singleton  singleton2=Singleton.getInstance();

        //Calling 'incerementCounter' on 'singleton1' increments the 'counter' of the shared instance to '1'.
        singleton1.incrementCounter();
        //'counter' of the share instance increases to '2'.
        singleton2.incrementCounter();

        //Both return the value of 'counter' from the same shared 'singleton' instance.
        System.out.println(singleton1.getCounter());
        System.out.println(singleton2.getCounter());
    }
}




