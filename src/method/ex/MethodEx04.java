package method.ex;

import java.util.Scanner;

public class MethodEx04 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택 >>>>");

            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼없애기
            int amount;

            switch (choice) {
                case 1 :
                    System.out.print("입금액을 입력하세요 >> ");
                    amount = sc.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2 :
                    System.out.print("출금액을 입력하세요 >> ");
                    amount = sc.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3 :
                    System.out.println("현재잔액 >> " + balance);
                    break;
                case 4 :
                    System.out.println("시스템을 종료합니다.");
                    // break; -> 다시 while문으로 감 사용x
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 선택해주세요");
            }
        }
    }
    // 입금하기 위한 메소드
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하셨습니다. 현재금액: " + balance);
        return balance;
    }
    // 출금하기 위한 메소드
    public static int withdraw(int balance, int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하셨습니다. 현재금액: " + balance);
        } else {
            System.out.println("잔액이 부족합니다. 현재금액: " + balance);
        } return balance;
    }
}
