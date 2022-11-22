package baekjoon.그리디.카드정렬하기;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }


        while (!pq.isEmpty()) {
            int num1 = pq.poll();
            if (pq.isEmpty()) {
                break;
            }

            int num2 = pq.poll();
            int sum = num1 + num2;
            count += sum;
            pq.offer(sum);
        }

        System.out.println(count);
    }
}
