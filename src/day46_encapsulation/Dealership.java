package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());
        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());
        car1.setMileage(98748);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("2017 Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(8000);
        System.out.println(alfaRomeo.toString());

    }
}
