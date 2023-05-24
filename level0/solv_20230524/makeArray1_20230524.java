package programmers.level0.solv_20230524;

import java.util.ArrayList;
import java.util.List;

public class makeArray1_20230524 {
    public static int[] solution(int n, int k){
        List<Integer> answer = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if( i % k == 0){
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args){
        int n1 = 10, n2 = 15;
        int k1 = 3, k2 = 5;
        int[] result1 = solution(n1, k1);
        int[] result2 = solution(n2, k2);

        for(int i: result1){
            System.out.print(i + ", ");
        }

        System.out.println();

        for(int i: result2){
            System.out.print(i + ", ");
        }

    }
}
