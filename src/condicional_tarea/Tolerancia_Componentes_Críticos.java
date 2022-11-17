import java.util.Scanner;

public class Tolerancia_Componentes_Críticos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para determinar la especificación.");
        System.out.println("Ingrese la tolerancia del componente para saber su estado de especificación: ");
        double t = teclado.nextDouble();

        if (t >= 10){
            System.out.println("Es grado de juguete.");
        }
        else if (t >= 1 && t < 10) {
            System.out.println("Su estado de especificación es grado comercial.");
        }
        else if (t >= 0.1 && t > 1) {
            System.out.println("Su estado de especificación es exploración espacial");
        }
        else if (t > 0.1) {
            System.out.println("Su estado de especificación es exploración espacial");
        }
        else {
            System.out.println("Carácter inválido.");
        }
    }
}
