package programmers.level0.answer;

public class comparison_answer {
    public static int solution(int num1, int num2){
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(2, 3));
        System.out.println(solution(7, 7));
    }
}
