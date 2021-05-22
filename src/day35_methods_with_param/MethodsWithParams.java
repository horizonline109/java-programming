package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(8); // value of int num = input inside the ()
        displayWord("Happy");
        displayWord("Smile");
        greetByName("Saim");
        greetByName("Murodil");
        greetByName("Nadir");
        greetByName("Ramin");
    }

    public static void displayValue(int num) {
        System.out.println("The value is " + num);
    }

    public static void displayWord(String word) {
        System.out.println("The word of the day is: " + word);
        if (word == "Happy") {
            System.out.println("It's a beautiful day in the neighborhood");
        } else {
            System.out.println("It's a quiet day here: good for java");
        }

    }

    public static void greetByName (String name){
        System.out.println("Hello, " +name+ "! So nice to see you today.");
        if(name == "Murodil") {
            System.out.println("Can we code some more java today?");
        } else if(name == "Nadir") {
            System.out.println("Can you interview me to improve my soft skills?");
        } else if (name == "Saim") {
            System.out.println("I am lost again in my code. Help!");
        } else {
            System.out.println("Let's get back to class.");
        }
    }

    public static void greetNameArr (String [] names) {

    }
}
