import java.util.Scanner;

public class ArregloSuma {
    public static void main(String[] args) {
        System.out.println("Ingrese el tamanio de los caracteres de su suma");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int arreglo1 [];
        int arreglo2 [];
        arreglo1 = new int[n];
        arreglo2 = new int[n];

        System.out.println("Ingrese el primer arreglo: ");
        for (int indice = 0; indice < n; indice++) {
            int n1 = teclado.nextInt();
            arreglo1 [indice] = n1;

        }
        System.out.println("Ingrese el segundo arreglo: ");
        for (int indice = 0; indice < n; indice++) {
            int n2 = teclado.nextInt();
            arreglo2 [indice] = n2;
        }
        int total[] = new int[n];
        for (int indice = 0; indice < n; indice++) {
            total[indice] = arreglo1[indice] + arreglo2[indice];
        }
        for (int indice = 0; indice < n; indice++) {
            System.out.println(total[indice]);

        }
    }
}
