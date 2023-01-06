public class MatrizTranspuesta {
    /**
     * Programa para generar la transpuesta de una matriz
     */
    public static void main(String[] args) {
        char letras [][] = {
                {'a','b','c'},
                {'d','e','f'}
        };//dimension 2x3
        int filas = letras.length;
        int cols = letras[0].length;
        char trans [][] = new char[cols][filas];
        for (int fila = 0; fila < cols; fila++) {
            for (int col = 0; col < filas; col++) {
                trans[fila][col] = letras [col][fila];
                System.out.print(trans[fila][col] + "\t");
            }
            System.out.println();
        }
    }
}
