package samsung_academy.level_1.신문헤드라인;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    신문 헤드라인
    소문자 문자열을 입력받았을 때 대문자로 변환하여 출력하라
 */

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/신문헤드라인/input.txt"));
        Scanner sc = new Scanner(System.in);

        // 문자열 입력 받기
        String line = sc.next();

        // 대문자로 변환하기
        String upperLine = line.toUpperCase();

        // 출력하기
        System.out.println(upperLine);
    }
}
