package cond;

public class If06 {        //잘못된 할인 방법//
    //가상의 쇼핑몰 할인 시스템을 개발 해야한다. 사용자가 상품을 구입할때 할인 조건에 따라 총 금액이 변할수 있다.
    //상품가격이 10000원 이상일때 1000원 할인
    //나이가 10살 이하일때 1000원 할인
    //나이가 10살인 사용자가 10000원 이상을 구입하면 총 2000원 할인 가능
    //상품금액: 10000원, 사용자: 10
    public static void main(String[] args) {
        int age = 10;
        int price = 10000;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 상품을 구매하셨습니다. 총 할인 가격: 1000원");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하 고객님이 상품을 구매하셨습니다. 총 할인 가격: 1000원");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 가격: " + discount + "원");

        if(false) //{
            System.out.println("if문에서 실행됨");
        //}     <-코드 블록 중요 꼭 쓰기
            System.out.println("if문에서 실행안됨");
    }
}
