package programmers.level0.solv_20230506;

public class numlistSum_20230506 {
    public static int solution(int[] num_list){
        int answer = 0;
        String evenNum = "";
        String oddNum = "";

        for(int i : num_list){
            if(i%2 == 0){
                evenNum += Integer.toString(i);
            }
            else if(i%2 != 0){
                oddNum += Integer.toString(i);
            }
        }

        answer = Integer.parseInt(evenNum) + Integer.parseInt(oddNum);

        return answer;
    }

    public static void main(String[] args){
        int[] input1 = {3, 4, 5, 2, 1};
        int[] input2 = {5, 7, 8, 3};
        System.out.println(solution(input1));
        System.out.println(solution(input2));
    }
}
