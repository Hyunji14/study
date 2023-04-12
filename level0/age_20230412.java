package programmers.level0;

public class age_20230412 {
    public static int solution(int age){
        int answer = 0;

        if(0 < age && age <= 120){
            answer = (2022-age)+1;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(40));
    }
}
