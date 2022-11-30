package baekjoon.그리디.숫자5와6의차이;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        // 문자열 a에 있는 6을 모두 5로 변환
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) - '0' == 6)
                sb.append("5");
            else
                sb.append(a.charAt(i));
        }
        int intA = Integer.parseInt(sb.toString());

        // 문자열 b에 있는 6을 5로 변환
        sb.delete(0, sb.length()); // 초기화
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) - '0' == 6)
                sb.append("5");
            else
                sb.append(b.charAt(i));
        }
        int intB = Integer.parseInt(sb.toString());

        int min = intA + intB;

        // 문자열 a에 있는 5을 모두 6으로 변환
        sb.delete(0, sb.length());
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) - '0' == 5)
                sb.append("6");
            else
                sb.append(a.charAt(i));
        }
        intA = Integer.parseInt(sb.toString());

        // 문자열 b에 있는 5을 모두 6으로 변환
        sb.delete(0, sb.length());
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) - '0' == 5)
                sb.append("6");
            else
                sb.append(b.charAt(i));
        }
        intB = Integer.parseInt(sb.toString());

        int max = intA + intB;

        System.out.println(min + " " + max);
    }
}
