package programmers.programmers.java.solv_20230510;

public class numAdjust2_20230510 {
    public static String solution(int[] numLog){
         String answer = "";
         int n = numLog[0];
         int check = 0;

        for(int i=1; i<numLog.length; i++){
            check = numLog[i]-n;
            if(check > 0){
                if(check == 1){
                    answer += "w";
                }
                else if(check == 10){
                    answer += "d";
                }
            }else{
                check = Math.abs(check);
                if(check == 1){
                    answer += "s";
                }
                else if(check == 10){
                    answer += "a";
                }
            }
            n = numLog[i];
        }

        return answer;
    }

    public static void main(String[] args){
        int[] input = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(input));
    }
}
