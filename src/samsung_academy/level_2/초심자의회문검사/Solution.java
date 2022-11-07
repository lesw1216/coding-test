package samsung_academy.level_2.초심자의회문검사;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_2/초심자의회문검사/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            String line = sc.next();
            String reverse = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                reverse = reverse.concat(String.valueOf(line.charAt(i)));
            }

            if (line.equals(reverse))
                System.out.println("#" + tc + " 1");
            else
                System.out.println("#" + tc + " 0");
        }
    }
}
