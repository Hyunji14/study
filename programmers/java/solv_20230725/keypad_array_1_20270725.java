package programmers.programmers.java.solv_20230725;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class keypad_array_1_20270725 {
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHandPosition = Integer.MIN_VALUE;
        int rightHandPosition = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> keypad = new HashMap<>();

        keypadSetting(keypad);

        for(int n : numbers){
            List nPosition = keypad.get(n);
            int leftLength = lengthCalculate(keypad.get(leftHandPosition), nPosition);
            int rightLength = lengthCalculate(keypad.get(rightHandPosition), nPosition);

            if(n == 1 || n == 4 || n == 7){
                answer += "L";
                leftHandPosition = n;
            } else if (n == 3 || n == 6 || n == 9) {
                answer += "R";
                rightHandPosition = n;
            } else if (leftLength == rightLength) {
                if(hand.equals("right")){
                    answer += "R";
                    rightHandPosition = n;
                }else{
                    answer += "L";
                    leftHandPosition = n;
                }
            }else if(leftLength > rightLength){
                answer += "R";
                rightHandPosition = n;
            }else {
                answer += "L";
                leftHandPosition = n;
            }
        }

        return answer;
    }

    public static int lengthCalculate(List<Integer> handposition, List<Integer> number){
        return Math.abs(handposition.get(0) - number.get(0)) + Math.abs(handposition.get(1) - number.get(1));
    }
    public static void keypadSetting(Map<Integer, List<Integer>> k){
        for(int i=0; i<12; i++){
            if(i == 9) {
                k.put(Integer.MIN_VALUE, new ArrayList<>());
            } else if (i == 10){
                k.put(0, new ArrayList<>());
            }else if (i == 11) {
                k.put(Integer.MAX_VALUE, new ArrayList<>());
            } else {
                k.put(i+1, new ArrayList<>());
            }
        }

        k.get(1).add(0);
        k.get(1).add(0);

        k.get(2).add(0);
        k.get(2).add(1);

        k.get(3).add(0);
        k.get(3).add(2);

        k.get(4).add(1);
        k.get(4).add(0);

        k.get(5).add(1);
        k.get(5).add(1);

        k.get(6).add(1);
        k.get(6).add(2);

        k.get(7).add(2);
        k.get(7).add(0);

        k.get(8).add(2);
        k.get(8).add(1);

        k.get(9).add(2);
        k.get(9).add(2);

        k.get(Integer.MIN_VALUE).add(3);
        k.get(Integer.MIN_VALUE).add(0);

        k.get(0).add(3);
        k.get(0).add(1);

        k.get(Integer.MAX_VALUE).add(3);
        k.get(Integer.MAX_VALUE).add(2);
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] num2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(solution(num1, "right"));
        System.out.println(solution(num2, "left"));
        System.out.println(solution(num3, "right"));
    }
}
