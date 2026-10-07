import java.time.LocalTime;

import boleto.Boleto;
import ruta.Horario;
import ruta.Parada;
import ruta.Ruta;
import unidad.Unidad;
import usuario.Conductor;
import utils.Validador;

public class PruebasSistema {

    private static int fallos = 0;

    public static void main(String[] args) {
        probarCompraYValidacionBoleto();
        probarRutaConParadas();
        probarAsignacionUnidad();
        probarValidador();
        System.out.println(fallos == 0 ? "TODAS LAS PRUEBAS PASARON" : fallos + " PRUEBA(S) FALLARON");
    }

    private static void comprobar(String nombre, boolean condicion) {
        System.out.println((condicion ? "[OK]    " : "[FALLO] ") + nombre);
        if (!condicion) {
            fallos++;
        }
    }

    private static void probarCompraYValidacionBoleto() {
        Horario horario = new Horario(1, LocalTime.of(6, 0), LocalTime.of(7, 0), "LUNES", 1);
        Boleto boleto = new Boleto(1, 1.25, horario.getIdHorario(), 10);
        Conductor conductor = new Conductor(2, "Ana", "ana@utp.ac.pa", "1234", "L-001", "A");

        comprobar("Boleto vigente al crearse", boleto.estaVigente());
        comprobar("Conductor valida boleto vigente", conductor.validarBoleto(boleto));
        boleto.anular();
        comprobar("Boleto anulado ya no esta vigente", !boleto.estaVigente());
        comprobar("Conductor rechaza boleto anulado", !conductor.validarBoleto(boleto));
    }

    private static void probarRutaConParadas() {
        Ruta ruta = new Ruta(1, "Via Espana", "Tocumen", "San Miguelito", 0.35);
        ruta.agregarParada(new Parada(1, "Tocumen", "Tocumen", 1, 1));
        ruta.agregarParada(new Parada(2, "Los Andes", "Los Andes", 2, 1));

        comprobar("Ruta registra paradas", ruta.obtenerParadas().size() == 2);
        ruta.cambiarEstado(false);
        comprobar("Ruta cambia de estado", !ruta.isActiva());
    }

    private static void probarAsignacionUnidad() {
        Ruta ruta = new Ruta(1, "Via Brasil", "Mercado", "Costa del Este", 0.25);
        Unidad unidad = new Unidad(1, "PB-1234", "Toyota Coaster", 30);

        comprobar("Unidad disponible al crearse", unidad.estaDisponible());
        unidad.asignarRuta(ruta);
        comprobar("Unidad queda asociada a la ruta", unidad.getIdRuta() == ruta.getIdRuta());
        unidad.cambiarEstado("EN_SERVICIO");
        comprobar("Unidad fuera de servicio no esta disponible", !unidad.estaDisponible());
    }

    private static void probarValidador() {
        comprobar("Correo valido", Validador.correoValido("user@utp.ac.pa"));
        comprobar("Correo invalido", !Validador.correoValido("usuario"));
        comprobar("Texto no vacio", Validador.textoNoVacio("Hola"));
    }
}
