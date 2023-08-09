package programmers.programmers.java.solv_20230808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class theif_1_20230808 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        List<Integer> reverList = new ArrayList<>();


        for(int r : reserve){
            reverList.add(r);
        }

        for(int i = 0; i< lost.length; i++){
            if(reverList.contains(lost[i])) {
                int idx = reverList.indexOf(lost[i]);
                reverList.remove(idx);
                lost[i] = -1;
                answer++;
            }
        }

        for (int i = 0; i< lost.length; i++){
            if(lost[i] > 0){
                int min = lost[i]-1;
                int max = lost[i]+1;

                if(reverList.contains(min)){
                    int idx = reverList.indexOf(min);
                    reverList.remove(idx);
                    answer++;
                }else if (reverList.contains(max)) {
                    int idx = reverList.indexOf(max);
                    reverList.remove(idx);
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;
        int n3 = 10;

        int[] lost = {2,4};
        int[] lost2 = {3};
        int[] lost3 = {3,4,7,9};

        int[] reverse1 = {1,3,5};
        int[] reverse2 = {3};
        int[] reverse3 = {1};
        int[] reverse4 = {2,3,8};

        System.out.println(solution(n1, lost, reverse1));
        System.out.println(solution(n1, lost, reverse2));
        System.out.println(solution(n2, lost2, reverse3));
        System.out.println(solution(n3, lost3, reverse4));
    }
    //https://school.programmers.co.kr/questions/34608
}
