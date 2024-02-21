package cond;

public class If03 {


    /*연령에 따라 다른 메세지를 출력하는 코드를 만들어야한다. 변수는 int age로 설정
      7세 이하일때:"미취학"
      8세 이상 13세 이하일때: "초등학생:
      14세 이상 16세 이하일때: "중학생"
      16세 이상 19세 이하일때: "고등학생"
      20살 이상일때: "성인"
     */
    public static void main(String[] args) {
        int age = 15;                           //참일때만 출력
        if (age <= 7 ) {
            System.out.println("미취학");
        }
        if (8 >= age && age <= 13) {     //8~13
            System.out.println("초등학생");
        }
        if (14 <= age && age <= 16) {    //14~16
            System.out.println("중학생");
        }
        if (16 <= age && age <= 19) {    //17~19
            System.out.println("고등학생");
        }if (age >= 20)
            System.out.println("성인");
        }
    }
    //이렇게 코드를 짜면 논리 연산자를 없애면 미취학,초등학생,중학생 다같이 출략


