/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline.reservation.system.client.ui;

import static airline.reservation.system.client.Client.CLIENTDTO;
import airline.reservation.system.client.ClientDTO;
import airline.reservation.system.serialization.Flight;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author AMAN
 */
public class TicketBooking extends javax.swing.JFrame {

    /**
     * Creates new form TicketBooking
     */
    public TicketBooking() {
        initComponents();
        jDateChooser1.setDate(new java.util.Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabelHeading = new javax.swing.JLabel();
        fromCB = new javax.swing.JComboBox<>();
        fromLabel = new javax.swing.JLabel();
        uptoLabel = new javax.swing.JLabel();
        uptoCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bookBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket Booking");
        setMinimumSize(new java.awt.Dimension(854, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelHeading.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabelHeading.setForeground(new java.awt.Color(0, 102, 102));
        jLabelHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeading.setText("Airline Ticket Booking ");

        fromCB.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fromCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangkok", "Beijing", "Cairo", "Dhaka", "Florida", "Kolkata", "Mumbai", "New Delhi", "São Paulo", "Shanghai", "Texas", "Tokyo" }));
        fromCB.setSelectedIndex(7);
        fromCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromCBActionPerformed(evt);
            }
        });

        fromLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        fromLabel.setForeground(new java.awt.Color(102, 102, 102));
        fromLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fromLabel.setText("From :");
        fromLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        uptoLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        uptoLabel.setForeground(new java.awt.Color(102, 102, 102));
        uptoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        uptoLabel.setText("Upto :");
        uptoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        uptoCB.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        uptoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangkok", "Beijing", "Cairo", "Dhaka", "Florida", "Kolkata", "Mumbai", "New Delhi", "São Paulo", "Shanghai", "Texas", "Tokyo" }));
        uptoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uptoCBActionPerformed(evt);
            }
        });

        bookBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        bookBtn.setForeground(new java.awt.Color(102, 102, 102));
        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(102, 102, 102));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(102, 102, 102));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dateLabel.setText("Date :");
        dateLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backBtn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(102, 102, 102));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 854, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)
                                            .addComponent(fromCB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(uptoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(31, 31, 31)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(uptoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jLabelHeading)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromCB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uptoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uptoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fromCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromCBActionPerformed

    private void uptoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uptoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uptoCBActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed

        String from = fromCB.getSelectedItem().toString();
        String upto = uptoCB.getSelectedItem().toString();
        Date date = jDateChooser1.getDate();

        if (from.equals(upto)) {
            System.out.println("Error : Origin and Destination should be different");
        } else if (date == null) {
            System.out.println("Error : No date specified!");
        } else {
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            Flight f = new Flight(0, from, upto, sqlDate);
            if (CLIENTDTO.addBooking(f)) {
                System.out.println("Booking successfully added");
                setVisible(false);
                UserDashboard udb = new UserDashboard();
                udb.setVisible(true);
            } else {
                System.out.println("Error : While Booking");
            }
        }
    }//GEN-LAST:event_bookBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        fromCB.setSelectedIndex(7);
        uptoCB.setSelectedIndex(0);
        jDateChooser1.setDate(new java.util.Date());

    }//GEN-LAST:event_resetBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        UserDashboard udb = new UserDashboard();
        udb.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        CLIENTDTO.removeResources();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> fromCB;
    private javax.swing.JLabel fromLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JButton resetBtn;
    private javax.swing.JComboBox<String> uptoCB;
    private javax.swing.JLabel uptoLabel;
    // End of variables declaration//GEN-END:variables
}
