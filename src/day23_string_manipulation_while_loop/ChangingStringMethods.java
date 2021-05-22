package day23_string_manipulation_while_loop;

public class ChangingStringMethods {
    public static void main(String[] args) {
        String word = "wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length()); //will only print the .length() portion

        System.out.println(word.replace(" ", ""));
        System.out.println(word.toUpperCase());

        String town = "Chicago";
        System.out.println(town.substring(0,1).toUpperCase()+town.substring(1));

        String city = "kAbUl";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));


    }
}
