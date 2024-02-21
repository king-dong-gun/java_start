package casting;

public class Casting03 {
    public static void main(String[] args) {

        long maxIntValue = 2147483647;  //int 최고값
        long maxIntOver = 2147483648L;  //int 최고값 + 1초과
        int intValue = 0;

        intValue = (int) maxIntValue;  //형변환
        System.out.println("maxIntValue casting = " + maxIntValue);

        intValue = (int) maxIntOver;  //int로 표현할수 있는 최고값을 초과했기 때문에 오버플로우 발생
        System.out.println("maxIntOver casting = " + intValue);
        //다시 처음부터 시작해서 시계가 돌던것처럼 다시 시작함 오버플로우가 발생하지 않도록 막아야한다 long타입으로 변경
    }
}
