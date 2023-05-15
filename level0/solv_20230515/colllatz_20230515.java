package programmers.level0.solv_20230515;

import java.util.ArrayList;
import java.util.List;

public class colllatz_20230515 {
    public static int[] solution(int n){
        List<Integer> list = new ArrayList<>();
        int check = n;

        list.add(check);

        while(check != 1){
            if(check % 2 == 0){
                check /= 2;
                list.add(check);
            }
            else if(check % 2 != 0){
                check = check*3 + 1;
                list.add(check);
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        int[] result = solution(10);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
