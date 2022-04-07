package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.CifrarContraseña;
import modelo.SQLModelo;
import modelo.Usuario;
import vista.VentanaInicio;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener {

    private final VentanaInicio vi;
    private final Usuario user;
    private final SQLModelo modelo;
    private String usuario = "UNKNOWN";
    private String contraseña = "UNKNOWN";

    public Controlador(VentanaInicio vi, Usuario user, SQLModelo modelo) {
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
            if (!vi.cajaUsuario.getText().equals("") || vi.cajaContraseña.getPassword().equals("")) {
                contraseña = new String(vi.cajaContraseña.getPassword());
                usuario = vi.cajaUsuario.getText();
            }

            if (usuario.equals("UNKNOWN")  || contraseña.equals("UNKNOWN") ) {
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
