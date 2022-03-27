package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.CifrarContraseña;
import modelo.Paciente;
import modelo.Profesional;
import modelo.SQLUsuario;
import modelo.Usuario;
import vista.VentanaInicio;
import vista.VentanaPrincipal;
import vista.VentanaRegistrarse;

public class Controlador implements ActionListener {

    private VentanaInicio vi;
    private Usuario user;
    private SQLUsuario modelo;

    public Controlador(VentanaInicio vi, Usuario user, SQLUsuario modelo) {
        this.vi = vi;
        this.user = user;
        this.modelo = modelo;
        vi.btnAcceder.addActionListener(this);
    }

    public void iniciar() {
        vi.setTitle("Bienvenido al sistema GestorPaciente");
        vi.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vi.btnAcceder) {

            String contraseña = new String(vi.cajaContraseña.getPassword());

            if (vi.cajaUsuario.getText().equals("") || contraseña.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe completar ambos campos");
            } else {
                String nuevaContraseña = CifrarContraseña.md5(contraseña);
                user.setNombreUsuario(vi.cajaUsuario.getText());
                user.setContraseña(nuevaContraseña);

                if (modelo.iniciarSesion(user)) {
                    this.vi.dispose();
                    VentanaPrincipal vp = new VentanaPrincipal();
                    vp.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario y contraseña no coinciden");
                }
            }
        }
    }
}
