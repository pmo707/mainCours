//package linear;
//
//
//import org.apache.commons.math3.analysis.function.Multiply;
//import org.apache.commons.math3.linear.*;
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class RealMatrixP {
//
//
//    public static ArrayList<ArrayList<Double>> addition(ArrayList<ArrayList<Double>> var1, ArrayList<ArrayList<Double>> var2) {
//
//
//        return null;
//    }
//
//    public static ArrayList<ArrayList<Double>> subtraction(ArrayList<ArrayList<Double>> var1, ArrayList<ArrayList<Double>> var2) {
//        return null;
//    }
//
//    /**
//     *
//     * @param var1
//     * @param var2
//     * @return
//     */
//    public static ArrayList<ArrayList<Double>> multiplication(ArrayList<ArrayList<Double>> var1, ArrayList<ArrayList<Double>> var2) {
//
//        double[][] matrixData = RealMatrixP.listToArray(var1);
//        RealMatrix var1RealMatrix = MatrixUtils.createRealMatrix(matrixData);
//
//        double[][] matrixData2 = RealMatrixP.listToArray(var2);
//        RealMatrix var2RealMatrix = MatrixUtils.createRealMatrix(matrixData2);
//
//        double [][] massResult ;
//
//
//        massResult  = var1RealMatrix.multiply(var2RealMatrix).getData();
//
//
//
//        return RealMatrixP.arrayToList(massResult);
//    }
//
//    public static ArrayList<ArrayList<Double>> division(ArrayList<ArrayList<Double>> var1, ArrayList<ArrayList<Double>> var2) {
//        return null;
//    }
//
//
//    public static double[][] listToArray(ArrayList<ArrayList<Double>> var) {
//
//        double[][] mass = new double[var.size()][];
//
//        for (int i = 0; i < var.size(); i++) {
//            int len = var.get(i).size();
//            mass[i] = new double[len];
//            for (int j = 0; j < len; j++) {
//                mass[i][j] = var.get(i).get(j);
//            }
//
//        }
//
//        return mass;
//
//
//    }
//
//
//    public static ArrayList<ArrayList<Double>> arrayToList(double[][] var) {
//        ArrayList<ArrayList<Double>> arrayListResult = new ArrayList<>();
//        for (int i = 0; i < var.length; i++) {
//            ArrayList<Double> arrayListInner = new ArrayList<>();
//            for (int j = 0; j < var[i].length; j++) {
//                arrayListInner.add(var[i][j]);
//            }
//            arrayListResult.add(arrayListInner);
//        }
//        return arrayListResult;
//    }
//}
