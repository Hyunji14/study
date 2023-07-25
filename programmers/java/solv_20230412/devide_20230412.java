package programmers.programmers.java.solv_20230412;

public class devide_20230412 {
    public static int solution(int num1, int num2){
        int answer = 0;

        if(0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100){
            float devide = ((float)num1)/((float) num2) ;
            answer = (int)(devide*1000);
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(3, 2));
    }
}
