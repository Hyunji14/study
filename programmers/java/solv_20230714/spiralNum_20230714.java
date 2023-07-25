package programmers.programmers.java.solv_20230714;

public class spiralNum_20230714 {
    public static int[][] solution(int n){
        int[][] answer = new int[n][n];
        int num = 1;
        int size = n*n;
        int x = 0;
        int y = 0;
        int width = n;
        int height = n-1;

        while (num<=size){
            //right
            for(int i=0; i<width; i++){
                answer[x][y] = num;
                y++;
                num++;
            }

            width--;
            x++;
            y--;

            //down
            for(int i=0; i<height; i++){
                answer[x][y] = num;
                x++;
                num++;
            }

            height--;
            x--;
            y--;

            //left
            for(int i=0; i<width; i++){
                answer[x][y] = num;
                y--;
                num++;
            }

            width--;
            x--;
            y++;

            //up
            for(int i=0; i<height; i++){
                answer[x][y] = num;
                x--;
                num++;
            }

            height--;
            x++;
            y++;
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
