package programmers.level0.solv_20230412;

public class maxMul_20230412 {
    public static int solution(int[] numbers){
        int answer = 0;
        int[] array = numbers;
        int max1 = 0;
        int position = 0;
        int max2 = 0;

        for(int i=0; i<array.length; i++){
            if( max1 <= array[i]){
                max1 = array[i];
                position = i;
            }
        }

        array[position] = -1;

        for(int i=0; i<array.length; i++){
            if( max2 <= array[i]){
                max2 = array[i];
            }
        }

        answer = max1*max2;

        return answer;
    }

    public static void main(String[] args){
//        int[] test = {1, 2, 3, 4, 5};
        int[] test = {0, 31, 24, 10, 1, 9};

        System.out.println(solution(test));
    }
}
