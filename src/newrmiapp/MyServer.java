
package newrmiapp;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JFrame;
import newapp.rmi.Chat1;
import newapp.rmi.Chatservice1;


public class MyServer extends JFrame{

    public MyServer() {
        
    }
    
    
    
    
    
    public static void startServer() {
        
        
        try {
            Chat1 chat = new Chatservice1();
            Registry reg = LocateRegistry.createRegistry(2123);
            reg.bind("ChatAdmin", chat);
            
            System.out.println("Chat server is running...");
                 
        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Exception ocured : " + e.getMessage());
        }
        
    }
    
}







