package RMI;
import java.rmi.*;
//A remote interface extends the interface java.rmi.Remote

public interface Adder extends Remote{
    //Each method declares RemoteException in its throws clause
    public int add(int x,int y) throws RemoteException;
}