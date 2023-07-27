package programmers.programmers.java.solv_20230727;

public class checkString_1_20230727 {
    public static boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String lowerString = s.toLowerCase();

        for(char c : lowerString.toCharArray()){
            if(c == 'p'){
                p++;
            }else if(c == 'y'){
                y++;
            }
        }

        if( p != y ){
            answer = false;
        }

        return answer;
    }
    public static void main(String[] args) {
        String s1 = "pPoooyY";
        String s2 = "Pyy";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
