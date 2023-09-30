public class Boolean_Matrix {
    public static void booleanMatrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 0, 0 },
                { 1, 0, 0 },
                { 1, 0, 0 },
                { 0, 0, 0 } };

        int n = matrix.length;
        int m = matrix[0].length;
        booleanMatrix(matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}