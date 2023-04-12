package programmers.level0;

import java.util.Arrays;

public class evenOddVal_20230412 {
    public static int[] solution(int[] num_list) {
        int[] answer = {0, 0};

        for(int obj: num_list){
            if( obj % 2 == 0) answer[0] += 1;
            if( obj % 2 == 1) answer[1] += 1;
        }
        return answer;
    }

    public static void main(String[] args){
//        int[] test = {1, 2, 3, 4, 5};
        int[] test = {1, 3, 5, 7};
        int[] result = solution(test);

        for(int obj : result) {
            System.out.print( obj + ", ");
        }
    }
}
