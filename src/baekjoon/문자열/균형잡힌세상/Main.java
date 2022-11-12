package baekjoon.문자열.균형잡힌세상;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line;

        while (true) {
            line = sc.nextLine();

            if (line.equals("."))
                break;

            String result = psCheck(line);
            System.out.println(result);

        }
    }

    private static String psCheck(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            try {

                if (c == '(' || c == '[')
                    stack.push(c);
                else if (c == ')') {
                    if (stack.peek() != '(' || stack.empty()) {
                        return "no";
                    }
                    else
                        stack.pop();
                } else if (c == ']') {
                    if (stack.peek() != '[' || stack.empty()) {
                        return "no";
                    }
                    else
                        stack.pop();
                }
            } catch (EmptyStackException ignored) {

            }
        }

        // 문자열을 모두 탐색하고 나왔을 때
        if (stack.empty())
            return "yes";
        else
            return "no";
    }
}
