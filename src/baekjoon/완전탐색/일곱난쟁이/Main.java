package baekjoon.완전탐색.일곱난쟁이;

import java.util.Arrays;
import java.util.Scanner;

/*
    아홉 난쟁이의 키가 주어진다.
    7명의 키 합이 100이면, 각 키를 오름차순으로 출력
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] list = new int[9];
        for (int i = 0; i < 9; i++) {
            list[i] = sc.nextInt();
            sum += list[i];
        }

        Arrays.sort(list);
        int fake1 = 0;
        int fake2 = 0;
        for (int i = 0; i < list.length - 1; i++)
            for (int j = i + 1; j < list.length; j++) {
                if (sum - list[i] - list[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                }
            }

        for (int i = 0; i < list.length; i++) {
            if (i == fake1 || i == fake2)
                continue;

            System.out.println(list[i]);
        }
    }
}
