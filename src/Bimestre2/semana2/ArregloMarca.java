package Segundo_Bimestre.semana2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que solicite el nombre de n marcas de vehiculos y
 * las almacene en un arreglo. Finalmente el programa debe mostrar
 * el nombre de las marcas almacenadas en el arrreglo.
 */
public class ArregloMarca {
    public static void main(String[] args) {
        String marcas [];
        System.out.println("Cuantas marcas de vehiculo va a ingresar: ? ");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas = new String[n]; //Creamos el arreglo con n elementos
        //Operacion escritura del arreglo
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Ingrese el nombre de la marca" + (indice+1));
            String marca = teclado.nextLine();
            marcas[indice] = marca;
        }
        System.out.println("Lista de marcas ingresadas");
        //Operacion lectura del arreglo
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas [indice] + "\t");
        }
        //operacion de busqueda
        System.out.println("Que nombre de la marca desea buscar?: ");
        //toUppercase () es una funcion q convierte un texto en mayusculas
        String marca_busqueda = teclado.nextLine().toUpperCase();
        System.out.println("marcas buscada: " + marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals (marcas[indice].toUpperCase())){
                System.out.println("Marcas encontrada");
                System.out.println("Se encuentra en el indice: " + indice);
                break;
            }

        }
    }
}
