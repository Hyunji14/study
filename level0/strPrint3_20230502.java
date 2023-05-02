package programmers.level0;

public class strPrint3_20230502 {
    public static void solution(String str){
        for(Character c : str.toCharArray()){
            System.out.println(c);
        }
    }

    public static void main(String[] args){
        solution("abcde");
    }
}
