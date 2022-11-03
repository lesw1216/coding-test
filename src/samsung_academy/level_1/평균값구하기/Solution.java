package samsung_academy.level_1.평균값구하기;

/*
    10개의 수를 입력받아, 평균 값을 출력하는 프로그램 작성
    주의. 소수점 첫째자리에서 반올림
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/평균값구하기/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;
            for (int i = 0; i < 10; i++)
                sum += sc.nextInt();


            long avg = Math.round(sum / 10.0);

            System.out.println("#" + tc + " " + avg);

            System.out.printf("#" + tc + " %.0f", sum / 10.0);

        }

    }
}
