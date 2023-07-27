package programmers.programmers.java.solv_20230727;

public class specSumNum_for_0_20230727 {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int center = total / num;
        int diff = total % num == 0 ? num/2 : num/2 - 1;
        int startNum = center - diff;

        for(int i=0; i<answer.length; i++){
            answer[i] = startNum+i;
        }

        return answer;
    }
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        int n3 = 4;
        int n4 = 5;

        int t1 = 12;
        int t2 = 15;
        int t3 = 14;
        int t4 = 5;

        int[] r1 = solution(n1, t1);
        int[] r2 = solution(n2, t2);
        int[] r3 = solution(n3, t3);
        int[] r4 = solution(n4, t4);

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
        System.out.println();
        for(int r : r4){
            System.out.print(r + " ");
        }
    }
}
