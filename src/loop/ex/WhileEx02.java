package loop.ex;

public class WhileEx02 {
    public static void main(String[] args) {
        //반복문을 사용하여 짝수 10개를 출력하는 프로그램 작 변수 num사용 for, while을 이용해서 작성
        int num = 2;
        int count = 1;
        while(count <= 10) {
            System.out.println(num);      //처음 num = 2 출력 후   while문 실행됨
            num += 2;                     //num에 계속 2를 더해주는 count를 10번 실행
            count++;
        }
    }
}
