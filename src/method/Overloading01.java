package method;

public class Overloading01 {
    // Overloading은 이름이 같고 매개변수(파라미터)가 다른 메소드를 여러개로 정의하는것
    // 메소드 이름이 같으면 매개변수(파리미터)의 타입이나 순서가 달라도 오버로딩 가능

    public static void main(String[] args) {
        System.out.println("1번: " + add(1,2));
        System.out.println("1번: " + add(1,2,3));

    }
    // 두 수를 더하는 add 메소드
    public static int add(int a, int b) {
        System.out.println("1번호출");
        return  a + b;
    }
    // 세 수를 더하는 add 메소드
    public static int add(int a, int b, int c) {
        System.out.println("2번호출");
        return a + b + c;
    }
}
