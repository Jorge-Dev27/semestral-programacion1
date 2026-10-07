package incidencia;

import java.time.LocalDateTime;

public class Incidencia {

    private int idIncidencia;
    private LocalDateTime fecha;
    private String tipo;
    private String descripcion;
    private String estado;
    private int idUnidad;
    private int idConductor;

    public Incidencia(int idIncidencia, String tipo, String descripcion,
                      int idUnidad, int idConductor) {
        this.idIncidencia = idIncidencia;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.idUnidad = idUnidad;
        this.idConductor = idConductor;
        this.fecha = LocalDateTime.now();
        this.estado = "ABIERTA";
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public void cerrar() {
        this.estado = "CERRADA";
    }

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }
}
