package programmers.level0.answer;

import java.util.*;

public class diceGame3_answer {
    public static int solution(int a, int b, int c, int d){
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 1;

        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        if(map.size() == 1){
            answer = (a * 1111);
        }
        else if(map.size() == 2){
            int p = 0;
            int q = 0;
            int o = 0;

            for(int x : map.keySet() ){
                if(map.get(x) == 3){
                    p = x;
                }else if(map.get(x) == 1){
                    q = x;
                }else{
                    if(o == 0){
                        o = x;
                    }else{
                        answer = Math.abs((o + x) * (o - x));
                        break;
                    }
                }
            }
            answer = (int) Math.pow((10 * p) + q, 2);
        }else if(map.size() == 3){
            for(int x: map.keySet()){
                if(map.get(x) == 1) {
                    answer *= x;
                }
            }
        }else{
            answer = Math.min(a, Math.min(b, Math.min(c, d)));
        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(2,2,2,2));
        System.out.println(solution(4,1,4,4));
        System.out.println(solution(1,1,1,4));
        System.out.println(solution(6,3,3,6));
        System.out.println(solution(2,5,2,6));
        System.out.println(solution(6,4,2,5));
    }
}
