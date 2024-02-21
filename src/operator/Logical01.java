package operator;

public class Logical01 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");       //두 피연산자 전부 참이여야함
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");     //두 피연산 중 하나만 참이면 true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");         //피연산자의 부정을 출력, true=거짓, false=참
        System.out.println(! true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a ||  b);
        System.out.println(!a);
        System.out.println(!b);


    }
}
