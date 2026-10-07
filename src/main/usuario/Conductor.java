package usuario;

import java.util.List;

import boleto.Boleto;
import incidencia.Incidencia;
import turno.Turno;

public class Conductor extends Usuario {

    private String numeroLicencia;
    private String tipoLicencia;
    private boolean disponible;

    public Conductor(int idUsuario, String nombre, String correo, String contrasena,
                     String numeroLicencia, String tipoLicencia) {
        super(idUsuario, nombre, correo, contrasena, "conductor");
        this.numeroLicencia = numeroLicencia;
        this.tipoLicencia = tipoLicencia;
        this.disponible = true;
    }

    public boolean validarBoleto(Boleto boleto) {
        return boleto != null && boleto.estaVigente();
    }

    public Incidencia registrarIncidencia(String tipo, String descripcion) {
        return null;
    }

    public List<Turno> consultarTurnos() {
        return null;
    }

    @Override
    public void mostrarMenu() {
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
