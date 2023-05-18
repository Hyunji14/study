package programmers.level0.solv_20230518;

import java.util.ArrayList;
import java.util.List;

public class makeArray5_20230518 {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for(String n: intStrs){
            String tmp = "";

            if((s+l) == n.length()){
                tmp = n.substring(s);
            }
            else{
                tmp = n.substring(s, s+l);
            }

            if (k < Integer.parseInt(tmp)) {
                answer.add(Integer.parseInt(tmp));
            }
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args){
        String[] str = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        int[] result = solution(str, k, s, l);

        for(int i : result){
            System.out.println(i + " ");
        }
    }
}
