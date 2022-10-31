package samngsung_academy.level_3.팔씨름;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    15번 팔씨름하여 8번 이상 이기면 점심 값 면제
    k번 팔씨름을 했는데, 결과를 s[1~k] 문자열에 저장, 이기면 o, 지면 x
    소정이가 점심값을 면제받을 `가능성` 확인하는 프로그램 작성.

    가능성이라는건, 현재 입력된 상황에서 소정이가 몇번을 졌는지만 확인하면 된다?
    2번 팔씨름을 하고 x가 두개일때, 아직 나머지 판의 결과는 모르니 이길 수 있는 가능성에 포함
    그러면 count가 7보다 작으면 가능성이 있는거네
    s 문자 배열에 x의 개수를 카운트.
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samngsung_academy/level_3/팔씨름/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int count = 0;
            String[] line = sc.next().split("");
            for (String re : line) {
                if (re.equals("x")) {
                    count++;
                }
            }

            if (count <= 7)
                System.out.println("#" + (tc + 1) + " YES");
            else
                System.out.println("#" + (tc + 1) + " NO");
        }
    }
}
