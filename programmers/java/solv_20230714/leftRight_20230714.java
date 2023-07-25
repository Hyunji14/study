package programmers.programmers.java.solv_20230714;

import java.util.ArrayList;
import java.util.List;

public class leftRight_20230714 {
    public static String[] solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        int index = -1;
        String d = "";

        for(int i = 0; i<str_list.length; i++){
            String s = str_list[i];
            if(s.equals("l")){
                index = i;
                if(i == 0){
                    break;
                }else {
                    d = "l";
                    break;
                }
            }else if(s.equals("r")){
                index = i;
                if(i == (str_list.length-1)){
                    break;
                }else{
                    d = "r";
                    break;
                }
            }
        }

        if (index < 0) {
            return answer.toArray(new String[]{});
        }else {
            if(d == "r"){
                for(int i = index+1; i<str_list.length; i++){
                    answer.add(str_list[i]);
                }
            }else{
                for(int i = 0; i<index; i++){
                    answer.add(str_list[i]);
                }
            }
        }

        return answer.toArray(new String[]{});
    }
    public static void main(String[] args) {
//        String[] str_list1 = {"u", "d", "d", "u", "u", "l", "d", "l", "r"};
        String[] str_list2 = {"u", "d", "d", "u", "u", "l"};
//        String[] r1 = solution(str_list1);
        String[] r2 = solution(str_list2);

//        for(String r : r1){
//            System.out.print(r + " ");
//        }
        System.out.println();
        for(String r : r2){
            System.out.print(r + " ");
        }
    }
}
