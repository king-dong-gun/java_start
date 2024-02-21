package scanner.ex;

import java.util.Scanner;

public class ScannerWhile01 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        //이름과 나이를 반복해서 입력받음, 사용자가 종료를 누르면 프로그램 종료
        while (true) {
            System.out.println("종료를 원하시면 (exit)를 입력하세요.");
            System.out.print("이름을 입력하세요: ");
            String name = inputData.nextLine();
            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요:");
            int age = inputData.nextInt();  //입력을 10으로 했을때 10\n 를 받아드리는게 아니라 10만 받아드리고 \n은 남아있
            inputData.nextLine();  //버퍼를 없애기 위해
            System.out.print("이름: " + name);
            System.out.println(", 나이: " + age);
            System.out.println();

            if (name.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
