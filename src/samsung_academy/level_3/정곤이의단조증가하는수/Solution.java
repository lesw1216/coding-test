package samsung_academy.level_3.정곤이의단조증가하는수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
    단조 증가 -> 각 숫자의 자릿수가 이전 자릿수 보다 증가하는 수
    EX) k 자리수 x = d1 d2 .. dk 일 때, d1 <= d2 <= ... < dk를 만족
    이전의 자릿수가 이전 자릿수보다 크다면 현재 자릿수에는 무조건 이전 자릿수 보다 큰 값이 오면된다.

    입력
    첫번째 줄 테스트케이스 T
    정수의 갯수 N
    N개의 정수 A1 ... An 개 입력받는다.

    출력
    1 <= i < j <= N 일 때, Ai * Aj 중 단조 증가하는 수 가 있을 텐데, 그 중의 최대값 출력
    없다면 -1 출력
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_3/정곤이의단조증가하는수/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int max = 0;

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    boolean check = false;
                    int mul = A[i] * A[j];
                    String sMul = String.valueOf(mul);

                    // 단조 증가인지 체크
                    for (int k = 0; k < sMul.length() - 1; k++) {
                        int fNum = sMul.charAt(k) - '0';
                        int bNum = sMul.charAt(k + 1) - '0';

                        if (fNum > bNum) {
                            // 단조 증가가 아닐 경우
                            check = true;
                            break;
                        }
                    }

                    if (!check) {
                        max = Math.max(mul, max);
                    }
                }
            }

            if (max == 0)
                System.out.println("#" + tc + " -1");
            else
                System.out.println("#" + tc + " " + max);
        }
    }
}
