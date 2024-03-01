package method;

public class Overloading03 {

    // 매개변수 타입이 다른 오버로딩 예제
    public static void main(String[] args) {
        System.out.println("1번: " + add(1,2));
        System.out.println("2번: " + add(1.2,1.2));

    }
    public static int add(int a, int b) {
        System.out.println("1번호출");
        return a + b; // int add 메소드가 없어도 double 메소드로 호출 가능, 자기에게 맞는 타입의 메소드로 호출
    }
    // 첫번째 메소드와 이름은 같지만 매개변수(파라미터)의 유형이 다름
    public static double add(double a, double b) {
        System.out.println("2번호출");
        return a + b;
    }
}
