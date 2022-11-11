package baekjoon.그리디.수들의합;

import java.util.Scanner;

/*
    N개의 자연수의 합이 S
    N개가 제일 많은 경우를 찾는 것.
    제일 작은 자연수들을 계속 더해야 N개의 개수가 많아지겠지.
    큰 수들끼리 더하면 100 + 100 =200 이면 N은 2개밖에안됨

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();

        for (long i = 1; i <= s; i++) {
            s = s - i;
            if (s <= i) {
                System.out.println(i);
                break;
            }
        }
    }
}
