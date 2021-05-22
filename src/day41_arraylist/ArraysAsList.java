package day41_arraylist;

import java.util.*;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 654);
        System.out.println("nums = " + nums);
        // nums.add(100); Wouldn't be able to, because  when we use asList, the arraylist becomes immutable.

        List<Integer> numList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numList.add(33);
        numList.add(90);
        System.out.println(numList);
        numList.remove(0);
        numList.remove(new Integer(23));
        System.out.println(numList);


        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "red bull", "coke", "coke",
                "pepsi", "mdew", "kambucha", "celsius", "monster"));

        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.equalsIgnoreCase("monster") || drink.equalsIgnoreCase("red bull") ||
                    drink.equalsIgnoreCase("celsius")) {
                caffeineAmount = 150;
            } else if (drink.equals("coffee") || drink.equals("kombucha")) {
                System.out.println();
            }

            for (String each : drinksWithCaffeine) {
                switch (each) {
                    case "monster": case "red bull": case "celsius":
                        caffeineAmount = 150;
                        System.out.println(each + "----> " + caffeineAmount + "mg");
                        break;
                    case "coffee": case "Kombucha":
                        caffeineAmount = 112;
                        System.out.println(each + "----> " + caffeineAmount + "mg");
                        break;
                    case "tea": case "coke": case "pepsi": case "mdew":
                        caffeineAmount = 35;
                        System.out.println(each + "----> " + caffeineAmount + "mg");
                        break;



                }
            }

            //drinksWithCaffeine.forEach(drinks -> System.out.println(drinks));
            drinksWithCaffeine.forEach(drinks -> {
                System.out.println("-----------");
                System.out.println("each = " + drinks);
                System.out.println("-----------");
            });



        }
    }
}
