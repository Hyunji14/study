package programmers.level0;

public class sum_20230412 {
    public static int solution(int num1, int num2){
        int answer = -1;

        if(-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000){
            answer = num1+num2;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(2, 3));
        System.out.println(solution(5, 100));
    }
}
