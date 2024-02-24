package method;

public class Method02 {
    public static void main(String[] args) {
        printHeader();  // 파라미터가 없기 때문에 아규먼트도 없어도 됨.
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }
    public static void printHeader() {  // 파라미터가 없는 메소드
        System.out.println("=프로그램을 시작합니다=");
        return;  // 모든 메소드는 return;을 호출 해야하지만 void의 경우 생략가능
    }
    public static void printFooter() {
        System.out.println("=프로그램을 종료합니다=");
    }
}
