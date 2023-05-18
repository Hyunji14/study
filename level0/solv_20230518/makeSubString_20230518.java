package programmers.level0.solv_20230518;

public class makeSubString_20230518 {
    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i=0; i<my_strings.length; i++){
            int start = parts[i][0];
            int end = parts[i][1];

            if(end+1 == my_strings[i].length()){
                answer += my_strings[i].substring(start);
            }
            else{
                answer += my_strings[i].substring(start, end+1);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        String[] str = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] p = {{0,4}, {1,2}, {3,5}, {7,7}};

        System.out.println(solution(str, p));
    }
}
