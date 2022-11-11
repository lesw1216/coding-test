package baekjoon.구현.음계;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[8];

        for (int i = 0; i < 8; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            if (list[0] == 1) {
                if (list[i] + 1 != list[i + 1]) {
                    System.out.println("mixed");
                    break;
                } else if (i == 6) {
                    System.out.println("ascending");
                    break;
                }
            } else if (list[0] == 8) {
                if (list[i] - 1 != list[i + 1]) {
                    System.out.println("mixed");
                    break;
                } else if (i == 6) {
                    System.out.println("descending");
                    break;
                }
            } else {
                System.out.println("mixed");
                break;
            }
        }
    }
}
