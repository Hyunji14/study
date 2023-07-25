package programmers.programmers.java.solv_20230506;

public class arrayToStr_20230506 {
    public static String solution(String[] arr){
        String answer = "";

        for(String s : arr){
            answer += s;
        }

        return answer;
    }

    public static void main(String[] args){
        String[] input = {"a","b","c"};
        System.out.println(solution(input));
    }
}
