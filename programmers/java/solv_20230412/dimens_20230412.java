package programmers.programmers.java.solv_20230412;

public class dimens_20230412 {
    public static int solution(int[] dot){
        int answer = 0;

        if( dot[0] > 0 ){
            answer = 1;
            if (dot[1] < 0){
                answer = 4;
            }
        }
        if( dot[0] < 0 ){
            answer = 2;
            if ( dot[1] <0){
                answer = 3;
            }
        }

        return answer;
    }

    public static void main(String[] args){
//        int[] test = {2, 4};
        int[] test = {-7, 9};

        System.out.println(solution(test));
    }
}
