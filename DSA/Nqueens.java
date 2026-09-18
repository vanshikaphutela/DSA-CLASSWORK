import java.util.*;

public class NQueens {

    static int n;

    static boolean isSafe(char[][] board, int row, int col) {

        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    static void solve(char[][] board, int row) {

        if (row == n) {
            for (char[] r : board)
                System.out.println(new String(r));
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';

                solve(board, row + 1);

                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {

        n = 4;

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        solve(board, 0);
    }
}