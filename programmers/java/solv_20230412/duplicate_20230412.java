package programmers.programmers.java.solv_20230412;

public class duplicate_20230412 {
    public static int solution(int[] array, int n){
        int answer = 0;

        for(int obj : array){
            if(n == obj){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        int[] test = {1, 1, 2, 3, 4, 5};
//        int[] test = {0, 2, 3, 4};

        System.out.println(solution(test, 1));
    }
}
