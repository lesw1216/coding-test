package baekjoon.그리디.수묶기;

import java.util.*;

public class Main {
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        PriorityQueue<Integer> plusNum = new PriorityQueue<>((o1, o2) -> o2 - o1);
        PriorityQueue<Integer> minusNum = new PriorityQueue<>();
        boolean zero = false;

        for (int i = 0; i < n;i ++) {
            int temp = sc.nextInt();
            if (temp < 0)
                minusNum.add(temp);
            else if (temp > 0)
                plusNum.add(temp);
            else
                zero = true;
        }

        int sum = 0;

        // 모두 양수인 경우


        // 모두 음수인 경우

        // 양수 음수 둘다 있는 경우

        // 양수 음수, 0 셋다 있는 경우

        while (true) {
            if (plusNum.isEmpty() && minusNum.isEmpty())
                break;

            // 양수 우선순위 큐에 값이 있는 경우
            if (!plusNum.isEmpty()) {
                // 하나만 값이 있는 경우
                if (plusNum.size() == 1) {
                    sum += plusNum.poll();
                } else {
                    int a = plusNum.poll();
                    int b = plusNum.poll();
                    sum += Math.max(a * b, a + b);
                }
            }

            if (!minusNum.isEmpty()) {
                // 하나만 값이 있는 경우
                if (minusNum.size() == 1) {
                    // 수열에 0이 있다면 넘어가고 0이 없다면 sum에 더해주기
                    if (!zero) {
                        sum += minusNum.poll();
                    } else {
                        minusNum.clear();
                    }
                }  else {
                    int a = minusNum.poll();
                    int b = minusNum.poll();
                    sum += (a * b);
                }
            }
        }

        System.out.println(sum);
    }
}
