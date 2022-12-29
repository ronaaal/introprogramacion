package semana3;

import java.util.Scanner;

public class CuentaBanco {
    public static void main(String[] args) {
        String socio [] = {"Pablo","Ivan","Richar","Andy","David"};
        int cuenta [] = {1234,4567,8910,1112,1314};
        int saldo [] = {1200,5000,3000,2500,10000};
        boolean interruptor = true;
        Scanner teclado = new Scanner(System.in);

        while (interruptor == true) {
            System.out.println("Seleccione del 1 al 4");
            System.out.println("1. Depositos");
            System.out.println("2. Retiros");
            System.out.println("3. Consulta de saldo");
            System.out.println("4. Salir");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("[DEPÓSITOS]");
                    System.out.print("Ingrese su número de cuenta: ");
                    int numero_cuenta = teclado.nextInt();
                    for (int indice = 0; indice < 5; indice++) {
                        if (numero_cuenta == cuenta[indice]) {
                            System.out.println("¡Bienvenido, "+ socio[indice] +"!");
                            System.out.println("¿Cuánto desea depositar?");
                            int cantidad = teclado.nextInt();
                            saldo[indice] = cantidad + saldo[indice];
                            System.out.println("Ahora posees: " + saldo[indice]);

                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("[RETIROS]");
                    System.out.print("Ingrese su número de cuenta: ");
                    int numero_cuenta1 = teclado.nextInt();
                    for (int indice = 0; indice < 5; indice++) {
                        if (numero_cuenta1 == cuenta[indice]) {
                            System.out.println("¡Bienvenido, "+ socio[indice] +"!");
                            System.out.println("¿Cuánto desea retirar?");
                            int retiro = teclado.nextInt();
                            saldo[indice] = saldo[indice] - retiro;
                            System.out.println("Ahora posees: " + saldo[indice]);

                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("[CONSULTA DE SALDO]");
                    System.out.print("Ingrese su número de cuenta: ");
                    int numero_cuenta2 = teclado.nextInt();
                    for (int indice = 0; indice < 5; indice++) {
                        if (numero_cuenta2 == cuenta[indice]) {
                            System.out.println( socio[indice] +", su cuenta dispone de: "+ saldo[indice]);

                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("[SALIR]");
                    interruptor = false;

                    break;
                default:
                    System.out.println("Número o carácter inválido.");
            }
        }
    }
}
