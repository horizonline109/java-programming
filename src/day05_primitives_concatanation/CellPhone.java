package day05_primitives_concatanation;

public class CellPhone {
    public static void main (String [] args) {
        String phoneBrand = "Apple";
        String phoneModel = "iPhone 6S";
        String phoneColor = "Space Grey";
        double phonePrice = 199.99;
        int phoneStorage = 64;
        boolean hasCamera = true;

        System.out.println(phoneBrand);
        System.out.println(phoneModel);
        System.out.println("$" + phonePrice);
        System.out.print(phoneStorage + "GB");
        System.out.println(hasCamera);

        System.out.println("Brand is " + phoneBrand);
        System.out.println("Model is " + phoneModel);
        System.out.println("Color is " + phoneColor);
        System.out.println("Price is $" + phonePrice);
        System.out.println("Storage is " + phoneStorage + "GB");
        System.out.println("Has camera? - " + hasCamera);


    }
}
