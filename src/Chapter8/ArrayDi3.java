package Chapter8;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}

        };

        // 2차원 배열의 길이를 활용
        for (int row = 0; row<arr.length; row++){
            for (int column = 0; column<arr[row].length; column++){
                System.out.println(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
