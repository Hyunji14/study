package programmers.programmers.java.answer;

public class spiralNum_answer {
    public static int[][] solution(int n){
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0, y = 0;
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        int direction = 0;

        while (num <= n * n) {
            answer[x][y] = num++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4; //범위 밖에 나갔을 때 방향전환
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }

        return answer;
    }
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;
        int[][] result1 = solution(n1);
        int[][] result2 = solution(n2);

        for(int i=0; i<n1; i++){
            for(int j=0; j<n1; j++){
                System.out.print(result1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i<n2; i++){
            for(int j=0; j<n2; j++){
                System.out.print(result2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
