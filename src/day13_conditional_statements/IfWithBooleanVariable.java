package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        //if(isHungry = true) {
        if(isHungry) {
            System.out.println("I am hungry I will go get something to eat.");
            System.out.println("Then code Java");
        } else {
            System.out.println("I am not hungry. Let's keep coding Java.");
        }

        double price = 130.44;
        double budget =200;
        boolean isAffordable = (price<= 200);
        if(isAffordable) {
            System.out.println("I can afford it, let's buy!");
        } else {
            System.out.println("Too expensive, let's keep coding Java.");
        }

        boolean isRemoteJob = true;
        if(isRemoteJob != true) {
            System.out.println("Sorry I am not interested");
        } else {
            System.out.println("Sure I am interested. What is the interview process?");
        }


    }
}
