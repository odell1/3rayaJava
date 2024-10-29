


public class ModeloTresEnRaya {
    private char[][] tablero;
    private char jugadorActual;

    public ModeloTresEnRaya() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
        jugadorActual = 'X';
    }

    public char getJugadorActual() {
        return jugadorActual;
    }

    public char[][] getTablero() {
        return tablero;
    }

    // Método que lanza una excepción checked si el movimiento es inválido
    public void hacerMovimiento(int fila, int columna) throws MovimientoInvalidoException {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
            // Lanza una excepción unchecked si el movimiento está fuera de los límites
            throw new MovimientoFueraDeLimitesException("Movimiento fuera de los límites del tablero.");
        }
        if (tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugadorActual;
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        } else {
            // Lanza una excepción unchecked si la celda ya está ocupada
            throw new CeldaOcupadaException("Movimiento inválido. La celda ya está ocupada.");
        }
    }

    public boolean verificarGanador() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != ' ') {
                return true;
            }
            if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != ' ') {
                return true;
            }
        }
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
            return true;
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
            return true;
        }
        return false;
    }

    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
