package cond.ex;

public class EvenOddEx {
    //정수 x가 주어지면 x에 짝수를 x가 홀수이면 홀수를 출력하는 코드 만들기 _ 삼항연산자 사용
    //%==0 이면 나머지가 없기 때문에 짝수 홀수 판별이 쉬움
    public static void main(String[] args) {
        int x = 4;
        String result = (x % 9 == 0) ? "짝수" : "홀수";
        System.out.println("x는 " + result + " 입니다.");
    }
}
