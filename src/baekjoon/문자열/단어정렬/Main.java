package baekjoon.문자열.단어정렬;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

/*
    길이가 짧은 것부터
    길이가 같으면 사전 순으로 a -> b -> c..
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<String> list = new HashSet<>();
        for (int i = 0; i < n; i++)
            list.add(sc.next());

        Stream<String> sorted = list.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }

                return o1.length() - o2.length();
            }
        });

        Object[] sortedList = sorted.toArray();


        for (Object s : sortedList)
            System.out.println(s);
    }
}
