public class MatrixOperations {

    public static int[] rowSums(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    public static int[] columnSums(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int columns = matrix[0].length;
        int[] sums = new int[columns];
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sums[j] = sums[j] + matrix[i][j];
            }
        }
        return sums;
    }

    public static int[][] add(int[][] first, int[][] second) {
        if (first.length != second.length ||
            first[0].length != second[0].length) {
            return null;
        }
        int[][] result = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0][0];
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static int[][] multiply(int[][] first, int[][] second) {

        if (first.length == 0 || second.length == 0) {
            return new int[0][0];
        }

        if (first[0].length != second.length) {
            return null;
        }

        int rows = first.length;
        int columns = second[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < second.length; k++) {

                    result[i][j] =
                            result[i][j] + first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}