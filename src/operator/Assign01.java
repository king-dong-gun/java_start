package operator;

public class Assign01 {
    //i = i + 3        ->           i+=3

    public static void main(String[] args) {

        int a = 5;    // a = 5
        a += 3;       // a = 8 (5 + 3): a = a + 3
        a -= 2;       // a = 6 (8 - 2): a = a - 2
        a *= 4;       // a = 24 (6 * 4): a = a * 4
        a /= 3;       // a = 8 ( 24 / 3): a = a / 3
        a %= 5;       // a = 3 ( 8 % 5): a = a % 5
        System.out.println(a);
    }
}
