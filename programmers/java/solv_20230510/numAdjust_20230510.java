package programmers.programmers.java.solv_20230510;

public class numAdjust_20230510 {
    public static int solution(int n, String control){
        int answer = n;

        for(Character c : control.toCharArray()){
            if(c.equals('w')){
                answer += 1;
            }
            else if(c.equals('s')){
                answer -= 1;
            }
            else if(c.equals('d')){
                answer += 10;
            }
            else if(c.equals('a')){
                answer -= 10;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(0,"wsdawsdassw"));
    }
}
