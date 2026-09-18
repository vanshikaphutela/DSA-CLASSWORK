class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    for (char num = '1'; num <= '9'; num++) {

                        if (isSafe(board, row, col, num)) {

                            board[row][col] = num;

                            if (solve(board))
                                return true;

                            // Backtrack
                            board[row][col] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    boolean isSafe(char[][] board, int row, int col, char num) {

        // Row
        for (int j = 0; j < 9; j++)
            if (board[row][j] == num)
                return false;

        // Column
        for (int i = 0; i < 9; i++)
            if (board[i][col] == num)
                return false;

        // 3 x 3 box
        int r = (row / 3) * 3;
        int c = (col / 3) * 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }
}
class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    for (char num = '1'; num <= '9'; num++) {

                        if (isSafe(board, row, col, num)) {

                            board[row][col] = num;

                            if (solve(board))
                                return true;

                            // Backtrack
                            board[row][col] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    boolean isSafe(char[][] board, int row, int col, char num) {

        // Row
        for (int j = 0; j < 9; j++)
            if (board[row][j] == num)
                return false;

        // Column
        for (int i = 0; i < 9; i++)
            if (board[i][col] == num)
                return false;

        // 3 x 3 box
        int r = (row / 3) * 3;
        int c = (col / 3) * 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }
}
class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    for (char num = '1'; num <= '9'; num++) {

                        if (isSafe(board, row, col, num)) {

                            board[row][col] = num;

                            if (solve(board))
                                return true;

                            // Backtrack
                            board[row][col] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    boolean isSafe(char[][] board, int row, int col, char num) {

        // Row
        for (int j = 0; j < 9; j++)
            if (board[row][j] == num)
                return false;

        // Column
        for (int i = 0; i < 9; i++)
            if (board[i][col] == num)
                return false;

        // 3 x 3 box
        int r = (row / 3) * 3;
        int c = (col / 3) * 3;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }
}