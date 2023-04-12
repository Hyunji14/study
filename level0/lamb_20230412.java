package programmers.level0;

import java.time.LocalDate;

public class lamb_20230412 {
    public static int solution(int n, int k){
        int answer = 0;
        int service = n/10;
        boolean lambVal = (0 < n && n < 1000);
        boolean drinkVal = (service <= k && k < 1000);

        if(lambVal && drinkVal){
            answer = (n*12000) + ((k-service)*2000);
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(64, 6));
    }
}
