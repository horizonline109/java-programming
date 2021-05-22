package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List <String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty. Keep coding Java");
        } else {
            System.out.println("List is not empty. Code Java, then go to Mall.");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty. Keep coding Java");
        }
        System.out.println("List is not empty. Code Java, then go to Mall.");

        int count = shoppingList.size();
        System.out.println("Number of Items to Purchase: " + count);

        System.out.println("Are shoes on my list?" + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")) {
            System.out.println("Shoes are on the list.");
        }

        shoppingList.remove("shoes");

        System.out.println("List: " + shoppingList);

        System.out.println("Shopping List completed, get back to coding:");
        shoppingList.clear();
        System.out.println("Shopping List Contents = " + shoppingList);

    }
}
