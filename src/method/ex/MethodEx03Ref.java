package method.ex;

public class MethodEx03Ref {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 3000); // 입금 메소드 추출
        balance = withdraw(balance, 3000); // 출금 메소드 추출
        System.out.println("현재잔액: " + balance);
    }

    // 입금하기 위한 메소드
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재잔액: " + balance + "원");
        return balance;
    }

    // 출금하기 위한 메소드
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재잔액: " + balance + "원");
        } else {
            System.out.println("잔액부족입니다. 현재잔액: " + balance);
        }
        return balance;
    }
}
