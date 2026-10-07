package usuario;

import java.util.List;

import boleto.Boleto;
import ruta.Horario;
import ruta.Ruta;

public class Pasajero extends Usuario {

    private String cedula;
    private String telefono;
    private double saldo;

    public Pasajero(int idUsuario, String nombre, String correo, String contrasena,
                    String cedula, String telefono, double saldo) {
        super(idUsuario, nombre, correo, contrasena, "pasajero");
        this.cedula = cedula;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public Boleto comprarBoleto(Horario horario) {
        return null;
    }

    public void recargarSaldo(double monto) {
        this.saldo += monto;
    }

    public List<Ruta> consultarRutas() {
        return null;
    }

    @Override
    public void mostrarMenu() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
