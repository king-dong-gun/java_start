package operator;

public class OperatorAdd01 {
    public static void main(String[] args) {
        int a = 0;
        a = a + 1;
        System.out.println("a = " + a);   //1

        a = 1 + 1;
        System.out.println("a = " + a);   //2

        //증감연산자
        ++a;  //a = a + 1
        System.out.println("a = " + a);   //3
        ++a;  //a = a + 1
        System.out.println("a = " + a);   //4

        --a;  //a = a - 1
        System.out.println("a = " + a);   //3

    }
}
