package JavaNativeInterface;

public class HelloJNI {

    //Loading the native library 'Hello'
    static{
        System.loadLibrary("Hello");
        //This library contains a native method called sayHello.
    }

    //The method 'sayHello' is declared as 'native', meaning its implementation is in another language (C in this case).
    private native void sayHello();
    public static void main(String[] args) {
        new HelloJNI().sayHello(); // Create an instance and invoke the native method
    }
}
