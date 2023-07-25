package programmers.programmers.java.solv_20230515;

import java.util.*;
import java.util.stream.Collectors;

public class diceGame3_20230515 {
    public static int solution(int a, int b, int c, int d){
        List<Integer> list = Arrays.asList(a, b, c, d);
        int answer = 0;

        List<Integer> checklist = list.stream().distinct().collect(Collectors.toList());

        if( checklist.size() == 1 ){
            answer = 1111*checklist.get(0);
        }
        else if( checklist.size() == 2 ){
            int p = checklist.get(0);
            int q = checklist.get(1);

            for(int i=0; i<2; i++){
                int val = checklist.get(i);
                int num = (int) list.stream().filter(x -> x == val).count();

                if(num == 3){
                    if(i == 0){
                        answer = ((10 * p) + q);
                    }
                    else{
                        answer = ((10 * q) + p);
                    }
                    answer = (int) Math.pow(answer, 2);
                    break;
                }
                else if(num == 2){
                    answer = Math.abs((p + q) * (p - q));
                    break;
                }
            }
        }
        else if( checklist.size() == 3){
            for(int i=0; i<checklist.size(); i++){
                int val = checklist.get(i);
                int num = (int) list.stream().filter(x -> x == val).count();
                if(num ==2){
                    int removeIdx = checklist.indexOf(val);
                    checklist.remove(removeIdx);
                    answer = checklist.get(0) * checklist.get(1);
                }
            }
        }else if(checklist.size() == list.size()){
            answer = Collections.min(list);
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
