// Excepción unchecked personalizada para celdas ocupadas
public class CeldaOcupadaException extends RuntimeException {
    public CeldaOcupadaException(String mensaje) {
        super(mensaje);
    }
}
