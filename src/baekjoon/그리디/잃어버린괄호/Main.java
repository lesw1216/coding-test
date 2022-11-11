package baekjoon.그리디.잃어버린괄호;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
    양수, +, -, 괄호를 가지고 식을 생성, 괄호 삭제

    괄호를 사용해 식이 최소값이 되도록 만들어보자.

    -가 나오면 그다음숫자부터 다음 -가 나올때까지 모두 더하여 하나의 -수로 만들자.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        StringTokenizer st = new StringTokenizer(line, "-");

        int sum = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            int temp = 0;


            StringTokenizer addToken = new StringTokenizer(st.nextToken(), "+");
            while (addToken.hasMoreTokens()) {
                temp += Integer.parseInt(addToken.nextToken());
            }

            if (sum == Integer.MAX_VALUE)
                sum = temp;
            else
                sum -= temp;
        }

        System.out.println(sum);
    }
}
