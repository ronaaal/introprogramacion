import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar si el numero es o no divisor del otro");
        System.out.println("Ingrese el primer número");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        int numero2 = teclado.nextInt();

        if (numero2%numero1==0) {
            System.out.println(numero2 +" es divisor de "+ numero1);
        }
        else {
            if (numero1%numero2==0) {
                System.out.println(numero1 +" es divisor de "+ numero2);
            }
            else {
                System.out.println("No son divisores");
            }
        }
    }
}
