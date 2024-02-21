package loop.ex;

public class WhileEx01 {
    public static void main(String[] args) {
        //처음 10개의 자연수를 출력하는 프로그램 작성 변수는 count, While, For문을 사용하여 두가지 프로그램을 만드시오.
        int count = 1;
        while(count<=10) {
            System.out.println(count);
            //System.out.println(count++); 로도 가능
            count++;
        }
    }
}
