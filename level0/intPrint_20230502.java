package programmers.level0;

public class intPrint_20230502 {
    public static void solution(double flo){
        if(0 <= flo && flo <= 100){
            System.out.println((int) flo);
        }
        else {
            System.out.println();
        }
    }

    public static void main(String[] args){
        solution(69.72);
    }
}
