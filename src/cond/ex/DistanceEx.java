package cond.ex;

public class DistanceEx {
    //거리가 1km 이하면 걸어가세요
    //거리가 10km 이하면 자전거타세요
    //거리가 100km 이하면 자동차타세요
    //거리가 100km 초과면 비행기타세요
    public static void main(String[] args) {
        int distance = 101;
        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요");
        }
    }

}
