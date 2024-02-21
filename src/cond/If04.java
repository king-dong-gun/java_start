package cond;

public class If04 {
    //else if   ->   if문이 거짓일때 다음 조건 검사(불필요한 검사를 피하고 코드 효율을 높힘)


    /*연령에 따라 다른 메세지를 출력하는 코드를 만들어야한다. 변수는 int age로 설정
      7세 이하일때:"미취학"
      8세 이상 13세 이하일때: "초등학생:
      14세 이상 16세 이하일때: "중학생"
      16세 이상 19세 이하일때: "고등학생"
      20살 이상일때: "성인"
     */
    public static void main(String[] args) {
        int age = 13;                           //변수값이 참이면 출력하고 if문 밖으로 나감
                                                //거짓이면 다음 조건으로 넘어감
        if (age <= 7 ) {
            System.out.println("미취학");
        } else if (age <= 13) {     //8~13
            System.out.println("초등학생");
        } else if (age<= 16) {    //14~16
            System.out.println("중학생");
        } else if (age <= 19) {    //17~19
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
