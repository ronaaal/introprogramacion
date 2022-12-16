public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1 [] = {"hp","asus","lenovo","toshiba"};
        String marcas2 [] = {"samsung","huawei","dere"};
        int tam_arr_resultado = marcas1.length + marcas2.length; //8
        String res[] = new String[tam_arr_resultado];
        for (int indice = 0; indice < marcas1.length; indice++) {
            res[indice] = marcas1[indice];
        }
        //Copiamos los valores del segundo arreglo marcas2 en el arreglo res
        for (int indice = marcas1.length, indice2 = 0;  indice < res.length; indice++) {
            res[indice] = marcas2[indice2];
            indice2++;
        }
        //Mostramos toods los elelmentos del arreglo res
        for (int indice = 0; indice < res.length; indice++) {
            System.out.println(res[indice]);
        }
    }
}
