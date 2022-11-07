package samsung_academy.level_2.백만장자프로젝트;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

/*
    연속한는 N일 동안의 물건의 매매가 예측
    하루에 최대 한개만 구입 가능.
    판매는 언제든 가능

    N일을 입력받고 매일 원자재의 가격을 입력 받는다.


 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_2/백만장자프로젝트/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            long sum = 0L;
            int max = 0;

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++)
                list.add(sc.nextInt());

            max = list.get(N - 1);
            for (int i = N - 2; i >= 0; i--) {
                Integer price = list.get(i);
                if (max > price) {
                    sum += max - price;
                } else {
                    max = price;
                }
            }

            System.out.println("#" + tc + " " + sum);
        }
    }
}
