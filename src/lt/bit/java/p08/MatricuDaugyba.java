package lt.bit.java.p08;

public class MatricuDaugyba {

    static int[][] a = {
            {2, 3},
            {4, 5}
    };
    static int[][] b = {
            {1, 2},
            {0, 4}
    };
    static int[][] c = dauginameMatricas(a, b);

    public static void main(String[] args) {
        System.out.println("Matrica a:");
        spausdintiMatrica (a);
        System.out.println("Matrica b:");
        spausdintiMatrica (b);

        dauginameMatricas(a, b);

        System.out.println("Matrica c:");
        spausdintiMatrica (c);
    }

    static void spausdintiMatrica(int[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                System.out.print(x[row][col] + " ");
            }
            System.out.println();
        }
    }

    static int[][] dauginameMatricas(int[][] z, int[][] y) {

        int [][] c = {{(z[0][0] * y[0][0] + z[0][1] * y[1][0]), (z[0][0] * y[0][1] + z[0][1] * y[1][1])},
                    {(z[1][0] * y[0][0] + z[1][1] * y[1][0]), (z[1][0] * y[0][1] + z[1][1] * y[1][1])}
        };
        return  c;
    }

}
