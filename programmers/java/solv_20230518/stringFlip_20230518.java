package programmers.programmers.java.solv_20230518;

public class stringFlip_20230518 {
    public static String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder a = new StringBuilder(my_string);
        StringBuilder sb = new StringBuilder(a.substring(s, e + 1));
        sb.reverse();

        a.replace(s, e+1, sb.toString());
        answer = a.toString();

        return answer;
    }

    public static void main(String[] args){
        String str1 = "Progra21Sremm3";
        String str2 = "Stanley1yelnatS";
        int s1 = 6;
        int s2 = 4;
        int e1 = 12;
        int e2 = 10;

        System.out.println(solution(str1, s1, e1));
        System.out.println(solution(str2, s2, e2));
    }
}
