package samsung_academy.level_1.자릿수더하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    2058
    하나의 자연수를 입력 받아, 각 자릿수의 합을 계산하는 프로그램
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/자릿수더하기/input.txt"));
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while (true) {
            if (num == 0)
                break;

            sum += num % 10;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
