package programmers.level0.solv_20230524;

import java.util.ArrayList;
import java.util.List;

public class makeArray3_20230524 {
    public static int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            for(int j=start; j<=end; j++){
                answer.add(arr[j]);
            }
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1,3}, {0,4}};
        int[] result = solution(arr, intervals);

        for(int i: result){
            System.out.print(i + " ");
        }
    }
}
