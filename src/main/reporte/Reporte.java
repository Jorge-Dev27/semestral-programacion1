package reporte;

import java.time.LocalDate;

import ruta.Ruta;
import unidad.Unidad;

public class Reporte {

    private int idReporte;
    private String tipo;
    private LocalDate fechaGeneracion;
    private String contenido;
    private int idRuta;
    private int idUnidad;

    public Reporte(int idReporte, String tipo) {
        this.idReporte = idReporte;
        this.tipo = tipo;
        this.fechaGeneracion = LocalDate.now();
    }

    public void generarPorRuta(Ruta ruta) {
        this.idRuta = ruta.getIdRuta();
        this.contenido = "Reporte de la ruta " + ruta.getNombre();
    }

    public void generarPorUnidad(Unidad unidad) {
        this.idUnidad = unidad.getIdUnidad();
        this.contenido = "Reporte de la unidad " + unidad.getPlaca();
    }

    public String exportar() {
        return contenido;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }
}
