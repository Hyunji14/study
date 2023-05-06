package programmers.level0.solv_20230506;

public class operValue_20230506 {
    public static int solution(int a, int b){
        int answer = 0;
        String num1 = Integer.toString(a) + Integer.toString(b);
        int ab = Integer.parseInt(num1);
        int num3 = 2*a*b;

        answer = (ab >= num3) ? ab : num3;

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }
}
