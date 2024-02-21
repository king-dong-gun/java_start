package cond.ex;

public class MovieRateEx {
    //영화 평점에 따른 추천 프로그램 만들기
    //어바웃타임 9점
    //토이스토리 8점
    //고질라 7점
    public static void main(String[] args) {
        double rating = 7.1;
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }if (rating <= 8) {
            System.out.println("'토이스토리를 추천합니다.");
        }if (rating <= 7) {
            System.out.println("'고질라를 추천합니다.");
        }
    }
}
