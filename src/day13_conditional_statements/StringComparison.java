package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "St. Louis";
        if(city.equals("St. Louis")) {
            System.out.println("It's a good day in St. Louis");
        } else {
            System.out.println("You are missing on hot summers and cold St. Louis winters!");
        }

        String weather = "sunny";
        if(weather.equals("sunny")){
            System.out.println("it's a beautiful day in the neighborhood!");
        } else {
            System.out.println("It's not sunny today. maybe tomorrow.");
        }
    }
}
