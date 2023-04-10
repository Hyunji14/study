package programmers.level0;

//정규표현식 사용 또는 replace 함수를 사용해 진행
public class babbling_answer {
    public static void main(String[] args) {
//        String[] test = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        String[] test = {"aya", "yee", "u", "maa", "wyeoo"};

        Babblig_replace b_c = new Babblig_replace();
        Babblig_regex b_r = new Babblig_regex();

        System.out.println(b_c.solution(test));
        System.out.println(b_r.solution(test));
    }
}

class Babblig_replace{
    int answer = 0;
    int solution(String[] array){
        for(int i=0; i<array.length; i++){
            array[i] = array[i].replace("aya", "1");
            array[i] = array[i].replace("woo", "1");
            array[i] = array[i].replace("ye", "1");
            array[i] = array[i].replace("ma", "1");
            array[i] = array[i].replace("1", "");
            if(array[i].isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}

class Babblig_regex{
    //정규식
    int answer = 0;
    int solution(String[] array){
        for(int i=0; i<array.length; i++){
            if(array[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }
        return answer;
    }
}