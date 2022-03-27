
package modelo;

import java.sql.Date;

public class HistoriaClinica {
    private int idHistoriaClinica;
    private Date fechaRegistro;
    private String registro;
    private String medicacion;
    private int idPaciente;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Date fechaRegistro, String registro, String medicacion, int idPaciente) {
        this.fechaRegistro = fechaRegistro;
        this.registro = registro;
        this.medicacion = medicacion;
        this.idPaciente = idPaciente;
    }

    public int getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(int idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    } 

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
}
