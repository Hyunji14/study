package programmers.programmers.java.solv_20230725;

public class remainNum_while_1_20230725 {
    public static int solution(int n) {
        int answer = -1;
        int x = 1;
        boolean check = false;

        while(!check){
            if( n % x == 1 ){
                if(answer < 0 || x <= answer) {
                    answer = x;
                    check = true;
                }
            }
            x++;
        }

        return answer;
    }
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 12;

        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }
}
