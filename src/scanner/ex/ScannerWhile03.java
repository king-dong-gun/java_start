package scanner.ex;

import java.util.Scanner;

public class ScannerWhile03 {
    //입력받은 숫자의 합과 평균을 계산하는 프로그램 출력
    //sum, avgerage 변수, -1을 입력하면 프로그램 종료
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("-1을 입력하시면 입력이 중단됩니다.");
//        while (true) {
//            input = inputData.nextInt();
//            inputData.nextLine();
//            if (input == -1) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//            sum += input;
//            count++;   //카운트 -> 숫자 늘어나는 횟수
        //}
        while((input = inputData.nextInt())  != -1) {    //while()내에 (input = inputData)먼저 계산
                                                        //1을 넣었다면 while(1 != -1)이 실행됨.
            sum += input;
            count++;   //카운트 -> 숫자 늘어나는 횟수
        }
        double average = (double) sum / count;     //int형을 double로 케스
        System.out.println("총 숫자의 합: " + sum);
        System.out.println("총 숫자의 평균: " + average);
    }
}
