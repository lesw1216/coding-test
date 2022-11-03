public class Main {
    public static void main(String[] args) {

        double n = 1.2345000000;

        System.out.println(Math.round(n * 1000000) / 1000000.0);
        System.out.printf("%.1f", n);
    }
}