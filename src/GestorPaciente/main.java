
package GestorPaciente;

import controlador.Controlador;
import modelo.SQLUsuario;
import modelo.Usuario;
import vista.VentanaInicio;

public class main {
    public static void main(String[]args){
        VentanaInicio vi = new VentanaInicio();
        Usuario user = new Usuario();
        SQLUsuario modelo = new SQLUsuario();
        Controlador controlador = new Controlador(vi, user, modelo);
        
        controlador.iniciar();
        vi.setVisible(true);
        
    }
}
