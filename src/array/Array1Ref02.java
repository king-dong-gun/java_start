package array;

public class Array1Ref02 {
    public static void main(String[] args) {
        int[] students;  //배열변수 선언
        students = new int[5];  //int형 변수 5개 생성

        //변수값 대입
        students[0] = 90;  //배열값 대입
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;


        for(int i = 0; i < 5; i++)  //i < 5  ->  student.length 로 바꿀수있음 (배열의 길이를 조회하는 기능)
            System.out.println("학생" + (i + 1) +" 점수: " + students[i]);
        //()가 없으면 문자+숫자가 문자+문자가 되기 때문에 ()를 꼭 쳐야함
    }
}
