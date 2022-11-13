package baekjoon.문자열.듣보잡;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
    N, M 입력받는다.
    한줄로 문자 입력 받는다.
    set에 저장?
    다 돌면
    set 출력?
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        for (int i = 0; i < m; i++) {
            String line = sc.next();
            if (!set.add(line)) {
                list.add(line);
                count++;
            }
        }

        System.out.println(count);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
