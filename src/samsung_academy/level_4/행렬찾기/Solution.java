package samsung_academy.level_4.행렬찾기;

import java.util.Scanner;

/*
    n^2개가 n x n 2차원 배열로 구성
    빈 용기에 해당하는 원소 : 0, 종류에 따라 1 ~ 9 사이의 정수 저장
    1. 용기들이 사각형을 이루고 있다. 내부에는 빈용기 즉, 0이 없다.
    2. 사각형들은 각각 크기가 다르다.
    3. 2개 이상의 사각형들은 빈용기로 경계가 구분, 단 대각선으로는 있을수도 없을수도 있다.

    입력
    테스트케이스 개수 입력
    테스트 케이스가 각 라인에 주어진다.
    첫줄 양의 정수 n이 주어진다.
    다음 n 줄에는 n x n 행렬의 모습으로 각 행이 한줄에 입력 받아진다.

    출력
    부분 행렬들의 총 개수, 행렬들의 행과 열의 크기 출력,
    이때 행과 열을 곱한 값이 작은 순으로 출력, 크기가 같다면 행이 작은 것 부터 출력,

 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();


        }
    }
}
