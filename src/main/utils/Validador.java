package utils;

public final class Validador {

    private Validador() {
    }

    public static boolean correoValido(String correo) {
        return correo != null && correo.contains("@");
    }

    public static boolean textoNoVacio(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
}
