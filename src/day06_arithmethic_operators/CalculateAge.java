package day06_arithmethic_operators;

public class CalculateAge {
    public static void main(String[] args) {
        int yearOfBirth = 1998;
        int currentYear = 2021;
        int age= currentYear - yearOfBirth;

        System.out.println("I am turning " + age + " years old in the year " + currentYear + ".");

        System.out.println("You are " + age + "years old");
    }
}
