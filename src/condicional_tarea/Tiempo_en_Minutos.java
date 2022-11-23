import java.util.Scanner;

public class Tiempo_en_Minutos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para convertir el tiempo en minutos a días, horas y minutos");
        System.out.println("Ingresar el tiempo en minutos: ");
        int tm = teclado.nextInt();
        int dia = 0;
        int hora = 0;
        int min = 0;
        while ( tm > 0 ) {
            if ( tm >= 1140 ) {
               dia = ( dia + 1 ) ;
               tm = ( tm - 1140 );
            }
            else if ( tm >= 60 ){
                hora = ( hora + 1 );
                tm = ( tm - 60 );
            }
            else {
                min = ( min + 1 );
                tm = ( tm - 1 );
            }
        }
        System.out.println("Día: " + dia);
        System.out.println("Horas: " + hora);
        System.out.println("Minutos: " + min);
    }
}
