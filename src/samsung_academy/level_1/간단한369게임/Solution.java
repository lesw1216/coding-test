package samsung_academy.level_1.간단한369게임;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    3, 6, 9가 들어 있을 때 -을 출력,
    -은 들어있는 개수 만큼
    36이면 -- 6이면 -

    1부터 입력받은 값 까지 반복문 실행.
    각 자릿수 마다 3, 6, 9에 해당하는지 검사
    한번이라도 나오면 -, 아니면 일반 숫자 출력

 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/간단한369게임/input.txt"));
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String stringValue = String.valueOf(i);
            boolean check = false;

            // 각 자리가 3, 6, 9 인지 검사
            for (int j = 0; j < stringValue.length(); j++) {
                char c = stringValue.charAt(j);

                if (c == '3' || c == '6' || c == '9') {
                    sb.append("-");
                    check = true;
                }
            }

            // 3,6,9가아니면 출력
            if (!check)
                sb.append(i);

            sb.append(" ");
        }

        System.out.println(sb);
    }
}
