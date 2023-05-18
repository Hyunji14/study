package programmers.level0.answer;

import java.util.ArrayList;
import java.util.List;

public class suffixCheck_answer {
    public static int solution(String my_string, String is_suffix) {
        if(my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        String str = "banana";
        String sfix1 = "ana";
        String sfix2 = "nan";
        String sfix3 = "wxyz";
        String sfix4 = "abanana";

        System.out.println(solution(str, sfix1));
        System.out.println(solution(str, sfix2));
        System.out.println(solution(str, sfix3));
        System.out.println(solution(str, sfix4));
    }
}
