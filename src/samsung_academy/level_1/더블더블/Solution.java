package samsung_academy.level_1.더블더블;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    1부터 입력받은 숫자까지 2를 곱한 값들을 출력

    결과 값 : 1;
    n을 입력 받는다.
    1 부터 n까지 반복한다.
        i 번째마다 `결과 값 = 결과값 * 2`;
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/더블더블/input.txt"));
        Scanner sc = new Scanner(System.in);

        int result = 1;
        int n = sc.nextInt();

        System.out.print(result);
        for (int i = 1; i <= n; i++) {
            result = result * 2;
            System.out.print(" " + result);
        }


    }
}
