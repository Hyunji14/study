package programmers.level0.solv_20230412;

import java.util.Arrays;

public class triangle_20230412 {
    public static int solution(int[] sides){
        int[] numbers = sides;

        Arrays.sort(numbers);

        if( numbers[0]+numbers[1] > numbers[2]) return 1;
        else return 2;
    }

    public static void main(String[] args){
//        int[] test = {1, 2, 3};
//        int[] test = {3, 6, 2};
        int[] test = {199, 72, 222};

        System.out.println(solution(test));
    }
}
