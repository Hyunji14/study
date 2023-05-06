package programmers.level0.solv_20230410;

public class babbling_20230410 {
    public static int solution(String[] babbling) {
        int answer = 0;
        Babbling b = new Babbling();

        for(int i=0; i< babbling.length; i++){
            if(b.IsBabblingWord(babbling[i])){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        String[] test = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        String[] test = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(test));
    }
}

class Babbling{
    String[] b_word = {"aya", "ye", "woo", "ma"};
    int[] b_length = {3, 2, 3, 2};
    boolean result = false;
    boolean initWordCheck = false;
    String checkWord = "";
    boolean IsBabblingWord(String word){
        for(int i=0; i<4; i++){
            checkWord = word;

            if(word.length() >= b_length[i]){
                checkWord = word.substring( 0, b_length[i] );
            }

            if( !b_word[i].equals(checkWord) ){
                result = false;
                continue;
            }
            if( b_word[i].equals(checkWord) ){
                result = true;
                checkWord = word.substring(b_length[i]);

                if (checkWord.length() > 0){
                    IsBabblingWord(checkWord);
                }
                if(checkWord.length() == 0){
                    return result;
                }
            }
        }
        return result;
    }
}

class Solution {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    Babbling b = new Babbling();
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i< babbling.length; i++){
            if(b.IsBabblingWord(babbling[i])){
                answer++;
            }
        }
        return answer;
    }
}