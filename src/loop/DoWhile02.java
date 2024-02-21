package loop;

public class DoWhile02 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는 " + i + " 입니다.");
            i++;
        } while (i < 3);
    }
}

//do-while문은 최초 한번을 실행 해야할때 사용한다. 최초 실행을 완료하고 while문 검사 -> 참이면 조건 재검사 후 실행 -> 거짓이면 while문 종료


