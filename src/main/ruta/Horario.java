package ruta;

import java.time.Duration;
import java.time.LocalTime;

public class Horario {

    private int idHorario;
    private LocalTime horaSalida;
    private LocalTime horaLlegada;
    private String diasOperacion;
    private int idRuta;

    public Horario(int idHorario, LocalTime horaSalida, LocalTime horaLlegada,
                   String diasOperacion, int idRuta) {
        this.idHorario = idHorario;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.diasOperacion = diasOperacion;
        this.idRuta = idRuta;
    }

    public boolean estaDisponible(String dia) {
        return diasOperacion != null && diasOperacion.contains(dia);
    }

    public int calcularDuracion() {
        return (int) Duration.between(horaSalida, horaLlegada).toMinutes();
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getDiasOperacion() {
        return diasOperacion;
    }

    public void setDiasOperacion(String diasOperacion) {
        this.diasOperacion = diasOperacion;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
}
