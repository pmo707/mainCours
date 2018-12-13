import MatrixAction.Matrix;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(5,5);
        Matrix matrix2 = new Matrix(5,5);
        Matrix matrix3 = new Matrix();
        matrix.createMatrix();
        matrix2.createMatrix();
        matrix.printMatrix();
        matrix2.printMatrix();
        matrix3.multipluy(matrix,matrix2);
       // matrix3.printMatrix();




        System.out.println();




    }
}
