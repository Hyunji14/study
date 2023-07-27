package programmers.programmers.java.solv_20230727;

import java.util.*;

public class doll_stack_1_20230727 {
    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        int n = board.length;
        Map<Integer, Queue<Integer>> boardMap = new HashMap<>();
        Stack<Integer> basket = new Stack<>();

        for(int i = 1; i <= n; i++){
            boardMap.putIfAbsent(i, new LinkedList<>());
        }

        for(int i=0; i<n; i++){
            int[] dolls = board[i];

            for(int j=0; j<n; j++){
                int doll = dolls[j];

                if(doll != 0){
                    boardMap.get(j+1).add(doll);
                }
            }
        }

        for(int m : moves){
            if(!boardMap.get(m).isEmpty()){
                int d = boardMap.get(m).poll();

                if(basket.isEmpty() || d != basket.peek()){
                    basket.push(d);
                }else{
                    basket.pop();
                    answer += 2;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] board  = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }
}
