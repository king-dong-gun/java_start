package array.ex;

import java.util.Scanner;

public class ArrayEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 정수의 숫자를 입력하세요: ");
        int inPut = sc.nextInt();  //입력받을 정수의 숫자 출력

        int[] numbers = new int[inPut];  // 입력받은 숫자의 배열생성
        int miniNum;
        int maxNum;

        System.out.println(inPut + "개의 정수를 입력하세요");
        for (int i = 0; i < inPut; i++) {
            numbers[i] = sc.nextInt();
        }
        miniNum = numbers[0];
        maxNum = numbers[0];
        for (int i = 1; i < inPut; i++) {
            if (numbers[i] < miniNum) {  // miniNum[0]보다 큰 numbers[i] 와 계속 비교
                miniNum = numbers[i];
            }
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];  // maxNum[0]보다 작은 numbers[i] 와 계속 비교
            }
        }

        System.out.println("최소값은 " + miniNum);
        System.out.println("최대값은 " + maxNum);
    }
}