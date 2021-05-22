package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        if(!( age > 7)) {
            System.out.println("Child needs to be in a car seat.");
        }

        boolean isSmokingAllowed = false;
        if(!isSmokingAllowed) {
            System.out.println("Smoking is not allowed.");
        } else {
            System.out.println("Smoking is allowed");
        }
            boolean isAffordable = true;
            if(!isAffordable) {
                System.out.println("You can not afford this.");
            } else {
                System.out.println("You can afford this!");
            }
            String carModel = "Tesla";
            //if not Tesla, print, not interested
            if(!carModel.equals("Tesla")) {
                System.out.println("Not interested. Thank you.");
            }

            String secretPassword = "abc123";
            String inputPassword = "abc321";
            if(!inputPassword.equals("abc123")) {
                System.out.println("Incorrect password. Please try again");
            }

            int num1 = 5;
            int num2 = 20;
            if(num1 <4 && num2 == 20) {
                System.out.println("This statement is false.");
            }
            //first condition is false, so since there are 2 &&, the first is checked and if false skips the next step and jumps to conclusion

        int n = 2;
            switch(n) {
                case 1:
                    System.out.println("n is 1");
                    break;
                case 2:
                    System.out.println("n is 2");
                case 3:
                    System.out.println("n is 3");

            }

    }
}
