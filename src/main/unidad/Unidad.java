package unidad;

import ruta.Ruta;

public class Unidad {

    private int idUnidad;
    private String placa;
    private String modelo;
    private int capacidad;
    private String estado;
    private int idRuta;

    public Unidad(int idUnidad, String placa, String modelo, int capacidad) {
        this.idUnidad = idUnidad;
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.estado = "DISPONIBLE";
    }

    public void asignarRuta(Ruta ruta) {
        this.idRuta = ruta.getIdRuta();
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public boolean estaDisponible() {
        return "DISPONIBLE".equals(estado);
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
}
