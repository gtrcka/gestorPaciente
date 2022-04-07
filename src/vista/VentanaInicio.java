/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.CifrarContraseña;
import modelo.SQLModelo;
import modelo.Usuario;

/**
 *
 * @author gabi_
 */
public class VentanaInicio extends javax.swing.JFrame {
    public static void diseño(){
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaRegistrarse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaRegistrarse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaRegistrarse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaRegistrarse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public VentanaInicio() {
        diseño();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVentanaInicio = new javax.swing.JPanel();
        eTituloInicioSesion = new javax.swing.JLabel();
        eImagenInicioSesion = new javax.swing.JLabel();
        eUsuario = new javax.swing.JLabel();
        eContraseña = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        eRegistrarse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eTituloInicioSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eTituloInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTituloInicioSesion.setText("Inicio de Sesión");

        eImagenInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicioSesion.png"))); // NOI18N

        eUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eUsuario.setText("Usuario: ");

        eContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eContraseña.setText("Contraseña: ");

        btnAcceder.setText("Acceder");

        eRegistrarse.setText("Registrase");
        eRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eRegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelVentanaInicioLayout = new javax.swing.GroupLayout(panelVentanaInicio);
        panelVentanaInicio.setLayout(panelVentanaInicioLayout);
        panelVentanaInicioLayout.setHorizontalGroup(
            panelVentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentanaInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelVentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eContraseña)
                    .addComponent(eUsuario))
                .addGap(38, 38, 38)
                .addGroup(panelVentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAcceder, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(cajaUsuario)
                    .addComponent(cajaContraseña))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentanaInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelVentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentanaInicioLayout.createSequentialGroup()
                        .addComponent(eTituloInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(eImagenInicioSesion)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentanaInicioLayout.createSequentialGroup()
                        .addComponent(eRegistrarse)
                        .addContainerGap())))
        );
        panelVentanaInicioLayout.setVerticalGroup(
            panelVentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentanaInicioLayout.createSequentialGroup()
                .addGroup(panelVentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentanaInicioLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(eTituloInicioSesion))
                    .addGroup(panelVentanaInicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eImagenInicioSesion)))
                .addGap(33, 33, 33)
                .addGroup(panelVentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eUsuario)
                    .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelVentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eContraseña)
                    .addComponent(cajaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAcceder)
                .addGap(18, 18, 18)
                .addComponent(eRegistrarse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eRegistrarseMouseClicked
        VentanaRegistrarse ventanaRegistrarse = new VentanaRegistrarse();
        ventanaRegistrarse.setVisible(true);
    }//GEN-LAST:event_eRegistrarseMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcceder;
    public javax.swing.JPasswordField cajaContraseña;
    public javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel eContraseña;
    private javax.swing.JLabel eImagenInicioSesion;
    private javax.swing.JLabel eRegistrarse;
    private javax.swing.JLabel eTituloInicioSesion;
    private javax.swing.JLabel eUsuario;
    private javax.swing.JPanel panelVentanaInicio;
    // End of variables declaration//GEN-END:variables
}
