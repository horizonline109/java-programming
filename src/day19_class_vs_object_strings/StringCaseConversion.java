package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "FlightGear";
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        word.toLowerCase(); //will not print  o
        System.out.println("word = " + word);
        
        //Must assign .toLowerCase() to variable if you want it to stay.
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        
        word = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        String company = "Amazon Web Services";
        System.out.println(company.toUpperCase());

    }
}
