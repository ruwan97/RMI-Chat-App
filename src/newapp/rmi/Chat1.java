
package newapp.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import newrmiapp.Message;

public interface Chat1 extends Remote{
    
    public void send_message(Message msg) throws RemoteException;
    
    public Message broadcast() throws RemoteException;
    
    //public void getMessages(String name,String msg) throws RemoteException;
    
    
}
