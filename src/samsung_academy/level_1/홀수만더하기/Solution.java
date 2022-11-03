package samsung_academy.level_1.홀수만더하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    10의 수를 입력 받아, 홀수만 더한 값 출력

 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/홀수만더하기/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;

            // 10개의 수 받으면서 바로 홀수 체크
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if (num % 2 != 0)
                    sum += num;
            }

            System.out.println("#" + tc + " " + sum);
        }
    }
}
