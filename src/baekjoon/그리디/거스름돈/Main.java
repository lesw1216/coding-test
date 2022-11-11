package baekjoon.그리디.거스름돈;

/*
    타로는 항상 1000엔 지폐를 낸다.
    이때, 지불하고 남은 돈은 최소 몇개의 동전으로 줄수 있는가.

    타로는 1000엔을 냈고, 입력받는 값은 타로가 계산해야하는 가격. 1000 - 입력받은 값 = 거슬러받아야 할 돈.

    제일큰 잔돈으로 거스름 돈을 나눈다. 몫은 동전의 개수, 나머지는 남은 거스름 돈.
    그다음 큰 잔돈으로 반복.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pay = sc.nextInt();
        int change = 1000 - pay;
        int[] list = {500, 100, 50, 10, 5, 1};

        int count = 0;
        for (int token : list) {
            count += change / token;
            change %= token;
        }

        System.out.println(count);
    }
}
