package baekjoon.그래프.미로탐색;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int n, m;
    public static int[][] map;
    static class Node {
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = temp.charAt(j) - '0';
            }
        }
        System.out.println(dfs(0, 0));
    }

    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static int dfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            Node outNode = q.poll();
            x = outNode.getX();
            y = outNode.getY();

            // 해당 노드의 상, 하, 좌, 우 검사?
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;

                if (map[nx][ny] == 0)
                    continue;

                if (map[nx][ny] == 1) {
                    q.offer(new Node(nx, ny));
                    map[nx][ny] = map[x][y] + 1;
                }
            }
        }
        return map[n - 1][m - 1];
    }
}
