package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String [] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.00;
        double remainingBalance = balance - price1 - price2 - price3;

        System.out.println(remainingBalance);
        System.out.println("Your initial balance: $" + balance);
        System.out.println("Your remaining balance: $" + remainingBalance); //219.68
        //now print 219 to get rid of change

        int balanceWithNoCents = (int)remainingBalance;
        System.out.println(balanceWithNoCents);
        System.out.println("Your remaining balance without cents is: $" + balanceWithNoCents);

    }
}
