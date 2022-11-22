package Estrucuta_For;

import java.util.Scanner;

public class TablaAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt();
        String fila_asteriscos = "";
        for (int col = 1; col <= columnas; col++){
            fila_asteriscos = fila_asteriscos + "+";
        }
        for (int fila = 1; fila <=filas; fila++ ){
            System.out.println(fila_asteriscos);
        }
    }
}
