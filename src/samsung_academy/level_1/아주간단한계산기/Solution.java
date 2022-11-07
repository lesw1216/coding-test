package samsung_academy.level_1.아주간단한계산기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    두 개의 자연수를 입력받아 사칙연산을 수행

    두 수 입력받는다.
    덧셈 결과 출력
    뺄셈 결과 출력
    곱셈 결과 출력
    나눗셈 결과 출력
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/아주간단한계산기/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
