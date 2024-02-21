package loop.ex;

public class NestedEx01 {
    public static void main(String[] args) {
        //중첩 for문을 사용하여 구구단을 출력하여라
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }
}

