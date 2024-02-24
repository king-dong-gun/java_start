package method;

public class MethodReturn02 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입금지 입니다.");
            return;
        }
            System.out.println(age + "살, 어서오세요.");
        }
    }
