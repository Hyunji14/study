package programmers.programmers.java.solv_20230506;

public class strNumSum_20230506 {
    public static int solution(String num_str){
        int answer = 0;

        for(Character c : num_str.toCharArray()){
            answer += Character.getNumericValue(c);
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }
}
