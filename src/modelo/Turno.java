
package modelo;

import java.sql.Time;
import java.util.Date;

public class Turno {
    private int idTurno;
    private Date fechaTurno;
    private Time horaTurno;
    private int idPaciente;

    public Turno() {
    }

    public Turno(Date fechaTurno, Time horaTurno, int idPaciente) {
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.idPaciente = idPaciente;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Time getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(Time horaTurno) {
        this.horaTurno = horaTurno;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
        
    
}
