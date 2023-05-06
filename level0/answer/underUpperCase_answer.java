package programmers.level0.answer;

public class underUpperCase_answer {
    public static void solution(String str){
        int strLength = str.length();
        String result = "";

        for(Character c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args){
        solution("aBcDeFg");
    }
}
