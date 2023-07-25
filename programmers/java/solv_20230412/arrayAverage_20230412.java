package programmers.programmers.java.solv_20230412;

public class arrayAverage_20230412 {
    public static double solution(int[] numbers){
        double answer = 0;
        int arrayLength = numbers.length;

        for(int i = 0; i<arrayLength ; i++){
            answer = answer + (double) numbers[i];
        }

        answer = answer/arrayLength;

        return answer;
    }

    public static void main(String[] args){
//        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(solution(test));
    }
}
