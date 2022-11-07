package samsung_academy.level_1.서랍속비밀번호;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    서랍속 비밀번호
    비밀번호 p : 000 ~ 999 중 하나.
    임시의 값 K가 주어지고 K부터 비밀번호 대조, K의 증가는 1씩 증가

    무한 루프를 돌린다.
        k가 999보다 크다면
            k를 000으로 초기화
        k를 p와 비교한다.
            k == p 이면 횟수 반환
            무한루프 종료
        아니면
            k를 1 증가 시킨다.
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/서랍속비밀번호/input.txt"));
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while (true) {
            if (k > 999)
                k = 0;

            count++;
            if (k == p) {
                System.out.println(count);
                return;
            } else
                k++;

        }
    }
}
