package semana6;

import java.util.Scanner;

public class Cedula {
    public static boolean validarCedula(String cedula) {
        int total = 0;
        int tamanoLongitudCedula = 10;
        int[] coeficientes = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
        int numeroProvincia = Integer.parseInt(cedula.substring(0, 2));
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));

        if (tercerDigito < 0) {
            return false;
        }

        if (numeroProvincia < 1 || numeroProvincia > 24) {
            return false;
        }

        if (cedula.length() != tamanoLongitudCedula) {
            return false;
        }

        for (int i = 0; i < coeficientes.length; i++) {
            int valor = Integer.parseInt(cedula.charAt(i) + "") * coeficientes[i];
            total += valor >= 10 ? valor - 9 : valor;
        }

        int ultimoDigito = Integer.parseInt(cedula.charAt(9) + "");
        return ultimoDigito == (total % 10 == 0 ? 0 : 10 - total % 10);
    }
    public static void validarCedulas(String[][] cedulas) {
        for (int i = 0; i < cedulas.length; i++) {
            for (int j = 0; j < cedulas[i].length; j++) {
                if (validarCedula(cedulas[i][j])) {
                    System.out.println("La cédula " + cedulas[i][j] + " es válida.");
                } else {
                    System.out.println("La cédula " + cedulas[i][j] + " no es válida.");
                }
            }
        }
    }

    public static void main(String[] args) {
        String[][] cedulas = new String[5][1];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cedulas.length; i++) {
            System.out.print("Ingresa el número de cédula: ");
            cedulas[i][0] = sc.nextLine();
        }
        validarCedulas(cedulas);
    }
}