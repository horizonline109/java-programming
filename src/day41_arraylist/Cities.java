package day41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        cities.add(0, "Ashgabat");
        System.out.print(cities + " ");
        System.out.println("First city: " + cities.get(0));
        System.out.println("Last city: " + cities.get(5));
        System.out.println("Last city: " + cities.get(cities.size()-1));

        for(int i =0; i < cities.size(); i++) {
            System.out.println(cities.get(i) + " ");
        }

        for(String city : cities){
            System.out.print(city + " ");
        }

        //remove something from index 3
        cities.remove(3);
        cities.remove("New York"); //will find what we are wantinging at the index

        System.out.println();
        System.out.println("Adjusted List: " + cities);

        cities.clear();
        System.out.println("Updated list:" + cities);

        if(cities.isEmpty()){
            System.out.println("List is now empty.");
        }
    }
}
