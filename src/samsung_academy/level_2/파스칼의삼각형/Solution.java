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

            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);

            for (int i = 1; i < N; i++) {
                list.add(i);

            }
        }
    }
}
