package samsung_academy.level_1.큰놈작은놈같은놈;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    2070

    2개의 수를 입력 받아 크기를 비교하여 등호, 부등호 출력
    왼쪽을 기준으로
    작으면 <
    같으면 =
    크면   >
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/큰놈작은놈같은놈/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left > right)
                System.out.println("#" + tc + " >");
            else if (left < right)
                System.out.println("#" + tc + " <");
            else
                System.out.println("#" + tc + " =");
        }
    }
}
