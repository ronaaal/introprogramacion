import java.util.Scanner;

public class CedulaVerificacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cedula;
        int numero = 0;
        int suma = 0;
        int resultado = 0;

        System.out.println("Ingrese su número de cédula: ");
        cedula = teclado.nextLine();

        for (int i = 0; i < cedula.length(); i++) {
            numero = Integer.parseInt(String.valueOf(cedula.charAt(i)));
            if (i%2 == 0){
                numero = numero * 2;
                if (numero > 9){
                    numero = numero - 9;
                }
            }
            suma = suma + numero;
        }
        if (suma%10 != 0){
            resultado = 10 - (suma%10);
            if (resultado == numero){
                System.out.println("Su cédula es correcta");
            } else {
                System.out.println("Su cédula no es correcta o no es Ecuatoriana.");
            }
        } else {
            System.out.println("Su cédula es correcta.");
        }
    }
}
