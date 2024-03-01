package method;

public class Overloading02 {
    // 매개변수가 다른 오버로딩 예제
    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2,1);

    }
    public static void myMethod(int a, double b) {
        System.out.println("int a + double b");
    }
    public static void myMethod(double a, int b) {
        System.out.println("double a + int b");
    }
}
