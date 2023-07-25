package programmers.programmers.java.solv_20230714;

import java.util.ArrayList;
import java.util.List;

public class switchArray_20230714 {
    public static int[] solution(int[] num_list, int n){
        List<Integer> answer = new ArrayList<>();

        for(int i = n; i<num_list.length; i++){
            answer.add(num_list[i]);
        }

        for(int i = 0; i<n; i++){
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(x->x).toArray();
    }
    public static void main(String[] args) {
        int[] numlist1 = {2,1,6};
        int[] numlist2 = {5,2,1,7,5};
        int n1 = 1;
        int n2 = 3;
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
