import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Programa para los dias de la semana");
        int n = teclado.nextInt();
        if (n == 1)
            System.out.println("Hoy es lunes");
        else if (n == 2)
            System.out.println("Hoy es martes");
        else if (n == 3)
            System.out.println("Hoy es miercoles");
        else if (n == 4)
            System.out.println("Hoy es jueves");
        else if (n== 5)
            System.out.println("Hoy es viernes");
        else if (n == 6)
            System.out.println("Hoy es sabado");
        else if (n == 7)
            System.out.println("Hoy es domingo");
        else
            System.out.println("no mames no existen mas dias");

    }
}
