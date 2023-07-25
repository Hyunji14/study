package programmers.programmers.java.solv_20230725;

import java.util.LinkedList;
import java.util.Queue;

public class doNotSame_Queue_1_20270525 {
    public static int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        int prevNum = Integer.MAX_VALUE;

        for(int a : arr){
            if(prevNum != a){
                q.add(a);
            }
            prevNum = a;
        }

        int[] answer = new int[q.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a1 = {1,1,3,3,0,1,1};
        int[] a2 = {4,4,4,3,3};

        int[] r1 = solution(a1);
        int[] r2 = solution(a2);

        for(int i : r1) {
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i : r2) {
            System.out.print(i + " ");
        }
    }
}
