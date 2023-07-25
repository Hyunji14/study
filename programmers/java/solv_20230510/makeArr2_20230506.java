package programmers.programmers.java.solv_20230510;

import java.util.ArrayList;
import java.util.List;

public class makeArr2_20230506 {
    public static int[] solution(int l, int r){
        String pattern = "5[0|5]*";
        List<Integer> list = new ArrayList<>();

        for(int i=l; i<r+1; i++){
            String tmp = Integer.toString(i);
            if(tmp.matches(pattern)){
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        if(answer.length < 1){
            answer = new int[] {-1};
        }

        return answer;
    }

    public static void main(String[] args){
//        int[] result = solution(5,555);
        int[] result = solution(10,20);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
