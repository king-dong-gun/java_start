package scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //print("\n"); = println();

        System.out.print("문자열을 입력하세요: ");
        //입력한 문자열이 hello java라면 scanner.nexLine()이 hello java로 바꾼다.
        String str = scanner.nextLine();  //입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하시오: ");
        int num = scanner.nextInt();
        System.out.println("입력한 정수: " + num);

        System.out.print("실수를 입력하세요: ");
        double value = scanner.nextDouble();
        System.out.println("입력한 실수: " + value);
    }
}
