public class DiamondPattern {

    private static final int ROWS = 5;

    public static void main(String[] args) {

        for (int i = 1; i <= ROWS; i++) {
            printRow(i);
        }

        for (int i = ROWS - 1; i >= 1; i--) {
            printRow(i);
        }
    }

    private static void printRow(int i) {

        for (int j = 1; j <= ROWS - i; j++) {
            System.out.print(" ");
        }

        System.out.print("*");

        if (i > 1) {
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }
}
