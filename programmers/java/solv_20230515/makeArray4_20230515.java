package programmers.programmers.java.solv_20230515;

import java.util.ArrayList;
import java.util.List;

public class makeArray4_20230515 {
    public static int[] solution(int[] arr){
        List<Integer> stk =new ArrayList<>();
        int i = 0;

        while(i<arr.length){
            int size = stk.size();
            int val = arr[i];

            if(size < 1){
                stk.add(val);
                i++;
            }
            else{
                int lastStk = stk.get(size-1);

                if( lastStk < val ){
                    stk.add(val);
                    i++;
                }
                else if( val <= lastStk ){
                    stk.remove(size-1);
                }
            }
        }


        return stk.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args){
        int[] arr = {1,4,2,5,3};
        int[] result = solution(arr);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
