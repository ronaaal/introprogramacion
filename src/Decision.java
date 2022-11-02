import java.util.Scanner;

/**
 * Programa para determinar si una persona es mayor o menor de edad
 */
public class Decision {
    public static void main(String[] args) {
        System.out.println("Programa para determinar si una persona es mayor de edad");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
            System.out.println ("dime mami q lo q");

        }
    }
}
