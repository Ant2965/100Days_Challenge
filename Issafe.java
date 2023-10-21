//package backtracking;

public class Issafe {

    public static boolean safe(int chess[][], int row, int col) {
        // up
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1) {
                return false;
            }
        }

        // left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        // diag right up

        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void queen(int chess[][], int row) {
        if (row == 5) {
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess.length; j++) {
                    System.out.print(chess[i][j]);

                }
                System.out.println();
            }

            System.out.println("-----------------");
            count++;

            return;
        }

        for (int i = 0; i < chess.length; i++) {
            if (safe(chess, row, i)) {
                chess[row][i] = 1;

                queen(chess, row + 1);

                chess[row][i] = 0;
            }
        }
    }

    static int count = 0;

    public static void main(String[] args) {

        int n = 5;
        int chess[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = 0;
            }
        }
        queen(chess, 0);

        System.out.println("Total ways are " + count);

    }

}
