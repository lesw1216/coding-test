package samsung_academy.level_1.몫과나머지출력하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/몫과나머지출력하기/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("#" + tc + " " + a / b + " " + a % b);
        }
    }
}
