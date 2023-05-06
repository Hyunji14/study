package programmers.level0.answer;

import java.util.Arrays;

public class maxMul_answer {
    public static int solution(int[] numbers){
        int answer = 0;
        int length = numbers.length;
        Arrays.sort(numbers);

        answer = numbers[length-1]*numbers[length-2];

        return answer;
    }

    public static void main(String[] args){
//        int[] test = {1, 2, 3, 4, 5};
        int[] test = {0, 31, 24, 10, 1, 9};

        System.out.println(solution(test));
    }
}
