import java.util.Scanner;

public class ControladorTresEnRaya {
    private ModeloTresEnRaya modelo;
    private VistaTresEnRaya vista;

    public ControladorTresEnRaya(ModeloTresEnRaya modelo, VistaTresEnRaya vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            vista.imprimirTablero(modelo.getTablero());
            vista.mostrarMensaje("Jugador " + modelo.getJugadorActual() + ", ingresa tu movimiento (fila y columna): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            try {
                modelo.hacerMovimiento(fila, columna);
                juegoTerminado = modelo.verificarGanador() || modelo.tableroLleno();
            } catch (MovimientoInvalidoException e) {
                vista.mostrarMensaje(e.getMessage());
            } catch (MovimientoFueraDeLimitesException e) {
                vista.mostrarMensaje(e.getMessage());
            } catch (CeldaOcupadaException e) {
                vista.mostrarMensaje(e.getMessage());
            }
        }

        vista.imprimirTablero(modelo.getTablero());
        if (modelo.verificarGanador()) {
            vista.mostrarMensaje("¡Jugador " + (modelo.getJugadorActual() == 'X' ? 'O' : 'X') + " gana!");
        } else {
            vista.mostrarMensaje("¡Es un empate!");
        }
    }

}
