package programmers.programmers.java.solv_20230725;

import java.util.LinkedList;
import java.util.Queue;

public class shortDist_bfs_2_20230725 {
    public static int solution(int[][] maps){
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];

        if(answer == 0) answer = -1;

        return answer;
    }

    public static void bfs(int[][] maps, int[][] visited){
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {x, y});

        while (!queue.isEmpty()){
            int[] point = queue.remove();
            int cx = point[0];
            int cy = point[1];

            for (int i=0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if( nx < 0 || nx > (maps.length - 1) || ny < 0 || ny > (maps[0].length - 1))
                    continue;

                if(visited[nx][ny] == 0 && maps[nx][ny] == 1){
                    visited[nx][ny] = visited[cx][cy] + 1;
                    queue.add(new int[] {nx, ny});
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] m1 = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
        int[][] m2 = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,0}, {0,0,0,0,1}};

        System.out.println(solution(m1));
        System.out.println(solution(m2));
    }
}
