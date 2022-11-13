package baekjoon.문자열.알파벳개수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        int[] list = new int[26];
        for (int i = 0; i < line.length(); i++) {
            list[line.charAt(i) - 'a'] += 1;
        }

        for (int count : list) {
            System.out.print(count + " ");
        }
    }
}
