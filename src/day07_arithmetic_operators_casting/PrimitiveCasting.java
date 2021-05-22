package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int num1 = 100; //takes up 2 bytes of memory
        byte b1 = (byte)num1; //take up 1 byte of memory
        short shNum1 = (short)num1; // takes 4 bytes of memory
        long lNum1 =num1;

        System.out.println(num1);
        System.out.println(b1);
        System.out.println(shNum1);
        //TODO: continue more practice on Casting.
    }
}
