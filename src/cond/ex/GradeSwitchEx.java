package cond.ex;

public class GradeSwitchEx {
    //A 탁월한 성과입니다
    //B 좋은 성과입니다
    //C 준수한 성과입니다
    //D 항상 필요합니다
    //F 불합격 입니다
    //나머지 잘못된 학점입니다
    public static void main(String[] args) {
        String grade = "F";
        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다.");
                break;
            case "B":
                System.out.println("좋은 성과입니다.");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("항상 필요합니다.");
                break;
            case "F":
                System.out.println("불합격 입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}



