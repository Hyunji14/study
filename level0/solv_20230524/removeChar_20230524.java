package programmers.level0.solv_20230524;

public class removeChar_20230524 {
    public static String solution(String my_string, int[] indices){
        String answer = "";
        char[] s = my_string.toCharArray();

        for(int i : indices){
            s[i] = ' ';
        }

        for(char c : s){
            if(c == ' '){
                continue;
            }
            else{
                answer += c;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String s = "apporoograpemmemprs";
        int[] input = {1, 16, 6, 15, 0, 10, 11, 3};

        System.out.println(solution(s, input));
    }
}
