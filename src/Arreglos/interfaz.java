/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author T-107
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        Transformar = new javax.swing.JButton();
        JLabel1 = new javax.swing.JLabel();
        ASCIIAChar = new javax.swing.JButton();
        ResultadoCHAR = new javax.swing.JLabel();
        EntradaFrase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setText("Interfaz Frase");

        Transformar.setText("Transformar");
        Transformar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransformarActionPerformed(evt);
            }
        });

        ASCIIAChar.setText("Retransformar a texto");
        ASCIIAChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASCIIACharActionPerformed(evt);
            }
        });

        EntradaFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaFraseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ASCIIAChar)
                    .addComponent(Transformar)
                    .addComponent(titulo)
                    .addComponent(EntradaFrase)
                    .addComponent(JLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(ResultadoCHAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(EntradaFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Transformar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ASCIIAChar)
                .addGap(18, 18, 18)
                .addComponent(ResultadoCHAR, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransformarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransformarActionPerformed
 //Paso uno, pedirle al textfiled el texto
        String f= EntradaFrase.getText();
        byte[] arreglo=f.getBytes();
        StringBuilder builder=new StringBuilder();
       for(byte b:arreglo){
           builder.append(b);
           builder.append((" , "));
       }
       String t=builder.toString();
        JLabel1.setText(t);
        
    
    }//GEN-LAST:event_TransformarActionPerformed

    private void ASCIIACharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASCIIACharActionPerformed
        String f= JLabel1.getText();
        byte[] arreglo=f.getBytes();
        StringBuilder builder=new StringBuilder();
       for(byte b:arreglo){
           builder.append((char)b);
          builder.append((" , "));
       }
       String t=builder.toString();
        ResultadoCHAR.setText(t);
        
 
    }//GEN-LAST:event_ASCIIACharActionPerformed

    private void EntradaFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaFraseActionPerformed

    }//GEN-LAST:event_EntradaFraseActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ASCIIAChar;
    private javax.swing.JTextField EntradaFrase;
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel ResultadoCHAR;
    private javax.swing.JButton Transformar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
