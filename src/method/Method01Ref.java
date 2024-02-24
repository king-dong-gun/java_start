package method;

public class Method01Ref {
    public static void main(String[] args) {

        // add 메소드 본문
        // 계산1
        int sum1 = add(5, 10);
        double muti1 = muti(5,10);
        System.out.println("연산 수행 결과1: " + sum1);
        System.out.println("연산 수행 결과1: " + muti1);
        muti(10,20); // 반환값을 굳이 안받아도 됨.

        System.out.println("----------------");

        // 계산2
        int sum2 = add(10, 20);  //10,20값을 인수 or argument 라고 부름
        double muti2 = muti(10,20);
        System.out.println("연산 수행 결과1: " + sum2);
        System.out.println("연산 수행 결과1: " + muti2);

    }

    // add 메소드 선언
    public static int add(int a, int b) {  //int a, int b 를 파라미터 or 매개변수 라고 부름
        System.out.println(a + "+" + b + "= " + "연산수행");
        int sum = a + b;
        return sum;
    }
    public static double muti(int a, int b) {
        System.out.println(a + "*" + b + "= " + "연산수행");
        int sum = a * b;
        return sum;
    }
}
