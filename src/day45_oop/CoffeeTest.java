package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("Amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);

        myCoffee.setType("Turkish Coffee");
        System.out.println("I'm currently drinking " + myCoffee.getType());
        System.out.println(myCoffee.toString());
    }
}
