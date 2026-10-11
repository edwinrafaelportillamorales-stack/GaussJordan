package Ecuaciones_lineales;

public class GaussJordan {

    // Metodo de Gauss-Jordan
    public static void eliminacionGaussJordan(double[][] matriz) {

        int n = matriz.length;

        // 1. Reutiliza la eliminacion gaussiana anterior
        // para obtener la matriz triangular superior
        Gauss.eliminacionGaussiana(matriz);

        // 2. Normaliza los pivotes para convertirlos en 1
        for (int i = 0; i < n; i++) {

            double pivote = matriz[i][i];

            // Divide todos los elementos del renglon entre el pivote
            for (int k = 0; k <= n; k++) {
                matriz[i][k] /= pivote;
            }
        }

        // 3. Elimina los coeficientes que estan arriba de los pivotes
        for (int i = n - 1; i >= 0; i--) {

            // Recorre los renglones superiores
            for (int j = i - 1; j >= 0; j--) {

                double factor = matriz[j][i];

                // Aplica la operacion para convertir el coeficiente en cero
                for (int k = 0; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}