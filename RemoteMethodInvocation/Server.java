package RemoteMethodInvocation;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try{
            //Create and export the remote  object:
            HelloImpl obj = new HelloImpl();

            //Create and get reference to the rmi registry on port 1099:
            Registry registry = LocateRegistry.createRegistry(1099);

            //Bind the remote object to the registry with the name Hello
            registry.bind("Hello", obj);
            System.out.println("Server ready");
        }catch(Exception e){
            System.err.println("Server exception: " +e.toString());
            e.printStackTrace();
        }
    }
}
