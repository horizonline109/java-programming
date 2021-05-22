package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.contains("v")); //
        System.out.println(word.contains("jv")); //false
        System.out.println(word.contains("j") && word.contains("v"));

        String etsyTitle = "Wooden Spoon | Etsy";
        System.out.println("etsyTitle = " + etsyTitle);

        if(etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "Ahmed";
        if (firstName.contains("a") || firstName.contains("e")) {
            System.out.println("First name contains both letters");
        } else {
            System.out.println("First name does not contain a or e");
        }

        String name = "Nadir";
        if(name.contains("i") || name.contains("a")) {
            System.out.println("Accepted");
        }


        String email = "stlactress@me.com";
        if(email.contains("@me") && email.endsWith(".com")) {
            System.out.println("Email is an Apple account");
        } else {
            System.out.println("Non Apple email address");
        }

        //To make case insensitive.
        if(email.toLowerCase().contains("d")) {
            System.out.println("contains d");
        }else{
            System.out.println("does not contain d");
        }


    }
}
