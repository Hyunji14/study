package programmers.level0;

public class overwriteStr_20230502 {
    public static String solution(String my_string, String overwrite_string, int s){
        String answer = "";
        int owLength = overwrite_string.length();
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+owLength);
        return answer;
    }

    public static void main(String[] args){
//        System.out.println(solution("He11oWro1d", "lloWorl", 2));
//        System.out.println(solution("Progl4M", "ram", 4));
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }
}
