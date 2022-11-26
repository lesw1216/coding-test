package baekjoon.그리디.단어수학;

import java.sql.Array;
import java.util.*;

/*
    길이가 같은 문자열이면 첫번째 문자열 부터 차례대로 제일큰 숫자를 부여
    다르다면
        길이가 긴 문자열부터 제일큰 숫자를 부여하다가 작은 문자열이 시작되는 부분에서 부터는 번갈아 가면서
        부여

    각 알파벳에 자리수를 붙여주고, 배열을 만들어 알파벳 값들을 저장해주자.
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

        int[] apList = new int[26];
        for (String line : list) {
            int digit = line.length() - 1;
            for (char ch : line.toCharArray()) {
                int index = ch - 'A';
                apList[index] += Math.pow(10, digit);
                digit--;
            }
        }

        Integer[] inteList = Arrays.stream(apList).boxed().toArray(Integer[]::new);
        Arrays.sort(inteList, ((o1, o2) -> {return o2 - o1;}));

        int s = 9;
        int sum = 0;
        for (int i : inteList) {
            if (i == 0)
                break;
            sum += (s * i);
            s--;
        }

        System.out.println(sum);
    }
}
