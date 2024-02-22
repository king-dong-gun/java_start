package array.ex;

public class ArrayRefEx01 {
    public static void main(String[] args) {
        //다음을 배열을 사용하여 간편하게 만들기

        int[] students = {100, 90, 80, 70, 60};
        int total = 0;
        for (int student : students) {
            total += student;
        }
        int average = total / 5;
        System.out.println("총합은: " + total);
        System.out.println("평균은: " + average);
    }

    int student1 = 100;
    int student2 = 90;
    int student3 = 80;
    int student4 = 70;
    int student5 = 60;

    //int total = student1 + student2 + student3 + student4 + student5;
    //int average = total / 5;
    //System.out.println("총합은: " + total);
    //System.out.println("평균은: " + average);

}

