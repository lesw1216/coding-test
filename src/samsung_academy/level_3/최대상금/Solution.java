package samsung_academy.level_3.최대상금;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    주어진 숫자판들 중에 두개를 선택해 서로 자리의 위치 교환 가능하고, 교환 횟수는 정해져 있다.
    가중치를 부여한다. 오른쪽 끝에서 1원 부터 시작해 10배수로 증가.
    EX) 숫자판이 5개면, 10000 1000 100 10 1 가중치

    주의할 점
    반드시 주어진 횟수만큼만 교환 가능
    동일한 위치의 교환 중복 가능
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_3/최대상금/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String sNum = sc.next();
            int changeTime = sc.nextInt();

            ArrayList<Integer> num = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < sNum.length(); i++)
                num.add(sNum.charAt(i) - '0');

            // 교환 횟수만큼 반복
            for (int i = 0; i < changeTime; i++) {
                while (true) {
                    if (num.size() == 0)
                        break;

                    Integer first = num.get(0);
                    Integer max = Collections.max(num);

                    // 첫번째 숫자가 최대값 보다 작다면
                    if (first < max) {
                        int maxIndex = num.indexOf(max); // 최대값의 위치 반환

                        // 인덱스 교환
                        int temp = num.get(0);
                        num.remove(0);
                        num.add(0, max);

                        num.remove(maxIndex);
                        num.add(maxIndex, temp);
                        result.add(num.remove(0));
                        break;
                    } else
                        result.add(num.remove(0));
                }

                for (int j = 0; j < num.size(); j++) {
                    result.add(num.remove(0));
                }
            }
            System.out.println(num);
            System.out.println(result);
        }
    }
}
