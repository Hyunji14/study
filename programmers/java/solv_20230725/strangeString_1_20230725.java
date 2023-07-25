package programmers.programmers.java.solv_20230725;

public class strangeString_1_20230725 {
    public static String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1);

        for(String w : words){
            char[] c = w.toCharArray();

            for(int i=0; i<c.length; i++){
                if(i % 2 == 0){
                    answer += Character.toUpperCase(c[i]);
                }else if(i % 2 == 1){
                    answer += Character.toLowerCase(c[i]);
                }
            }

            if(answer.length() != s.length()) answer += " ";
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "try hello world";

        System.out.println(solution(s));
    }
}
