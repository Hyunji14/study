package programmers.level0.solv_20230524;

import java.util.ArrayList;
import java.util.List;

public class areaTwo_20230524 {
    public static int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int startIdx = -1;
        int endIdx = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                if(startIdx == -1){
                    startIdx = i;
                }
                else {
                    endIdx = i;
                }
            }
        }

        if(startIdx != -1){
            if(endIdx == -1){
                answer.add(arr[startIdx]);
            }
            else{
                for(int i=startIdx; i<=endIdx; i++){
                    answer.add(arr[i]);
                }
            }
        }
        else if(startIdx == -1){
            answer.add(-1);
        }

        return answer.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
        int[] arr2 = {1, 2, 1};
        int[] arr3 = {1, 1, 1};
        int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};

        int[] result1 = solution(arr1);
        int[] result2 = solution(arr2);
        int[] result3 = solution(arr3);
        int[] result4 = solution(arr4);

        for(int i: result1){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i: result2){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i: result3){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i: result4){
            System.out.print(i + " ");
        }
    }
}
