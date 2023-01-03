package semana3;

public class Burbuja {
    public static void main(String[] args) {
        //Para cambiar del 1000 datos, a 10000; Simplemente hay que cambiar el tamaño de la variable "int numeros = new int []"
        //y poner 10000 o 100000
        int numeros[] = new int[1000];
        long totaltiempo;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        long fintiempo = System.currentTimeMillis();
        totaltiempo = fintiempo - inicio;

        System.out.println("El vector ordenado es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
        System.out.println("\nTiempo de ejecución: " + totaltiempo + " milisegundos");
    }
}

