package programmers.programmers.java.solv_20230808;

public class changeStr_contains_0_20230808 {
    public static int solution(String myString, String pat) {
        String tmp = "";

        for(char c : myString.toCharArray()){
            if(c == 'A'){
                tmp += "B";
            }else{
                tmp += "A";
            }
        }

        return tmp.contains(pat) ? 1 : 0;
    }
    public static void main(String[] args) {
        String myString1 = "ABBAA";
        String pat1 = "AABB";

        String myString2 = "ABAB";
        String pat2 = "ABAB";

        System.out.println(solution(myString1, pat1));
        System.out.println(solution(myString2, pat2));
    }
}
