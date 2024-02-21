package scope;

public class Scope02 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {  //블록 내부, for문 내
            System.out.println("m = " + m);  //블록 내부에서 외부로 접근 가능
            System.out.println("i = " + i) ;
        }  //i 생존 종료
    }  // m 생존 종료
}
