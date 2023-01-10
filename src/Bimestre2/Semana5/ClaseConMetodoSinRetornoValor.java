package Semana5;

import java.util.Locale;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        //Crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornoValor llamada = new ClaseConMetodoSinRetornoValor();
        //llamada.saludar();
        saludar_con_nombre("Roni");
    }
    public static void saludar (){
        System.out.println("BIENVENIDO A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java.");
    }

    public static void saludar_con_nombre(String nombre){
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CREACION DE METODOS");
        System.out.println("Metodo creado en java");
    }
}
