package method.ex;

public class MethodEx02Ref {
    public static void main(String[] args) {

        printMessage("Glory", 3);
        printMessage("Man",5);
        printMessage("United",7);
    }
    public static void printMessage(String message, int times) { // 단순 출력이기 때문에 void
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
