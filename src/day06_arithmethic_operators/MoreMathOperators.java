package day06_arithmethic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking = (toyotas + hondas + vw + tesla + nissan + bmw);

        //There are 842 cars in the parking lot.
        System.out.println("There are " + totalCarsInParking + " cars in the parking lot.");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        //there are 2 slices per person

        System.out.println("There are " + slicesPerPerson + " per person.");
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, " + people + " people ate" + slices + " slices each");

        System.out.println("We ordered " + pizza + " pizza with " +
                slices + " slices, " + people + " people ate " + slices + " slices each.");
    }
}
