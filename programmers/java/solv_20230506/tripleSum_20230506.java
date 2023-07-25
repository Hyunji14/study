package programmers.programmers.java.solv_20230506;

public class tripleSum_20230506 {
    public static int solution(int a, int b, int c){
        int answer = 0;

        if(a == b && a == c){
            answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        else if( a == b || b == c || c == a){
            answer = (a+b+c) * (a*a + b*b + c*c);
        }
        else {
            answer = a+b+c;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(2,6,1));
        System.out.println(solution(5,3,3));
        System.out.println(solution(4,4,4));
    }
}
