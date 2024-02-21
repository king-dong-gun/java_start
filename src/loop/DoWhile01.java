package loop;

public class DoWhile01 {
    public static void main(String[] args) {
        int i = 10;
        while (i <= 5) {             // i = 10    -> 거짓이라 프로그램 종료됨
            System.out.println("현재 숫자는 " + i + " 입니다.");
            i++;
        }
    }
}
