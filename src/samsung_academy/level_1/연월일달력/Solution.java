package samsung_academy.level_1.연월일달력;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    연월일 순으로 구성된 8자리 연속된 숫자 입력
    22220228 -> 2222/02/28

    날짜의 유효성 판단 후, 유효하다면: YYYY/MM/DD 형식 출력, 유효하지 않다면: -1출력
    월은 1 ~ 12
    일은
    1, 3, 5, 7, 8, 10, 12월은 1 ~ 31일
    2, 4, 6, 9, 11월은 1 ~ 30일
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/연월일달력/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            boolean isNotMonth = false;
            boolean isNotDay = false;
            // 연월일 입력 받기
            int date = sc.nextInt();

            // 일(day)구하기
            int day = date % 100;

            // 월 구하기
            int month = (date / 100) % 100;

            // 년도 구하기
            int year = (date / 10000);


                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (1 <= day && day <= 31)
                            System.out.printf("#%d %04d/%02d/%02d\n",tc, year, month, day);
                        else
                            System.out.println("#" + tc + " -1");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (1 <= day && day <= 30)
                            System.out.printf("#%d %04d/%02d/%02d\n",tc, year, month, day);
                        else
                            System.out.println("#" + tc + " -1");
                        break;
                    case 2:
                        if (1 <= day && day <= 28)
                            System.out.printf("#%d %04d/%02d/%02d\n",tc, year, month, day);
                        else
                            System.out.println("#" + tc + " -1");
                        break;
                    default:
                        System.out.println("#" + tc + " -1");
                }
        }
    }
}
