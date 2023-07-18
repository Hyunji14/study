package programmers.level0.solv_20230718;

import static java.lang.Math.abs;

public class parall_20230718 {
    public static int solution(int[][] dots){
        //Exhautive Search
        int answer = 0;
        int x1 = dots[0][0];
        int x2 = dots[1][0];
        int x3 = dots[2][0];
        int x4 = dots[3][0];

        int y1 = dots[0][1];
        int y2 = dots[1][1];
        int y3 = dots[2][1];
        int y4 = dots[3][1];

        if((double)abs(x1-x2)/abs(y1-y2) == (double) abs(x3-x4)/abs(y3-y4)) {
            answer = 1;
        } else if ((double)abs(x1-x3)/abs(y1-y3) == (double) abs(x2-x4)/abs(y2-y4)) {
            answer = 1;
        } else if ((double)abs(x1-x4)/abs(y1-y4) == (double) abs(x2-x3)/abs(y2-y3)) {
            answer = 1;
        } else if ((double)abs(x2-x3)/abs(y2-y3) == (double) abs(x1-x4)/abs(y1-y4)) {
            answer = 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] d1 = {{1,4}, {9,2}, {3,8}, {11,6}};
        int[][] d2 = {{3,5}, {4,1}, {2,4}, {5,10}};
        int[][] d3 = {{1,1}, {1,0}, {3,3}, {3,4}};

        System.out.println(solution(d1));
        System.out.println(solution(d2));
        System.out.println(solution(d3));

        //1 10

    }
}
