
package newapp.rmi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import newrmiapp.Message;



public class Chatservice1 extends UnicastRemoteObject implements Chat1{
    
    public Chatservice1() throws RemoteException{
        super();
    }
    
    //ArrayList<Message> msgs = new ArrayList<Message>();
    Message newmsg = null;
    //Message prevmsg = null;

    @Override
    public void send_message(Message msg) throws RemoteException {
        
        this.newmsg = msg;
        System.out.println(newmsg.getMsgid());
        System.out.println(newmsg.getName());
        System.out.println(newmsg.getMessage());
        System.out.println(newmsg.getDate_time());
        this.save_msg();


    }
    
    
    public void save_msg() {
    
        String fileName = "messagedb.ser";
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName, true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.newmsg);
            out.flush();
            out.close();
            fileOut.close();
            
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
         
    }
    

    public Message broadcast(){

//        if(this.newmsg==this.bcmsg){
//            return null;
//        }else{
//            this.bcmsg = this.newmsg;
//            return this.newmsg;
//        }
        return this.newmsg;
    }

   
    
    
    
}
