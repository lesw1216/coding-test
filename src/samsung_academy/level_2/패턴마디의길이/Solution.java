package samsung_academy.level_2.패턴마디의길이;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    패턴에서 반복되는 부분을 마디
    마디의 길이를 출력

    입력을 받는다.
    문자열을 문자로 분리하여 2번 중복되는 순간 마디의 시작이다.
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_2/패턴마디의길이/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String line = sc.next();

            for (int i = 1; i < line.length(); i++) {
                String sub1 = line.substring(0, i);
                String sub2 = line.substring(i, i * 2);

                if (sub1.equals(sub2)) {
                    System.out.println("#" + tc + " " + sub1.length());
                    break;
                }
            }
        }
    }
}
