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
1. Clona este repositorio o descarga el código fuente en tu computadora.
2. Abre el proyecto en tu entorno de desarrollo favorito compatible con Java (como **IntelliJ IDEA** o Eclipse).
3. Asegúrate de que las tres clases (`Defmatrix.java`, las clases de los métodos iterativos y `Main.java`) se encuentren dentro del mismo paquete o directorio `src`.
4. Ejecuta la clase principal **`Main.java`** para visualizar en la consola el comportamiento iterativo y los resultados comparativos de ambos métodos.

## 📊 Sistema Evaluado
El sistema de ecuaciones lineales implementado para asegurar la diagonal dominancia es:
$$\begin{cases} 5x + y + z = 7 \\  x + 4y + z = 6 \\  x + 2y + 5z = 8 \end{cases}$$
