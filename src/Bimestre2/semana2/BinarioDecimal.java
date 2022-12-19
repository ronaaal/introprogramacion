import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinarioDecimal {
    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int decimal = 0;
        int n;
        int x;
        System.out.println("Ingrese el número binario que desea convertir a Decimal");
        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();
        String binario = Integer.toString(n);
        n = binario.length();
        x = 0;
        System.out.println("La longitud del binario es de "+binario.length()+" dígitos");
        if (binario.length()<=6) {
            while (n!=0) {
                if (binario.substring(n-1,n).equals("1")) {
                    decimal = decimal + (int)Math.pow(2, x);
                }
                n = n-1;
                x = x+1;
            }
            System.out.println("Es igual a: "+decimal);
        } else {
            System.out.println("Debe de ser menor o igual a 6");
        }
    }
}
