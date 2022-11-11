package baekjoon.구현.세수;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[3];

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);
        System.out.println(list[1]);
    }
}
