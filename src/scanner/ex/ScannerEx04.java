package scanner.ex;

import java.util.Scanner;

public class ScannerEx04 {
    //하나의 정수 n을 출력 받고 n단 구구단 출력하기
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단 단의 수를 입력해주세요: ");
        int n = input.nextInt();
        System.out.println("----------" + n + "단----------");
        for (int i = 1; i <= 9; i++) {
            int multi = n * i;
            System.out.println(n + " X " + i + " = " + multi);
        }
    }
}
