package day10_shorthand_operators;

public class ChangVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
        //Increase count by 2
        count = count + 2;
        System.out.println("count = " + count);
        
        int apples = 5;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples -3;
        System.out.println("apples = " + apples);

        int pizzaSlice = 8;
        System.out.println("pizzaSlice = " + pizzaSlice);
        pizzaSlice = pizzaSlice / 2;
        System.out.println("pizzaSlice = " + pizzaSlice);
        pizzaSlice = pizzaSlice + 8;
        System.out.println("pizzaSlice = " + pizzaSlice);
        
        int players = 10;
        System.out.println("players = " + players);
        //double the players
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 244;
        System.out.println("cents = " + cents);
        //just asking for the change, not the dollars
        cents = cents % 100;
        System.out.println("cents = " + cents);


    }
}
