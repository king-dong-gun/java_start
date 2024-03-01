package method;

public class MethodCasting02 {
    public static void main(String[] args) {
        int number = 100;
        printNum(number); // double형 매개변수에 int형 인수를 전달하는데에 문제x
    }
    public static void printNum (double n) {
        System.out.println("숫자: " + n);

    }
}
