package scanner.ex;

import java.util.Scanner;

public class ScannerEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요.");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();

        //두번째 숫자가 첫번째 숫자보다 크다면 두 숫자를 교환합니다.
        if (num1 > num2) {     //num1이 num2보다 크다면
            int temp = num1;   //num1 = sc값 -> temp
            num1 = num2;       //num2 = sc값 -> num1
            num2 = temp;       //temp(num1.sc값) -> num2
        }
        //5,7일때 5,6,7,8 출력
        System.out.println("두 숫자 사이의 정수를 모두 출력하시오.");
        for (int i = num1; i <= num2; i++) {   //i가 num1이고 (출력받은 숫자), i가 num2보다 같거나 작고, i는 범위내에 하나씩 증가
            System.out.print(i);               //sc num1   ~~~ i ~~~   sc num2 출력
            if (i != num2) {                   //i 사이마다 , 넣기    ***  ! 연산은 부정을 출력, != 는 같지않다는 뜻   ***
                System.out.print(", ");
            }
        }
    }
}
