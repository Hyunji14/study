package programmers.level0.answer;

public class stringFlip_answer {
    public static StringBuilder rvr(StringBuilder s, int l, int r) {
        StringBuilder t = new StringBuilder(s.substring(l, r + 1));
        t.reverse();
        s.replace(l, r + 1, t.toString());
        return s;
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        for (int[] q : queries) answer = rvr(answer, q[0], q[1]);
        return answer.toString();
    }

    public static void main(String[] args){
        String s = "rermgorpsam";
        int[][] q = {{2,3}, {0,7}, {5,9}, {6,10}};

        System.out.println(solution(s, q));
    }
}
