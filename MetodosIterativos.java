public class MetodosIterativos {

    //metdodo de jacobi
    public static double[] resolverJacobi(double[][] A, double[] b, double[] x0, double tol, int maxIter) {
        int n = b.length;
        double[] x = x0.clone(); // Copia de la aproximación actual
        double[] xNuevo = new double[n]; // Vector para almacenar la nueva aproximación
        boolean convergio = false;

        System.out.println("metdodo de jacobi");
        for (int k = 0; k < maxIter; k++) {
            for (int i = 0; i < n; i++) {
                double suma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * x[j];
                    }
                }
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }
            // evaluar la norma de error (diferencia maxima entre interacciones)
            double error = 0.0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(xNuevo[i] - x[i]));
            }

            System.out.printf("Iteración %d: x1 = %.5f, x2 = %.5f, x3 = %.5f (Error: %.6f)%n",
                    (k + 1), xNuevo[0], xNuevo[1], xNuevo[2], error);

            if (error < tol) {
                System.out.println("Jacobi convergió en la iteración " + (k + 1) + "\n");
                convergio = true;
                break;
            }

            x = xNuevo.clone();
        }

        if (!convergio) {
            System.out.println("Jacobi alcanzó el número máximo de iteraciones sin converger estrictamente.\n");
        }
        return x;
    }

    // Método de Gauss-Seidel
    public static void resolverGaussSeidel(double[][] A, double[] b, double[] x0, double tol, int maxIter) {
        int n = b.length;
        double[] x = x0.clone();
        boolean convergio = false;

        System.out.println("--- MÉTODO DE GAUSS-SEIDEL ---");
        for (int k = 0; k < maxIter; k++) {
            double[] xAnterior = x.clone();

            for (int i = 0; i < n; i++) {
                double suma = 0.0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * x[j]; // Utiliza valores recién actualizados de manera inmediata
                    }
                }
                x[i] = (b[i] - suma) / A[i][i];
            }

            // Evaluar la norma del error
            double error = 0.0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(x[i] - xAnterior[i]));
            }

            System.out.printf("Iteración %d: x1 = %.5f, x2 = %.5f, x3 = %.5f (Error: %.6f)%n",
                    (k + 1), x[0], x[1], x[2], error);

            if (error < tol) {
                System.out.println("Gauss-Seidel convergió en la iteración " + (k + 1) + "\n");
                convergio = true;
                break;
            }
        }

        if (!convergio) {
            System.out.println("Gauss-Seidel alcanzó el número máximo de iteraciones sin converger estrictamente.\n");
        }
    }
}