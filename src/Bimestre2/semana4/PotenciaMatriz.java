import java.util.Scanner;

public class PotenciaMatriz {
    public static void main(String[] args) {
        /**
         * Programa para elevar a una potencia dada los elementos de la matriz
         */
        int numeros [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; //Dimension de la matriz 3x3
        int matriz_potencia[][] = new int[numeros.length][numeros[0].length];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la potencia: ");
        int potencia = teclado.nextInt();
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
                matriz_potencia[fila][col] = (int) Math.pow(numeros[fila][col], potencia);
            }
        }
        //Lectura de la matrzi matriz_potencia
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
                System.out.print(matriz_potencia[fila][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}
