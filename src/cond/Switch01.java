package cond;

public class Switch01 {
    //회원 등급에 따라 쿠폰 발급을 한다 int grade라는 변수를 사용
    /*1등급: 쿠폰 1000
    2등급:쿠폰 2000
    3등급:쿠폰 3000
    위 등급이 아닐 경우: 500 */
    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade ==3) {
            coupon = 3000;
        } else {
            coupon =500;
        }
        System.out.println("발급하신 쿠폰: " + coupon);
    }
}
//if문으로도 나타낼수 있지만 더 간략하게 쓰기위해 switch 사용
//if는 비교 연산자를 사용할수 있지만, switch는 값이 같은지만 비교 할수있음.
//ex) if grade < 1
//ex) switch = 2
