package baekjoon.그리디.보석도둑;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*
    N개의 보석
    무게 M, 가격 V
    K개의 가방
    각 가방은 최대 C무게까지 담을 수 있음. 최대 한개의 보석만 넣을 수 있다.
    최대 가격 구하기
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] list = new int[N][2];
        LinkedList<ArrayList<Integer>> aList = new LinkedList<>();

//        for (int i = 0; i < N; i++) {
//            list[i][0] = sc.nextInt();
//            list[i][1] = sc.nextInt();
//        }

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());

            aList.add(temp);
        }

        int[] bagSize = new int[K];
        for (int i = 0; i < K; i++) {
            bagSize[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;
        int maxIndex = -1;
//        for (int i = 0; i < K; i++) {
//            for (int j = 0; j < N; j++) {
//                if (list[j][0] <= bagSize[i]) {
//                    max = Math.max(max, list[j][1]);
//                    maxIndex = j;
//                }
//            }
//            sum += max;
//            max = 0;
//
//        }

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < aList.size(); j++) {
                ArrayList<Integer> temp = aList.get(j);
                if (temp.get(0) <= bagSize[i]) {
                    max = Math.max(max, temp.get(1));
                    maxIndex = j;
                }
            }

            sum += max;
            max = 0;
            aList.remove(maxIndex);
        }

        System.out.println(sum);
    }
}
