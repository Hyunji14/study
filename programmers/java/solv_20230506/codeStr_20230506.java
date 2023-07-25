package programmers.programmers.java.solv_20230506;

public class codeStr_20230506 {
    public static String solution(String code){
        String answer = "";
        char[] strArray = code.toCharArray();
        char mode = '0';

        for(int i=0; i < strArray.length; i++){
            char s = strArray[i];

            if( s == '1'){
                if(mode == '1') mode = '0';
                else if(mode == '0') mode = '1';
            }
            else{
                if (mode == '0' && i % 2 == 0) {
                    answer += s;
                }
                else if(mode == '1' && i % 2 == 1){
                    answer += s;
                }
            }
        }

        if(answer.length() < 1){
            answer = "EMPTY";
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("abc1abc1abc"));
    }
}
