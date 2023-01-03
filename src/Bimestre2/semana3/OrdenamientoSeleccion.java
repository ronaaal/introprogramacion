package semana3;

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        //Para cambiar del 1000 datos, a 10000; Simplemente hay que cambiar el tamaño de la variable "int numeros = new int []"
        //y poner 10000 o 100000
        int numeros[] = new int[1000];
        long totaltiempo;
        int n = 1;
        int menor, pos, tem;
        for (int x = 0; x < 1; x++) {
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = n;
                n++;
            }
            for (int i = 0; i < numeros.length; i++) {
                menor = numeros[i];
                pos = i;
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[j] < menor) {
                        menor = numeros[j];
                        pos = j;
                    }
                }
                if (pos != i) {
                    tem = numeros[i];
                    numeros[i] = numeros[pos];
                    numeros[pos] = numeros[tem];
                }
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
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
}
