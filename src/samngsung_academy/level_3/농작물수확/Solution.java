package samngsung_academy.level_3.농작물수확;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;
            int N = sc.nextInt();
            int mid = N / 2;

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                String line = sc.next();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = line.charAt(j) - '0';
                }
            }

            for (int i = 0; i <= N / 2; i++) {
                int s = mid - i;
                for ( ; s <= mid + i; s++) {
                    if (i == N / 2) {
                        sum += arr[i][s];
                        continue;
                    }

                    sum += arr[i][s] + arr[N - 1 - i][s];
                }
            }

            System.out.println("#" + tc + " " + sum);
        }
    }
}
