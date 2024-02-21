package cond;

public class If05 {
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
        }
        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하 고객님이 상품을 구매하셨습니다. 총 할인 가격: 1000원");
        }
            System.out.println("10살 이하 고객님이 10000원 이상 상품을 구매하셨습니다. 총 할인 가격: " + discount + "원");
        }
    }
    //각각 독립된 if문 (조건이 겹치지 않음)이라 해당하는 모든 할인을 적용
    //else if를 쓴다면 첫번째 조건 충족시 두번째 조건 무시되기 때문에 할인을 받지 못함
