package programmers.programmers.java.solv_20230412;

public class mheight_20230412 {
    public static int solution(int[] array, int height){
        int answer = 0;

        for(int obj : array){
            if(height < obj){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
//        int[] test = {149, 180, 192, 170};
        int[] test = {180, 120, 140};

        System.out.println(solution(test, 190));
    }
}
