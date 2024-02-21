package array;

public class ArrayDi04 {
    public static void main(String[] args) {
        //2x3의 2차원 배열을 만듬
        int[][] arr = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < arr.length; row++) {  //열의 갯수 arr.length
            for (int column = 0; column < arr[row].length; column++) {  //row의 행의 갯수 arr.length
                System.out.print(arr[row][column] + " ");
            } System.out.println();// 한행이 끝나면 줄을 바꾼다.
        }
    }
}
