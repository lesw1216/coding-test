package baekjoon.그리디.전자레인지;

import java.util.Scanner;

/*
    A, B, C 버튼이 달린 전자레인지.
    각각 5분, 1분, 10초

    요리시간 T를 주었을때 최소한의 버튼 동작으로 T초가 되도록 전자레인지를 설정하는가?
    각 버튼의 최소 횟수를 출력하자.

    정확히떨어지지 않는다면 -1
    해당 버튼을 누르지 않는다면 0

    5분 : 300초, 1분 : 60초

    버튼을 최소한으로 누르려면, 제일 시간이 많은 A버튼 부터 더이상 A버튼을 누를수 없을 때까지 실행한다.
    그후 B, C 순으로 반복

    각 A, B, C 시간으로 T를 나눈다.
    몫은 각 버튼을 누르는 횟수,
    나머지는 각 버튼을 최대로 누르고 남은 시간.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] timeList = {300, 60, 10};
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int time : timeList) {
            sb.append(T / time).append(" ");
            T = T % time;
        }

        if (T != 0)
            System.out.println("-1");
        else
            System.out.println(sb);
    }
}
