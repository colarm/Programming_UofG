package week4;

import java.util.Random;

public class array {
    private double[] arrDouble = new double[100];
    private int[] arrInt = new int[100];

    public double mean(double[] a) {
        double sum = 0;
        int length = a.length;
        for (int i = 0; i < length; ++i) {
            sum += a[i];
        }
        return sum / length;
    }

    public double[] randomDouble() {
        Random r = new Random();
        for (int i = 0; i < 100; ++i) {
            arrDouble[i] = r.nextDouble();
        }
        // for (int i = 0; i < 100; ++i) {
        //     System.out.println(arrDouble[i]);
        // }
        return arrDouble;
    }

    public int[] randomInt() {
        Random r = new Random();
        for (int i = 0; i < 100; ++i) {
            arrInt[i] = r.nextInt(0, 100);
        }
        // for (int i = 0; i < 100; ++i) {
        //     System.out.println(arrInt[i]);
        // }
        return arrInt;
    }

    public int find(int val) {
        for (int i = 0; i < 100; ++i) {
            if (arrDouble[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
