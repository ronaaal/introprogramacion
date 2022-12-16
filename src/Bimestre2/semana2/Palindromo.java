import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra para determinar si es palindromo0");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine().toLowerCase();
        int tam_palabra = palabra.length();
        System.out.println("tam_palabra = " + tam_palabra);
        //pasamos los caracteres de palabra al arreglo palabra_arr
        char palabra_arr [] = new char[tam_palabra];
        for (int indice = 0; indice < tam_palabra; indice++) {
            palabra_arr[indice] = palabra.charAt(indice);
        }
        //Lecura del arreglo de derecha a izquierda
        String palabra_invertida = "";
        for (int indice = tam_palabra - 1; indice >= 0; indice--) {
            palabra_invertida = palabra_invertida  + palabra_arr[indice];

        }
        //determinamos si es palindromo o no
        if (palabra.equals(palabra_invertida)){
            System.out.println("Si es palabra palindroma");
        }
        else{
            System.out.println("No es palabra palindroma, parce");
        }

        //for (int indice = 0; indice < tam_palabra; indice++) {
        //    System.out.println(palabra_arr[indice]);
        //}
    }
}
