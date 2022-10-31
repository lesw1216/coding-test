package samngsung_academy.level_3.오목판정;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static char[][] map;

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samngsung_academy/level_3/오목판정/input.txt"));

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        test:
        for (int tc = 1; tc <= T; tc++) {
            int size = sc.nextInt();

            map = new char[size][size];

            for (int i = 0; i < size; i++) {
                String s = sc.next();
                for (int j = 0; j < size; j++) {
                    map[i][j] = s.charAt(j);
                }
            }

            // 2차원 배열에서 모든 요소 탐색은 항상 이중 for문 보통 i를 세로, j를 가로로 설정
            // 즉 바깥 for문에서 i를 쓰고, 안쪽 for문에서 j를 사용한다.
            //di, dj
            // 아래 방향 : i 증가 j 변화 없음 (i, j) => (1, 0)
            // 오른쪽 방향 : i 변화 없음, j 증가 (0, 1)
            // 우하향 대각선 : i, j 둘다 증가 (1, 1)
            // 우상향 대각선 : i 감소, j 증가 (-1, 1)


            // 하나의 요소에서 4개의 방향을 모두 체크해야한다. 그러면?
            int[][] di_j = {{1, 0}, {0, 1}, {-1, 1}, {1, 1}};

//            start:
//            for (int si = 0; si < size; si++) {
//                for (int sj = 0; sj < size; sj++) {
//                    for (int[] dir : di_j) {
//                        for (int sk = 0; sk < 5; sk++) {
//                            if ((dir[0] == 1 && dir[1] == 0) && (si + (sk * dir[0])) >= size)
//                                continue start;
//                            else if ((dir[0] == 0 && dir[1] == 1) && (sj + (sk * dir[1])) >= size)
//                                continue start;
//                            else if ((dir[0] == -1 && dir[1] == 1) && (si + (sk * dir[0])) < 0)
//                                continue start;
//
//                            if (map[si + (sk * dir[0])][sj + (sk * dir[1])) {
//
//                            }
//                        }
//                    }
//                }
//            }


            // 세로, 가로, 우하향 대각, 우상향 대각, 각각의 메서드?
            int[] dc = {1, 0};
        }
    }
}
