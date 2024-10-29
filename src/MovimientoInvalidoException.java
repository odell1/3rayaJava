// Excepción checked personalizada para movimientos inválidos
public class MovimientoInvalidoException extends Exception {
    public MovimientoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
