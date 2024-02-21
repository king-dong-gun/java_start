package loop.ex;

public class ForEx03 {
    public static void main(String[] args) {
        //while, for문을 사용하여 1에서 max까지의 합을 계산하고 출력하는 프로그램 작성 sum이라는 합의 변수와 i라는 변수를 사용하여 카운트 실행
        int sum = 0;
        int max = 100;
        for(int i = 1; i <= max; i++) {
            System.out.println("//max= " + i);
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
