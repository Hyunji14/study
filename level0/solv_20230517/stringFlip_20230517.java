package programmers.level0.solv_20230517;

public class stringFlip_20230517 {
    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();

        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            for(int j= start; j <= (start+end)/2 ; j++){
                char temp = arr[j];
                arr[j] = arr[start+end-j];
                arr[start+end-j] = temp;
            }
        }

        for(Character c : arr){
            answer += c;
        }

        return answer;
    }
    public static void main(String[] args){
        String s = "rermgorpsam";
        int[][] q = {{2,3}, {0,7}, {5,9}, {6,10}};

        System.out.println(solution(s, q));
    }
}
