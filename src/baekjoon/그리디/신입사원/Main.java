package baekjoon.그리디.신입사원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int tc = 1; tc <= T; tc++) {
//            int n = sc.nextInt();
            int n = Integer.parseInt(bf.readLine());
            int[][] list = new int[n][2];
            for (int i = 0; i < n; i++) {
//                list[i][0] = sc.nextInt();
//                list[i][1] = sc.nextInt();
                String[] s = bf.readLine().split(" ");
                list[i][0] = Integer.parseInt(s[0]);
                list[i][1] = Integer.parseInt(s[1]);

            }

            Arrays.sort(list, ((o1, o2) -> {return o1[0] - o2[0];}));

            int count = 1;
            int topRank = list[0][1];
            for (int i = 1; i < list.length; i++) {
                if (topRank > list[i][1]) {
                    topRank = list[i][1];
                    count++;
                }
            }

            System.out.println(count);
        }

        bf.close();
    }
}
