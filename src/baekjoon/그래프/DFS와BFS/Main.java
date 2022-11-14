package baekjoon.그래프.DFS와BFS;

import java.util.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeCount = sc.nextInt();
        int edgeCount = sc.nextInt();
        int startNode = sc.nextInt();

        visited = new boolean[nodeCount + 1];
        Arrays.fill(visited, false);

        // 내부 리스트 초기화
        for (int i = 0; i <= nodeCount; i++) {
            nodes.add(i, new ArrayList<>());
        }

        for (int i = 0; i < edgeCount; i++) {
            int firstInputNode = sc.nextInt();
            int secondInputNode = sc.nextInt();
            ArrayList<Integer> list = nodes.get(firstInputNode);
            list.add(secondInputNode);

            ArrayList<Integer> list2 = nodes.get(secondInputNode);
            list2.add(firstInputNode);
        }

        // dfs
        dfs(startNode);

        System.out.println();
        Arrays.fill(visited, false);

        // bfs
        bfs(startNode);
    }

    public static void dfs(int startNode) {
        visited[startNode] = true;
        System.out.print(startNode + " ");
        ArrayList<Integer> list = nodes.get(startNode);
        Collections.sort(list);

        for (int i = 0; i < nodes.get(startNode).size(); i++) {
            Integer node = list.get(i);
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        // 시작 정점은 자의적으로 추가하고, 방문 확인 까지 체크해준다.
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {

            Integer outNode = q.poll();
            System.out.print(outNode + " ");

            // 큐에서 나온 노드와 인접한 노드들의 리스트를 꺼내온다.
            for (int i = 0; i < nodes.get(outNode).size(); i++) {
                Integer node = nodes.get(outNode).get(i);
                if (!visited[node]) {
                    q.offer(node);
                    visited[node] = true;
                }
            }
        }
    }
}
