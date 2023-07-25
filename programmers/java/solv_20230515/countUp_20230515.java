package programmers.programmers.java.solv_20230515;

public class countUp_20230515 {
    public static int[] solution(int start, int end){
        int num = end-start+1;
        int[] answer = new int[num];

        for(int i=0; i<num; i++){
            answer[i] = start+i;
        }

        return answer;
    }

    public static void main(String[] args){
        int[] result = solution(3, 10);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
