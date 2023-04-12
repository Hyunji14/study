package programmers.level0;

import java.time.LocalDate;

public class evenSum_20230412 {
    public static int solution(int n){
        int answer = 0;
        boolean val = (0 < n && n <= 1000);

        if (val) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    answer = answer + i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(10));
    }
}
