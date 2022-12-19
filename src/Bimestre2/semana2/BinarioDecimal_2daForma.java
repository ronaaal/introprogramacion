import java.util.Scanner;
public class BinarioDecimal_2daForma {

        public static void main(String args[]) {

            int ultimodigito;
            int num;
            int c = 0;
            int decimal = 0;
            System.out.println("Ingrese el n�mero binario que desea convertir a Decimal (hasta 6 cifras)");
            Scanner teclado = new Scanner(System.in);
            num = teclado.nextInt();
            String binario = Integer.toString(num);
            if (binario.length()<=6){
                while (num !=0) {
                    ultimodigito = num %10;
                    decimal+= ultimodigito*Math.pow(2, c);
                    c++;
                    num/=10;
                }
                System.out.println("Es igual a: "+ decimal);
            }
            else {
                System.out.println("Debe ser un número menor o igual a 6");
            }
        }
}
