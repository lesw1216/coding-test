package baekjoon.그리디.보물;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        Arrays.sort(a, Comparator.reverseOrder());
        Arrays.sort(b);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[i];
        }

        System.out.println(sum);
    }
}
