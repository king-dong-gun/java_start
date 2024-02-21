package array;

public class Array1Ref03 {
    public static void main(String[] args) {
        int[] students;  //배열변수 선언
        students = new int[] {90, 80, 70, 60, 50};  //배열 생성과 초기화를 동시에 하기

        for(int i = 0; i < 5; i++)  //i < 5  ->  student.length 로 바꿀수있음 (배열의 길이를 조회하는 기능) 
            System.out.println("학생" + (i + 1) +" 점수: " + students[i]);
        //()가 없으면 문자+숫자가 문자+문자가 되기 때문에 ()를 꼭 쳐야함
    }
}
