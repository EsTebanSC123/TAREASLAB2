/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import static Main.registro.Contraseñatxt;
import static Main.registro.Nicktxt;
import static Main.registro.Nombretxt;
import static Main.registro.Edadtxt;
import javax.swing.JOptionPane;

import java.awt.Label;

/**
 *
 * @author Basti
 */
public class Datos_1 extends javax.swing.JFrame {

  String Nomnew , niK , Años , Pass;
   
        
    public Datos_1() {
        
       initComponents();
       this.setLocationRelativeTo(null);
       setTitle("Cambiar Datos");
       Nomnew= Nombretxt.getText();
       niK=Nicktxt.getText();
       Años=Edadtxt.getText();
       Pass=Contraseñatxt.getText();
        
       LNom.setText(Nombretxt.getText());
       LNick.setText(Nicktxt.getText());
       LEdad.setText(Edadtxt.getText());
       LContra.setText(Contraseñatxt.getText());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LNom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LEdad = new javax.swing.JLabel();
        LNick = new javax.swing.JLabel();
        LContra = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 71, 29));

        LNom.setOpaque(true);
        jPanel1.add(LNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 26, 138, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 71, 29));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nickname: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 71, 29));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 86, 29));

        LEdad.setOpaque(true);
        jPanel1.add(LEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 73, 138, -1));

        LNick.setOpaque(true);
        jPanel1.add(LNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 138, -1));

        LContra.setOpaque(true);
        jPanel1.add(LContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 167, 138, -1));

        jButton2.setText("Cambiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jButton3.setText("Cambiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jButton4.setText("Cambiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jButton5.setText("Cambiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jButton6.setText("Salir sin guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 214, 127, -1));

        jButton7.setText("Guardar cambios");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 135, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/36779.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 260));

        jMenu1.setText("Menú");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Volver");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String respuesta = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
             Nomnew=(Nombretxt.getText());
        if(respuesta.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vacío , intente nuevamente");
           
           Nomnew=(Nombretxt.getText());
        }else{
            LNom.setText(respuesta);
            Nomnew=respuesta;
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String respuesta2 = JOptionPane.showInputDialog("Ingrese la nueva edad");
                 Años=(Edadtxt.getText());
         if(respuesta2.isEmpty()){
              JOptionPane.showMessageDialog(null, "Campo vacío , intente nuevamente");
             
     
       
              Años=(Edadtxt.getText());
         }else{
            LEdad.setText(respuesta2);  
            Años=respuesta2;
         }
      
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String respuesta3 = JOptionPane.showInputDialog("Ingrese el nuevo Nickname");
       niK=(Edadtxt.getText());
        if(respuesta3.isEmpty()){
          JOptionPane.showMessageDialog(null, "Campo vacío , intente nuevamente");
       
    
      
          niK=(Edadtxt.getText());
        }else{
             LNick.setText(respuesta3);
             niK=respuesta3;
        }
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       Pass=Contraseñatxt.getText();
        String respuesta4 = JOptionPane.showInputDialog("Ingrese la nueva contraseña");
        
  if(respuesta4.isEmpty()){
    JOptionPane.showMessageDialog(null, "Campo vacío , intente nuevamente");  
   
       
   Pass=Contraseñatxt.getText();
  }else{
      LContra.setText(respuesta4);
      Pass=respuesta4;
  }
      
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          LNom.setText(Nombretxt.getText());
        LNick.setText(Nicktxt.getText());
        LEdad.setText(Edadtxt.getText());
        LContra.setText(Contraseñatxt.getText());
        
        ArriendoAutos aaa1 = new ArriendoAutos();
        aaa1.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Nombretxt.setText(Nomnew);
        Nicktxt.setText(niK);
        Edadtxt.setText(Años);
       Contraseñatxt.setText(Pass);
        
        ArriendoAutos aca1 = new ArriendoAutos();
        aca1.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        LNom.setText(Nombretxt.getText());
        LNick.setText(Nicktxt.getText());
        LEdad.setText(Edadtxt.getText());
        LContra.setText(Contraseñatxt.getText());
        
        ArriendoAutos aca1 = new ArriendoAutos();
        aca1.setVisible(true);
         dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LContra;
    private javax.swing.JLabel LEdad;
    private javax.swing.JLabel LNick;
    private javax.swing.JLabel LNom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
