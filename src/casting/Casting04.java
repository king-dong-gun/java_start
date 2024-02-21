package casting;

public class Casting04 {
    public static void main(String[] args) {
        int div1 = 3 / 2;  //int/int
        System.out.println("div1 = " + div1);//int 타입끼리의 연산이므로 int 타입으로 출력

        double div2 = 3 / 2;//int/int -> int 타입의 결과 1
        System.out.println("div2 = " + div2);//-> int에서 double로 자동 형변환 double 1 = 1.0

        double div3 = 3.0 / 2; //double/int -> double의 범위가 더 크기 때문에 double/double로 형변환 발생
        System.out.println("div3 = " + div3);//double값 출력

        double div4 = (double) 3 / 2;//명시적 형변환 (double) int/int -> double/int -> double/double로 형변환 발생
        System.out.println("div4 = " + div4);//double값 출력

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);//1.5
        //같은 타입끼리의 계산은 같은 타입으로 나온다  ex) int + int = int,     double + double = double
        //서로 다른 타입의 계산은 큰 범위로 자동 형변환이 된다 ex) int + long -> long + long,    int + double -> double + double
    }
}
