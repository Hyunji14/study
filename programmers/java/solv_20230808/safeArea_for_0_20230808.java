package programmers.programmers.java.solv_20230808;

import java.util.Stack;

public class safeArea_for_0_20230808 {
    public static int solution(int[][] board) {
        int answer = (int) Math.pow(board.length, 2);
        int check = 0;
        Stack<int[]> s = new Stack<>();
        int[][] area = board;
        // up, down, left, right
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // rightUp, rightDown, leftDown, leftUP
        int[] dgx = {-1, 1, 1, -1};
        int[] dgy = {1, 1, -1, -1};

        for(int x=0; x < area.length; x++){
            for(int y=0; y < area.length; y++){
                if(area[x][y] == 1) {
                    int[] temp = {x, y};
                    check++;
                    s.push(temp);
                }
            }
        }

        while(!s.isEmpty()){
            int[] position = s.pop();
            int x = position[0];
            int y = position[1];

            for(int i=0; i<4; i++){
                int newX = x+dx[i];
                int newY = y+dy[i];
                int newDgx = x+dgx[i];
                int newDgy = y+dgy[i];

                if(newX >=0 && newX < area.length && newY>=0 && newY < area.length){
                    if(area[newX][newY] == 0){
                        area[newX][newY] = -1;
                        check++;
                    }
                }

                if(newDgx >=0 && newDgx < area.length && newDgy>=0 && newDgy < area.length){
                    if(area[newDgx][newDgy] == 0){
                        area[newDgx][newDgy] = -1;
                        check++;
                    }
                }
            }
        }

        answer = answer - check;

        return answer;
    }
    public static void main(String[] args) {
        int[][] b1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] b2 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int[][] b3 = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};

        System.out.println(solution(b1));
        System.out.println(solution(b2));
        System.out.println(solution(b3));
    }
}
