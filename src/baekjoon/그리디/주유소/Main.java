package baekjoon.그리디.주유소;

import java.math.BigInteger;
import java.util.Scanner;

/*
    각 도시는 리터당 원으로 기름값이 다르다.
    최소 주유 비용을 찾아라.

    현재 도시의 기름 값보다 더 작은 도시가 나올때까지 갈수있는 기름의 양을 주유한다.
    더 기름값이 싼 도시가 나오면 거기서 다시 더 작은 도시가 나올때까지 갈수있는 거리만큼 주유한다.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] oil = new int[n];
        int[] distance = new int[n - 1];

        for (int i = 0; i < distance.length; i++)
            distance[i] = sc.nextInt();

        for (int i = 0; i < oil.length; i++)
            oil[i] = sc.nextInt();

        BigInteger sum = new BigInteger("0");
        int startCity = 0;
        for (int i = 1; i < oil.length; i++) {
            if (oil[startCity] >= oil[i]) {
                BigInteger distanceSum = new BigInteger("0");
                for (int j = startCity; j < i; j++) {
                    distanceSum = distanceSum.add(new BigInteger(String.valueOf(distance[j])));
                }
                sum = sum.add(new BigInteger(String.valueOf(distanceSum.multiply(new BigInteger(String.valueOf(oil[startCity]))))));
//                sum += oil[startCity] * distanceSum;
                startCity = i;
            }
        }

        System.out.println(sum);
    }
}
