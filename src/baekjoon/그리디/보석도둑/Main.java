package baekjoon.그리디.보석도둑;

import java.util.*;

/*
    N개의 보석
    무게 M, 가격 V
    K개의 가방
    각 가방은 최대 C무게까지 담을 수 있음. 최대 한개의 보석만 넣을 수 있다.
    최대 가격 구하기
 */
public class Main {
    static class Jewelry {
        int weight;
        int price;

        public Jewelry(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }
    public static int jewelryCount;
    public static int bag;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        jewelryCount = sc.nextInt();
        bag = sc.nextInt();

        ArrayList<Jewelry> list = new ArrayList<>();
        for (int i = 0; i < jewelryCount; i++) {
            Jewelry temp = new Jewelry(sc.nextInt(), sc.nextInt());
            list.add(temp);
        }

        list.sort(Comparator.comparingInt(o -> o.weight));

        ArrayList<Integer> bagList = new ArrayList<>();
        for (int j = 0; j < bag; j++) {
            bagList.add(sc.nextInt());
        }

        Collections.sort(bagList);

        long result = 0L;
        int index = 0;
        PriorityQueue<Integer> priceMinList = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int bag : bagList) {
            for (int j = index; j < jewelryCount; j++) {
                if (bag >= list.get(j).weight) {
                    priceMinList.add(list.get(j).price);
                    index++;
                } else {
                    break;
                }
            }

            if (!priceMinList.isEmpty())
                result += priceMinList.poll();
        }

        System.out.println(result);
    }
}


