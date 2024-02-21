package scanner.ex;

import java.util.Scanner;

public class ScannerEx01 {
    //당신의 이름을 입력하세요
    //당신의 나이를 입력하세요
    //당신의 이름은 00이고 나이는 00입니다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름은: ");
        String name = scanner.nextLine();
        System.out.print("당신의 나이는: ");
        int age = scanner.nextInt();
        System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "살 입니다.");
    }
}
