package baekjoon.문자열.균형잡힌세상;

import java.util.Scanner;
import java.util.Stack;

/*
    무한 루프
        맨 처음이 . 라면 무한 루프 종료

        한줄을 입력받는다.
        한줄을 쪼개기 반복문
            if 문자 하나가 (,[ 둘중 하나라면
                해당 문자를 스택에 push
            else if 문자 == (
                if (stack.peek() != ')' || stack.empty)
                    균형을 이루지 않음? 어떻게 표현?
            else if 문자 == [
                if (stack.peek() != '] || stack.empty)
                    균형을 이루지 않음

        한줄 문자에서 한 문자를 쪼개고 난후
        스택비어있으면
            yes
        비어있지 않으면
            no



 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
    무한 루프
        한줄을 입력받는다.
        맨 처음이 . 라면 무한 루프 종료

        한줄을 쪼개기 반복문
            if 문자 하나가 (,[ 둘중 하나라면
                해당 문자를 스택에 push
            else if 문자 == )
                if (stack.peek() != '(' || stack.empty)
                    균형을 이루지 않음? 어떻게 표현?
            else if 문자 == ]
                if (stack.peek() != '[' || stack.empty)
                    균형을 이루지 않음

        한줄 문자에서 한 문자를 쪼개고 난후
        스택비어있으면
            yes
        비어있지 않으면
            no
 */
        while (true) {
            String line = sc.nextLine();

            if (line.equals("."))
                break;

            String result = psCheck(line);
            System.out.println(result);
        }
    }

    public static String psCheck(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '(' || c == '[')
                stack.push(c);
            else if (c == ')') {
                if (stack.empty() || stack.peek() != '(' ) {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.empty())
            return "yes";
        else
            return "no";
    }
}
