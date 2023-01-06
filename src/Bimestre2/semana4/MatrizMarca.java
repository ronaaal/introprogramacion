import java.util.Locale;
import java.util.Scanner;

public class MatrizMarca {
    /**
     * Programa para crear una matriz con valores recibidos desde el teclado, y
     * luego poder realizar operaciones de:
     * 1. Busqueda
     * 2. Modificacion
     * 3. Eliminacion
     * 4. Visualizacion
     * 4. Salida
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int cols = teclado.nextInt();
        int nuevo = teclado.nextInt();
        teclado.nextLine();
        String marcas [][] = new String[filas][cols];//establecemos dimension de la matriz
        for (int fila1 = 0; fila1 < filas; fila1++) {
            for (int col1 = 0; col1 < cols; col1++) {
                System.out.println("Ingrese valor para posicion ["+fila1+"]["+col1+"]");
                marcas [fila1][col1] = teclado.nextLine().toLowerCase();
            }
        }
        boolean salir = false;
        while(!salir) { //salir == false
            System.out.println("Digite 1 para realizar una busqueda: ");
            System.out.println("Digite 2 para modificar un valor: ");
            System.out.println("Digite 3 para eliminar un valor: ");
            System.out.println("Digite 4 para visualizar la matriz: ");
            System.out.println("Digite 5 para salir: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Has seleccionado la operacion busqueda");
                    System.out.println("Que marca busca: ?");
                    String marca_busqueda = teclado.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_busqueda)){
                                System.out.println("Se encontro la marca!: "+marca_busqueda);
                                System.out.println("en la posicion: ["+fila+"]["+col+"]");
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if (encontrado == false)
                        System.out.println("Marca no encontrada");
                    break;
                case 2:
                    System.out.println("Has seleccionado la operacion de modificacion");
                    System.out.println("Ingrese que fila desea modificiar: ");
                    int fila1 = teclado.nextInt();
                    System.out.println("Ingrese que columna desea modificar: ");
                    int col1 = teclado.nextInt();
                    System.out.println("Cual es la nueva marca que desea ingresar: ");
                    String nueva_marca = teclado.nextLine().toLowerCase();
                    marcas[fila1][col1] = nueva_marca;
                    break;
                case 3:
                    System.out.println("Has seleccionado la operacion de eliminacion");
                    System.out.println("Que marca va a eliminar?: ");
                    String marca_a_eliminar = teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_a_eliminar)){
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Has seleccionado la operacion de lectura");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.println(marcas[fila][col] = "\t");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 5:
                    System.out.println("Hasta la vista, Baby");
                    break;
                default:
                    System.out.println("que eri bobo?");
            }
        }
    }
}
