package semana4;

public class Matriz {
    public static void main(String[] args) {
        int matriz [][] = new int[2][3];
        System.out.println(matriz[1][2]);
        //Creacion de una matriz con valores predefinidos
        String univ [][] = {
                {"utpl","ucuenca","espol"},
                {"unl","uzay","uide"}
        };
        System.out.println("Dimension de la matriz");
        System.out.println("Filas = "+ univ.length);
        System.out.println("Columnas = "+ univ[0].length);

        int filass = univ.length;
        int columnas = univ[1].length;
        for (int fila = 0; fila < filass; fila++) {
            for (int col = 0; col < columnas ; col++) {
                System.out.print(univ[fila][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}
