package samsung_academy.level_2.조교의성적매기기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
    10개의 평점
    A+ A0 A- B+ B0 B0 B- C+ C0 C- D0

    총점이 높은 순서대로 평점을 차례대로 부과
    총점 = 중간 (35%) + 기말 (45%) + 과제(20%)

    평점은 N명의 학생이 있을 때, N/10 명의 학생에게 동일한 평점 부과 가능
    즉, 각 평점마다 10명의 학생에게 부과할수 있다.

    k번째 학생의 학점을 출력하라.

    N은 항상 10의 배수, 10 ~ 100이하 정수
    K는 1 ~ N 이하의 정수
    동일한 총점인 학생의 입력은 주어지지 않는다.

    각 학생의 중간, 기말, 과제 점수를 입력으로 받는다.
    총점을 계산한다. 배열에 총점을 저장한다.
    1. 제일 높은 총점을 찾는다.
    2. 평점을 매긴다. 평점은 N / 10 의 비율로 매긴다. 10명이면 평점은 1명당 한개씩만가능
    1 ~ 2 반복

 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_2/조교의성적매기기/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            ArrayList<Integer> list = new ArrayList<>();
            String[] rank = {"A+","A0" ,"A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

            int N = sc.nextInt();
            int k = sc.nextInt();

            for (int i = 0; i < N; i++) {
                int mid = sc.nextInt();
                int finals = sc.nextInt();
                int task = sc.nextInt();

                int total = mid * 35 / 100 + finals * 45 / 100 + task * 20 / 100;
                list.add(total);
            }

            ArrayList<String> rankOfStd = new ArrayList<>();
            int rankIndex = 0;
            int rate = N / 10;
            int count = 1;
            int maxIndex = -1;
            while (true) {
                int max = 0;
                for (int i = 0; i < list.size(); i++) {
                    Integer temp = list.get(i);
                    if (max < temp) {
                        maxIndex = i;
                    }
                }

                rankOfStd.add(rank[rankIndex]);
                if (count < rate) {
                    count++;
                } else {
                    rankIndex++;
                    count = 1;
                }


            }


        }
    }
}
