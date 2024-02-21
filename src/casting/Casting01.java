package casting;

public class Casting01 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue = 0;
        double doubleValue = 0;

        longValue = intValue;    //int -> long
        System.out.println("longValue= " + longValue);

        doubleValue = intValue;  //int -> double
        System.out.println("doubleValue= " + doubleValue);

        doubleValue = 20L;      //long -> double
        System.out.println("doubleValue2= " + doubleValue);
    }
}
