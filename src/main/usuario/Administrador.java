package usuario;

import java.time.LocalDate;

import reporte.Reporte;
import ruta.Ruta;
import turno.Turno;
import unidad.Unidad;

public class Administrador extends Usuario {

    private String cargo;

    public Administrador(int idUsuario, String nombre, String correo, String contrasena, String cargo) {
        super(idUsuario, nombre, correo, contrasena, "administrador");
        this.cargo = cargo;
    }

    public void registrarRuta(Ruta ruta) {
    }

    public void asignarUnidad(Unidad unidad, Ruta ruta) {
        unidad.asignarRuta(ruta);
    }

    public Turno crearTurno(Conductor conductor, Unidad unidad, Ruta ruta, LocalDate fecha) {
        return null;
    }

    public Reporte generarReporte(String tipo) {
        return null;
    }

    @Override
    public void mostrarMenu() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
