package Semana5;

import java.util.Scanner;

public class ClaseConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA SUMAR DOS NUMEROS");
        System.out.println("Ingrese el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = teclado.nextInt();
        int resultado = sumar(num1, num2, 5);
        System.out.println("La suma es : "+resultado);
        //sumar_dos_numeros(num1, num2);
        //obtener el promedio de los numeros ingresados
        double promedio = obtener_promedio(resultado, 3);
        System.out.println("El promedio de los numeros es: "+promedio);
    }

    /**
     *Este metodo realiza la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return resultado5
     */
    public static int sumar(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }

    public static void sumar_dos_numeros(int n1, int n2){
        int resultado = n1 + n2;
        System.out.println("La suma de los numeros es : "+ resultado);
    }

    /**
     *
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public static int sumar(int n1, int n2, int n3){
        int resultado = n1 + n2 + n3;
        return resultado;
    }

    /**
     * Metodo para obetener el rpomedio de una suma de valores
     * @param suma_total
     * @param cantidad_num
     * @return
     */
    public static double obtener_promedio(int suma_total, int cantidad_num){
        double promedio = (double)suma_total/(double)cantidad_num;
        return promedio;
    }
}
