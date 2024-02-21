package cond;

public class If01 {
    public static void main(String[] args) {
        /* if(condition) {
            조건이 참일때 실행되는 코드, 거짓일 땐 if문 실행x
            }     <-코드블럭: 중괄호 사이 코드
         */

        int age = 15;     //사용자의 나이
        if (age >= 18) {                 //만약 (20 >= 18) 이라면 성인 입니다 출력
            System.out.println("성인입니다.");
        }//true이면 출력
            if (age < 18) {             //만약 (20 < 18) 이라면 미성년자 입니다 출력
                System.out.println("미성년자 입니다.");    //false이면 무시//
                 }

    }
}
