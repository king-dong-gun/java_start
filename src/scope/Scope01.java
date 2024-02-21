package scope;

public class Scope01 {
    public static void main(String[] args) {
        int m = 10;  //m 생존 시작
        if (true) {
            int x = 20;  //x 생존 시작, if내에서만 생존
            System.out.println("if m=" + m);            //코드블럭 내에서 선언했다면 m 생존
            System.out.println("if x=" + x);
        } //x 생존 종료
    } //m 생존 종료
}
