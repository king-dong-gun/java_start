package array.ex;

import java.util.Scanner;

public class ArrayEx04 {
    public static void main(String[] args) {
        //평균 출력
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        int sum = 0;
        double average;
        System.out.println("다섯개의 정수를 입력하세요");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        average = (double) sum / 5;
        System.out.println("총 합: " + sum);
        System.out.println("평균: " + average);
    }
}


