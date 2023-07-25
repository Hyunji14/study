package programmers.programmers.java.solv_20230510;

public class seqeunceQuery2_20230510 {
    public static int[] solution(int[] arr, int[][] queries){
        int[] answer = new int[queries.length];
        int idx = 0;

        for(int[] q : queries){
            int s = q[0];
            int e = q[1];
            int k = q[2];
            int result = -1;

            for(int i=s; i<e+1; i++){
                if(k < arr[i]){
                    if(result > 0 && result < arr[i]){
                        continue;
                    }
                    else{
                        result = arr[i];
                    }
                }
            }

            answer[idx] = result;
            idx++;
        }

        return answer;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 2, 4, 3};
        int[][] query = {{0,4,2}, {0,3,2}, {0,2,2}};
        int [] result = solution(arr, query);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
