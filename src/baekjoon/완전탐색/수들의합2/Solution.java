package baekjoon.완전탐색.수들의합2;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static int n;
    public static int m;
    public static ArrayList<Integer> list;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int count = toPointer();

        System.out.println(count);
    }

    private static int toPointer() {
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;

        while (start < n) {

            if (sum > m || end == n)
                sum -= list.get(start++);
            else
                sum += list.get(end++);

            if (sum == m)
                count++;
        }

        return count;
    }
}
