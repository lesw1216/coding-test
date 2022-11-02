package samsung_academy.level_3.magnetic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("src/samsung_academy/level_3/magnetic/input.txt"));

        Scanner sc = new Scanner(System.in);


        for (int tc = 1; tc <= 10; tc++) {
            int lineSize = sc.nextInt();
            int[][] table = new int[lineSize][lineSize];
            int cnt = 0;

            for (int col = 0; col < lineSize; col++) {
                for (int row = 0; row < lineSize; row++) {
                    int inputValue = sc.nextInt();
                    if (inputValue == 0)
                        continue;

                    table[col][row] = inputValue;
                }
            }

            for (int row = 0; row < lineSize; row++) {
                boolean checkSecond = false;
                for (int col = 0; col < lineSize; col++) {
                    if (table[col][row] == 1) {
                        checkSecond = true;
                        continue;
                    }

                    if (table[col][row] == 2 && checkSecond) {
                        cnt++;
                        checkSecond = false;
                    }
                }
            }

            System.out.println("#" + tc + " " + cnt);
            System.out.println(Arrays.deepToString(table));
        }
    }
}
