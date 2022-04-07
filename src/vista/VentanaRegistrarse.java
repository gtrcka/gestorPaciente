package vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.CifrarContraseña;
import modelo.Conexion;
import modelo.SQLModelo;
import modelo.Usuario;
import static vista.VentanaInicio.diseño;

public class VentanaRegistrarse extends javax.swing.JFrame {

    public VentanaRegistrarse() {
        diseño();
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistroUsuario = new javax.swing.JPanel();
        eRegistroUsuario = new javax.swing.JLabel();
        eUserRegister = new javax.swing.JLabel();
        eUserRegister1 = new javax.swing.JLabel();
        eUsuario = new javax.swing.JLabel();
        eContraseña = new javax.swing.JLabel();
        eNombre = new javax.swing.JLabel();
        eApellido = new javax.swing.JLabel();
        eEdad = new javax.swing.JLabel();
        eProfesion = new javax.swing.JLabel();
        eEspecialidad = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaApellido = new javax.swing.JTextField();
        cajaEdad = new javax.swing.JTextField();
        cajaProfesion = new javax.swing.JTextField();
        cajaEspecialidad = new javax.swing.JTextField();
        cajaContraseña = new javax.swing.JPasswordField();
        eDni = new javax.swing.JLabel();
        cajaDni = new javax.swing.JTextField();
        eConfirmarContraseña = new javax.swing.JLabel();
        cajaConfirmarContraseña = new javax.swing.JPasswordField();
        btnRegistrarse = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        eMatricula = new javax.swing.JLabel();
        cajaMatricula = new javax.swing.JTextField();
        cajaCorreo = new javax.swing.JTextField();
        eCorreo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eRegistroUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eRegistroUsuario.setText("Registro de Usuario");

        eUserRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userRegister.png"))); // NOI18N

        eUserRegister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userRegister1.png"))); // NOI18N

        eUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eUsuario.setText("Usuario:");

        eContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eContraseña.setText("Contraseña:");

        eNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNombre.setText("Nombre:");

        eApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eApellido.setText("Apellido:");

        eEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eEdad.setText("Edad:");

        eProfesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eProfesion.setText("Profesión:");

        eEspecialidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eEspecialidad.setText("Especialidad:");

        eDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eDni.setText("DNI:");

        eConfirmarContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eConfirmarContraseña.setText("<html>Confirmar Contraseña:</html>");

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        eMatricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eMatricula.setText("Matricula:");

        eCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eCorreo.setText("Correo:");

        javax.swing.GroupLayout panelRegistroUsuarioLayout = new javax.swing.GroupLayout(panelRegistroUsuario);
        panelRegistroUsuario.setLayout(panelRegistroUsuarioLayout);
        panelRegistroUsuarioLayout.setHorizontalGroup(
            panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(eRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                        .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(eNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                        .addComponent(eApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(eEdad)
                                    .addComponent(eUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eDni, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cajaConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cajaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cajaDni, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroUsuarioLayout.createSequentialGroup()
                                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eMatricula)
                                    .addComponent(btnVolver)
                                    .addComponent(eProfesion)
                                    .addComponent(eEspecialidad)
                                    .addComponent(eCorreo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cajaEspecialidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cajaProfesion, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cajaMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(cajaCorreo)))))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eUserRegister1)
                            .addComponent(eUserRegister))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegistroUsuarioLayout.setVerticalGroup(
            panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(eRegistroUsuario)
                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(eUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eContraseña)
                        .addGap(13, 13, 13)
                        .addComponent(eConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eNombre)
                        .addGap(15, 15, 15)
                        .addComponent(eApellido)
                        .addGap(15, 15, 15)
                        .addComponent(eDni)
                        .addGap(18, 18, 18)
                        .addComponent(eEdad))
                    .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cajaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cajaConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eUserRegister1)
                        .addGap(5, 5, 5)
                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eUserRegister)
                            .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                                .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cajaDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eMatricula)
                                    .addComponent(cajaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                                        .addComponent(eProfesion)
                                        .addGap(14, 14, 14)
                                        .addComponent(eEspecialidad))
                                    .addGroup(panelRegistroUsuarioLayout.createSequentialGroup()
                                        .addComponent(cajaProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnRegistrarse)
                .addGap(21, 21, 21)
                .addComponent(btnVolver)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiarCajas() {
        cajaApellido.setText("");
        cajaConfirmarContraseña.setText("");
        cajaContraseña.setText("");
        cajaCorreo.setText("");
        cajaDni.setText("");
        cajaEdad.setText("");
        cajaEspecialidad.setText("");
        cajaMatricula.setText("");
        cajaNombre.setText("");
        cajaProfesion.setText("");
        cajaUsuario.setText("");
    }
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        if (!cajaEdad.getText().equals("") || !cajaMatricula.getText().equals("")) {
            int edad = Integer.parseInt(cajaEdad.getText());
            int matricula = Integer.parseInt(cajaMatricula.getText());
            String contraseña = new String(cajaContraseña.getPassword());
            String confirmarContraseña = new String(cajaConfirmarContraseña.getPassword());
            Conexion con = new Conexion();
            SQLModelo sqlUsuario = new SQLModelo();
            Usuario usuario = null;

            if (cajaUsuario.getText().equals("") || contraseña.equals("") || cajaProfesion.getText().equals("") || cajaEspecialidad.getText().equals("") || cajaNombre.getText().equals("") || cajaApellido.getText().equals("") || cajaDni.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falta completar uno o más campos.");
            } else {
                if (contraseña.equals(confirmarContraseña)) {
                    if (sqlUsuario.verificarUsuario(cajaUsuario.getText()) == 0) {
                        if (sqlUsuario.comprobarCorreo(cajaCorreo.getText())) {
                            String nuevaContraseña = CifrarContraseña.md5(contraseña);
                            usuario = new Usuario(cajaUsuario.getText(), nuevaContraseña, 1, cajaProfesion.getText(), matricula, cajaEspecialidad.getText(), cajaNombre.getText(), cajaApellido.getText(), edad, cajaDni.getText());
                            if (sqlUsuario.registrar(usuario)) {
                                limpiarCajas();
                                dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al registrar usuario.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El e-mail ingresado es incorrecto");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese nombre");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falta completar uno o más campos.");
        }

    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarse().setVisible(true);
            }
        });       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarse;
    public javax.swing.JButton btnVolver;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JPasswordField cajaConfirmarContraseña;
    private javax.swing.JPasswordField cajaContraseña;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaDni;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaEspecialidad;
    private javax.swing.JTextField cajaMatricula;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaProfesion;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel eApellido;
    private javax.swing.JLabel eConfirmarContraseña;
    private javax.swing.JLabel eContraseña;
    private javax.swing.JLabel eCorreo;
    private javax.swing.JLabel eDni;
    private javax.swing.JLabel eEdad;
    private javax.swing.JLabel eEspecialidad;
    private javax.swing.JLabel eMatricula;
    private javax.swing.JLabel eNombre;
    private javax.swing.JLabel eProfesion;
    private javax.swing.JLabel eRegistroUsuario;
    private javax.swing.JLabel eUserRegister;
    private javax.swing.JLabel eUserRegister1;
    private javax.swing.JLabel eUsuario;
    private javax.swing.JPanel panelRegistroUsuario;
    // End of variables declaration//GEN-END:variables
}
