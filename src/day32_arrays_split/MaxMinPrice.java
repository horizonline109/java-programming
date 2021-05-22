package day32_arrays_split;
import java.util.*;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 123456, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));


        double maxPrice = 0;
        int indexOfMaxPrice = 0;
        for(int i = 0; i < items.length -1; i++) {
            if(prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice  = i;
            }


        }
        System.out.println("***** Highest Priced Item *****");
        System.out.println(items[indexOfMaxPrice] + "\t|\t$" + prices[indexOfMaxPrice] + "\t|\t#" + itemIDs[indexOfMaxPrice]);

        System.out.println("----1) Find and print details of most expesive item----");

        double max = prices[0];
        int indexOfMax = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] >max) {
                max = prices[i];
            }
        }
    }
}
