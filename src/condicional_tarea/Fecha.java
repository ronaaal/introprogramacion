import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE FECHA");
        System.out.println("Ingrese un dia: ");
        int dia = teclado.nextInt();
        System.out.println("Ingrese un mes: ");
        int mes = teclado.nextInt();
        System.out.println("Ingrese un año: ");
        int anio = teclado.nextInt();

        if ( anio >= 1990 && anio <= 2010 ){
            if (mes >=1 && mes <= 12){
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia >= 1 && dia <= 31) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                } break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia >= 1 && dia <= 30) {
                    System.out.println("Fecha correcta");
                } else {
                    System.out.println("Fecha incorrecta");
                } break;
                case 2:
                    if ( anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0 ) {
                        if (dia>=1 && dia<=29) {
                        System.out.println("Fecha correcta");
                        }
                        else {
                        System.out.println("Fecha incorrecta");
                        }
                    }
                    else if(dia>=1 && dia<=28) {
                    System.out.println("Fecha correcta");
                    }
                    else {
                    System.out.println("Fecha incorrecta");
                    } break;
            }
            }
        }
        else {
            System.out.println("Fecha incorrecta");}
    }
}
