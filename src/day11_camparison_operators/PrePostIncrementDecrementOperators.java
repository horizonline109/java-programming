package day11_camparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //int num1 = 1;
        //num1++;
        //++num1;
        //System.out.println(num1);

        //int num2 = 5;
       // num2--;
       // --num2;
        //System.out.println(num2);

        //PRE-INCREMENT
        int num1 = 10;
        //++num1 = the same as when we convert to one statement
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //POST-INCREMENT
        int num3 = 4;
        int num4= num3++;
        //num3++; add 1
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        
        int apples = 5;
        int basket = apples++;
        //apples = 6, basket = 5
        System.out.println("apple = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);
        int sedans = 10;
        System.out.println(sedans++); //adds1 After the print
        System.out.println("sedans = " + sedans);

        int myNumber =20;
        System.out.println("myNumber = " + myNumber); // will print 20
        System.out.println(myNumber++); // will print 20, then add 1
        System.out.println(++myNumber); // will add 1, then print with both new additions : 22
        
        int myNumbers = 99;
        int yourNumber = myNumbers++;
        System.out.println(yourNumber);
        
        
        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        //int c = a++ + ++b; // imagine a++; is inserted on the next line instead of this. so 4 +5
        System.out.println("a = " + a); //51
        System.out.println("b = " + b); //23
        System.out.println("c = " + c); //73

    }

}
