package baekjoon.그리디.수리공항승;

import java.util.Arrays;
import java.util.Scanner;

/*
    물이 새는 곳은 가장 왼쪽에서 정수 만큼 떨어진 거리만 물이 샌다.
    항승이는 길이가 L인 테이프를 무한개 가지고 있음.
    물을 막는 위치의 적어도 좌우 0.5만큼 간격을 줘야 물이 다시 안샘.

    물이 새는 곳의 위치, 테이프의 길이 L이 주어진다. 이때 필요한 테이프의 최소 개수
    테이프를 자를수없고, 겹쳐 붙이는건 가능하다.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int tapeCount = 1;
        int tapelen = (int) (list[0] - 0.5 + l);

        for (int i = 1; i < list.length; i++) {
            // 테이프를 붙인 곳의 마지막 위치보다 해당 물이 새는 곳 - 0.5의 위치보다 더 클 때
            if (tapelen < list[i] - 0.5) {
                tapelen = (int) (list[i] - 0.5 +l);
                tapeCount++;
            }
        }

        System.out.println(tapeCount);
    }
}
