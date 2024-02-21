package cond.ex;

public class CondOpEx {
    //두개의 정수 변수 a b가 있다 a는 10 b는 20 삼항연사자를 사용하여 두 숫자중 더 큰 숫자를 출력
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + " 입니다.");
    }
}
