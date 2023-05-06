package programmers.level0.answer;
import java.time.*;

public class age_answer {
    public static int solution(int age){
        int answer = 0;

        if(0 < age && age <= 120){
            LocalDate d = LocalDate.now();
            answer = d.getYear() - age;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(40));
    }
}
