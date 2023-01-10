package Semana5;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CALCULAR EL AREA DE UNA FIGURA");
        System.out.println("Digite '1' Obtener area de una circuferencia: ");
        System.out.println("Digite '2' Obtener el area de un cuadrado: ");
        System.out.println("Digite '3' Obtener el area de un circulo: ");
        int opcion = teclado.nextInt();

    }
    public void seleccionar_figura(int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){

            case 1:
                System.out.println("Ingrese el valor de radio");
                double radio = teclado.nextInt();
                double area = obtener_area_circunferencia(radio);
                System.out.println("El area es: "+area);
            case 2:
                System.out.println("AREA DE UN CUADRADO");
            case 3:
                System.out.println("AREA DE UN CILINDRO");
        }
    }
    /**
     * Metodo para obetener el area de una circunferencia
     * @param radio
     * @return
     */
    public double obtener_area_circunferencia(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    /**
     * Metodo para obtener el area de un cuadrado
     * @param lado
     * @return
     */
    public double obtener_area_cuadrado(double lado){
        double area = lado * lado;
        return area;
    }

    public double obtener_area_cilindro(double radio, double altura){
        double area_c = 2 * Math.PI * radio * (altura + radio);
        return area_c;
    }

}
