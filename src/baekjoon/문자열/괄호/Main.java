package baekjoon.문자열.괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            Stack<Character> st = new Stack<>();
            String line = sc.next();

            for (int i = 0; i < line.length(); i++) {
                char ps = line.charAt(i);
                if (ps == '(')
                    st.push(ps);
                else if (st.size() == 0 && ps == ')')
                    st.push(ps);

                // 작은 vps가 되었을 경우
                if (st.peek() == '(' && ps == ')')
                    st.pop();
            }

            if (st.size() == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
