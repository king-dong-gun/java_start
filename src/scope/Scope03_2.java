package scope;

public class Scope03_2 {
    public static void main(String[] args) {

        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp= " + temp);
        }
        System.out.println("m= " + m);
        //System.out.println("temp= " + temp);    if문안에서 temp 변수선언 하였기 때문에 코드블럭 밖에서 사용 불가능
    }
}
