public class ConcentricSquare {

    private static final int N = 4;

    public static void main(String[] args) {

        int size = 2 * N - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                int value = N - min;

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
