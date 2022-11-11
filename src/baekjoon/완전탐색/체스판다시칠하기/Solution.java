package baekjoon.완전탐색.체스판다시칠하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[][] tb = new boolean[m][n];
        int min = 64; // max는 기본적으로 0으로 두면 해결되지만, min은 최소값이므로 현재 나올수있는 값중 제일 큰값으로
        // 초기화 시켜준다. 8 x 8 = 64

        for (int i = 0; i < m; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                if (line.charAt(j) == 'W')
                    tb[i][j] = true;
                else
                    tb[i][j] = false;
            }
        }

        // 전체 체스판에서 모든 8 x 8 체스판을 탐색하는 반복문
        for (int i = 0; i < m - 7; i++) {
            for (int j = 0; j < n - 7; j++) {
                int count = 0;
                boolean firstColor = tb[i][j];

                // 8 x 8 체스판 안에서 비교하는 반복문
                for (int l = i; l < i + 8; l++) {
                    for (int k = j; k < j + 8; k++) {
                        if (tb[l][k] != firstColor) {
                            count++;
                        }

                        firstColor = !firstColor;
                    }

                    firstColor = !firstColor;
                }

                // 첫번째 칸의 색이 틀린경우. 그니까 W 가 처음나왔다고, WBWBWB 패턴이아니라
                // WWBWBWBWB 패턴일 수도 있다는 것.
                count = Math.min(count, 64 - count);

                min = Math.min(min, count);
            }
        }

        System.out.println(min);
    }
}
