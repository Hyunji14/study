package programmers.level0.solv_20230517;

public class stringFlip_20230517 {
    public static String solution(String my_string, int[][] queries) {
        String answer = my_string;
        StringBuffer sb;

        for(int i=0; i<queries.length; i++){
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            String str;

            if(idx2 + 1 == my_string.length()){
                str = answer.substring(idx1);
            }
            else{
                str = answer.substring(idx1, idx2+1);
            }

            sb = new StringBuffer(str);

            String[] tmp = answer.split(str);

            if(tmp.length == 2){
                answer = tmp[0] + sb.reverse().toString() + tmp[1];
            }
            else if (tmp.length == 1){
                answer = tmp[0] + sb.reverse().toString() + "";
            }
        }

        return answer;
    }

    public static String solution2(String my_string, int[][] queries) {
        String answer = my_string;

        for(int i=0; i<queries.length; i++){
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            int t_length = 0;
            String str, flip = "";;

            if(idx2 + 1 == my_string.length()){
                str = answer.substring(idx1);
            }
            else{
                str = answer.substring(idx1, idx2+1);
            }

            t_length = str.length()-1;
            char[] arry = str.toCharArray();

            for(int j=0; j<(arry.length+1)/2; j++){
                char t1 = arry[j];
                char t2 = arry[t_length];

                arry[j] = t2;
                arry[t_length] = t1;

                t_length--;
            }

            for(char t : arry){
                flip += t;
            }

            String[] tmp = answer.split(str);

            if(tmp.length == 2){
                answer = tmp[0] + flip + tmp[1];
            }
            else if (tmp.length == 1){
                answer = tmp[0] + flip + "";
            }
        }

        return answer;
    }

    public static void main(String[] args){
        String s = "rermgorpsam";
        int[][] q = {{2,3}, {0,7}, {5,9}, {6,10}};

        System.out.println(solution2(s, q));
    }
}
