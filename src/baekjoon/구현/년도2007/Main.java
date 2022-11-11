package baekjoon.구현.년도2007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int date = sc.nextInt();
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] fullDate = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sumDate = date;
        for (int i = 1; i < month; i++) {
            sumDate += fullDate[i];
        }

        int dayIndex = sumDate % 7;
        String result = day[dayIndex];
        System.out.println(result);
    }
}
