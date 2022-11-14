package baekjoon.그래프.바이러스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static boolean[] visited;
    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = sc.nextInt();
        int network = sc.nextInt();

        // 방문횟수 초기화.
        visited = new boolean[com + 1];
        Arrays.fill(visited, false);

        // 이중 리스트 초기화
        for (int i = 0; i <= com; i++) {
            graph.add(i, new ArrayList<>());
        }

        // 입력 받기
        for (int i = 0; i < network; i++) {
            int input = sc.nextInt();
            int secondInput = sc.nextInt();
            ArrayList<Integer> list = graph.get(input);
            list.add(secondInput);

            ArrayList<Integer> list2 = graph.get(secondInput);
            list2.add(input);
        }

        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int startNode) {
        visited[startNode] = true;
        ArrayList<Integer> nodeList = graph.get(startNode);
        Collections.sort(nodeList);

        for (int i = 0; i < graph.get(startNode).size(); i++) {
            Integer nextNode = graph.get(startNode).get(i);
            if (!visited[nextNode]) {
                count++;
                dfs(nextNode);
            }
        }
    }
}
