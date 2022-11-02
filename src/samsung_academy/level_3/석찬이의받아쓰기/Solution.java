package samsung_academy.level_3.석찬이의받아쓰기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int len = sc.nextInt();
            int cnt = 0;

            String problem = sc.next();
            String write = sc.next();

            for (int i = 0; i < len; i++) {
                if (problem.charAt(i) == write.charAt(i))
                    cnt++;
            }

            System.out.println("#" + tc + " " + cnt);
        }
    }
}
