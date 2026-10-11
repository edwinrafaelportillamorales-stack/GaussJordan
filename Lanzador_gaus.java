package Ecuaciones_lineales;

public class Lanzador_gaus {

    public static void main(String[] args) {

        // 1. Obtiene la matriz aumentada [A | b]
        double[][] matriz = defmatrizz.defmatriz();

        // 2. Aplica el metodo de Gauss-Jordan
        // Reutiliza la eliminacion gaussiana de la practica anterior
        GaussJordan.eliminacionGaussJordan(matriz);

        // 3. Imprime la matriz resultante
        System.out.println("Matriz resultante de Gauss-Jordan:");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.4f\t", matriz[i][j]);
            }

            System.out.println();
        }

        // 4. Muestra las soluciones de las incognitas
        System.out.println("\nSoluciones del sistema:");

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("x%d = %.4f%n",
                    i + 1, matriz[i][matriz[i].length - 1]);
        }
    }
}