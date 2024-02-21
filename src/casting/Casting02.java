package casting;

public class Casting02 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue;    <- double을 int에 넣을수 없기 때문에 컴파일 오류
        intValue = (int) doubleValue;  //int로 형변환
        System.out.println(intValue);  //int형 숫자 1 출력
        System.out.println("doubleValue = " + doubleValue); //형변환을 했다고 doubleValue의 값이 바뀌는건 아님 그대로 1.5 유지

        System.out.println(10.5);
        System.out.println((int) 10.5);
    }
}
