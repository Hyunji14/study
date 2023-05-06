package programmers.level0.answer;
import java.util.Arrays;

public class arrayAverage_answer {
    public static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
    public static void main(String[] args){
//        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(solution(test));
    }
}
