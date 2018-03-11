/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author MemoBG
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlSide = new javax.swing.JPanel();
        pnlRadio = new javax.swing.JPanel();
        rdQuadraticCenter = new javax.swing.JRadioButton();
        rdMultiplicativeGenerator = new javax.swing.JRadioButton();
        rdCongruential = new javax.swing.JRadioButton();
        rdMixedCongruential = new javax.swing.JRadioButton();
        sprB = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        txtX = new javax.swing.JTextField();
        lblX = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        btnRun = new javax.swing.JButton();
        sprA = new javax.swing.JSeparator();
        lblIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pnlBack.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Skia", 1, 36)); // NOI18N
        lblTitle.setText("Generador de números random");

        pnlSide.setBackground(new java.awt.Color(41, 45, 49));

        pnlRadio.setBackground(new java.awt.Color(41, 45, 49));
        pnlRadio.setForeground(new java.awt.Color(255, 255, 255));

        rdQuadraticCenter.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        rdQuadraticCenter.setForeground(new java.awt.Color(255, 255, 255));
        rdQuadraticCenter.setText("Centros de los cuadrados");
        rdQuadraticCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdQuadraticCenterActionPerformed(evt);
            }
        });

        rdMultiplicativeGenerator.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        rdMultiplicativeGenerator.setForeground(new java.awt.Color(255, 255, 255));
        rdMultiplicativeGenerator.setText("Generador multiplicativo");
        rdMultiplicativeGenerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMultiplicativeGeneratorActionPerformed(evt);
            }
        });

        rdCongruential.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        rdCongruential.setForeground(new java.awt.Color(255, 255, 255));
        rdCongruential.setText("Congriencial");
        rdCongruential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdCongruentialActionPerformed(evt);
            }
        });

        rdMixedCongruential.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 14)); // NOI18N
        rdMixedCongruential.setForeground(new java.awt.Color(255, 255, 255));
        rdMixedCongruential.setText("Congruencial Mixto");
        rdMixedCongruential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMixedCongruentialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRadioLayout = new javax.swing.GroupLayout(pnlRadio);
        pnlRadio.setLayout(pnlRadioLayout);
        pnlRadioLayout.setHorizontalGroup(
            pnlRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRadioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdMixedCongruential)
                    .addComponent(rdCongruential)
                    .addComponent(rdMultiplicativeGenerator)
                    .addComponent(rdQuadraticCenter))
                .addGap(18, 18, 18))
        );
        pnlRadioLayout.setVerticalGroup(
            pnlRadioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRadioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdQuadraticCenter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdMultiplicativeGenerator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdCongruential)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdMixedCongruential)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(41, 45, 49));

        txtX.setText("0");

        lblX.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 15)); // NOI18N
        lblX.setForeground(new java.awt.Color(255, 255, 255));
        lblX.setText("x:");

        lblM.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 15)); // NOI18N
        lblM.setForeground(new java.awt.Color(255, 255, 255));
        lblM.setText("m:");

        txtM.setText("0");

        txtA.setText("0");
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 15)); // NOI18N
        lblA.setForeground(new java.awt.Color(255, 255, 255));
        lblA.setText("a:");

        lblC.setFont(new java.awt.Font("Sinhala Sangam MN", 0, 15)); // NOI18N
        lblC.setForeground(new java.awt.Color(255, 255, 255));
        lblC.setText("c:");

        txtC.setText("0");
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblC)
                        .addGap(18, 18, 18)
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblX)
                        .addGap(18, 18, 18)
                        .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblA)
                        .addGap(18, 18, 18)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblM))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnRun.setBackground(new java.awt.Color(218, 56, 73));
        btnRun.setFont(new java.awt.Font("Sinhala Sangam MN", 1, 18)); // NOI18N
        btnRun.setForeground(new java.awt.Color(255, 255, 255));
        btnRun.setText("Ejecutar");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        lblIcon.setForeground(new java.awt.Color(255, 255, 255));
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/shuffle.png"))); // NOI18N

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblIcon)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSideLayout.createSequentialGroup()
                                .addComponent(sprA, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addComponent(sprB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprA, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTable1.setFont(new java.awt.Font("Sinhala MN", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Xn", "Generador", "Operación", "No Aleatorio", "Ri"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addComponent(pnlSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(pnlSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdQuadraticCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdQuadraticCenterActionPerformed
        if(rdQuadraticCenter.isSelected()){
            rdMultiplicativeGenerator.setSelected(false);
            rdCongruential.setSelected(false);
            rdMixedCongruential.setSelected(false);
            lblM.setVisible(false);
            txtM.setVisible(false);
            txtA.setVisible(false);
            lblA.setVisible(false);
            lblC.setVisible(false);
            txtC.setVisible(false);
        }
    }//GEN-LAST:event_rdQuadraticCenterActionPerformed

    private void rdMultiplicativeGeneratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMultiplicativeGeneratorActionPerformed
        if(rdMultiplicativeGenerator.isSelected()){
            rdQuadraticCenter.setSelected(false);
            rdCongruential.setSelected(false);
            rdMixedCongruential.setSelected(false);
            lblM.setVisible(true);
            txtM.setVisible(true);
            txtA.setVisible(true);
            lblA.setVisible(true);
            lblC.setVisible(false);
            txtC.setVisible(false);
        }
    }//GEN-LAST:event_rdMultiplicativeGeneratorActionPerformed

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRunActionPerformed

    private void rdCongruentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdCongruentialActionPerformed
        if(rdCongruential.isSelected()){
            rdQuadraticCenter.setSelected(false);
            rdMultiplicativeGenerator.setSelected(false);
            rdMixedCongruential.setSelected(false);
            lblM.setVisible(true);
            txtM.setVisible(true);
            txtA.setVisible(true);
            lblA.setVisible(true);
            lblC.setVisible(true);
            txtC.setVisible(true);
        }
    }//GEN-LAST:event_rdCongruentialActionPerformed

    private void rdMixedCongruentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMixedCongruentialActionPerformed
        if(rdMixedCongruential.isSelected()){
            rdQuadraticCenter.setSelected(false);
            rdMultiplicativeGenerator.setSelected(false);
            rdCongruential.setSelected(false);
            lblM.setVisible(true);
            txtM.setVisible(true);
            txtA.setVisible(true);
            lblA.setVisible(true);
            lblC.setVisible(true);
            txtC.setVisible(true);
        }
    }//GEN-LAST:event_rdMixedCongruentialActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlRadio;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JRadioButton rdCongruential;
    private javax.swing.JRadioButton rdMixedCongruential;
    private javax.swing.JRadioButton rdMultiplicativeGenerator;
    private javax.swing.JRadioButton rdQuadraticCenter;
    private javax.swing.JSeparator sprA;
    private javax.swing.JSeparator sprB;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtX;
    // End of variables declaration//GEN-END:variables
}
