package programmers.level0.solv_20230714;

import java.util.ArrayList;
import java.util.List;

public class blinkNumber_20230714 {
    public static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i<num_list.length; i = i+n){
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        int[] numlist = {4, 2, 6, 1, 7, 6};
        int n1 = 2;
        int n2 = 4;
        int[] result1 = solution(numlist, n1);
        int[] result2 = solution(numlist, n2);

        for(int r: result1){
            System.out.print(r + " ");
        }

        System.out.println();

        for(int r: result2){
            System.out.print(r + " ");
        }
    }
}
