package programmers.programmers.java.solv_20230518;

public class verticalRead_20230518 {
    public static String solution(String my_string, int m, int c) {
        String answer = "", tmp ="";
        int row = my_string.length()/m;
        char[][] arr = new char[row][m];
        int start = 0;
        int end = m;

        for(int i=0; i<row; i++){
            if(end == my_string.length()){
                tmp = my_string.substring(start);
            }
            else if(start == 0 && end == m){
                tmp = my_string.substring(start, end);
            }
            else{
                tmp = my_string.substring(start, end);
            }

            arr[i] = tmp.toCharArray();

            start += m;
            end += m;
        }

        for(int i=0; i<row; i++){
            answer += arr[i][c-1];
        }

        return answer;
    }

    public static void main(String[] args){
        String str1 = "ihrhbakrfpndopljhygc";
        String str2 = "programmers";
        int m1 = 4, c1 =2;
        int m2 = 1, c2 = 1;
        System.out.println(solution(str1, m1, c1));
        System.out.println(solution(str2, m2, c2));
    }
}
