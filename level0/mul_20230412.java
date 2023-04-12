package programmers.level0;

public class mul_20230412 {
    public static int solution(int num1, int num2){
        int answer = 0;

        if(0 <= num1 && 0 <= num2 && num1 <= 100 && num2 <= 100){
            answer = num1*num2;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(3,4));
    }
}
