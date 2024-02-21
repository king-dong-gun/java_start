package scanner.ex;

public class ChangeVar01 {
    //a = 20;
    //b = 10;
    //a와 b의 변수를 바꾸는 코드 작성, temp 코드를 사용
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int temp;  //임시 저장소

        temp = a;  //a의 값 10
        a = b;     //b = 10 -> a
        b = temp;  // temp = 20 -> b

        System.out.println("a: " + a);  //a = 20
        System.out.println("b: " + b);  //b = 10
    }

}
