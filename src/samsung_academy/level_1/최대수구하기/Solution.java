package samsung_academy.level_1.최대수구하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    2068
    10개의 수를 입력 받아서 그중에 가장 큰 수를 출력
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/최대수구하기/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int max = 0;
            for (int i = 0; i < 10; i++) {
                int tmp = sc.nextInt();
                if (tmp > max)
                    max = tmp;
            }

            System.out.println("#" + tc + " " + max);
        }
    }
}
