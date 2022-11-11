package baekjoon.그리디.로프;

import java.util.Arrays;
import java.util.Scanner;

/*
    N개의 로프중 K개의 로프를 선택한다.
    이때 중량 W를 들어올리수 있다.
    K개의 로프에 가해지는 무게는 w/k 만큼

    정렬을한다.
    작은 값부터 본인보다 크거나 같은 중량의 로프 개수를 곱한다.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();

        Arrays.sort(list);

        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = list[i] * (n - i);
            max = Math.max(max, temp);
        }

        System.out.println(max);
    }
}
