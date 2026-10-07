package ruta;

public class Parada {

    private int idParada;
    private String nombre;
    private String ubicacion;
    private int orden;
    private int idRuta;

    public Parada(int idParada, String nombre, String ubicacion, int orden, int idRuta) {
        this.idParada = idParada;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.orden = orden;
        this.idRuta = idRuta;
    }

    public String mostrarInfo() {
        return nombre + " (" + ubicacion + ")";
    }

    public boolean esTerminal() {
        return false;
    }

    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
}
