package turno;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {

    private int idTurno;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private int idRuta;
    private int idConductor;
    private int idUnidad;

    public Turno(int idTurno, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin,
                 int idRuta, int idConductor, int idUnidad) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.idRuta = idRuta;
        this.idConductor = idConductor;
        this.idUnidad = idUnidad;
    }

    public double calcularHoras() {
        return Duration.between(horaInicio, horaFin).toMinutes() / 60.0;
    }

    public void finalizar() {
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }
}
