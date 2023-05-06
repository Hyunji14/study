package programmers.level0.solv_20230502;

public class oddEvenCheck_20230502 {
    public static void solution(int n){
        if( n % 2 == 0){
            System.out.println(n + " is even");
        }
        else if(n % 2 != 0){
            System.out.println(n + " is odd");
        }
    }

    public static void main(String[] args){
        solution(100);
    }
}
