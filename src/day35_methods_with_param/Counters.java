package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(10);
        count(8);

        String word = "wooden spoon";
        count(word.length());
        System.out.println();
        printAge(1991);

        }

    public static void count (int num){
        for(int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }
    }

    public static void printAge(int year){
        int currentYear = 2021;
        System.out.println("Birth year: " + year + ". Age: " +(currentYear - year));
    }
}
