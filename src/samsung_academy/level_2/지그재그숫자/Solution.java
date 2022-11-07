package samsung_academy.level_2.지그재그숫자;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    1 ~ N 까지의 숫자에서 홀수는 더하고, 짝수는 뺐을 때 누적된 값

 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_2/지그재그숫자/input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int rs = 0;

            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0)
                    rs -= i;
                else
                    rs += i;
            }

            System.out.println("#" + tc + " " + rs);
        }
    }
}
