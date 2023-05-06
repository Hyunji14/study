package programmers.level0.solv_20230506;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lastListVal_20230506 {
    public static int[] solution(int[] num_list){
        int listLength = num_list.length;
        int[] answer = new int[listLength+1];
        int lastVal = num_list[listLength-1];
        int lastVal2 = num_list[listLength-2];

        for(int i=0; i<listLength; i++){
            answer[i] = num_list[i];
        }

        if(lastVal > lastVal2){
            answer[listLength] = (lastVal-lastVal2);
        }
        else if(lastVal <= lastVal2){
            answer[listLength] = (lastVal*2);
        }

        return answer;
    }

    public static void main(String[] args){
        int[] input1 = {2, 1, 6};
        int[] input2 = {5, 2, 1, 7, 5};

        int[] result = solution(input1);
//        int[] result = solution(input2);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
