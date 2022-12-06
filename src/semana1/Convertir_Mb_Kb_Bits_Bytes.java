package Bimestre2.semana1;

import java.util.Scanner;

public class Convertir_Mb_Kb_Bits_Bytes {
    public static void main(String[] args) {
        int interruptor_convertir = 1;
        double valor_kb1;
        double valor_mb1;
        double valor_bytes;
        double valor_bits;
        Scanner teclado = new Scanner(System.in);
        while (interruptor_convertir == 1){
            System.out.println("- Escriba '1' para convertir de Mb a Kb");
            System.out.println("- Escriba '2' para convertir de Kb a Mb");
            System.out.println("- Escriba '3' para convertir de Mb a bits");
            System.out.println("- Escriba '4' para finalizar");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("[ De MB a KB ]");
                    System.out.println("Ingrese el valor de Mb: ");
                    int valor_mb = teclado.nextInt();
                    valor_kb1 = valor_mb * 1024;
                    System.out.println(valor_mb + " mb es igual a: " + valor_kb1);
                    break;

                case 2:
                    System.out.println("[ De KB a MB ]");
                    System.out.println("Ingrese el valor de Kb: ");
                    int valor_kb = teclado.nextInt();
                    valor_mb1 = valor_kb /1024;
                    System.out.println(valor_kb + " kb es igual a: " + valor_mb1);
                    break;
                case 3:
                    System.out.println("[ De MB a BITS ]");
                    System.out.println("Ingrese el valor de Mb: ");
                    int valor_mb2 = teclado.nextInt();
                    valor_bytes = valor_mb2 * 1024 * 1024;
                    valor_bits = valor_bytes * 8;
                    System.out.println(valor_mb2 + " mb es igual a: " + valor_bits);
                    break;

                case 4:
                    System.out.println("[ SALIR ]");
                    interruptor_convertir = 0;
                    break;

                default:
                    System.out.println("[ Opción incorrecta ]");

            }
        }
    }
}
