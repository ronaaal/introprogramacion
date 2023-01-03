package semana3;

public class BurbujaAvanzado {
    public static void main(String[] args) {
        //Para cambiar del 1000 datos, a 10000; Simplemente hay que cambiar el tamaño de la variable "int numeros = new int []"
        //y poner 10000 o 100000
        int numeros[] = new int[1000];
        long totaltiempo;
        int n = 1;
        boolean cambio;
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = n;
            n++;
        }
        long inicio = System.nanoTime();
        int aux;
        do {
            cambio = false;
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    cambio = true;
                }
            }
        } while (cambio);
        long fintiempo = System.nanoTime();
        totaltiempo = fintiempo - inicio;

        System.out.println("El vector ordenado es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
        System.out.println("\nTiempo de ejecución: " + totaltiempo + " nanosegundos");
        System.out.println("Tiempo de ejecución: " + totaltiempo / 1000 + " microsegundos");
        System.out.println("Tiempo de ejecución: " + totaltiempo / 1000000 + " milisegundos");
    }
}
