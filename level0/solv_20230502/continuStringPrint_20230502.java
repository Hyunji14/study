package programmers.level0.solv_20230502;

public class continuStringPrint_20230502 {
    public static void solution(String str, int n){
        int strLength = str.length();
        if(1 <= strLength && strLength <= 10 && 1 <= n && n <= 5){
            for (int i=0; i<n ; i++) {
                System.out.print(str);
            }
        }
        else {
            System.out.println();
        }
    }

    public static void main(String[] args){
        solution("string", 5);
    }
}
