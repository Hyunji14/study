package programmers.programmers.java.solv_20230517;

public class makeString_20230517 {
    public static String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] s = my_string.toCharArray();

        for(int i : index_list){
            answer += s[i];
        }

        return answer;
    }

    public static void main(String[] args){
        String s = "cvsgiorszzzmrpaqpe";
        String s2 = "zpiaz";
        int[] i = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        int[] i2 = {1, 2, 0, 0, 3};

        System.out.println(solution(s, i));
        System.out.println(solution(s2, i2));
    }
}
