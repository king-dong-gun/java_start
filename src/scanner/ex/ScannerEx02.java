package scanner.ex;

import java.util.Scanner;

public class ScannerEx02 {
    //사용자에게 하나의 정수를 받아서 홀수 짝수를 판별하는 프로그램을 만드세요
    //하나의 정수를 입력하세요:
    //입력한 숫자는 ~은 홀/짝수 입니다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 숫자를 입력하세요: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력한 숫자는 " + num + " 이고 짝수 입니다.");
        } else {
            System.out.println("입력한 숫자는 " + num + " 이고 홀수 입니다.");
        }
    }
}