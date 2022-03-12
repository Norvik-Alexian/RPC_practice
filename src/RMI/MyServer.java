package RMI;
import java.rmi.*;
public class MyServer{
    public static void main(String[] args){
        try{
            Adder obj = new Implementation();
            // The Naming class provides methods to get and store the remote object.
            //Naming.rebind binds the remote object to the new name(bind also can be used)
            Naming.rebind("rmi://localhost:5000/sonoo", obj);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}