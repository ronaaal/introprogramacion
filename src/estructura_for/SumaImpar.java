package estructura_for;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero limite");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int suma_impares = 0;
        for (int contador = 1; contador <= limite; contador = contador + 2){
            suma_impares = suma_impares + contador;
        //for (int contador = 1; contador <= limite; contador ++){
           // if (contador%2 == 1)
              // suma_impares = suma_impares + contador;
        }
        System.out.println("La suma de numeros impares = "+ suma_impares);
    }
}
