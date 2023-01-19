package semana6;

import java.util.Scanner;

public class SaldoInicial {
    static double saldo = 0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        saldo = teclado.nextDouble();

        int opcion = 0;
        do {
            System.out.println("1. Consulta de saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    Consultar();
                    break;
                case 2:
                    Retirar();
                    break;
                case 3:
                    Depositar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 4);
    }

    public static void Consultar() {
        System.out.println("Saldo actual: $" + saldo);
    }

    public static void Retirar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a retirar: $");
        double retira = teclado.nextDouble();
        if (retira > saldo) {
            System.out.println("Saldo insuficiente para realizar esta operación.");
        } else {
            saldo -= retira; //Se resta la cantidad retirada al saldo actual
            System.out.println("Dinero retirado exitosamente. Nuevo saldo: $" + saldo);
        }
    }

    public static void Depositar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a depositar: $");
        double deposita = teclado.nextDouble();
        saldo += deposita;
    }
}

