import java.util.Scanner;
public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar numero del 1 al 3");
        int numero = teclado.nextInt();
        switch (numero){
            case 1:
                System.out.println("Ingresar la base del triangulo: ");
                int base = teclado.nextInt();
                System.out.println("Ingresar la altura del triangulo: ");
                int altura = teclado.nextInt();
                int Area_triangulo (base*altura)/2;
            case 2:
                System.out.println("Ingresar el radio de un circulo: ");
                double radio = teclado.nextInt();
                double Area_Circulo = (Math.PI*Math.pow(radio,2));
                System.out.println("El area es: "+ Area_Circulo);
            case 3:
                System.out.println("Ingresar valor de un lado: ");
                double lado = teclado.nextInt();
                double Area_Cuadrado = Math.pow(lado,2);
                System.out.println("El area del cuadrado es: "+ Area_Cuadrado);
            default:
                System.out.println("Error");
        }
    }
}
