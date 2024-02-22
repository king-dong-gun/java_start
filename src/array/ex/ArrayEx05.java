package array.ex;

import java.util.Scanner;

public class ArrayEx05 {
    public static void main(String[] args) {
        //입력받을 수의 개수를 입력받고 평균 구하기
        Scanner sc = new Scanner(System.in);
        System.out.println("입력받을 수의 갯수를 입력하세요");
        int inPut = sc.nextInt();

        int numbers[] = new int[inPut];
        int sum = 0;
        double average;

        System.out.println(inPut + "개의 숫자를 입력하세요");
        for (int i = 0; i < inPut; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / inPut;
        System.out.println("총 합: " + sum);
        System.out.println("평균: " + average);
    }
}
