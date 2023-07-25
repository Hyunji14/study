package programmers.programmers.java.solv_20230506;

public class multiplNum2_20230506 {
    public static int solution(int num, int  n, int m){
        int answer = 0;

        answer = ( num % n == 0 && num % m == 0) ? 1 : 0;

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(60, 2, 3));
        System.out.println(solution(55, 10, 5));
    }
}
