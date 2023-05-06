package programmers.level0.solv_20230412;

public class pizzaDivide_20230412 {
    public static int soultion(int n){
        int answer = 0;

        if ( n%7 == 0 ) answer = (n/7);
        if ( n%7 != 0 ) answer = (n/7)+1;

        return answer;
    }

    public static void main(String[] args){
        System.out.println(soultion(17));
    }
}
