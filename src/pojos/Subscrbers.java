package pojos;
// Generated Dec 24, 2020 3:32:06 AM by Hibernate Tools 4.3.1



/**
 * Subscrbers generated by hbm2java
 */
public class Subscrbers  implements java.io.Serializable {


     private int subId;
     private int chatId;
     private int userId;

    public Subscrbers() {
    }

    public Subscrbers(int subId, int chatId, int userId) {
       this.subId = subId;
       this.chatId = chatId;
       this.userId = userId;
    }
   
    public int getSubId() {
        return this.subId;
    }
    
    public void setSubId(int subId) {
        this.subId = subId;
    }
    public int getChatId() {
        return this.chatId;
    }
    
    public void setChatId(int chatId) {
        this.chatId = chatId;
    }
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }




}


