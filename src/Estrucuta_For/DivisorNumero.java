package Estrucuta_For;

import java.util.Scanner;

public class DivisorNumero {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        for (int contador = 1; contador; contador++){
            if (numero%contador==0)
                System.out.println("Los divisores son: ")+contador;
        }
    }
}
