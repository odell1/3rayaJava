
public class VistaTresEnRaya {
    // Método para imprimir el tablero en la consola
    public void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    // Método para mostrar mensajes al usuario
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}//VistaTresEnRaya