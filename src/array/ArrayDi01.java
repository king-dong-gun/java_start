package array;

public class ArrayDi01 {
    public static void main(String[] args) {
        //2x3의 2차원 배열을 만듬
        int[][] arr = new int[2][3];  //2행 3열
        arr[0][0] = 1; //0행 0열
        arr[0][1] = 2; //0행 1열
        arr[0][2] = 3; //0행 2열
        arr[1][0] = 4; //1행 0열
        arr[1][1] = 5; //1행 1열
        arr[1][2] = 6; //1행 2열

        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");
        System.out.println();
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
        System.out.println();
        // 한행이 끝나면 줄을 바꾼다.
    }
}
