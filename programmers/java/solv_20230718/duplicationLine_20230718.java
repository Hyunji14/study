package programmers.programmers.java.solv_20230718;

public class duplicationLine_20230718 {
    public static int solution(int[][] lines) {
        int answer = 0;
        int x1 = lines[0][0];
        int x2 = lines[1][0];
        int x3 = lines[2][0];

        int y1 = lines[0][1];
        int y2 = lines[1][1];
        int y3 = lines[2][1];

        for(int i=-100; i<100; i++){
            int check = 0;

            if(x1 <= i && i<y1) check++;
            if(x2 <= i && i<y2) check++;
            if(x3 <= i && i<y3) check++;

            if(check>1) answer++;
        }


        return answer;
    }
    public static void main(String[] args) {
        int[][] l1 = {{0,1}, {2,5}, {3,9}};
        int[][] l2 = {{-1,1}, {1,3}, {3,9}};
        int[][] l3 = {{0,5}, {3,9}, {1,10}};

        System.out.println(solution(l1));
        System.out.println(solution(l2));
        System.out.println(solution(l3));
    }
}
