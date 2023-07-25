package programmers.programmers.java.solv_20230506;

public class multiplNum_20230506 {
    public static int solution(int num, int  n){
        int answer = 0;

        answer = (num % n == 0) ? 0 : 1;

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(98, 2));
        System.out.println(solution(34, 3));
    }
}
