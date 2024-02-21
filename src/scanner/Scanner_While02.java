package scanner;

import java.util.Scanner;

public class Scanner_While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자와 두번째 숫자 모두 0을 입력하면 프로그램이 종료됩니다.");

        while(true) {
            System.out.print("첫번째 정수를 입력하세요: ");
            int num1 = scanner.nextInt();
            System.out.print("두번째 정수를 입력하세요: ");
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 ==0) {           //&&연산자 꼭 기억하기
                System.out.println("프로그램 종료");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 숫자의 합: " + sum);
            System.out.println();
        }
    }
}