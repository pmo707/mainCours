package MatrixAction;

import java.util.Random;

public class Matrix {



    private int xMatrix;
    private int yMatrix;
    public double massMatrix[][];

    public Matrix(){}
    public Matrix(int xMatrix, int yMatrix) {
        massMatrix = new double[xMatrix][yMatrix];
    }

    public double[][] createMatrix() {
        Random random = new Random();
        for (int i = 0; i < massMatrix.length; i++) {
            for (int j = 0; j < massMatrix[i].length; j++) {
                massMatrix[i][j] = random.nextDouble();
            }
        }
        return massMatrix;
    }

    public void printMatrix(){

        for (int i = 0; i < massMatrix.length; i++) {
            for (int j = 0; j < massMatrix[i].length; j++) {
                System.out.print(massMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public double [][] multipluy(Matrix matrix1, Matrix matrix2){


//        if (matrix1.massMatrix.yMatrix==matrix2.xMatrix) {


        System.out.println(matrix1.massMatrix.length);
        System.out.println(matrix2.yMatrix);
            double [][] resultMatrix= new double[matrix1.xMatrix][matrix2.yMatrix];


//        }
//        else System.out.println("НИЗЯ перемножить");

        return null;
    }

}

