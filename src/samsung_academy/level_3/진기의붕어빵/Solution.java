package samsung_academy.level_3.진기의붕어빵;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_3/진기의붕어빵/input.txt"));
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        // 테스트 케이스 수 설정
        loop1:
        for (int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int cnt = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int person = sc.nextInt();
                list.add(person);
            }

            Collections.sort(list);
            for (int i = 0; i < n; i++) {
                Integer pTime = list.get(i);
                int bTime = k * (pTime/m);
                if (cnt >= bTime) {
                    System.out.println("#" + t + " Impossible");
                    continue loop1;
                }

                cnt++;
            }

            System.out.println("#" + t + " Possible");
        }
    }
}
