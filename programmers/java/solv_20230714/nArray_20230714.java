package programmers.programmers.java.solv_20230714;

import java.util.ArrayList;
import java.util.List;

public class nArray_20230714 {
    public static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i<n; i++){
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(x->x).toArray();
    }
    public static void main(String[] args) {
        int[] list1 = {2,1,6};
        int[] list2 = {5,2,1,7,5};
        int n1 = 1;
        int n2 = 3;
        int[] r1 = solution(list1, n1);
        int[] r2 = solution(list2, n2);

        for(int r : r1){
            System.out.print(r + " ");
        }
        System.out.println();
        for(int r : r2){
            System.out.print(r + " ");
        }
    }
}
