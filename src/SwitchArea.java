import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 3");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Area de un triangulo");
                System.out.println("Ingrese la base");
                double base = teclado.nextDouble();
                System.out.println("Ingrese el area");
                double altura = teclado.nextDouble();
                double area_triangulo = (base * altura)/2;
                System.out.println("el area es: "+ area_triangulo);
                break;
            case 2:
                System.out.println("Area de una circunferencia");
                System.out.println("Ingrese el radio");
                double radio = teclado.nextDouble();
                double area_circulo = Math.PI * (radio * radio);
                System.out.println("el area es: "+ area_circulo);
                break;
            case 3:
                System.out.println("Area de un cuadrado");
                System.out.println("Ingrese el lado");
                double lado = teclado.nextDouble();
                double area_cuadrado = lado * lado;
                System.out.println("El area es: "+ area_cuadrado);
                break;
            default:
                System.out.println("opcion incorrecta");
        }
    }
}
