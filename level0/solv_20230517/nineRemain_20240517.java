package programmers.level0.solv_20230517;

import java.math.BigDecimal;

public class nineRemain_20240517 {
    public static int solution(String number){
        int answer = 0;
        int num = 0;

        for(char c : number.toCharArray()){
            num += Integer.parseInt(String.valueOf(c));
        }

        answer = (num % 9);

        return answer;
    }

    public static void main(String[] args){
        String s1 = "123";
        String s2 = "78720646226947352489";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
