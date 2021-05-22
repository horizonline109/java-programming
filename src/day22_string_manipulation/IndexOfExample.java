package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        // to find first comma
        System.out.println(technologies.indexOf(","));
        //last comma
        System.out.println(technologies.lastIndexOf(","));
        System.out.println(technologies.indexOf("java"));
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);

        int indexOfSql = technologies.indexOf("sql"); //not present -1
        System.out.println("sql is at index " + indexOfSql);

        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
        if (technologies.indexOf("maven") > -1) { //anything over -1 means maven is present
        } else {
            System.out.println("maven is not present");
        }
        
        String country = "Belize";
        System.out.println(country.substring(2, 5)); //liz

        String word = "hello";
        System.out.println(word.substring(0,2)); //he


    }
}
