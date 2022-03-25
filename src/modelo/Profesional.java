
package modelo;

public class Profesional extends Persona {
    private int idProfesional;
    private String profesion;
    private String especialidad;
    private int matricula;

    public Profesional(String profesion, String especialidad,int matricula, String nombre, String apellido, int edad, String dni) {
        super(nombre, apellido, edad, dni);
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.matricula = matricula;
    }    

    public Profesional() {
        super();
        this.idProfesional = idProfesional;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.matricula = matricula;
    }
    
    

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }  

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }   
}
