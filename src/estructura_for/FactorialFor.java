package estructura_for;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero que quiere factorizar: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int factorial = 1;
        for (int contador = 2; contador <= numero ; contador++){
            factorial = factorial * contador;
        }
        System.out.println("El factorial es: "+ factorial);
    }
}
