package programmers.level0.solv_20230515;

public class logicOp_20230515 {
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4){
        boolean answer = true;

        answer = (x1 || x2) && (x3 || x4 ) ? true : false;

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(false, true, true, true));
        System.out.println(solution(true, false, false, false));
    }
}
