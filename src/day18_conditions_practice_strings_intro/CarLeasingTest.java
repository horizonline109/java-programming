package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leasePrice = 500;
        //String model = "A";
        //int leasePrice2 = 400;
        //String make2 = "Audi";
        //String model3 = "SQ5";
        //int leasePrice3 = 552;
        //String model4 = "";


        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        }
        if (make.equals("AUDI")) {
            if (model.equals("SQ5")) {
                leasePrice = 552.0;
            } else if (make.equals("A3")) {
                leasePrice = 600.0;
            }
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }
}

