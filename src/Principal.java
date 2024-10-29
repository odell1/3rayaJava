
/*
 *
ModeloTresEnRaya: Contiene la lógica del juego y el estado del tablero.
VistaTresEnRaya: Se encarga de mostrar el tablero y los mensajes al usuario.
ControladorTresEnRaya: Maneja la interacción entre el modelo y la vista.
MovimientoInvalidoException: Excepción checked para movimientos inválidos.
MovimientoFueraDeLimitesException: Excepción unchecked para movimientos fuera de los límites.
CeldaOcupadaException: Excepción unchecked para celdas ocupadas.
 */

public class Principal {
    public static void main(String[] args) {
        ModeloTresEnRaya modelo = new ModeloTresEnRaya();
        VistaTresEnRaya vista = new VistaTresEnRaya();
        ControladorTresEnRaya controlador = new ControladorTresEnRaya(modelo, vista);
        controlador.jugar();
    }
    
}
