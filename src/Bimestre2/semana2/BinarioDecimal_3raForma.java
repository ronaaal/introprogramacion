import java.util.Scanner;

public class BinarioDecimal_3raForma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número binario a convertir: ");
        String binario = scanner.nextLine();

        int decimal = 0;
        int[] Matrizbinaria = new int[binario.length()];

        for (int i = 0; i < binario.length(); i++) {
            Matrizbinaria[i] = Character.getNumericValue(binario.charAt(i));
        }

        for (int i = 0; i < Matrizbinaria.length; i++) {
            decimal += Matrizbinaria[i] * Math.pow(2, Matrizbinaria.length - i - 1);
        }

        System.out.println("El número decimal es: " + decimal);
    }
}
