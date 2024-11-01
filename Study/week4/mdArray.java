package week4;

public class mdArray {
    private int[][] mda;

    private int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public mdArray() {
        mda = new int[6][6];
        for (int i = 0; i < mda.length; ++i) {
            for (int j = 0; j < mda[0].length; ++j) {
                mda[i][j] = max(j - i + 1, 0);
            }
        }
    }

    public mdArray(int width, int height) {
        mda = new int[width][height];
    }

    public void print() {
        for (int i = 0; i < mda.length; ++i) {
            for (int j = 0; j < mda[0].length; ++j) {
                System.out.printf("%8d", mda[i][j]);
            }
            System.out.println();
        }
    }
}
