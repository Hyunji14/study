package programmers.level0.solv_20230714;

import java.util.ArrayList;
import java.util.List;

public class nNumber_20230714 {
    public static int[] solution(int[] num_list, int n){
        List<Integer> answer = new ArrayList<>();

        for(int i = n-1; i<num_list.length; i++){
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(x->x).toArray();
    }
    public static void main(String[] args) {
        int[] numlist1 = {2,1,6};
        int[] numlist2 = {5,2,1,7,5};
        int n1 = 3;
        int n2 = 2;
        int[] result1 = solution(numlist1, n1);
        int[] result2 = solution(numlist2, n2);

        for(int r: result1){
            System.out.print(r + " ");
        }

        System.out.println();

        for(int r: result2){
            System.out.print(r + " ");
        }
    }
}
