/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;

import CLASES.Usuario;
import java.awt.Color;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;

/**
 *
 * @author termi
 */
public class Login extends javax.swing.JFrame {

  /**
   * Creates new form Login
   */
  public Login() {
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

    jPanel1 = new javax.swing.JPanel();
    TXTpassword = new javax.swing.JPasswordField();
    jSeparator2 = new javax.swing.JSeparator();
    TXTusuario = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    BTNingresar = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    BTNregistrar = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setAlwaysOnTop(true);
    setBackground(new java.awt.Color(255, 255, 255));
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setForeground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    TXTpassword.setBackground(new java.awt.Color(153, 255, 204));
    TXTpassword.setFont(TXTpassword.getFont().deriveFont((TXTpassword.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD));
    TXTpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    TXTpassword.setText("********");
    TXTpassword.setBorder(null);
    TXTpassword.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        TXTpasswordMouseClicked(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        TXTpasswordMousePressed(evt);
      }
    });
    TXTpassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TXTpasswordActionPerformed(evt);
      }
    });
    jPanel1.add(TXTpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 280, 250, 40));

    jSeparator2.setBackground(new java.awt.Color(51, 0, 255));
    jSeparator2.setForeground(new java.awt.Color(51, 255, 51));
    jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 230, 10));

    TXTusuario.setBackground(new java.awt.Color(153, 255, 204));
    TXTusuario.setForeground(new java.awt.Color(153, 153, 153));
    TXTusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    TXTusuario.setText("Ingrese su Usuario");
    TXTusuario.setBorder(null);
    TXTusuario.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        TXTusuarioMouseClicked(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        TXTusuarioMousePressed(evt);
      }
    });
    TXTusuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TXTusuarioActionPerformed(evt);
      }
    });
    jPanel1.add(TXTusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 250, 40));

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_eye_60px.png"))); // NOI18N
    jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabel4MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        jLabel4MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        jLabel4MouseExited(evt);
      }
    });
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 60, 40));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_user_60px_1.png"))); // NOI18N
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_key_50px_2.png"))); // NOI18N
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 50, -1));

    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8_user_150px_9.png"))); // NOI18N
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

    BTNingresar.setBackground(new java.awt.Color(102, 255, 102));
    BTNingresar.setText("Ingresar");
    BTNingresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BTNingresarActionPerformed(evt);
      }
    });
    jPanel1.add(BTNingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 80, 30));

    jButton3.setBackground(new java.awt.Color(102, 255, 204));
    jButton3.setText("SALIR");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 80, 30));

    BTNregistrar.setBackground(new java.awt.Color(102, 255, 204));
    BTNregistrar.setText("CREAR");
    BTNregistrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BTNregistrarActionPerformed(evt);
      }
    });
    jPanel1.add(BTNregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 80, 30));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/WhatsApp Image 2022-06-25 at 6.39.58 PM.jpeg"))); // NOI18N
    jLabel5.setText("jLabel5");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 460, 570));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 390));

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void TXTusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTusuarioActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_TXTusuarioActionPerformed

    private void TXTusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTusuarioMouseClicked

      TXTusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(NORMAL));
      TXTpassword.setBorder(null);
    }//GEN-LAST:event_TXTusuarioMouseClicked

    private void TXTusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTusuarioMousePressed

      if (TXTusuario.getText().equals("Ingrese su Usuario")) {
        TXTusuario.setText("");
        TXTusuario.setForeground(Color.black);
      }

      if (String.valueOf(TXTpassword.getPassword()).isEmpty()) {
        TXTpassword.setText("********");
        TXTpassword.setForeground(Color.gray);

      }


    }//GEN-LAST:event_TXTusuarioMousePressed

    private void TXTpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTpasswordMousePressed

      if (String.valueOf(TXTpassword.getPassword()).equals("********")) {
        TXTpassword.setText("");
        TXTpassword.setForeground(Color.black);
      }

      if (TXTusuario.getText().isEmpty()) {
        TXTusuario.setText("Ingrese su Usuario");
        TXTusuario.setForeground(Color.gray);

      }

    }//GEN-LAST:event_TXTpasswordMousePressed

    private void TXTpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTpasswordMouseClicked

      TXTpassword.setBorder(javax.swing.BorderFactory.createBevelBorder(NORMAL));

      TXTusuario.setBorder(null);


    }//GEN-LAST:event_TXTpasswordMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

      TXTpassword.setEchoChar((char) 0);


    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited

      TXTpassword.setEchoChar('*');


    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered


    }//GEN-LAST:event_jLabel4MouseEntered

    private void BTNregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregistrarActionPerformed

      frmCrearUsuario FRM = new frmCrearUsuario();
      FRM.setVisible(true);
      dispose();
      // aqui mike


    }//GEN-LAST:event_BTNregistrarActionPerformed

    private void BTNingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNingresarActionPerformed
      Usuario obj_Usuario = new Usuario();
      util obj_encript = new util();
      String valorPass = new String(TXTpassword.getPassword());
      String pssCifred = obj_encript.cifrar(String.valueOf(valorPass));

      boolean userCheck = obj_Usuario.LoginCheck(TXTusuario.getText(), pssCifred);
      if (userCheck == true) {
        frmPRINCIPAL obj_Principal = new frmPRINCIPAL();
        JOptionPane.showMessageDialog(this, "Inicio de sesión satisfactorio.");
        obj_Principal.setLblName(obj_Usuario.changeNamelbl(TXTusuario.getText()));
        obj_Principal.setVisible(true);
        this.dispose();
      } else {
        JOptionPane.showMessageDialog(this, "Error de validacion\n Usuario u contraseña incorrectos.",
      "Aviso!", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_BTNingresarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TXTpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTpasswordActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_TXTpasswordActionPerformed

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
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Login().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BTNingresar;
  private javax.swing.JButton BTNregistrar;
  private javax.swing.JPasswordField TXTpassword;
  private javax.swing.JTextField TXTusuario;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator2;
  // End of variables declaration//GEN-END:variables
}
