package RMI;
import java.rmi.*;
import java.rmi.server.*;
/*extend the UnicastRemoteObject class or use the exportObject() method of the UnicastRemoteObject class and implement the remote object interface*/

public class Implementation extends UnicastRemoteObject implements Adder{
    //The constructor
    Implementation() throws RemoteException{
        super();
    }
    //the implementation of the method in remote interface
    public int add(int x,int y){
        return x+y;
    }
}