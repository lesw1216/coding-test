package samsung_academy.level_1.가위바위보;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    가위: 1, 바위: 2, 보: 3

    a, b 입력 받는다.
    보 > 바위 > 가위 > 보 : 3 > 2 > 1 > 3
    가위 > 보 : 1 > 3
    바위 > 가위 : 2 > 1
    보 > 바위 : 3 > 2

    if a = 1 and b = 3
        return a
    else if a = 2 and b = 1
        return a
    else if a = 3 and b = 2
        return a
    else
        return b

    a의 이기는 경우의 수를 모두 비교한다. 그외는 모두 a가 지는 경우의 수이므로 else 가 b를 반환하게 한다.
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/가위바위보/input.txt"));
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1 && b == 3)
            System.out.println("A");
        else if (a == 2 && b == 1)
            System.out.println("A");
        else if (a == 3 && b == 2)
            System.out.println("A");
        else
            System.out.println("B");
    }
}
