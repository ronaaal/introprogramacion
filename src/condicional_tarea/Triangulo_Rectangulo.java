import java.util.Scanner;

public class Triangulo_Rectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar si los tres lados forman un triangulo rectangulo");
        System.out.println("Ingrese el primer lado");
        double lado1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo lado");
        double lado2 = teclado.nextDouble();
        System.out.println("Ingrese el tercer lado");
        double lado3 = teclado.nextDouble();

        if ((( lado1 *lado1 )+( lado2 * lado2))== ( lado3 * lado3 )) {
            System.out.println("El triángulo es un rectángulo.");
        }
        else {
            System.out.println("El triángulo no es un rectángulo.");
        }
    }
}
