package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";
        if(onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println(itemName + " is eligible for free shipping. Add to cart?");
            boolean addToCart = true;
            System.out.println("Your item has been added. Thanks for choosing Amazon!");
        } else {
            System.out.println("Continue shopping");
        }
    }
}
