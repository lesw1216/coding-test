package samngsung_academy.level_2.쉬운거스름돈;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append("\n");
            int in = sc.nextInt();
            for (int j : money) {
                sb.append(in / j).append(" ");
                in = in % j;
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
