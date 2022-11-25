package baekjoon.그리디.a부터b;

import java.util.Scanner;

/*
    A -> B
    연산
    1. 2를 곱한다.
    2. 1을 수의 가장 오른쪽에 추가한다.
    연산의 최소횟수는?

    큰값에서 2로 나눌수 있다면
        2로 나눈다.
    나눌수 없는데 끝 숫자가 1이라면
        1을 제외시킨다. EX) 2001 -> 200
    나눌수 없는데 끝 숫자가 1이 아니라면
        -1 출력

    연산 후 결과 값이 시작값 보다 작으면
        -1 출력
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        int count = 0;
        while (true) {
            System.out.println("b = " + b);
            if (b == a) {
                count++;
                System.out.println(count);
                break;
            } else if (b < a) {
                System.out.println(-1);
                break;
            }

            // 큰값이 2로 나누어 떨어지면
            if (b % 2 == 0) {
                b /= 2; // 2로 나눈 값을 재저장
                count++;
            } else if (b % 10 == 1) {
                b = (long) ((b - 1) * 0.1);
                count++;
            } else {
                System.out.println(-1);
                break;
            }
        }
    }
}
