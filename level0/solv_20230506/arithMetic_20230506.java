package programmers.level0.solv_20230506;

public class arithMetic_20230506 {
    public static int solution(int a, int d, boolean[] included){
        int answer = 0;

        for(int i = 0 ; i < included.length ; i++){
            if(included[i]){
                answer += a+(i*d);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        boolean[] include1 = {true, false, false, true, true};
        boolean[] include2 = {false, false, false, true, false, false, false};
        System.out.println(solution(3,4,include1));
        System.out.println(solution(7,1,include2));
    }
}
