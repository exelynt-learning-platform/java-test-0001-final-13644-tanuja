public class DiamondPattern {

    private static final int ROWS = 5; 

    public static void main(String[] args) {

        for (int row = 1; row <= ROWS; row++) {
            printRow(row);
        }

        for (int row = ROWS - 1; row >= 1; row--) {
            printRow(row);
        }
    }

    private static void printRow(int currentRow) {

        for (int space = 1; space <= ROWS - currentRow; space++) {
            System.out.print(" ");
        }

        System.out.print("*");

        if (currentRow > 1) {
            for (int space = 1; space <= 2 * currentRow - 3; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }
}
