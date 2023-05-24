package programmers.level0.solv_20230524;

import java.util.ArrayList;
import java.util.List;

public class listCut_2030524 {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if(n == 1){
            for(int i=0; i<=b; i++){
                answer.add(num_list[i]);
            }
        }else if(n == 2){
            for(int i=a; i<num_list.length; i++){
                answer.add(num_list[i]);
            }
        }else if(n == 3){
            for(int i=a; i<=b; i++){
                answer.add(num_list[i]);
            }
        }else{
            for(int i=a; i<=b; i+=c){
                answer.add(num_list[i]);
            }
        }


        return answer.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        int n1 = 3, n2 = 4;
        int[] slicer = {1,5,2};
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] result1 = solution(n1, slicer, num);
        int[] result2 = solution(n2, slicer, num);

        for(int i : result1){
            System.out.print(i + ", ");
        }

        System.out.println();

        for(int i : result2){
            System.out.print(i + ", ");
        }
    }
}
