package method.ex;

public class MethodEx03 {
    public static void main(String[] args) {
        int balance = 10000;

        // 입금
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재잔액: " + balance + "원");

        // 출금
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족하여 출금할 수 없습니다. 현재잔액: " + balance);
        }
        System.out.println("현재잔액: " + balance);
    }
}
