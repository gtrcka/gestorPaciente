
package modelo;

import java.sql.Date;

public class Paciente extends Persona {
    private int idPaciente;

    public Paciente() {
    }

    public Paciente( String nombre, String apellido, int edad, String dni) {
        super(nombre, apellido, edad, dni);
    } 

    public Paciente(String nombre, String apellido, String dni, int edad, Date fechaNacimiento, String domicilio, String celular, String correo) {
        super(nombre, apellido, edad, dni, fechaNacimiento, domicilio, celular, correo);
    }
    
    

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
}
