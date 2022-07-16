/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FORMULARIOS;

import CLASES.Usuario;
import CLASES.conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class frm_Login extends javax.swing.JFrame {

    private conexion Conn = new conexion();
    private Usuario obj_Usuario = new Usuario();

    public frm_Login() {
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
        txt_password = new javax.swing.JPasswordField();
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

        txt_password.setBackground(new java.awt.Color(153, 255, 204));
        txt_password.setFont(txt_password.getFont().deriveFont((txt_password.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setText("********");
        txt_password.setBorder(null);
        txt_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passwordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passwordMousePressed(evt);
            }
        });
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 280, 250, 40));

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
        jPanel1.add(BTNingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, 30));

        jButton3.setBackground(new java.awt.Color(102, 255, 204));
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 80, 30));

        BTNregistrar.setBackground(new java.awt.Color(102, 255, 204));
        BTNregistrar.setText("+Crear");
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
        txt_password.setBorder(null);
    }//GEN-LAST:event_TXTusuarioMouseClicked

    private void TXTusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTusuarioMousePressed

        if (TXTusuario.getText().equals("Ingrese su Usuario")) {
            TXTusuario.setText("");
            TXTusuario.setForeground(Color.black);
        }

        if (String.valueOf(txt_password.getPassword()).isEmpty()) {
            txt_password.setText("********");
            txt_password.setForeground(Color.gray);

        }


    }//GEN-LAST:event_TXTusuarioMousePressed

    private void txt_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMousePressed

        if (String.valueOf(txt_password.getPassword()).equals("********")) {
            txt_password.setText("");
            txt_password.setForeground(Color.black);
        }

        if (TXTusuario.getText().isEmpty()) {
            TXTusuario.setText("Ingrese su Usuario");
            TXTusuario.setForeground(Color.gray);

        }

    }//GEN-LAST:event_txt_passwordMousePressed

    private void txt_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passwordMouseClicked

        txt_password.setBorder(javax.swing.BorderFactory.createBevelBorder(NORMAL));

        TXTusuario.setBorder(null);


    }//GEN-LAST:event_txt_passwordMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        txt_password.setEchoChar((char) 0);


    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited

        txt_password.setEchoChar('*');


    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered


    }//GEN-LAST:event_jLabel4MouseEntered

    private void BTNregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregistrarActionPerformed
        frm_GestionarEmpleado obj_GestU = new frm_GestionarEmpleado();
        obj_GestU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNregistrarActionPerformed

    private void BTNingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNingresarActionPerformed

        util obj_encript = new util();
        String valorPass = new String(txt_password.getPassword());
        String pssCifred = obj_encript.cifrar(String.valueOf(valorPass));
        boolean userCheck = obj_Usuario.db_LoginCheck(TXTusuario.getText(), pssCifred);
        if (userCheck == true) {
            frm_Principal obj_Principal = new frm_Principal();
            JOptionPane.showMessageDialog(this, "Inicio de sesión satisfactorio.");
            String nombreUser = obj_Usuario.changeNamelbl(TXTusuario.getText());
            obj_Usuario.setCurrentUser(nombreUser);
            obj_Principal.setLblName(obj_Usuario.getCurrentUser());
            obj_Principal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error de validacion\n Usuario ucontraseña incorrectos.", "Aviso!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BTNingresarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNingresar;
    private javax.swing.JButton BTNregistrar;
    private javax.swing.JTextField TXTusuario;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
