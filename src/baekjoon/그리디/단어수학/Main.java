package baekjoon.그리디.단어수학;

import java.util.*;

/*
    길이가 같은 문자열이면 첫번째 문자열 부터 차례대로 제일큰 숫자를 부여
    다르다면
        길이가 긴 문자열부터 제일큰 숫자를 부여하다가 작은 문자열이 시작되는 부분에서 부터는 번갈아 가면서
        부여
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();

        ArrayList<String> list = new ArrayList<>();
        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            list.add(sc.next());
        }

        list.sort(Comparator.reverseOrder());

        for (String line : list) {

        }
    }
}
