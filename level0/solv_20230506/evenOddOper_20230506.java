package programmers.level0.solv_20230506;

public class evenOddOper_20230506 {
    public static int solution(int  n){
        int answer = 0;

        if(n % 2 == 0){
            for(int i = 0 ; i <= n ; i++){
                if( i % 2 == 0){
                    answer += i*i;
                }
            }
        }else if(n % 2 != 0){
            for(int i = 1 ; i <= n+1 ; i++){
                if( i % 2 != 0){
                    answer += i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(7));
        System.out.println(solution(10));
    }
}
