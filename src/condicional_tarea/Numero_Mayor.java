import java.util.Scanner;

public class Numero_Mayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Verificar si un número es mayor que otro.");
        System.out.println("Ingresar el primer número:");
        double n1 = teclado.nextDouble();
        System.out.println("Ingresar el segundo número:");
        double n2 = teclado.nextDouble();

        if (n1> n2){
            System.out.println("El número " + n1 + " es mayor a " + n2);
        }
        if (n2 >n1){
            System.out.println("El número " + n2 + " es mayor a " + n1);
        }
        else {
            System.out.println("Carácteres incorrectos");
    }
}}
