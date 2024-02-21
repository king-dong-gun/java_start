package scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.print("더 큰 정수: " + num1);
        } else if (num1 < num2) {
            System.out.print("더 큰 정수: " + num2);
        } else {
            System.out.println("두 정수가 같습니다.");
        }
    }
}
