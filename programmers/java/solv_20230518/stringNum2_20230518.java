package programmers.programmers.java.solv_20230518;

public class stringNum2_20230518 {
    public static String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
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
