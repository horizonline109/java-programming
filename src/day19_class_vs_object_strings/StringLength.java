package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word ="java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());

        String name = "Mary";
        System.out.println(name + ": " + name.length());
        int count =name.length();
        System.out.println("count = " + count);

        String password = "abc123";
        if(password.length() >= 6) {
            System.out.println("Valid Amazon Password");
        } else {
            System.out.println("Password too short");

            String country = "USA"; //how to check if all letters are uppercase
            String countryCode = "usa";
            if(countryCode.equals(countryCode.toUpperCase())) {
                System.out.println("Country = " + countryCode);
            } else {
                System.out.println();
            }
        }
    }
}
