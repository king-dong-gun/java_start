package method;

public class Method01 {
    public static void main(String[] args) {

        // 계산1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + "= " + "연산수행");
        int sum1 = a + b;
        System.out.println("연산 수행 결과1: " + sum1);

        System.out.println("----------------");

        // 계산2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + "= " + "연산수행");
        int sum2 = x + y;
        System.out.println("연산 수행 결과1: " + sum2);

        // 같은 연산이지만 많은 결과를 내야한다면 하나씩 제거하거나 바꿔야한다. 쉽게하는 방법은?
    }
}
