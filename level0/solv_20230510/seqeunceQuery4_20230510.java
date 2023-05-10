package programmers.level0.solv_20230510;

public class seqeunceQuery4_20230510 {
    public static int[] solution(int[] arr, int[][] queries){
        int[] answer = arr;

        for(int[] q : queries){
            int s = q[0];
            int e = q[1];
            int k = q[2];

            for(int i=s; i<e+1; i++){
                if(i % k == 0){
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[] arr = {0, 1, 2, 4, 3};
        int[][] query = {{0,4,1}, {0,3,2}, {0,3,3}};
        int [] result = solution(arr, query);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
