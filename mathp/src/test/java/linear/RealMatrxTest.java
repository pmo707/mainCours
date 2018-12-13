package linear;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;


public class RealMatrxTest {

    double[][] arrayI = {{0.9}, {0.1}, {0.8}};
    double[][] arrayW12 = {{0.9, 0.3, 0.4}, {0.2, 0.8, 0.2}, {0.1, 0.5, 0.6}};
    double[][] arrayW23 = {{0.3, 0.7, 0.5}, {0.6, 0.5, 0.2}, {0.8, 0.1, 0.9}};
    double[][] arrayIMulArrayW12 = {{1.16}, {0.42}, {0.62}};

    double delta = 0.000000000001;

    ArrayList arrayListW12 = new ArrayList() {
        {
            add(Arrays.asList(arrayW12[0][0], arrayW12[0][1], arrayW12[0][2]));
            add(Arrays.asList(arrayW12[1][0], arrayW12[1][1], arrayW12[1][2]));
            add(Arrays.asList(arrayW12[2][0], arrayW12[2][1], arrayW12[2][2]));
        }
    };

    @org.junit.jupiter.api.Test
    public void arrayToListTest1() {
        ArrayList<ArrayList<Double>> arrayList = MatrixP.arrayToList(arrayW12);
        assertArrayEquals("Array to List checked!!!", arrayListW12.toArray(), arrayList.toArray());

        arrayList.forEach(e -> e.forEach(System.out::println));


    }

    @Test
    public void listToArrayTest1() {
        double[][] array = MatrixP.listToArray(MatrixP.arrayToList(arrayW12));
        assertArrayEquals(array, arrayW12);
        MatrixP.arrayToList(arrayW12).forEach((System.out::println));
    }

    @Test
    public void multiplicationTest1() {
        ArrayList<ArrayList<Double>> arrayListFromMethod = MatrixP.multiplication(MatrixP.arrayToList(arrayW12), MatrixP.arrayToList(arrayI));
        double[][] arrayFromMethod = MatrixP.listToArray(arrayListFromMethod);


        assertArrayEquals("Array to List checked!!!", arrayIMulArrayW12[0], arrayFromMethod[0], delta);
    }
}
