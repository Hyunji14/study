package programmers.devMatching;

import java.util.ArrayList;
import java.util.List;

public class lotto_20230718 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        int zeroNum = 0;
        int check = 0;

        for(int l : lottos){
            list.add(l);
            if(l == 0) zeroNum++;
        }

        for(int n : win_nums){
            if(list.contains(n)) check++;
        }

        answer[0] = checkGrade(check+zeroNum);
        answer[1] = checkGrade(check);

        return answer;
    }

    public static int checkGrade(int num){
        switch (num){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
    public static void main(String[] args) {
        int[] l1 = {44, 1, 0, 0, 31, 25};
        int[] l2 = {0, 0, 0, 0, 0, 0};
        int[] l3 = {45, 4, 35, 20, 3, 9};
        int[] n1 = {31, 10, 45, 1, 6, 19};
        int[] n2 = {38, 19, 20, 40, 15, 25};
        int[] n3 = {20, 9, 3, 45, 4, 35};

        int[] r1 = solution(l1, n1);
        int[] r2 = solution(l2, n2);
        int[] r3 = solution(l3, n3);

        for(int r : r1){
            System.out.print(r + " ");
        }
        System.out.println();
        for(int r : r2){
            System.out.print(r + " ");
        }
        System.out.println();
        for(int r : r3){
            System.out.print(r + " ");
        }

    }
}
