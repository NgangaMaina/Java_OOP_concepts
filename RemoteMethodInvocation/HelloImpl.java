package RemoteMethodInvocation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//Implementation of the remote interface:

public class HelloImpl extends UnicastRemoteObject implements Hello {

    public HelloImpl() throws RemoteException{
        super();
    }
    @Override
    public String sayHello() throws RemoteException {
        return "Hello World";
    }
}
