package method;

public class MethodValue03 {
    public static void main(String[] args) {

        // 자바는 항상 변수의 값을 복사하여 대입한다!!!!
        // 자바는 항상 변수의 값을 복사하여 대입한다!!!!
        // 자바는 항상 변수의 값을 복사하여 대입한다!!!!

        int num1 = 5;
        System.out.println("1. changeNumber 호출전 num1: " + num1);  // num1값 5 출력
        num1 = changeNumber(num1); // changeNumber 메소드에 num1값 5 전송 후 계산한 다음 num1 = 10
        System.out.println("4. changeNumber 호출 후 num1: " + num1); // 10
    }
    public static int changeNumber(int num2) { // num2 = 5
        num2 = num2 * 2; // 5*2 = 10 = num2
        return num2;
    }
}
