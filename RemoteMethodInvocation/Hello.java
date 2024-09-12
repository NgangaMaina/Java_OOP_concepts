package RemoteMethodInvocation;
import java.rmi.Remote;
import java.rmi.RemoteException;

//Remote interface definition:
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
