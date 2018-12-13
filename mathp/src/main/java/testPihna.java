import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class testPihna {





    public static void main(String[] args) {
        double[][] matrixData = { {1d,2d,3d}, {2d,5d,3d}, {2d,5d,3d}};
        double[][] array;
        RealMatrix m = MatrixUtils.createRealMatrix(matrixData);
        RealMatrix n = MatrixUtils.createRealMatrix(matrixData);
        RealMatrix l=m.multiply(n);
        array=l.getData();
        double[][] array2 = m.getData();


        for (int i=0;i<array.length;i++){

            for(int j=0; j<array[0].length; j++){


                System.out.print(" "+array2[i][j]+"; ");


            }
            System.out.println();

        }







    }


}
