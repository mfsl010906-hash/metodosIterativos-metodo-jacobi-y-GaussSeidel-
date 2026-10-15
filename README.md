# metodosIterativos-metodo-jacobi-y-GaussSeidel-
**institucion** instituto tecnologico superior de xalapa
**materia** metodos numericos
**docente** victor hugo vasquez herrera
**practica** Programación Modular en Java: Métodos Iterativos
**alumna** maria fatima sanchez landa

## 📋 Descripción del Proyecto
Implementación en Java de un sistema modular de tres componentes para la resolución de sistemas de ecuaciones lineales mediante los métodos iterativos de **Jacobi** y **Gauss-Seidel**, evaluando la convergencia bajo una tolerancia de error específica.

## 🏗️ Arquitectura Modular
El proyecto está estructurado en tres componentes principales para garantizar la separación de responsabilidades:
1. **Módulo 1 (`Defmatrix.java`):** Almacena la matriz de coeficientes A, el vector de términos independientes b, el vector de aproximación inicial X0 = [0, 0, 0]^T y la tolerancia de error = 0.0001.
2. **Módulo 2 (`MetodoJacobi.java` y `MetodoGaussSeidel.java`):** Clase que contiene la lógica de cálculo para el Método de Jacobi (utilizando un vector auxiliar para los nuevos valores) y el Método de Gauss-Seidel (empleando la actualización inmediata de variables).
3. **Módulo 3 (`Main.java`):** Clase principal de ejecución que instancia los datos y realiza la llamada secuencial a ambos métodos para su comparación.

## ⚙️ Instrucciones de Compilación y Ejecución
### Desde la Terminal/Consola

1. Clonar el repositorio y acceder a la carpeta del proyecto:
   ´´´bash
   git clone <https://github.com/mfsl010906-hash/metodosIterativos-metodo-jacobi-y-GaussSeidel-.git>
   cd <metodosIterativos-metodo-jacobi-y-GaussSeidel>
   ´´´

3. Compilar los archivos fuente:
   ´´´bash
   javac *.java
   ´´´

4. Ejecutar las clase de prueba:
   
   - Para probar la **Main**
     ´´´bash
     java Main
     ´´´

---

## 📊 Sistema Evaluado
Sistema de ecuaciones evaluado
5x +y+z =7 
x+4y+z =6 
x+2y+5z =8

## resultados
Método de jacobi
Iteración 1: x1 = 1.40000, x2 = 1.50000, x3 = 1.60000 (Error: 1.600000)
Iteración 2: x1 = 0.78000, x2 = 0.75000, x3 = 0.72000 (Error: 0.880000)
Iteración 3: x1 = 1.10600, x2 = 1.12500, x3 = 1.14400 (Error: 0.424000)
Iteración 4: x1 = 0.94620, x2 = 0.93750, x3 = 0.92880 (Error: 0.215200)
Iteración 5: x1 = 1.02674, x2 = 1.03125, x3 = 1.03576 (Error: 0.106960)
Iteración 6: x1 = 0.98660, x2 = 0.98438, x3 = 0.98215 (Error: 0.053608)
Iteración 7: x1 = 1.00669, x2 = 1.00781, x3 = 1.00893 (Error: 0.026778)
Iteración 8: x1 = 0.99665, x2 = 0.99609, x3 = 0.99554 (Error: 0.013394)
Iteración 9: x1 = 1.00167, x2 = 1.00195, x3 = 1.00223 (Error: 0.006696)
Iteración 10: x1 = 0.99916, x2 = 0.99902, x3 = 0.99888 (Error: 0.003348)
Iteración 11: x1 = 1.00042, x2 = 1.00049, x3 = 1.00056 (Error: 0.001674)
Iteración 12: x1 = 0.99979, x2 = 0.99976, x3 = 0.99972 (Error: 0.000837)
Iteración 13: x1 = 1.00010, x2 = 1.00012, x3 = 1.00014 (Error: 0.000419)
Iteración 14: x1 = 0.99995, x2 = 0.99994, x3 = 0.99993 (Error: 0.000209)
Iteración 15: x1 = 1.00003, x2 = 1.00003, x3 = 1.00003 (Error: 0.000105)
Iteración 16: x1 = 0.99999, x2 = 0.99998, x3 = 0.99998 (Error: 0.000052)
Jacobi convergió en la iteración 16

--- MÉTODO DE GAUSS-SEIDEL ---
Iteración 1: x1 = 1.40000, x2 = 1.15000, x3 = 0.86000 (Error: 1.400000)
Iteración 2: x1 = 0.99800, x2 = 1.03550, x3 = 0.98620 (Error: 0.402000)
Iteración 3: x1 = 0.99566, x2 = 1.00454, x3 = 0.99905 (Error: 0.030965)
Iteración 4: x1 = 0.99928, x2 = 1.00042, x3 = 0.99998 (Error: 0.004119)
Iteración 5: x1 = 0.99992, x2 = 1.00003, x3 = 1.00001 (Error: 0.000639)
Iteración 6: x1 = 0.99999, x2 = 1.00000, x3 = 1.00000 (Error: 0.000072)
Gauss-Seidel convergió en la iteración 6
Process finished with exit code 0

conclusion

