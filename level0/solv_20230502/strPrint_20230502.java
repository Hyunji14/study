package programmers.level0.solv_20230502;

public class strPrint_20230502 {
    public static void solution(String str){
        int strLength = str.length();
        if(1 <= strLength && strLength <= 1000000){
            System.out.println(str);
        }
        else {
            System.out.println();
        }
    }

    public static void main(String[] args){
        solution("Hello world!");
    }
}
