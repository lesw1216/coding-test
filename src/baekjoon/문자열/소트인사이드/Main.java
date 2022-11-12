package baekjoon.문자열.소트인사이드;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < line.length(); i++) {
            list.add(line.charAt(i) - '0');
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return -1;
                else if (o1.equals(o2))
                    return 0;
                else
                    return 1;
            }
        });

        for (int i = 0; i < line.length(); i++)
            System.out.print(list.get(i));

    }
}
