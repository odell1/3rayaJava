// Excepción unchecked personalizada para movimientos fuera de los límites del tablero
public class MovimientoFueraDeLimitesException extends RuntimeException {
    public MovimientoFueraDeLimitesException(String mensaje) {
        super(mensaje);
    }
}
