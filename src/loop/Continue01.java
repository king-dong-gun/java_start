package loop;

public class Continue01 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;          //continue를 쓰면 i가 3일때 조건이 참이므로 출력문으로 넘어가지 않고 다시 while문으로 되돌아감
            }                      //i가 1,2,4,5이면 if문의 조건이 거짓이므로 출력문으로 넘어가서 3이 출력되지 않고 1,2,4,5만 출력됨
            System.out.println("i: " + i);
            i++;
        }
    }

}
