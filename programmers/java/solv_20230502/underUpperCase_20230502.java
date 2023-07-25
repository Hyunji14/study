package programmers.programmers.java.solv_20230502;

public class underUpperCase_20230502 {
    public static void solution(String str){
        int strLength = str.length();
        String result = "";

        if(1 <= strLength && strLength <= 10){
            for(int i = 0; i < strLength ; i++){
                int tmp = (int) str.charAt(i);
                char temp  = str.charAt(i);

                if(65 <= tmp && tmp <= 90){
                    temp = Character.toLowerCase(temp);
                    result += temp;
                }
                else if(97 <= tmp && tmp <= 122){
                    temp = Character.toUpperCase(temp);
                    result += temp;
                }
            }
            System.out.println(result);
        }
        else {
            System.out.println();
        }
    }

    public static void main(String[] args){
        solution("aBcDeFg");
    }
}
