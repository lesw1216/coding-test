package samsung_academy.level_3.magnetic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    푸른 자성체 : N극에 이끌리는 성질, 붉은 자성체 : S극에 끌리는 성질
    각 자성체가 끌리면서 다른 색상과 충돌하면 교착 상태에 빠짐.
    교착상태의 개수를 구하라.

    입력
    10개의 테스트 케이스
    테스트 케이스의 첫번째 입력 줄 : 정사각형 테이블의 한변의 길이 N(항상 100)
    각 행의 입력을 한줄에 받음.
    1은 S극에 이끌리는 성질, 0은 N극에 이끌리는 성질
    테이블의 윗부분은 N극, 아랫부분은 S극

    1은 아래 부분인 S극에 이끌린다.
    2는 윗부분인 N극에 이끌린다.
 */
public class Solution {

    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("src/samsung_academy/level_3/magnetic/input.txt"));

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 반복
        for (int tc = 1; tc <= 10; tc++) {
            int lineSize = sc.nextInt();
            int[][] table = new int[lineSize][lineSize];
            int cnt = 0;

            // 테이블에 입력받은 자성체들을 저장한다.
            for (int row = 0; row < lineSize; row++) {
                for (int col = 0; col < lineSize; col++) {
                    int inputValue = sc.nextInt();

                    table[row][col] = inputValue;
                }
            }

            // row : 행, col : 열
            // 왼쪽부터 오른쪽 탐색이 아닌 위부터 아래쪽 탐색을 실시한다.
            // 1이 나오면, 2가 나올때까지 다음 번 자성체들을 검사한다.
            // 이때, checkSecond 를 사용하여 1 다음 2가 아닌 단독으로 2먼저 나올경우를 배제시켜준다.
            // checkSecond 가 true 라 함은 1이 2 이전에 나와서 2가 다음 자성체로 나올때까지 루프를 돌고 있음을 의미한다.
            for (int col = 0; col < lineSize; col++) {
                boolean checkSecond = false;
                for (int row = 0; row < lineSize; row++) {
                    if (table[row][col] == 1) {
                        checkSecond = true;
                        continue;
                    }

                    if (table[row][col] == 2 && checkSecond) {
                        cnt++;
                        checkSecond = false;
                    }
                }
            }

            System.out.println("#" + tc + " " + cnt);
        }
    }
}
