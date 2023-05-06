package programmers.level0.solv_20230412;

import java.util.Arrays;

public class middleVal_20230412 {
    public static int solution(int[] array){
        int answer = 0;
        int position = array.length / 2;
        int[] numbers = array;

        Arrays.sort(numbers);
        answer = numbers[position];

        return answer;
    }

    public static void main(String[] args){
//        int[] test = {1, 2, 7, 10, 11};
        int[] test = {9, -1, 0};

        System.out.println(solution(test));
    }
}
