package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "tea";
        String snack = "chips";
        if (selection.equals("drink")) {
            System.out.println(selection + " is selected");
            if (drink.equals("coke")) {
                System.out.println(drink + " is selected");
            } else {
                System.out.println("tea is selected");
            }
        } else if (selection.equals("snack")) {
            System.out.println(selection + "is selected");
        }
        if (snack.equals("chips")) {
            System.out.println(snack + " is selected");
        } else {
            System.out.println("candy is selected");
        }
    }

}

