package method;

public class MethodCasting01 {
    public static void main(String[] args) {
        double number = 1.5;
        // printNum(number);  // double형이므로 int 메소드 계산이 안되기 때문에 컴파일 오류
        printNum((int)number); // double을 int로 명시적 형변환
    }
    public static void printNum (int n) {
        System.out.println("숫자: " + n);

    }
}
