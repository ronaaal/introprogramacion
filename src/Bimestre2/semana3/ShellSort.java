package semana3;

public class ShellSort {
    public static void main(String[] args) {
        //Para cambiar del 1000 datos, a 10000; Simplemente hay que cambiar el tamaño de la variable "int n ="
        //y poner 10000
        int n = 1000;
        int[] vector = new int[n];
        long totaltiempo;
        //Al igual que en esta línea de aquí, por ej; "vector[i] = 10000 - i"
        for (int i = 0; i < n; i++) {
            vector[i] = 1000 - i;
        }

        long inicio = System.currentTimeMillis();

        int interno = (int) Math.floor(n / 2);
        while (interno > 0) {
            for (int i = interno; i < n; i++) {
                int j = i - interno;
                while (j >= 0) {
                    int k = j + interno;
                    if (vector[j] <= vector[k]) {
                        j -= 1;
                    } else {
                        int aux = vector[j];
                        vector[j] = vector[k];
                        vector[k] = aux;
                        j -= interno;
                    }
                }
            }
            interno = (int) Math.floor(interno / 2);
        }

        long fintiempo = System.currentTimeMillis();
        totaltiempo = fintiempo - inicio;

        System.out.println("El vector ordenado es: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i] + " ");
        }
        System.out.println("\nTiempo de ejecución: " + totaltiempo + " milisegundos");
    }
}
