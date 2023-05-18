package programmers.level0.solv_20230518;

public class prefixCheck_20230518 {
    public static int solution(String my_string, String is_prefix) {
        if(my_string.startsWith(is_prefix)){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        String str = "banana";
        String sfix1 = "ban";
        String sfix2 = "nan";
        String sfix3 = "abcd";
        String sfix4 = "bananan";

        System.out.println(solution(str, sfix1));
        System.out.println(solution(str, sfix2));
        System.out.println(solution(str, sfix3));
        System.out.println(solution(str, sfix4));
    }
}
