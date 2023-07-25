package programmers.nct.java;

public class num1_20230720 {
    public static int solution(String[] emails){
        int answer = -2;
        int count = 0;

        for(String email : emails){
            String regex = "[a-z]+(\\.[a-z]+)*@[a-z]+(\\.[a-z]+)*(\\.(net|com|org))$";

            if(email.matches(regex)){
                count++;
            }
        }

        if(count >=0){
            answer = count;
        }

        return answer;
    }
    public static void main(String[] args) {
        String[] e1 = {"abc", "abc@je.net", "f@n.o", "oew@i.org"}; //2
        String[] e2 = {"kc", "abc@je.net.ek", "f@n.o", "oew@i.or.com", "kk@h@i.net", "jr@oe.org"}; //2
        String[] e3 = {"eje.net", "abc@je.net.org", "f@n.com", "he.he@p.org"}; //3

        System.out.println(solution(e1));
        System.out.println(solution(e2));
        System.out.println(solution(e3));
    }
}
