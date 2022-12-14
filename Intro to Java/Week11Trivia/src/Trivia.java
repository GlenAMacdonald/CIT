/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author glenmacdonald
 */
public class Trivia extends javax.swing.JFrame {
    String responseCorrect = "You are Correct, wtf";
    String responseIncorrect = "Duh, this question makes no sense";

    /**
     * Creates new form Trivia
     */
    public Trivia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpAnswers = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnIncorrect1 = new javax.swing.JRadioButton();
        btnIncorrect2 = new javax.swing.JRadioButton();
        btnIncorrect3 = new javax.swing.JRadioButton();
        btnCorrect = new javax.swing.JRadioButton();
        txtResponse = new javax.swing.JTextField();
        btnMark = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Question: How much wood can a woodchuck chuk?");

        btnGrpAnswers.add(btnIncorrect1);
        btnIncorrect1.setText("As much wood as a woodchuck can chuck wood");

        btnGrpAnswers.add(btnIncorrect2);
        btnIncorrect2.setText("4 Tonnes");

        btnGrpAnswers.add(btnIncorrect3);
        btnIncorrect3.setText("3Kg");

        btnGrpAnswers.add(btnCorrect);
        btnCorrect.setText("None, wtf");

        txtResponse.setToolTipText("");
        txtResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponseActionPerformed(evt);
            }
        });

        btnMark.setText("Mark Me!");
        btnMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnIncorrect1)
                            .addComponent(btnIncorrect2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIncorrect3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResponse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMark, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCorrect, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(btnIncorrect1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncorrect2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncorrect3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCorrect)
                .addGap(12, 12, 12)
                .addComponent(btnMark)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkActionPerformed

        if (btnCorrect.isSelected()){
            txtResponse.setText(responseCorrect);
        } else {
            txtResponse.setText(responseIncorrect);
        }
        
    }//GEN-LAST:event_btnMarkActionPerformed

    private void txtResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponseActionPerformed

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
            java.util.logging.Logger.getLogger(Trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trivia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnCorrect;
    private javax.swing.ButtonGroup btnGrpAnswers;
    private javax.swing.JRadioButton btnIncorrect1;
    private javax.swing.JRadioButton btnIncorrect2;
    private javax.swing.JRadioButton btnIncorrect3;
    private javax.swing.JButton btnMark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtResponse;
    // End of variables declaration//GEN-END:variables
}
