package day19_class_vs_object_strings;

public class StringStartsEndWith {
    public static void main(String[] args) {
        String word = "PhD";

        System.out.println(word.endsWith("D"));
        System.out.println(word.startsWith("Ph"));
        System.out.println(word.contains("hD"));

        String name = "Irina";
        if(name.endsWith("a")) {
            System.out.println("Maybe it's a female name");
        }


        String firstName = "Ms. Mary";
        if(firstName.startsWith("Mr.")) {
            System.out.println("Man: " + firstName);
        } else if(firstName.startsWith("Dr.")) {
            System.out.println("Doctor: : " + firstName);
        } else if(firstName.startsWith("Mrs.")) {
            System.out.println("Married Woman: " + firstName);
        } else if(firstName.startsWith("Ms.")) {
            System.out.println("Single woman: " + firstName);
        } else if(firstName.startsWith("Sr.")) {
            System.out.println("Senior: " + firstName);
        }

        String website = "charitywater.org";
        if(website.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if(website.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if(website.endsWith(".gov")) {
            System.out.println("Government website");
        } else if(website.endsWith(".edu")) {
            System.out.println("Education website");
        } else if(website.endsWith(".org")) {
            System.out.println("Organization website");
        } else {
            System.out.println("Non valid URL.");
        }
    }
}
