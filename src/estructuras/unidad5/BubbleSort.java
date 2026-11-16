package estructuras.unidad5;

import java.util.Arrays;

public class BubbleSort {

    // Ordena un arreglo de menor a mayor con el método burbuja
    public static void ordenar(int[] arreglo) {
        int n = arreglo.length;
        boolean huboIntercambio;

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    huboIntercambio = true;
                }
            }

            // Si no hubo intercambios, ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90, 5};

        System.out.println("=== Ordenamiento por Burbuja ===");
        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        ordenar(numeros);

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
    }
}