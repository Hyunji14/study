package programmers.level0.solv_20230518;

public class stringNum1_20230518 {
    public static String solution(String my_string, int n) {
        int idx = my_string.length() - n;
        String answer = my_string.substring(idx);

        return answer;
    }

    public static void main(String[] args){
        String s1 = "ProgrammerS123";
        String s2 = "He110W0r1d";
        int n1 = 11;
        int n2 = 5;

        System.out.println(solution(s1, n1));
        System.out.println(solution(s2, n2));
    }
}
