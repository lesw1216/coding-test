package samsung_academy.level_2.쉬운거스름돈;

import java.util.Scanner;

/*
    돈의 종류 : 50,000원 10,000원 5,000원 1,000원 500원 100원 50원 10원
    거슬러 주어야 할 돈을 입력 받는다. : N

    출력
    돈의 종류마다 필요한 개수를 공백을 사이에 두고 출력 순서는 내림 차순.
 */
public class Solution {
    public static void main(String[] args) {
        int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append("\n");
            int in = sc.nextInt();
            for (int j : money) {
                sb.append(in / j).append(" ");
                in = in % j;
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
