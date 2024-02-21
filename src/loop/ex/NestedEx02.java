package loop.ex;

public class NestedEx02 {
    public static void main(String[] args) {
        //int rows를 선언하고 피라미드를 출력해라
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
