/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travel;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KEC
 */
public class MainMenuScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuScreen
     */
    public MainMenuScreen() {
        initComponents();
        Color backgroundcolor = new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor);
        setVisible(true);
        setResizable(false);
        clockDisplay();
    }

    void clockDisplay()
    {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int year = cal.get(Calendar.YEAR);
        lbldate.setText("DATE:"+date+"-"+(month+1)+"-"+year);
      
        Thread clocktime = new Thread()
        {
           public void run()
            {
                try {
                while(true)
                {
        Calendar c = new GregorianCalendar();
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        lbltime.setText("TIME:"+hour+":"+minute+":"+second);
                    
                        sleep(1000);
                    } 
                }catch (InterruptedException ex) {
                        Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            }
           
        };
         clocktime.start();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblflightbooking = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        lblflightbooking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblflightbooking.setText("CLICK HERE FOR FLIGHT BOOKING");
        lblflightbooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblflightbookingMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        lbldate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldate.setText("jLabel2");

        lbltime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltime.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblflightbooking)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltime)
                            .addComponent(lbldate))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lblflightbooking, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldate)
                .addGap(18, 18, 18)
                .addComponent(lbltime)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblflightbookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblflightbookingMouseClicked
        try {
            // TODO add your handling code here:
            FlightBooking fb = new FlightBooking();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblflightbookingMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblflightbooking;
    private javax.swing.JLabel lbltime;
    // End of variables declaration//GEN-END:variables
}
