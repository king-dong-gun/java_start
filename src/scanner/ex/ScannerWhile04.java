package scanner.ex;

import java.util.Scanner;

public class ScannerWhile04 {
    //사용자로부터 상품명 상품가격 상품수량을 받고 이들 총 가격을 출력하는 프로그램 만들기
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPrice = 0;

        while (true) {
            System.out.println("1. 상품 입력   2. 상품 결제   3. 구매 종료");
            int option = input.nextInt();
            if (option == 1) {
                System.out.println("상품을 입력하세요.");
                String name = input.nextLine();
                System.out.println("가격을 입력하세요.");
                int price = input.nextInt();
                input.nextLine();
                System.out.println("수량을 입력하세요.");
                int quantity = input.nextInt();
                input.nextLine();
                totalPrice += price * quantity;
                System.out.println("상품명: " + name + ", 가격: " + price + "원, 수량: " + quantity);

            } else if (option == 2) {
                input.nextInt();
                System.out.println("총 비용: " + totalPrice + "원");
                totalPrice = 0;  //결제하면 총 비용 초기화
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 옵션입니다.");
            }
        }
    }
}
