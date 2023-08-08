package programmers.programmers.java.solv_20230808;

public class recommandID_regex_1_20230808 {
    public static String solution(String new_id) {
        //step 1
        String answer = new_id.toLowerCase();

        //step 2
        String regex = "[~ | \\! | @ | # |\\$ | % | \\^ | & | \\* | \\( | \\) | = | \\+ | \\[ | \\{ |" +
                "\\] | \\} | : | \\? | < | > | / | ,]";
        answer = answer.replaceAll(regex, "" );

        //step3
        answer = answer.replaceAll("(\\.)+", ".");

        //step4
        answer = dotCheckFunction(answer);

        //step5
        if(answer.length() == 0) {
            answer = "a";
        }

        //step6
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            answer = dotCheckFunction(answer);
        }

        //step7
        if(answer.length() <= 2){
            char c = answer.charAt(answer.length() - 1);

            while(answer.length() != 3){
                answer += c;
            }
        }

        return answer;
    }

    public static String dotCheckFunction(String s){
        String result = s;

        result = result.replaceAll("^(\\.)+", "");
        result = result.replaceAll("(\\.)$", "");

        return result;
    }
    public static void main(String[] args) {
        String id1 = "...!@BaT#/*..y.abcdefghijklm";
        String id2 = "z-+.^.";
        String id3 = "=.=";
        String id4 = "123_.def";
        String id5 = "abcdefghijklmn.p";
        String id6 = "~!@#$%&*()=+[{]}:?,<>/";

        System.out.println(solution(id1));
        System.out.println(solution(id2));
        System.out.println(solution(id3));
        System.out.println(solution(id4));
        System.out.println(solution(id5));
        System.out.println(solution(id6));
    }
}
