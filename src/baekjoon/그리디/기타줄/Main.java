package baekjoon.그리디.기타줄;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
    끊어진 기타줄 N개
    기타줄 브랜드 M개
    각각의 브랜드에서 파는 기타줄 6개 패키지 가격
    낱개로 살때의 가격
    적어도 N개를 사기 위해 필요한 돈이 최소가 되는 프로그램 작성.

    입력
    첫째 줄 N, M
    N <= 100, M <= 50
    둘째 줄 ~ M 개의 줄
    각 브랜드의 패키지 가격과 낱개의 가격, 0 <= 가격 <= 1000

    1. 끊어진 기타줄이 6개보다 크거나 같을 경우
        낱개 가격이 제일 작은 기타줄로 모두 구매한 가격을 최소값에 넣어두고
        6개의 패키기 가격이 제일 싼 기타줄로 구매후 남은 기타줄을 낱개 가격이 저렴한 기타줄로 구매한 값을
        최소값과 비교한다.
    2. 6개 보다 작을 경우
        낱개 가격이 제일 작은 기타줄로 모두 구매한 가격을 최소값에 넣어두고
        6개의 패키지 가격이 제일 싼 기타줄와 최소값을 비교한다.


 */
public class Main {
    public static int guitarLineCount, brandCount;
    public static PriorityQueue<Integer> packageSorted;
    public static PriorityQueue<Integer> eachSorted;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        guitarLineCount = sc.nextInt();
        brandCount = sc.nextInt();

        packageSorted = new PriorityQueue<>();
        eachSorted = new PriorityQueue<>();

        for (int i = 0; i < brandCount; i++) {
            packageSorted.add(sc.nextInt());
            eachSorted.add(sc.nextInt());
        }

        int result = min();
        System.out.println(result);
    }

    public static int min() {

        int min = Integer.MAX_VALUE;
        while (true) {
            // 끊어진 기타줄이 6개보다 많을 경우
            if (guitarLineCount > 6 && !eachSorted.isEmpty() && !packageSorted.isEmpty()) {
                int smallEachPay = eachSorted.peek();
                min = Math.min(min, smallEachPay * guitarLineCount);

                // 제일 저렴한 패키지 가격
                int smallPackage = packageSorted.peek();
                int temp = (guitarLineCount / 6) * smallPackage;
                int temp2 = (guitarLineCount % 6) * smallEachPay;
                min = Math.min(min, temp + temp2);

                // 해당 갯수를 넘개 사도 패키지가 싼 경우
                if (guitarLineCount % 6 != 0) {
                    int maxPackage = (guitarLineCount / 6) + 1;
                    int tempPackage = maxPackage * smallPackage;
                    min = Math.min(min, tempPackage);
                }

                return min;
            } else if (!eachSorted.isEmpty() && !packageSorted.isEmpty()){
                int smallEachPay = eachSorted.peek();
                min = Math.min(min, smallEachPay * guitarLineCount);

                // 제일 저렴한 패키지 가격
                int smallPackage = packageSorted.peek();
                min = Math.min(min, smallPackage);
                return min;
            }
        }
    }
}
