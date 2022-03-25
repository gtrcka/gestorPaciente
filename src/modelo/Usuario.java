
package modelo;

public class Usuario extends Profesional {
    private int idUsuario;
    private String nombreUsuario;
    private String contraseña;
    private int idTipoUsuario;

    public Usuario(String nombreUsuario, String contraseña, int idTipoUsuario, String profesion, int matricula, String especialidad, String nombre, String apellido, int edad, String dni) {
        super(profesion, especialidad, matricula, nombre, apellido, edad, dni);
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.idTipoUsuario = idTipoUsuario;
    }

    public Usuario() {
        super();
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.idTipoUsuario = idTipoUsuario;
    }
    
       

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }
    
    
          
}
