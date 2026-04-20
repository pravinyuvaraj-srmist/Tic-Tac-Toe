public class TicTacToe {

    // Entry point
    public static void main(String[] args) {

        int slot = 7;

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    // Convert slot (1–9) to row index (0–2)
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot (1–9) to column index (0–2)
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}
