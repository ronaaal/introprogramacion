package semana6;

import java.util.Scanner;

public class TipoTriangulo {
    public static String tipoTriangulo(double a, double b, double c) {
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            return "Triángulo rectángulo";
        } else if (Math.pow(c, 2) < Math.pow(a, 2) + Math.pow(b, 2)) {
            return "Triángulo acutángulo";
        } else {
            return "Triángulo obtusángulo";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor del primer cateto: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el valor del segundo cateto: ");
        double b = sc.nextDouble();
        System.out.print("Ingresa el valor de la hipotenusa: ");
        double c = sc.nextDouble();
        System.out.println("El triángulo es de tipo: " + tipoTriangulo(a, b, c));
    }
}
