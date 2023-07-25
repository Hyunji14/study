package programmers.programmers.java.solv_20230524;

import java.util.HashMap;
import java.util.Map;

public class countChar_20230524 {
    public static int[] solution(String my_string){
        int[] answer = new int[52];
        Map<Character, Integer> map = new HashMap<>();
        char tmp = 65;

        for(int i=0; i<52; i++){
            map.put(tmp, i);
            tmp++;

            if(tmp == 91){
                tmp = 97;
            }
        }

        for(char c: my_string.toCharArray()){
            int idx = map.get(c);

            answer[idx]++;
        }

        return answer;
    }

    public static void main(String[] args){
        String s = "Programmers";
        int[] result = solution(s);

        for(int i: result){
            System.out.print(i + ", ");
        }
    }
}
