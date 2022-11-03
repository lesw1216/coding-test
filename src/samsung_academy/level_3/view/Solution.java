package samsung_academy.level_3.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
    왼쪽과 오른쪽의 각각의 거리가 2 이상의 공간이 확보 되었을 때 조망권이 확보
    맨왼쪽 두칸, 맨 오른쪽 두칸에는 건물이 없다.

    각 건물을 기준으로 왼쪽 두개 건물, 오른쪽 두개 건물 중 제일 높은 건물과 비교해서 기준 건물이 더 높다면
    기준 건물 - 비교하는 건물 중 제일 높은 건물 = 기준 건물에서 조망권이 확보된 세대 수

    만약 조망권이 확보된 세대가 있는 건물이 있다면, 오른쪽 두개 건물까지는 조망권을 회득한 세대수가 없는 건물이다.
    따라서 다음 건물을 체크하기위해선 2개 건물 다음의 3번째 건물 부터 조망권 체크를 다시 시작한다.
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_3/view/input.txt"));
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int N = sc.nextInt();   // 건물의 개수
            int sum = 0; // 조망권 세대 수 저장 변수
            ArrayList<Integer> buildings = new ArrayList<>();

            // N개의 건물 입력 받기
            for (int i = 0; i < N; i++)
                buildings.add(sc.nextInt());

            // 조망권 세대 체크 로직
            for (int i = 2; i < buildings.size() - 2; i++) {
                int leftHighBuilding = Math.max(buildings.get(i - 2), buildings.get(i - 1)); // 왼쪽 두 건물 중 최대 높이 건물
                int rightHighBuilding = Math.max(buildings.get(i + 1), buildings.get(i + 2)); // 오른쪽 두 건물 중 최대 높이 건물
                int highBuildings = Math.max(leftHighBuilding, rightHighBuilding); // 제일 높은 건물

                if (buildings.get(i) > highBuildings) {
                    sum += buildings.get(i) - highBuildings;
                    i += 2;
                    /*
                        i를 오른쪽 두칸 건물 위치로 옮겨 다음 i는 그 다음 건물을 체크 할 수있도록 한다.
                        반복문을 다시 시작하면 i가 한번 더 증가 되므로, 여기서 2만 증가시켜 준다.
                     */
                }
            }

            System.out.println("#" + tc + " " + sum);
        }
    }
}
