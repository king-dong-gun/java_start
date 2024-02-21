package loop;

public class Nested01 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {              //1) i=0일때 외부 for 시작, 2)내부 for 종료 후 i=1일때 외부 for 시작
            System.out.println("외부 for 시작 i: " + i);
            for (int j = 0; j < 3; j++) {          //1) i=0일때 j 3번 수행, 2)i=1일때 j 3번 실행
                System.out.println("-> 내부 for: " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i: " + i);
            System.out.println();
        }
    }
}
