package baekjoon.그리디.캠핑;

import java.util.Scanner;

/*
    P일 중 L일 동안만 사용, V일 짜리 휴가다.

    V일 짜리 휴가에 P일을 나누면 P일의 반복횟수가 나온다. 그리고 L을 곱하고, V % P는 곱한 값에 더한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int count = 1;
        while (true) {
            int L = sc.nextInt();
            int P = sc.nextInt();
            int v = sc.nextInt();

            if (L == 0 && P == 0 && v == 0)
                break;

            // 나머지가, 숙박을 쓸 수 있는 날보다 클 수도 있다. 8일 동안 5일을 쓸 수 있을 떄
            // 46일을 여행한다면.
            int temp = (v / P) * L;
            temp += Math.min(v % P, L);

//            int camping = (v / P) * L + (v % P);
            sb.append("Case ").append(count).append(": ").append(temp).append("\n");
            count++;
        }

        System.out.println(sb);
    }
}
