/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Mendaki extends javax.swing.JFrame {

    /**
     * Creates new form Mendaki
     */
    public Mendaki() {
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

        jLabel1 = new javax.swing.JLabel();
        Bawang = new javax.swing.JTextField();
        Kelam = new javax.swing.JTextField();
        Macan = new javax.swing.JTextField();
        Tback = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        DescBawang = new javax.swing.JButton();
        PilihBawang = new javax.swing.JButton();
        DescKelam = new javax.swing.JButton();
        PilihKelam = new javax.swing.JButton();
        DescMacan = new javax.swing.JButton();
        PilihMacan = new javax.swing.JButton();
        DescJamur = new javax.swing.JButton();
        PilihJamur = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tempat Pendakian Di Kalbar");

        Bawang.setText("Gunung Bawang / Bawang Peak");

        Kelam.setText("Bukit Kelam");

        Macan.setText("Bukit Macan");

        Tback.setText("Back");
        Tback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbackActionPerformed(evt);
            }
        });

        jTextField1.setText("Bukit Jamur");

        DescBawang.setText("Desc");
        DescBawang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescBawangActionPerformed(evt);
            }
        });

        PilihBawang.setText("Pilih");
        PilihBawang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihBawangActionPerformed(evt);
            }
        });

        DescKelam.setText("Desc");
        DescKelam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescKelamActionPerformed(evt);
            }
        });

        PilihKelam.setText("Pilih");
        PilihKelam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihKelamActionPerformed(evt);
            }
        });

        DescMacan.setText("Desc");
        DescMacan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescMacanActionPerformed(evt);
            }
        });

        PilihMacan.setText("Pilih");
        PilihMacan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihMacanActionPerformed(evt);
            }
        });

        DescJamur.setText("Desc");
        DescJamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescJamurActionPerformed(evt);
            }
        });

        PilihJamur.setText("Pilih");
        PilihJamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihJamurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Tback, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bawang, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kelam, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Macan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DescBawang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(DescKelam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DescMacan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DescJamur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PilihMacan, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(PilihBawang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PilihKelam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PilihJamur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PilihBawang, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bawang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DescBawang)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kelam, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescKelam)
                    .addComponent(PilihKelam))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Macan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescMacan)
                    .addComponent(PilihMacan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescJamur)
                    .addComponent(PilihJamur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(Tback)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TripLocal().setVisible(true);
    }//GEN-LAST:event_TbackActionPerformed

    private void DescKelamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescKelamActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Kelam().setVisible(true);
    }//GEN-LAST:event_DescKelamActionPerformed

    private void DescBawangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescBawangActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Bawang().setVisible(true);
    }//GEN-LAST:event_DescBawangActionPerformed

    private void DescMacanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescMacanActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Macan().setVisible(true);
    }//GEN-LAST:event_DescMacanActionPerformed

    private void DescJamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescJamurActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Jamur().setVisible(true);
    }//GEN-LAST:event_DescJamurActionPerformed

    private void PilihBawangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihBawangActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PilihMendaki().setVisible(true);
    }//GEN-LAST:event_PilihBawangActionPerformed

    private void PilihKelamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihKelamActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PilihMendaki().setVisible(true);
    }//GEN-LAST:event_PilihKelamActionPerformed

    private void PilihMacanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihMacanActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PilihMendaki().setVisible(true);
    }//GEN-LAST:event_PilihMacanActionPerformed

    private void PilihJamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihJamurActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PilihMendaki().setVisible(true);
    }//GEN-LAST:event_PilihJamurActionPerformed

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
            java.util.logging.Logger.getLogger(Mendaki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mendaki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mendaki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mendaki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mendaki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bawang;
    private javax.swing.JButton DescBawang;
    private javax.swing.JButton DescJamur;
    private javax.swing.JButton DescKelam;
    private javax.swing.JButton DescMacan;
    private javax.swing.JTextField Kelam;
    private javax.swing.JTextField Macan;
    private javax.swing.JButton PilihBawang;
    private javax.swing.JButton PilihJamur;
    private javax.swing.JButton PilihKelam;
    private javax.swing.JButton PilihMacan;
    private javax.swing.JButton Tback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}