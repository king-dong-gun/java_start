package operator;

public class OperatorEx03 {
    public static void main(String[] args) {
        //int형 변수 score 선언 score은 80, 60
        //score가 80 이상 100 이하면 true 아니면 false 출력
        int score1 = 80;
        boolean result1 = 80 <= score1 && score1 <= 100;
        System.out.println(result1);

        int score2 = 60;
        boolean result2 = 80 <= score2 && score2 <= 100;
        System.out.println(result2);


    }
}
