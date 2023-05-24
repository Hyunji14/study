package programmers.level0.solv_20230524;

public class firstNegative_20230524 {
    public static int solution(int[] num_list) {
        int answer = -1;

        for(int i=0; i<num_list.length; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] num1 = {12, 4, 15, 46, 38, -2, 15};
        int[] num2 = {13, 22, 53, 24, 15, 6};

        System.out.println(solution(num1));
        System.out.println(solution(num2));
    }
}
