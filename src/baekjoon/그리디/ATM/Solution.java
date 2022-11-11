package baekjoon.그리디.ATM;

import java.util.Arrays;
import java.util.Scanner;

/*
    돈을 인출하는데 걸리는 시간 Pi

    사람들이 줄을 섰을 때 모든 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하라.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();

        Arrays.sort(list);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum += list[j];
            }
        }

        System.out.println(sum);
    }
}
