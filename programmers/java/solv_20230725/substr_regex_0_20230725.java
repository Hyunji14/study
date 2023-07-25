package programmers.programmers.java.solv_20230725;

public class substr_regex_0_20230725 {
    public static int solution_regex(String my_string, String target) {
        String regex = ".*(" + target + ").*";

        if(my_string.matches(regex)){
            return 1;
        }else {
            return 0;
        }
    }

    public static int solution_contains(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

    public static void main(String[] args) {
        String ms1 = "banana";
        String tar1 = "ana";
        String tar2 = "wxyz";
        String tar3 = "aaan";

        System.out.println(solution_regex(ms1, tar1));
        System.out.println(solution_contains(ms1, tar1));

        System.out.println(solution_regex(ms1, tar2));
        System.out.println(solution_contains(ms1, tar2));

        System.out.println(solution_regex(ms1, tar3));
        System.out.println(solution_contains(ms1, tar3));
    }
}
