package cond.ex;

public class ScoreEx {
    //학점 계산하기
    /* 90점이상 : A
    80점이상 : B
    70점이상 : C
    60점이상 : D
    60점미만 : F */
    public static void main(String[] args) {
        int score = 85;
        if(score >= 90) {
            System.out.println("A입니다");
        } else if(score >= 80) {
            System.out.println("B입니다");
        } else if(score >= 70) {
            System.out.println("C입니다.");
        } else if (score >= 60) {
            System.out.println("D입니다.");
        } else {
            System.out.println("F입니다.");
        }
    }

}
