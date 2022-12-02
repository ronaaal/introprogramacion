package Proyecto_Final;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int num1 = 0; int num2 = 1; int num3 = 1;
        String a = ""; String b = "*"; String c = "*";

        System.out.print("Ingresar el numero para la serie Fibonacci: ");
        int n = teclado.nextInt();

        for (int contador_As = 0; contador_As < n; contador_As++){
            System.out.println(num3);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        for (int contador = 0; contador < n; contador++){
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
