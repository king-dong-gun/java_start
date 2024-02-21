package scanner.ex;

import java.util.Scanner;

public class ScannerWhile02 {
    //사용자로부터 상품가격과 수량을 받아 총 가격을 출력하는 프로그램 만들기
    //-1을 입력하여 종료
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        while (true) {
            System.out.println("종료하시려면 -1을 입력하세요");
            System.out.println("상품가격을 입력하세요.");
            int price = inputData.nextInt();
            inputData.nextLine();
            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("상품 수량을 입력하세요.");
            int quantity = inputData.nextInt();
            inputData.nextLine();
            int totalPrice = price * quantity;
            System.out.println("총 가격: " + totalPrice );
        }
    }
}
