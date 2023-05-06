package programmers.level0.solv_20230412;

public class share_20230412 {
    public static int soultion(int num1, int num2){
        int answer = -1;

        if(0 < num1 && num1 <= 100 && 0< num2 && num2 <= 100){
            answer = num1 / num2;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(soultion(10,5));
    }
}
