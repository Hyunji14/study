package programmers.programmers.java.solv_20230727;

public class nextNum_arr_0_20230727 {
    public static int solution(int[] common){
        int answer = 0;
        int lastIndex = common.length -1;

        if(common[1] - common[0] == common[2] - common[1]){
            answer = common[lastIndex]+(common[1] - common[0]);
        }else {
            answer = common[lastIndex]*(common[1]/common[0]);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] c1 = {1, 2, 3, 4};
        int[] c2 = {2, 4, 8};

        System.out.println(solution(c1));
        System.out.println(solution(c2));
    }
}
