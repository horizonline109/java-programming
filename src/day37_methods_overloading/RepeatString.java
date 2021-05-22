package day37_methods_overloading;

public class RepeatString {

    public static void main(String[] args) {
        repeatString("Java", 3, '|');
    }
    public static String repeatString(String word, int times, char delimiter) {
        String newValue = "";
        for (int i = 0; i < times; i++) {
            if(i == times) {
                newValue += word;
            } else {
                newValue += word + delimiter;
            }
        }
        return newValue;
    }
}
