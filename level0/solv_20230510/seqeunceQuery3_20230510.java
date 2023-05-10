package programmers.level0.solv_20230510;

import java.util.ArrayList;
import java.util.List;

public class seqeunceQuery3_20230510 {
    public static int[] solution(int[] arr, int[][] queries){
        List list = new ArrayList<>();
        int qLength = queries.length;

        for(int i : arr){
            list.add(i);
        }

        for(int i = 0; i<qLength; i++){
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];

            int num1 = list.indexOf(idx1);
            int num2 = list.indexOf(idx2);

            list.set(idx1, num2);
            list.set(idx2, num1);
        }

        int[] answer = list.stream().mapToInt(x -> (int) x).toArray();

        return answer;
    }

    public static int[] solution2(int[] arr, int[][] queries){
        int[] answer = arr;

        for(int i = 0; i<queries.length; i++){
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            int num1 = answer[idx1];
            int num2 = answer[idx2];

            answer[idx1] = num2;
            answer[idx2] = num1;
        }

        return answer;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 2, 3, 4};
        int[][] query = {{0,3}, {1,2}, {1,4}};
        int [] result = solution2(arr, query);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
