package array;

public class Array1Ref01 {
    public static void main(String[] args) {
        int[] students;  //배열변수 선언
        students = new int[5];  //int형 변수 5개 생성

        System.out.println(students); // I@a09ee92 -> I는 int형 09ee92는 16진수의 참조값

        //변수값 대입
        students[0] = 90;  //배열값 대입
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //1. 변수값 읽기
        System.out.println("학생1의 점수: " + students[0]);
        //2. 변수있는 참조값을 통해 실제 배열에 접근, 인덱스를 사용하여 해당 요소에 접근.
        //System.out.println("학생1의 점수: " + x001[0]);
        //3. 배열값을 읽음
        //System.out.println("학생1의 점수: " + 90);
        System.out.println("학생2의 점수: " + students[1]);
        System.out.println("학생3의 점수: " + students[2]);
        System.out.println("학생4의 점수: " + students[3]);
        System.out.println("학생5의 점수: " + students[4]);
    }
}
