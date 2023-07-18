package programmers.level0.solv_20230714;

import java.util.ArrayList;
import java.util.List;

public class cutArray_20230714 {
    public static int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();

        for(int a : arr){
            answer.add(a);
        }

        for(int i=0; i<query.length; i++){
            int index = query[i];

            if(i % 2 == 0) {
                for(int p = index+1; p < answer.size(); p++){
                    answer.set(p, -1);
                }
            }else {
                for(int p = index-1; p >= 0; p--){
                    answer.set(p, -1);
                }
            }
            while(answer.remove(Integer.valueOf(-1)));
        }

        return answer.stream().mapToInt(x->x).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] query = {4, 1, 2};
        int[] result = solution(arr, query);

        for(int i : result){
            System.out.print(i + " ");
        }

    }
}
