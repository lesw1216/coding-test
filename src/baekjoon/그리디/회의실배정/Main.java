package baekjoon.그리디.회의실배정;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
    N 개의 회의
    회의의 시작과 끝을 알려줌
    회의의 최대 개수
    제일 작은 회의 부터 시작되야 한다?
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }
//        int[] list = new int[n * 2];
//        for (int i = 0; i < n * 2; i++)
//            list[i] = sc.nextInt();
        Arrays.sort(list, (o1, o2) -> {
            // 종료 시작이 같은 경우, 시작시간이 빠른순으로 결정.
            if (o1[1] == o2[1])
                return o1[0] - o2[0];

            // 종료시간이 빠른 순으로 정렬
            return o1[1] - o2[1];
        });

        int preEndTime = 0;
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (preEndTime <= list[i][0]) {
                preEndTime = list[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
