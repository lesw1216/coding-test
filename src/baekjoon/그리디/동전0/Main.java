package baekjoon.그리디.동전0;

import java.util.Arrays;
import java.util.Scanner;

/*
    동전의 종류 : N
    동전 가치의 합 : K
    이때 필요한 동전 개수의 최솟값 구하기

    첫째 줄에 N, K
    둘째 줄 부터 N개의 줄(종류) 동전의 가치 Ai 오름차순으로 제시

    동전의 가치가 큰 값으로 K를 나눈다. 이때, 몫은 동전의 개수, 나머지는 큰 값으로 제외하고 남은 동전의 가치
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] money = new int[N];

        // 동전 가치 입력
        for (int i = N - 1; i >= 0; i--)
            money[i] = sc.nextInt();

        // K를 money의 요소들로 나눈다. 몫은 동전 개수, 나머지값은 동전으로 나누고 남은 값들
        int count = 0;

        for (int m : money) {
            if (k == 0)
                break;
            count += k / m;
            k = k % m;
        }

        System.out.println(count);
    }
}
