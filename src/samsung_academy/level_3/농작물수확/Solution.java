package samsung_academy.level_3.농작물수확;

import java.util.Scanner;

/*
    N x N 크기 농장
    농장의 크기는 항상 홀수
    수확은 농장의 크기에 맞는 정사각형 마름모 형태

    입력
    농장의 크기를 입력받고 농작물의 가치를 입력받는다.
 */
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

                // 공백이 없이 나열된 문자열을 한문자로 잘라 int로 변환한다.
                for (int j = 0; j < N; j++) {
                    // char는 int로 코드값을 갖는데, '0'의 코드값에서 빼준다면 각 char가 int 값이 됨.
                    arr[i][j] = line.charAt(j) - '0';
                }
            }

            // 실제 농작물의 수익을 찾는 로직
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
