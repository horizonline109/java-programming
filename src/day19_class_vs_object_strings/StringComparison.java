package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String [] args) {
        String city = "St. Louis";
        if(city.equalsIgnoreCase("St. Louis")){
            System.out.println("It's beautiful this time of year in " + city);
        } else {
            System.out.println("Another city.");
        }
    }

}
