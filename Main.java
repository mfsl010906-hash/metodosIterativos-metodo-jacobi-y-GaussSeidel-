public class Main {

    public static void main(String[] args) {
        // Cargamos los datos del sistema desde el modulo 1
        double[][] A = Defmatrix.obtenerMatrizA();
        double[] b = Defmatrix.obtenerVectorB();
        double[] x0 = Defmatrix.obtenerVetorX0();
        double tol = Defmatrix.obtenerTolerancia();
        int maxIter = 100;

        MetodosIterativos.resolverJacobi(A, b, x0, tol, maxIter);
        MetodosIterativos.resolverGaussSeidel(A, b, x0, tol, maxIter);
    }
}