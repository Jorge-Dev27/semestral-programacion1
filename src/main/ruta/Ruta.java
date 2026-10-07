package ruta;

import java.util.ArrayList;
import java.util.List;

public class Ruta {

    private int idRuta;
    private String nombre;
    private String origen;
    private String destino;
    private double tarifa;
    private boolean activa;
    private List<Parada> paradas = new ArrayList<>();
    private List<Horario> horarios = new ArrayList<>();

    public Ruta(int idRuta, String nombre, String origen, String destino, double tarifa) {
        this.idRuta = idRuta;
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.tarifa = tarifa;
        this.activa = true;
    }

    public void agregarParada(Parada parada) {
        paradas.add(parada);
    }

    public void agregarHorario(Horario horario) {
        horarios.add(horario);
    }

    public List<Parada> obtenerParadas() {
        return paradas;
    }

    public void cambiarEstado(boolean activa) {
        this.activa = activa;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }
}
