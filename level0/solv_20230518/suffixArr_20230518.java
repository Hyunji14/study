package programmers.level0.solv_20230518;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class suffixArr_20230518 {
    public static String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();

        for(int i=0; i<my_string.length(); i++){
            String tmp = my_string.substring(i);
            answer.add(tmp);
        }

        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args){
        String s1 = "banana";
        String s2 = "prgrammers";
        String[] r1 = solution(s1);
        String[] r2 = solution(s2);

        for(String s : r1){
            System.out.print(s + ", ");
        }

        System.out.println();

        for(String s : r2){
            System.out.print(s + ", ");
        }
    }
}
