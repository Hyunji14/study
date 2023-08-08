package programmers.programmers.java.solv_20230808;

public class strContains_regex_0_20230808 {
    public static int solution(String str1, String str2) {
        int answer = 2;
        String pattern = ".*("+str2+").*";

        if(str1.matches(pattern)){
            answer = 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        String s1 = "ab6CDE443fgh22iJKlmn1o";
        String s2 = "6CD";

        String s3 = "ppprrrogrammers";
        String s4 = "pppp";

        String s5 = "AbcAbcA";
        String s6 = "AAA";

        System.out.println(solution(s1, s2));
        System.out.println(solution(s3, s4));
        System.out.println(solution(s5, s6));
    }
}
