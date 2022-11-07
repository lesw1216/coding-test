package samsung_academy.level_2.중간평균값구하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    최소, 최대값을 제외한 평균 값 구하기
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_2/중간평균값구하기/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++)
                list.add(sc.nextInt());

            Collections.sort(list);
            for (int i = 1; i < list.size() - 1; i++)
                sum += list.get(i);

            long rs = Math.round(sum / 8.0);
            System.out.println("#" + tc + " " + rs);
        }
    }
}
