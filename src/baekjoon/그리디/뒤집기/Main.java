package baekjoon.그리디.뒤집기;

import java.util.Scanner;

/*
    뒤집기
    0,1 문자로 이루어진 문자열 S
    모든 숫자를 같게 만들자.
    맨 앞의 문자로 모두 변환.

    문자열을 쪼개 하나의 문자를 탐색한다.
    맨앞의 문자를 a라고 하자(0,1)
    그 다음 문자들이 a가 나오면 변환횟수를 증가시키지 않고 계속 탐색한다.
    다음 문자가 a가 아닌 문자가 나온다면 변환횟수를 증가시키고, 변환 체크 변수 true로 변경 다음문자가 a가 나올때까지
    탐색한다.
    a가 나오면 변환 체크 변수 false로 변경
 */
public class Main {
    public static boolean convertCheck;
    public static String[] line;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 입력 받고 배열로 저장하기
        line = sc.next().split("");

        // 첫번째 문자 확인
        String first = line[0];

        int count = 0;
        for (int i = 1; i < line.length;i++) {
            // 첫번째 문자와 다른 문자가 나왔을 때
            if (!first.equals(line[i]) && !convertCheck) {
                convertCheck = true;
                count++;
            } // 변환하다가 첫번째 문자가 나왔을때
            else if (first.equals(line[i])){
                convertCheck = false;
            }
        }

        System.out.println(count);
    }
}
