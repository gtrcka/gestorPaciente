
package GestorPaciente;

import controlador.Controlador;
import modelo.SQLModelo;
import modelo.Usuario;
import vista.VentanaInicio;

public class main {
    public static void main(String[]args){
        VentanaInicio vi = new VentanaInicio();
        Usuario user = new Usuario();
        SQLModelo modelo = new SQLModelo();
        Controlador controlador = new Controlador(vi, user, modelo);
        
        controlador.iniciar();
        vi.setVisible(true);
        
    }
}
