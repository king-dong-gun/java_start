package array;

public class ArrayDi05 {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];

        int i = 0;
        // 순서대로 1씩 증가하는 값을 입력
        for (int row = 0; row < arr.length; row++) {
            for (int calumn = 0; calumn < arr[row].length; calumn++) {
                arr[row][calumn] = i++;
            }
        }
        // 2차원 배열 길이를 활용
            for (int row = 0; row < arr.length; row++) {
                for (int column = 0; column < arr[row].length; column++) { 
                    System.out.print(arr[row][column] + " ");
                }
                System.out.println();
            }
        }
    }

