package day32_arrays_split;

import java.util.*;
import java.util.Arrays;

public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 123456, 12347, 12348, 12349, 12350};

        System.out.println("--------FIND THE INDEX OF 'Gloves' IN ITEMS ARRAY-------");
        for (int i = 0; i < items.length - 1; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Index of Gloves = " + i);
                break;
            }
        }

        System.out.println("--- Set Boolean to true if iPad exists");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")) {
                iPadExists = true;
                break;
            }
        }

        System.out.println("iPadExists = ");
        if (iPadExists) {
            System.out.println("We bought the iPad!!");
        } else {
            System.out.println("We forgot the iPad! :(");
        }

        System.out.println("----Print a report of each shopping item ----");
        for (int i = 0; i < items.length; i++) {
            System.out.println("item name: " + items[i] + " item price $" + prices[i] + " Item ID is #" + itemIDs[i]);
        }

        System.out.println("----Look for 'Jacket' in items and print all details");
        boolean jacketExists = true;
        for (int i = 0; i < items.length; i++) {
                if (items[i].equalsIgnoreCase("Jacket")) {
                    System.out.println(items[i] + "\t | \t$"+prices[i]+"\t | \t#" + itemIDs[i]);
                    break;
                }
        }
    }
}