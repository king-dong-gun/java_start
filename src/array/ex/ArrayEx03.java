package array.ex;

import java.util.Scanner;

public class ArrayEx03 {
    public static void main(String[] args) {
        //역순 출력
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        System.out.println("다섯개의 정수를 입력하세요");

        for(int i=0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("출력");
        for(int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}

