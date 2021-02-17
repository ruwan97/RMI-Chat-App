package newrmiapp;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import newapp.rmi.Chat1;

public class MyClient1 extends javax.swing.JFrame {

    Registry reg;
    Chat1 chat;

    public MyClient1() {
        initComponents();
        this.load();

    }

    public void load() {
        try {
            reg = LocateRegistry.getRegistry("localhost", 2123);
            chat = (Chat1) reg.lookup("ChatAdmin");
            retrivemsg.start();
        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        msgtext = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clientUserName = new javax.swing.JLabel();
        dp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msgtext.setFont(new java.awt.Font("DinaminaUniWeb", 1, 11)); // NOI18N
        msgtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgtextActionPerformed(evt);
            }
        });
        jPanel1.add(msgtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 309, 40));

        send.setFont(new java.awt.Font("DinaminaUniWeb", 1, 11)); // NOI18N
        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 74, 40));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Nueva Std", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name :");

        clientUserName.setFont(new java.awt.Font("Nueva Std", 1, 16)); // NOI18N
        clientUserName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(clientUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 472, -1));

        panelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panelBody);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 410, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        String n = clientUserName.getText();
        String m = msgtext.getText();

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time_now = myDateObj.format(myFormatObj);

        Message msg = new Message();
        msg.setMsgid(msg.hashCode());
        msg.setName(n);
        msg.setMessage(m);
        msg.setDate_time(time_now);

        try {
            chat.send_message(msg);
            msgtext.setText("");
        } catch (RemoteException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_sendActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    int height = 12;
    private void msgtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgtextActionPerformed

    Thread retrivemsg = new Thread() {
        public void run() {

            int preiv = 0;

            while (true) {
                try {

                    Message nmsg = chat.broadcast();
                    if (nmsg != null) {
                        if (preiv != nmsg.getMsgid()) {
                            bubble(height, nmsg.getDate_time(), nmsg.getName(), nmsg.getMessage());
//                            displaymsg.setText(displaymsg.getText() + nmsg.getDate_time()+"\t"+ nmsg.getName()+ " : " + nmsg.getMessage()+"\n");
                            System.out.println(nmsg.getDate_time() + "\t" + nmsg.getName() + " : " + nmsg.getMessage() + "\n");
                            preiv = nmsg.getMsgid();

                            height += 72;

                        }
                    }

//                    if(newmsg!=preiv){
//                        System.out.println(chat.broadcast().getMessage());
//                        preiv = newmsg;
//                    }
                    Thread.sleep(100);
                } catch (RemoteException | NullPointerException ex) {
                    System.out.println(ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyClient1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    };

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyClient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyClient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyClient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyClient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyClient1().setVisible(true);

            }
        });

    }

    public void bubble(int x, String date_time, String name, String msg) {
        JPanel panelCard = new JPanel();
        JLabel lblMessage = new JLabel();

        JLabel lblDate = new JLabel();

        panelCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMessage.setText(msg);
        lblMessage.setOpaque(true);

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText(name+ "   " + date_time);
        lblDate.setOpaque(true);

        if (name.equalsIgnoreCase(clientUserName.getText())) {
            lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            panelCard.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 369, 25));

            panelCard.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 369, -1));
            
            panelCard.setBackground(new java.awt.Color(0, 153, 51));
            lblMessage.setBackground(new java.awt.Color(0, 153, 51));
            lblDate.setBackground(new java.awt.Color(0, 153, 51));

            lblMessage.setForeground(new java.awt.Color(255, 255, 255));
            lblDate.setForeground(new java.awt.Color(255, 255, 255));
            
            lblMessage.setFont(new java.awt.Font("DinaminaUniWeb", 1, 11));
            lblDate.setFont(new java.awt.Font("DinaminaUniWeb", 1, 11));
            

        } else {
            panelCard.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 369, 25));
            panelCard.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 369, -1));

            panelCard.setBackground(new java.awt.Color(71, 71, 71));
            lblMessage.setBackground(new java.awt.Color(71, 71, 71));
            lblDate.setBackground(new java.awt.Color(71, 71, 71));

            lblMessage.setForeground(new java.awt.Color(255, 255, 255));
            lblDate.setForeground(new java.awt.Color(255, 255, 255));
            
            lblMessage.setFont(new java.awt.Font("DinaminaUniWeb", 1, 11));
            lblDate.setFont(new java.awt.Font("DinaminaUniWeb", 1, 11));
        }
        panelBody.add(panelCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, x, 380, 52));
        
        JScrollBar jscBar = jScrollPane1.getVerticalScrollBar();
        jscBar.setValue(jscBar.getMaximum());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel clientUserName;
    public javax.swing.JLabel dp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField msgtext;
    private javax.swing.JPanel panelBody;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
