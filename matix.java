public class matix {
    public static void largestSubmatrix(int[][] matrix) {
        int area = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[][] = new int[row][col];
        // preprocessing matrix
        for (int k = 0; k < col; k++) {
            arr[0][k] = matrix[0][k];
        }

        for (int i = 0; i < col; i++) { // column
            for (int j = 1; j < row; j++) { // row
                if (matrix[j][i] == 1 && matrix[j][i] != 0) {
                    if (arr[j - 1][i] >= 1) { // if 1
                        arr[j][i] = 1 + arr[j - 1][i];
                    } else { // not 1
                        arr[j][i] = matrix[j][i];
                    }
                } else {
                    arr[j][i] = matrix[j][i];
                }
            }

        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int matrix[][] = {
                { 0, 0, 1 },
                { 1, 1, 1 },
                { 1, 0, 1 } };
        largestSubmatrix(matrix);

    }

}