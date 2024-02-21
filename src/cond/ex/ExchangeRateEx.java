package cond.ex;

public class ExchangeRateEx {
    //환율 계산하기
    //달러가 0 미만이면 잘못된 금액입니다.
    //달러가 0 이면 환전할 금액이 없습니다.
    //달러가 0 초과이면 환전 금액은 (계산된 원화 금액) 입니다.
    public static void main(String[] args) {
        int dolor = 6;
        if (dolor < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dolor == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dolor * 1300;
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
    }
}
/*switch (dolor) {
            case -5 :
                System.out.println("잘못된 금액입니다.");
                break;
            case 0 :
                System.out.println("환전할 금액이 없습니다.");
                break;
            case 10 :
                System.out.println("환전 금액은 " + dolor*1300 + "원 입니다.");
        }
    }
} */
