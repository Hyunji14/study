package programmers.programmers.java.kakaoTechInternship;

import java.util.ArrayList;
import java.util.List;

public class mbti_20230719 {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        List<Character> tempt = new ArrayList<>();
        int[] score =  {0, 0, 0, 0, 0, 0, 0, 0};
        int[] num = {3, 2, 1, 0, 1, 2, 3};

        tempt.add('R');
        tempt.add('T');
        tempt.add('C');
        tempt.add('F');
        tempt.add('J');
        tempt.add('M');
        tempt.add('A');
        tempt.add('N');

        for(int i=0; i<survey.length; i++){
            char[] character = survey[i].toCharArray();
            int c = choices[i];

            if(c == 4) {
                continue;
            }else{
                int idx;
                int currentScore;

                if(c < 4 ) {
                    idx = tempt.indexOf(character[0]);
                }else {
                    idx = tempt.indexOf(character[1]);
                }
                currentScore = score[idx];
                currentScore += num[choices[i]-1];
                score[idx] = currentScore;
            }
        }

        for(int i = 0; i<8; i += 2){
            if(score[i] >= score[i+1]){
                answer += tempt.get(i);
            }else if(score[i] < score[i+1]){
                answer += tempt.get(i+1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] s1 = {"AN", "CF", "MJ", "RT", "NA"};
        int[] c1 = {5, 3, 2, 7, 5};

        String[] s2 = {"TR", "RT", "TR"};
        int[] c2 = {7, 1, 3};

        String r1 = solution(s1, c1);
        String r2 = solution(s2, c2);

        System.out.println(r1);
        System.out.println(r2);

    }
}
