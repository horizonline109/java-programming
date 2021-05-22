package solo_practice;
import java.util.*;

public class ReplitShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        //for(count = 1; count <= 10; count ++){
           // System.out.println("Enter Item" +count + " and its price:\n" +item + "\n" + price);
            do{
                System.out.println("Enter Item"+count+" and its price:");
                item = scan.next();
                price = scan.nextDouble();
                System.out.println("Add one more item?");
                countinue = scan.next();

                shoppingListReport = shoppingListReport.concat("Item"+count+": "+item+" Price: "+price);
                count++;
                totalPrice = totalPrice+price;
                if(countinue.equals("yes")){
                    shoppingListReport += ", ";
                }
            }while(count <= 10 && countinue.equals("yes") );
            System.out.println(shoppingListReport);
            System.out.println("Total price: " + totalPrice);
        }

    }

