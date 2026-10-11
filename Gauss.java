package Ecuaciones_lineales;

public class Gauss {

    // Metodo de eliminacion gaussiana
    public static void eliminacionGaussiana(double[][] matriz) {

        int n = matriz.length; // Obtiene el tamaño del sistema

        // Selecciona el renglon pivote actual
        for (int i = 0; i < n; i++) {

            // Recorre los renglones que estan debajo del pivote
            for (int j = i + 1; j < n; j++) {

                // Calcula el factor para anular el coeficiente
                double factor = matriz[j][i] / matriz[i][i];

                // Recorre las columnas de la fila
                // Aplica la operacion Rj = Rj - (factor * Ri)
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    // Metodo de sustitucion regresiva
    public static double[] sustitucionRegresiva(double[][] matriz) {

        int n = matriz.length;
        double[] x = new double[n]; // Almacena las soluciones

        // Recorre los renglones de abajo hacia arriba
        for (int i = n - 1; i >= 0; i--) {

            double suma = 0;

            // Suma las incognitas que ya se conocen
            for (int j = i + 1; j < n; j++) {
                suma += matriz[i][j] * x[j];
            }

            // Despeja la incognita actual
            x[i] = (matriz[i][n] - suma) / matriz[i][i];
        }

        return x; // Regresa las soluciones
    }
}
