package baekjoon.구현.년도2007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int date = sc.nextInt();
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] fullDate = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 1월 부터 12월 까지

        int sumDate = date; // 입력받은 마지막달의 일은 처음부터 sumDate에 넣고 시작
        for (int i = 1; i < month; i++) {
            /*
                1월 부터 입력받은 월의 이전달 까지 저장한다.
             */
            sumDate += fullDate[i];
        }

        // 7로 나눴을때 나온 나머지를 day 배열의 인덱스에 매칭
        int dayIndex = sumDate % 7;
        String result = day[dayIndex];

        System.out.println(result);
    }
}
