package programmers.level0.solv_20230502;

public class numberPrint_20230502 {
    public static void solution(int a, int b){
        if(-1000000 <= a && a <= 1000000 && -1000000 <= b && b <= 1000000){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        else {
            System.out.println();
        }
    }

    public static void main(String[] args){
        solution(4,5);
    }
}
