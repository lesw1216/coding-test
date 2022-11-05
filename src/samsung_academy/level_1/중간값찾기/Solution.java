package samsung_academy.level_1.중간값찾기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    2063
    입력으로 N개의 값이 주어졌을 때, 중간값을 출력
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_1/중간값찾기/input.txt"));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++)
            arr.add(sc.nextInt());

        Collections.sort(arr);
        System.out.println(arr.get(N / 2));
    }
}
