package scanner.ex;

import java.util.Scanner;

public class ScannerSwitch05 {
    //사용자로부터 상품명 상품가격 상품수량을 받고 이들 총 가격을 출력하는 프로그램 만들기
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPrice = 0;

        while (true) {
            System.out.println("1. 상품입력 , 2. 상품 결제, 3. 구매 종료");
            System.out.print("번호를 입력하세요 ===>");
            int select = input.nextInt();
            input.nextLine();

            switch (select) {
                case 1 -> {
                    System.out.print("상품을 입력하세요 ===>");
                    String name = input.nextLine();
                    System.out.print("가격을 입력하세요 ===>");
                    int price = input.nextInt();
                    System.out.print("수량을 입력하세요 ===>");
                    int quantity = input.nextInt();
                    System.out.println("상품 이름: " + name + ", 상품 가격: " + price + ", 상품 수량: " + quantity);
                    totalPrice += price * quantity;
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("상품 총 금액은 " + totalPrice + "원 입니다.");
                    System.out.println();
                    totalPrice = 0;
                }
                default -> System.out.println("오류입니다.");
            }
            if (select == 3) break;
        }
    }
}