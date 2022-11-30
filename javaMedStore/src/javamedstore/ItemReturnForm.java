/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaMedStore;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

/**
 *
 * @author sosin/Francis
 */
public class ItemReturnForm extends javax.swing.JFrame {

    /**
     * Creates new form ItemReturnForm
     */
    public ItemReturnForm() {
        initComponents();
    }
    public int counter = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseInform = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        renteeName1 = new javax.swing.JTextField();
        phoneNo1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailAddr1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoDisplay = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemName1 = new javax.swing.JTextField();

        purchaseInform.setEditable(false);
        purchaseInform.setColumns(20);
        purchaseInform.setRows(5);
        jScrollPane1.setViewportView(purchaseInform);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Item Return Form");

        renteeName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renteeName1ActionPerformed(evt);
            }
        });

        phoneNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNo1ActionPerformed(evt);
            }
        });

        jLabel4.setText("(Optional)Phone No. :");

        jLabel5.setText("(Optional)Email Addr. :");

        emailAddr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddr1ActionPerformed(evt);
            }
        });

        infoDisplay.setEditable(false);
        infoDisplay.setColumns(20);
        infoDisplay.setRows(5);
        jScrollPane2.setViewportView(infoDisplay);

        submitBtn.setText("submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name:");

        jLabel3.setText("Rentee:");

        itemName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemName1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(renteeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemName1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(itemName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(renteeName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(phoneNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(submitBtn)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void renteeName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renteeName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renteeName1ActionPerformed

    private void phoneNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNo1ActionPerformed

    private void emailAddr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddr1ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        //try to store user data into file
        try {
            //get text stored in both fields itemName1 and renteeName1
            String it1 = itemName1.getText();
            String rt1 = renteeName1.getText();
            //create new file and appropriate variable for existing file
            File abc = new File("userItemReturn.txt");
            //if file does not already exist
            if (abc.exists() != true) {
                //create new file
                abc.createNewFile();
            //if file already exists
            } else {
                //check to see if data entered in itemName1 is empty
                if (it1.isEmpty() == true) {
                    infoDisplay.setText("Product name field cannot be empty");
                } else {
                    //check to see if data entered in renteeName1 is empty
                    if (rt1.isEmpty() == true) {
                        infoDisplay.setText("Rentee field cannot be empty");
                    } else {
                        //if fields aren't empty execute data addition to file
                        if (rt1.isEmpty() != true && it1.isEmpty() != true) {
                            //File writer allows to write to the txt file and append
                            FileWriter itemRet = new FileWriter(abc.getAbsolutePath(),true);
                            //allows for the addition of data into the file instead of overwriting
                            BufferedWriter addData = new BufferedWriter(itemRet);
                            //write user entered data into the .txt file
                            addData.write("\n");
                            addData.write("\nItem Returned: " + itemName1.getText());
                            addData.write("\nRentee: " + renteeName1.getText());
                            addData.write("\nPhone Number: " + phoneNo1.getText());
                            addData.write("\nEmail Address: " + emailAddr1.getText());
                            //close FileWriter and BufferedWriter
                            addData.close();
                            itemRet.close();
                            //display that item has been returned
                            infoDisplay.setText("Rental item returned!");
                        //else if fields managed to still be empty
                        } else {
                            infoDisplay.setText("Error submiting information");
                        }
                    }
                }
            }
            //catch any error that may occur when trying to write to file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void itemName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemName1ActionPerformed

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
            java.util.logging.Logger.getLogger(ItemReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemReturnForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemReturnForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailAddr1;
    private javax.swing.JTextArea infoDisplay;
    private javax.swing.JTextField itemName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField phoneNo1;
    private javax.swing.JTextArea purchaseInform;
    private javax.swing.JTextField renteeName1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
