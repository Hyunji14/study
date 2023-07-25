package programmers.programmers.java.solv_20230518;

import java.util.ArrayList;
import java.util.List;

public class suffixCheck_20230518 {
    public static int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> list = new ArrayList<>();

        for(int i=0; i<my_string.length(); i++){
            list.add(my_string.substring(i));
        }

        if(list.contains(is_suffix)){
            answer = 1;
        }

        return answer;
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
