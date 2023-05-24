package programmers.level0.solv_20230524;

public class qrcode_20230524 {
    public static String solution(int q, int r, String code){
        String answer = "";

        for(int i=0; i<code.length(); i++){
            if( i%q == r){
                answer += code.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int q1 = 3, q2 = 1;
        int r1 = 1, r2 = 0;
        String code1 = "qjnwezgrpirldywt";
        String code2 = "programmers";

        System.out.println(solution(q1, r1, code1));
        System.out.println(solution(q2, r2, code2));
    }
}
