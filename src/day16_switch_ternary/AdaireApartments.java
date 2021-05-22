package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedrooms = 3;
        double startingPrice = 0;

        System.out.println("***** Welcome to Adaire Apartments *****");
        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("1 bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:

                System.out.println("2 bedroom apartment selected");
                startingPrice = 28099;
                break;
            default:
                System.out.println("5 bedroom currently unavailable");
        }
        System.out.println("Starting Price $1,454");
    }
}
