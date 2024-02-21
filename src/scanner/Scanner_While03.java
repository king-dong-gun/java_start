package scanner;

import java.util.Scanner;

public class Scanner_While03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("0을 누르면 프로그램이 종료됩니다.");

        while (true) {
            System.out.print("정수를 입력하세요: ");
            int number = input.nextInt();

            if (number == 0) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            sum += number;     //sum = sum + number;
        }
        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}
