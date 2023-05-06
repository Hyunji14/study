package programmers.level0.solv_20230412;

public class comparison_20230412 {
    public static int solution(int num1, int num2){
        int answer = -1;

        if(0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000){
            if (num1 == num2){
                answer = 1;
            }
            else{
                answer = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(2, 3));
        System.out.println(solution(7, 7));
    }
}
