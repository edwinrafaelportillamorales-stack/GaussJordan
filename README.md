# GaussJordan

Descripción del proyecto:
El programa utiliza una estructura modular que separa la definición de la matriz, la eliminación gaussiana y el procesamiento de Gauss-Jordan. Para evitar repetir código, la clase GaussJordan reutiliza el método Gauss.eliminacionGaussiana(matriz) desarrollado en la práctica anterior, y después, normaliza los pivotes y elimina los coeficientes que se encuentran por encima de la diagonal principal.

Compilación y ejecución en Java:
1.- Abrir el proyecto en el programa.
2.- Verificar que las clases estén dentro del paquete Ecuaciones_lineales.
3.- Ejecutar la clase Lanzador_gaus.java.
4.- Consultar la matriz resultante y las soluciones en la consola.

Ejemplo de Prueba:
Matriz utilizada
 2.0    1.0   -1.0  |   8.0
-3.0   -1.0    2.0  | -11.0
-2.0    1.0    2.0  |  -3.0

Matriz resultante de Gauss-Jordan:
1.0000	0.0000	0.0000	2.0000	
0.0000	1.0000	0.0000	3.0000	
-0.0000	-0.0000	1.0000	-1.0000	

Soluciones del sistema:
x1 = 2.0000
x2 = 3.0000
x3 = -1.0000
