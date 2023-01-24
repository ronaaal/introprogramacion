package semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

/*\
PROGRAMA PARA REALIZAR LA DIVISION ENTRE DOS NUMEROS
 */
public class ManejoExcepcion {
    double n1;
    double n2;
    public static void main(String[] args) {
        ManejoExcepcion mivar = new ManejoExcepcion();
        mivar.ejecutar();
    }
    public void ejecutar(){
        ingresar_datos();
        System.out.println("Resultado = " + dividir() );
    }
    public void ingresar_datos(){
        //el bloque try nos ayuda a captar o detectar si ocurre la excepcion
        try {//Este codigo tiene la posibilidad de presentar una excepcion
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el numerador: ");
            n1 = teclado.nextDouble();
            System.out.println("Ingrese el denominador: ");
            n2 = teclado.nextDouble();
        }catch(Exception error_de_teclado){
            System.out.println("Manejo de la excepcion con catch");
            System.out.println( error_de_teclado.getMessage() );
        }
    }
    public double dividir(){
        double resultado = 0;
        try {
            //codigo en el que posiblemente puede ocurrir una excepcion
            resultado = n1 / n2;
            return resultado;
        }catch (ArithmeticException error){
            //este codigo se ehectura solo si ocurre una excepcion
            System.out.println("Error de tipo airtmetico");
            System.out.println( error.getMessage() );
        }finally {
            //este codigo se ejectura ocurra o no la excepcion
            System.out.println("Ingreso a finally");
        }
        System.out.println("Resultado = " + resultado);
        return resultado;
    }
}
