package samsung_academy.level_2.파스칼의삼각형;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_2/파스칼의삼각형/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();

            System.out.println("#" + tc);

            int[][] array = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    // 양 끝은 1, 처음은 1
                    if (i == 0 || j == 0 || j == i)
                        array[i][j] = 1;
                    else {
                        array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
