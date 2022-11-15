/**
 * Generar la tabla de multiplicar hasta el 10 de un numero ingresado por teclado
 */
package repeticion_while.JOptionPane;

import javax.swing.*;

public class TablaMultiplicacion {
    public static void main(String[] args) {
       // System.out.println("PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR");
        JOptionPane.showMessageDialog(null, "PROGRAMA PARA GENERAR LA TABLA DE MULTIPLICAR" );
        //System.out.println("Ingrese un numero: ");
        String num = JOptionPane.showInputDialog("Ingrese un numero: ");
        int contador = 1;
        String acumulador = "";
        while (contador <= 10 ){
            int mult = Integer.parseInt(num) * contador; //convertimos valor string a int
            String salida = num + " x " + String.valueOf(contador) + "=" + String.valueOf(mult) + "\n";
            acumulador = acumulador + salida;
            contador = contador +1;
        }
        JOptionPane.showMessageDialog(null, acumulador);
    }
}
