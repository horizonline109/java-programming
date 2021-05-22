package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String [] args) {
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3); //12
        System.out.println(10 - 5 + 3); //8
        System.out.println(10 - (5 + 3));

        System.out.println(2 * 3); //6
        System.out.println(2 * 3 / 3); //2
        System.out.println(20 / (2 * 2)); //5
        //System.out.println(10 / 0); cannot divide by ZERO
        System.out.println(2 + 5 * 3); //17
        System.out.println((2+ 5) * 3); //21

        int num = 10;
        //System.out.println(num / 0); //ERROR/Exception during RUNTIME

        System.out.println(10/3); //3 --> java throws away the remainder
        System.out.println(5 / 2); //2

        System.out.println(10.0 / 3.0); //3.33333
        System.out.println(5.0 / 2); //2.5
    }
}
