import java.util.Random;

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    // Entry point
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Toss logic and symbol assignment
    static void tossAndAssignSymbols() {
        Random rand = new Random();

        // Random toss: 0 or 1
        int toss = rand.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display result
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human wins the toss and plays first.");
        } else {
            System.out.println("Computer wins the toss and plays first.");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}