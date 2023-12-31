/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PresentationLayer.Usuario;

import BusinessLayer.AuxiliarAcademicoBO;
import BusinessLayer.UsuarioBO;
import javax.swing.JOptionPane;
import DataTransferObject.Usuario;
import PresentationLayer.AuxiliarAcademico.Pantalla_principal_auxiliar_academico;
import PresentationLayer.DirectorAcademico.PantallaPrincipal;
import PresentationLayer.Docente.Pantalla_principal_docente;
import PresentationLayer.Estudiante.Pantalla_principal_estudiante;
import Utilities.BCRYPT.BCryptManagement;
import BusinessLayer.DirectorAcademicoBO;
import BusinessLayer.DocenteBO;
import BusinessLayer.EstudianteBO;
import DataTransferObject.AuxiliarAcademico;
import DataTransferObject.DirectorAcademico;
import DataTransferObject.Docente;
import Utilities.Validator.ValidatorUsuario;
import java.awt.event.KeyEvent;
import java.util.Date;

public class Inicio_de_Sesion extends javax.swing.JFrame {

    public Inicio_de_Sesion() {
        initComponents();
        
        /*try{
            new DirectorAcademicoBO().insertar(new DirectorAcademico(0,"71727172","Marcelo","Gonzalez","Paco",new Date(),"918271829","Hombre",String.valueOf(6),"Doctor"));
            new UsuarioBO().insertar(new Usuario(0,"71727172","mgonzalespaco@gmail.com","12312sadSDA__@@",String.valueOf(1)));
        }
        catch(Exception e){
            e.printStackTrace();
        }*/
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtCorreoElectronico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jpContrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Inicio de Sesion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 9, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/imagen_2022-09-02_131314277.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Colegio_mayor_coar_logo (1) (3).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Colegio de Alto Rendimiento");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Correo Electronico");

        jtxtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCorreoElectronicoActionPerformed(evt);
            }
        });
        jtxtCorreoElectronico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCorreoElectronicoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setMnemonic('i');
        jButton1.setText("Iniciar Sesion");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("¿Olvidó la contraseña?");

        jpContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpContraseniaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jtxtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(86, 86, 86))
                            .addComponent(jpContrasenia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(104, 104, 104))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addComponent(jtxtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addComponent(jpContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

    private void jtxtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCorreoElectronicoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            UsuarioBO usuarioBO = new UsuarioBO();
        
            if(this.jtxtCorreoElectronico.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Error, ingrese el Correo Electrónico del Usuario");
            }
            else if(!ValidatorUsuario.isEmail(this.jtxtCorreoElectronico.getText())){
                JOptionPane.showMessageDialog(null, "Error, el Correo Electrónico ingresado no posee el formado adecuado");
            }
            else if(this.jpContrasenia.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Error, ingrese la Contraseña del Usuario");
            }
            else if(!ValidatorUsuario.isPassword(this.jpContrasenia.getText())){
                JOptionPane.showMessageDialog(null, "Error, la Contraseña ingresada no posee el formato adecuado");
            }
            else{
                Usuario usuario = usuarioBO.inicioDeSesion(this.jtxtCorreoElectronico.getText());
                if(usuario!=null){
                    if(BCryptManagement.verificarContrasenia(this.jpContrasenia.getText(), usuario.getContraseniaSV())){
                        switch(usuario.getRol()){
                            case 1:
                                DirectorAcademicoBO directorAcademicoBO = new DirectorAcademicoBO();
                                PantallaPrincipal ventana = new PantallaPrincipal();
                                ventana.setNombreCompleto(directorAcademicoBO.buscar_nombre_completo());
                                ventana.setCorreoElectronico(usuario.getCorreoElectronico());
                                ventana.setVisible(true);
                                this.dispose();
                                break;
                            case 2:
                                AuxiliarAcademicoBO auxiliarAcademicoBO = new AuxiliarAcademicoBO();
                                AuxiliarAcademico auxiliarAcademico = auxiliarAcademicoBO.buscarPorDNI(usuario.getDni());
                                Pantalla_principal_auxiliar_academico ventana2 = new Pantalla_principal_auxiliar_academico();
                                ventana2.setNombreCompleto(auxiliarAcademico.getNombreCompleto());
                                ventana2.setCorreoElectronico(usuario.getCorreoElectronico());
                                ventana2.setDni(usuario.getDni());
                                ventana2.setVisible(true);
                                this.dispose();
                                break;
                            case 3:
                                DocenteBO docenteBO = new DocenteBO();
                                Docente docente = docenteBO.buscarPorDNI(usuario.getDni());
                                Pantalla_principal_docente ventana3 = new Pantalla_principal_docente();
                                ventana3.setNombreCompleto(docente.getNombreCompleto());
                                ventana3.setCorreoElectronico(usuario.getCorreoElectronico());
                                ventana3.setDni(usuario.getDni());
                                ventana3.setVisible(true);
                                this.dispose();
                                break;
                            case 4:
                                EstudianteBO estudianteBO = new EstudianteBO();
                                Pantalla_principal_estudiante ventana4 = new Pantalla_principal_estudiante();
                                ventana4.setDni(usuario.getDni());
                                ventana4.setNombreCompleto(estudianteBO.buscar_por_dni(usuario.getDni()).getNombreCompleto());
                                ventana4.setCorreoElectronico(usuario.getCorreoElectronico());
                                ventana4.setVisible(true);
                                this.dispose();
                                break;
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error, el usuario ingresado no existe");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error, el usuario ingresado no existe");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void jtxtCorreoElectronicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCorreoElectronicoKeyTyped
        if(this.jtxtCorreoElectronico.getText().length()==100) evt.consume();
    }//GEN-LAST:event_jtxtCorreoElectronicoKeyTyped

    private void jpContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpContraseniaKeyTyped
        if(this.jpContrasenia.getPassword().length==50) evt.consume();
    }//GEN-LAST:event_jpContraseniaKeyTyped

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
  
    }//GEN-LAST:event_jPanel1KeyTyped

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
            java.util.logging.Logger.getLogger(Inicio_de_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_de_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_de_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpContrasenia;
    private javax.swing.JTextField jtxtCorreoElectronico;
    // End of variables declaration//GEN-END:variables
}
