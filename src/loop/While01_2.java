package loop;

public class While01_2 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {          //(count < 10)이 거짓(false)가 되면 와일문 밖 코드블럭을 빠져나옴
            count = count + count + 1;
            System.out.println("현재숫자:" + count);
        }           //    <- while문 종료 되면 다음 코드로 넘어감
        System.out.println("프로그램을 종료합니다.");
    }
}
