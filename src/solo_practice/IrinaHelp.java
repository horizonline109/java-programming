package solo_practice;

public class IrinaHelp {
    public static void main(String[] args) {
        int age = 145;

        if (age > 0 && age < 120) {
            if (age <= 2) {
                System.out.println("Infant");
            } else if (age >= 3 && age <= 5) {
                System.out.println("Toddler");
            } else if (age >= 6 && age <= 9) {
                System.out.println("Kid");
            } else if (age >= 10 && age <= 12) {
                System.out.println("Pre-Teen");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teenager");
            } else if (age >= 18 && age <= 20) {
                System.out.println("Young adult");
            } else if (age >= 21 && age <= 39) {
                System.out.println("Adult");
            } else if (age >= 40 && age <= 49) {
                System.out.println("Young Middle-Aged Adult");
            } else if (age >= 50 && age <= 54) {
                System.out.println("Middle aged adult");
            } else if (age >= 55 && age <= 64) {
                System.out.println("Very Young Senior Citizen");
            } else if (age >= 65 && age <= 74) {
                System.out.println("Young Senior Citizen");
            } else if (age >= 75 && age <= 84) {
                System.out.println("Senior Citizen");
            } else if (age >= 85 && age <= 120) {
                System.out.println("Old Senior Citizen");
            }
        } else {
            System.out.println("Invalid entry");
        }
    }
}