package programmers.programmers.java.devMatching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class queueSum_20230720 {
    public static int solution(int[] queue1, int[] queue2){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int count = 0;
        double q1Num = 0;
        double q2Num = 0;
        double sumNumber = 0;

        for(int i=0; i<queue1.length; i++){
            sumNumber = sumNumber+queue1[i]+queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            q1Num += queue1[i];
            q2Num += queue2[i];
        }

        int end = (q1.size() + q2.size())*2;

        if (q1Num == q2Num) return 0;
        if (sumNumber % 2 == 1) return -1;


        while( q1Num != q2Num){
            int tmp = 0;
            if(q1Num >= q2Num){
                tmp = q1.poll();
                q1Num -= tmp;
                q2Num += tmp;
//                q1.remove(0);
                q2.offer(tmp);
            }else {
                tmp = q2.poll();
                q1Num += tmp;
                q2Num -= tmp;
//                q2.remove(0);
                q1.offer(tmp);
            }
            count++;

            if(count > end){
                return -1;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] q1 = {3, 2, 7, 2};
        int[] q2 = {4, 6, 5, 1};
        int[] q3 = {1, 2, 1, 2};
        int[] q4 = {1, 10, 1, 2};
        int[] q5 = {1, 1};
        int[] q6 = {1, 5};

        System.out.println(solution(q1, q2));
        System.out.println(solution(q3, q4));
        System.out.println(solution(q5, q6));
    }
}
