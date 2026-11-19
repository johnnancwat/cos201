public class assignment {
    public static void main(String[] args) {
        int[] sequence = fibonacci(10);

        for (int number : sequence) {
            System.out.print(number + " ");
        }
    }

    public static int[] fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }

        int[] sequence = new int[n];
        if (n > 0) {
            sequence[0] = 0;
        }
        if (n > 1) {
            sequence[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }
}
