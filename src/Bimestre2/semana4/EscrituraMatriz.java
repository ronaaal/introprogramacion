package semana4;

import java.util.Scanner;

public class EscrituraMatriz {
    public static void main(String[] args) {
        int numeros[][] = new int [3][2];
        int filass = numeros.length;
        int columnas = numeros[1].length;
        numeros[1][1] = 5;
        numeros [2][0] = 9;
        //opreacion esctritura de una matriz
        Scanner teclado = new Scanner(System.in);
        for (int fila = 0; fila < filass; fila++) {
            System.out.println("fila: "+ fila);
            for (int col = 0; col < columnas ; col++) {
                System.out.println("Ingrese una edad para numeros ["+fila+"]["+col+"]: ");
                int edad = teclado.nextInt();
                numeros[fila][col] = edad;
                //System.out.print(numeros[fila][col] + "\t");
            }
        }
        //Operacion lectura de una matriz
        for (int fila = 0; fila < filass; fila++) {
            for (int col = 0; col < columnas ; col++) {
                System.out.print(numeros[fila][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}
