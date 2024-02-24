package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProudct = 10;
        String[] productName = new String[maxProudct];
        int[] productPrice = new int[maxProudct];
        int productCount = 0;
        Scanner inPut = new Scanner(System.in);

        while (true) {
            System.out.println("1.상품 등록  |  2.상품목록  |  3.종료");
            System.out.print("메뉴를 선택하세요 :");
            int menu = inPut.nextInt();
            inPut.nextLine();  // 버퍼 없애기

            if (menu == 1) {
                if (productCount >= maxProudct) { // 상품이 최대치일때 메소드
                    System.out.println("상품을 더 이상 등록할 수 없습니다.");
                    continue;  // 등록 불가능일때 다시 메뉴로 가기
                }
                System.out.print("상품 이름을 등록하세요: ");
                productName[productCount] = inPut.nextLine(); // 입력한 정보를 productName에 저장
                System.out.print("상품 가격을 등록하세요: ");
                productPrice[productCount] = inPut.nextInt(); // 입력한 정보를 productPrice에 저장
                productCount++;  // 상품수 ++
            } else if (menu == 2) {
                System.out.println("----상품 목록입니다.----");
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println((i + 1) + ": " + productName[i] + ": " + productPrice[i] + "원");
                    // productName, productPrice 배열로 출력
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 정보입니다.");
            }
        }
    }
}

