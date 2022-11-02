package samsung_academy.level_3.퍼펙트셔플;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_3/퍼펙트셔플/input.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc);
            Queue<String> a = new LinkedList<>();
            Queue<String> b = new LinkedList<>();

            int size = sc.nextInt();
            sc.nextLine();
            String[] line = sc.nextLine().split(" ");

            for (int i = 0; i < size; i++) {
                // 저장된 사이즈가 짝수일 때
                if (size % 2 == 0) {
                    // 정확히 중간
                    if (i < size / 2)
                        a.add(line[i]);
                    else
                        b.add(line[i]);
                } else {
                    // 사이즈가 홀수 일때
                    if (i <= size / 2)
                        a.add(line[i]);
                    else
                        b.add(line[i]);
                }
            }

            while (true) {
                sb.append(" ").append(a.poll()).append(" ").append(b.poll());

                if (a.size() > 0 && b.size() == 0)
                    sb.append(" ").append(a.poll());

                if (a.size() == 0)
                    break;
            }

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
