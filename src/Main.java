public class Main {
    public static void main(String[] args) {


        int N = 98254;
        int k = 2;
        double sqrt = Math.sqrt(N);
        int count = 0;
        System.out.println("sqrt = " + sqrt);

        for (int i = 1; i <= N; i++) {
            if (N % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        while (true) {
            System.out.println("N = " + N);
            count++;
            if (N == 1)
                break;

            if (N % k == 0) {
                System.out.print(k + " ");
                N /= k;
            } else {
                k++;
            }
        }
        System.out.println();
        System.out.println("count = " + count);

        System.out.println("============================================");

        k = 2;
        N = 98254;
        count = 0;
        while (true) {
            count++;
            if (N == 1 || k > sqrt) {
                break;
            }

            if (N % k == 0) {
                System.out.print(k + " ");
                N /= k;
            } else {
                k++;
            }
        }

        if (N > 1) {
            // K의 값이 제곱근을 초과했을 때, N의 값이 1보다 클 수 있다.
            System.out.print(N + " ");
            System.out.println();
            System.out.println("k = " + k);
            System.out.println("N = " + N);
        } else {
            System.out.println("k = " + k);
            System.out.println("N = " + N);
        }

        System.out.println("count = " + count);
    }
}