package programmers.programmers.java.solv_20230506;

public class condStr_20230506 {
    public static int solution(String ineq, String eq, int n, int m){
        int answer = 0;

        if( ineq.equals("<")){
            if(eq.equals("!")){
                if (n < m) answer = 1;
                else answer = 0;
            }else if(eq.equals("=")){
                if (n <= m) answer = 1;
                else answer = 0;
            }
        }
        if( ineq.equals(">")){
            if(eq.equals("!")){
                if (n > m) answer = 1;
                else answer = 0;
            }else if(eq.equals("=")){
                if (n >= m) answer = 1;
                else answer = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }
}
