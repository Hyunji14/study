package programmers.programmers.java.solv_20230524;

public class nearFindOne_20230524 {
    public static int solution(int[] arr, int idx) {
        int answer = -1;

        for(int i = 0; i<arr.length; i++){
            if(idx <= i && arr[i] == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 1};
        int[] arr2 = {1, 0, 0, 1, 0, 0};
        int[] arr3 = {1, 1, 1, 1, 0};
        int[] arr4 = {1, 0, 1, 0, 1, 0};
        int idx1 = 1, idx2 = 4, idx3 = 3, idx4 = 0;

        System.out.println(solution(arr1, idx1));
        System.out.println(solution(arr2, idx2));
        System.out.println(solution(arr3, idx3));
        System.out.println(solution(arr4, idx4));
    }
}
