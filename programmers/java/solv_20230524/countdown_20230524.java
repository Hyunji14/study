package programmers.programmers.java.solv_20230524;

import java.util.ArrayList;
import java.util.List;

public class countdown_20230524 {
    public static int[] solution(int start, int end) {
        List<Integer> answer = new ArrayList<>();

        for(int i=start; i>=end; i--){
            answer.add(i);
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args){
        int start = 10, end = 3;
        int[] result = solution(start, end);

        for(int i : result){
            System.out.print(i + ", ");
        }
    }
}
