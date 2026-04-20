public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    // Entry point
    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // test case
    }

    // Validate move
    static boolean isValidMove(int row, int col) {

        // Check boundaries
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}