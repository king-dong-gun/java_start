package loop;

public class Break01 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (true) {
            sum = i + 1;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 sum: " + sum + ", i= " + i);
                break;            //break가 없으면 sum > 10이 계속 실행,  sum이 10보다 크게 되면 break로 실행정지
            }
            i++;
        }
    }
}
