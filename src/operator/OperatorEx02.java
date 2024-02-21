package operator;

public class OperatorEx02 {
    //double 변수를 출력하고 그 합과 평균을 출력하세요
    public static void main(String[] args) {


        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum = val1 + val2 + val3;       // 변수에 double 타입이 붙으면 자동으로 double 타입
        double average = sum / 3;
        System.out.println(sum);
        System.out.println(average);
    }
}
