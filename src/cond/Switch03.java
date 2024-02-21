package cond;

public class Switch03 {
    public static void main(String[] args) {
        //2등급, 3등급과 같이 3000원을 줄 때 (break없이 동시 진행)
        int grade = 2;
        int coupon;

        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 :
            case 3 :
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰: " + coupon + "포인트");
    }
}
