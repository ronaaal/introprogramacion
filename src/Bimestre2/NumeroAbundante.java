package Bimestre2;

import java.util.Scanner;

public class NumeroAbundante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 1;
        int suma_divisores = 0;
        System.out.println("Ingrese el número: ");
        int numero = teclado.nextInt();
        while (contador < numero){
            if (numero % contador == 0){
                suma_divisores = suma_divisores + contador;
            }
            contador = contador + 1;
        }
        if (suma_divisores > numero){
            System.out.println("Sí es abundante.");

        } else {
            System.out.println("No es abundante.");
        }
    }
}
