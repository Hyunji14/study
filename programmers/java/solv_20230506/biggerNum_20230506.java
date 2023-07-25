package programmers.programmers.java.solv_20230506;

public class biggerNum_20230506 {
    public static int solution(int a, int b){
        int answer = 0;
        String num1 = Integer.toString(a) + Integer.toString(b);
        String num2 = Integer.toString(b) + Integer.toString(a);

        if(Integer.parseInt(num1) > Integer.parseInt(num2)){
            return Integer.parseInt(num1);
        }
        else if (Integer.parseInt(num1) < Integer.parseInt(num2)){
            return Integer.parseInt(num2);
        }
        else{
            return answer;
        }
    }

    public static void main(String[] args){
        System.out.println(solution(9, 91));
        System.out.println(solution(89, 8));
    }
}
