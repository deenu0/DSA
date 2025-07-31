public class NQueensCharOnly {

    public static void solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board)
            java.util.Arrays.fill(row, '.');

        placeQueens(board, 0,board.length);
    }

    private static void placeQueens(char[][] board, int row,int n) {
        if (row == n) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                placeQueens(board, row + 1,n);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board)
            System.out.println(new String(row));
    }

    public static void main(String[] args) {
        int N = 4; // You can change N to any size
        solveNQueens(N);
    }
}