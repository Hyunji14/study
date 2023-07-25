package programmers.programmers.java.answer;

public class verticalRead_answer {
    public static String solution(String my_string, int m, int c) {
        String answer = "";

        for(int i= c-1; i< my_string.length(); i+=m){
            answer += my_string.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args){
        String str1 = "ihrhbakrfpndopljhygc";
        String str2 = "programmers";
        int m1 = 4, c1 =2;
        int m2 = 1, c2 = 1;
        System.out.println(solution(str1, m1, c1));
        System.out.println(solution(str2, m2, c2));
    }
}
