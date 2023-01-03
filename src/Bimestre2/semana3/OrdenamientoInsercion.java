package semana3;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        //Para cambiar del 1000 datos, a 10000; Simplemente hay que cambiar el tamaño de la variable "int numeros = new int []"
        //y poner 10000 o 100000
        int numeros[] = new int[1000];
        long totaltiempo;
        int aux;
        for (int i = 0; i < 1; i++) {
            long inicio = System.currentTimeMillis();

            // Generar y asignar valores aleatorios a la matriz "numeros"
            for (int indice = 0; indice < numeros.length; indice++) {
                numeros[indice] = indice + 1;
            }

            // Ordenar la matriz "numeros" usando el método de inserción
            for (int cont1 = 1; cont1 < numeros.length; cont1++) {
                aux = numeros[cont1];
                for (int cont2 = (cont1 - 1); cont2 >= 0 && numeros[cont2] > aux; cont2--) {
                    numeros[cont2 + 1] = numeros[cont2];
                    numeros[cont2] = aux;
                }
            }

            // Imprimir la matriz "numeros" ordenada
            System.out.println("El vector ordenado es: ");
            for (int indice = 0; indice < numeros.length; indice++) {
                System.out.println(numeros[indice] + " ");
            }
            long fintiempo = System.currentTimeMillis();
            totaltiempo = fintiempo - inicio;

            System.out.println("El vector ordenado es: ");
            for (int i2 = 0; i2 < numeros.length; i2++) {
                System.out.println(numeros[i2] + " ");
            }
            System.out.println("\nTiempo de ejecución: " + totaltiempo + " milisegundos");
        }
    }
}


