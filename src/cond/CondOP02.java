package cond;

public class CondOP02 {
    public static void main(String[] args) {
        int age = 17;
        String status = (age >= 18) ? "성인" : "미성년자";       //삼항 연산지 (조건) ? 참_표현식 : 거짓_표현식
        System.out.println("age: " + age + ", status: " +status);
    }
}
