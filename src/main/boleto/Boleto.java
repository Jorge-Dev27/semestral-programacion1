package boleto;

import java.time.LocalDateTime;
import java.util.UUID;

public class Boleto {

    private int idBoleto;
    private String codigo;
    private LocalDateTime fechaCompra;
    private double precio;
    private String estado;
    private int idHorario;
    private int idPasajero;

    public Boleto(int idBoleto, double precio, int idHorario, int idPasajero) {
        this.idBoleto = idBoleto;
        this.precio = precio;
        this.idHorario = idHorario;
        this.idPasajero = idPasajero;
        this.fechaCompra = LocalDateTime.now();
        this.codigo = generarCodigo();
        this.estado = "VIGENTE";
    }

    public boolean validar() {
        return estaVigente();
    }

    public void anular() {
        this.estado = "ANULADO";
    }

    public boolean estaVigente() {
        return "VIGENTE".equals(estado);
    }

    public String generarCodigo() {
        return UUID.randomUUID().toString();
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }
}
