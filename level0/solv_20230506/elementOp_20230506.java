package programmers.level0.solv_20230506;

public class elementOp_20230506 {
    public static int solution(int[] num_list){
        int answer = 0;
        int mul1 = 1;
        int mul2 = 0;

        for(int i : num_list){
            mul1 *= i;
            mul2 += i;
        }

        mul2 *= mul2;
        answer = (mul1 < mul2) ? 1 : 0;

        return answer;
    }

    public static void main(String[] args){
        int[] input1 = {3, 4, 5, 2, 1};
        int[] input2 = {5, 7, 8, 3};
        System.out.println(solution(input1));
        System.out.println(solution(input2));
    }
}
