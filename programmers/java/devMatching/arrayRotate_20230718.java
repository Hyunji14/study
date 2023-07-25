package programmers.programmers.java.devMatching;

public class arrayRotate_20230718 {
    public static int[] solution(int rows, int columns, int[][] queries){
        int[] answer = new int[queries.length];
        int num = 1;
        int[][] arr = new int[rows][columns];

        for(int i = 0; i<rows; i++){
            for (int j=0; j<columns; j++){
                arr[i][j] = num;
                num++;
            }
        }

        for(int i=0; i<queries.length; i++){
            answer[i] = rotate(arr, queries[i]);
        }

        return answer;
    }

    public static int rotate(int[][] arr, int[] query){
        int min = Integer.MAX_VALUE;
        int x1 = query[0]-1;
        int y1 = query[1]-1;
        int x2 = query[2]-1;
        int y2 = query[3]-1;

        int oldValue;
        int newValue = arr[x1+1][y1];

        //right
        for(int p = y1; p <= y2; p++){
            min = minNum(min, newValue);
            oldValue = arr[x1][p];
            arr[x1][p] = newValue;
            newValue = oldValue;
        }

        //down
        for(int p=x1+1; p <= x2; p++){
            min = minNum(min, newValue);
            oldValue = arr[p][y2];
            arr[p][y2] = newValue;
            newValue = oldValue;
        }

        //left
        for(int p= y2-1; p >= y1; p--){
            min = minNum(min, newValue);
            oldValue = arr[x2][p];
            arr[x2][p] = newValue;
            newValue = oldValue;
        }

        //up
        for(int p = x2-1; p >= x1; p--){
            min = minNum(min, newValue);
            oldValue = arr[p][y1];
            arr[p][y1] = newValue;
            newValue = oldValue;
        }

        return min;
    }

    public static int minNum (int oldNum, int newNum){
        if(oldNum >= newNum){
            return newNum;
        }else{
            return oldNum;
        }
    }
    public static void main(String[] args) {
        int[][] q1 = {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}};
        int[][] q2 = {{1,1,2,2}, {1,2,2,3}, {2,1,3,2}, {2,2,3,3}};
        int[][] q3 = {{1,1,100,97}};

        int[] r1 = solution(6,6, q1);
        int[] r2 = solution(3,3, q2);
        int[] r3 = solution(100,97, q3);

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
