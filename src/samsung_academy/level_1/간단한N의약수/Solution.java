package samsung_academy.level_1.간단한N의약수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    N의 약수를 구하기
    N을 입력받는다.

    N을 1부터 나눈다.
    나머지가 0이면 N을 나눈 해당 값은 N의 약수이다.
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/간단한N의약수/input.txt"));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }

        ArrayList<Integer> list = new ArrayList<>();
        double sqrt = Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                if (Math.pow(i, 2) == n)
                    list.add(i);
                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
