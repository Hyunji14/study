package programmers.level0.solv_20230506;

public class strMulti_20230506 {
    public static String solution(String my_string, int k){
        String answer = "";

        for(int i = 0; i < k ; i++){
            answer += my_string;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("string", 3));
        System.out.println(solution("love", 10));
    }
}
