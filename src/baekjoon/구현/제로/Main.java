package baekjoon.구현.제로;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int money = sc.nextInt();
            if (money == 0)
                stack.pop();
            else
                stack.push(money);
        }

        try {
            int sum = 0;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                sum += stack.pop();
            }

            System.out.println(sum);
        } catch (EmptyStackException e) {
            System.out.println(0);
        }
    }
}
