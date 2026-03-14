public class DiamondPattern {

    private static final int N = 5;

    public static void main(String[] args) {

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N - i; j++) {
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

        for (int i = N - 1; i >= 1; i--) {

            for (int j = 1; j <= N - i; j++) {
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
}
