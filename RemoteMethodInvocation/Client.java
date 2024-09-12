package RemoteMethodInvocation;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try{
            //Get the reference to the RMI registry on localhost at port 1099:
            Registry registry = LocateRegistry.getRegistry("Localhost");

            //Look up the remote object from the registry:
            Hello stub = (Hello) registry.lookup("Hello");

            //Invoke the remote method:
            String response = stub.sayHello();
            System.out.println("Response: " +response);

        }catch(Exception e){
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
