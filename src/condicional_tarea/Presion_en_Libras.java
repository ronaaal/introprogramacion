import java.util.Scanner;

public class Presion_en_Libras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Programa para determinar el valor de la presión en libras por pulgada cuadrada (psi)");
        System.out.println("Ingresar el tiempo en segundos: ");
        int tiempo = teclado.nextInt();
        double psi;

        if (tiempo <= 35){
            psi = 0.46 * tiempo;
            System.out.println("La presión es: "+ psi);
        }
        else {
            psi = (0.19 * tiempo) + 9.45;
            System.out.println("La presión es: "+ psi);
        }
    }
}
