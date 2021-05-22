package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        //deduct from balance
        System.out.println("Balance = $" + balance);

        double baklava = 22.50;
        System.out.println("Baklava = $" + baklava);
        balance = balance - baklava;
        System.out.println("Balance after baklava = $" + balance);
        
        double kenafe = 44.45;
        System.out.println("Kenafe = $" + kenafe);
        //decrease balance by kenafe
        balance = balance - kenafe;
        System.out.println("Balance after kenafe = $" + balance);

        //second kenafe is 50% off. let's buy it.
        balance = balance - kenafe /2;
        System.out.println("Balance after second kenafe purchase: $" + balance);

        double plov = 7.99;
        System.out.println("Plov = $" + plov);
        balance = balance - plov;
        System.out.println("Balance after plov: $" + balance);

        double icedTea = 3.00;
        System.out.println("Iced Tea = $" + icedTea);
        balance = balance - icedTea * 4;
        System.out.println("Balance after 4 iced tea: $" + balance);

        //return baklava
        System.out.println("Returning baklava = $" + baklava);
        balance = balance + baklava;
        System.out.println("Balance after returning baklava = $" + balance);

    }
}
