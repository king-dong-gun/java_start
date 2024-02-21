package scope;

public class Scope03_1 {
    public static void main(String[] args) {

        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp= " + temp);    //비효율적인 코드인 이유: temp는 if문 안에서만 사용되니 앞서 변수 선언할 필요 없음
        }
        System.out.println("m= " + m);
    }
}
