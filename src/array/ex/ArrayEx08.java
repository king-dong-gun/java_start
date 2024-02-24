package array.ex;

import java.util.Scanner;

public class ArrayEx08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int students = sc.nextInt();

        int[][] scores = new int[students][3];  // [4]는 학생수 [3]은 과목수
        String[] subjects = {"국어", "영어", "수학"};

        // 입력을 받는 for문
        for (int i = 0; i < students; i++) {  // 4행 (학생수)의 for문
            System.out.println((i + 1) + "번의 학생 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {  // 3행 (과목수)의 for문
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = sc.nextInt();
            }
        }
        // 총점과 평균을 구하는 for문
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번의 총 점수 합: " + total + "점");
            System.out.println((i+1) + "번의 총 점수 평균: " + average + "점");
        }

    }
}
