package operator;

public class OperatorEx01 {
    public static void main(String[] args) {
        //num1, num2, num3의 값을 int 변수 선언하고 각 10, 20, 30으로 초기화
        //각 변수의 합을 sum으로 이름의 int 변수에 저장
        //각 변수의 평균을 average 이름의 int 변수에 저장 후 sum을 이용하여 출

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;       //int끼리의 나눗셈을 자동으로 소숫점을 이하를 버림
        System.out.println(sum);
        System.out.println(average);
    }
}
