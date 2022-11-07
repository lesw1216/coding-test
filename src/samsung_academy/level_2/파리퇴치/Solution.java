package samsung_academy.level_2.파리퇴치;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    N x N 배열
    M x M 크기의 파리채로 최대한 많은 파리 죽이기

    완전탐색?
    0,0 부터 비교?
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_2/파리퇴치/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] tb = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    tb[i][j] = sc.nextInt();
                }
            }

            int max = 0;
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    int temp = 0;

                    for (int k = 0; k < M; k++) {
                        for (int l = 0; l < M; l++) {
                            temp += tb[i + k][j + l];
                        }
                    }

                    if (max < temp)
                        max = temp;
                }
            }

            System.out.println("#" + tc + " " + max);
        }
    }
}
